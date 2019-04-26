package com.epam.pool.task4_prototype.Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatterUtil {
    private static final String TIME_FORMAT = "HH:mm:ss.SSS dd-MM-yyyy";

    private DateFormatterUtil() {
    }

    public static String formatDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TIME_FORMAT);
        return simpleDateFormat.format(date);
    }
}
