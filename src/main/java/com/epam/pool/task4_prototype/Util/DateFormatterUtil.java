package com.epam.pool.task4_prototype.Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatterUtil {

    private DateFormatterUtil() {
    }

    public static String formatDate(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS dd-MM-yyyy");
        return simpleDateFormat.format(date);
    }
}
