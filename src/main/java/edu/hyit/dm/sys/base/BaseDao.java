package edu.hyit.dm.sys.base;

import java.util.List;

public interface BaseDao<T extends BaseModel> {

    void insert(T t);

    void update(T t);

    void delete(T t);

    void delete(Long id);

    T find(T t);

    List<T> findList(T t);

    List<T> findAll();

    T findById(String id);
}
