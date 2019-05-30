package edu.hyit.dm.sys.base;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class BaseService<T extends BaseModel,D extends BaseDao<T>> {


    @Autowired
    protected D dao;

    public T findById(Long id){
        return dao.findById(id);
    }

    public T find(T t){
        return dao.find(t);
    }

    public List<T> findList(T t){
        return dao.findList(t);
    }


    public List<T> findAll(){
        return dao.findAll();
    }

    public void delete(Long id){
        dao.delete(id);
    }

    public void delete(T t){
        dao.delete(t);
    }

    public void save(T t){
        t.setUpdateTime(new Date());
        if(t.getId()!=null&&!"".equals(t.getId())){
            t.preUpdate();
            dao.update(t);
        }else{
            t.preInsert();
            dao.insert(t);
        }
    }

    /**
     * 专门返回分页数据
     * @param t pageNum 第几页 pageSize每页条数
     * @return
     */
    public PageInfo<T> page(T t, Integer pageNum, Integer pageSize){
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> dao.findList(t));
    }
}
