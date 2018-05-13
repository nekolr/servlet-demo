package com.nekolr.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogUtil {

    private LogUtil() {
    }


    public static void log(String msg) {
        System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss,SSS")) + "] " + msg);
    }
}
