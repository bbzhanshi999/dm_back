package edu.hyit.dm;

import edu.hyit.dm.sys.utils.DateUtils;
import edu.hyit.dm.sys.utils.IdGenerator;
import org.assertj.core.util.DateUtil;
import org.junit.Test;

import java.util.Date;

public class SimpleTest {

    @Test
    public void idTest(){
        System.out.println(IdGenerator.genId());

    }
    @Test
    public void DateUtilTest(){
        System.out.println(DateUtils.format(new Date()));
        System.out.println(DateUtils.format(new Date(),"yyyy-MM-dd"));
        System.out.println(DateUtils.format(new Date()));
    }
}
