package edu.hyit.dm.sys.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private static SimpleDateFormat dateFormat = new SimpleDateFormat();

    private static final String DEFAULT_PATTERN="yyyy-MM-dd HH:mm:ss";

    public static String format(Date target,String pattern){
        dateFormat.applyPattern(pattern);
        return dateFormat.format(target);
    }

    public static String format(Date target){
        dateFormat.applyPattern(DEFAULT_PATTERN);
        return dateFormat.format(target);
    }
}
