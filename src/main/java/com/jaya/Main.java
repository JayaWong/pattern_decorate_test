package com.jaya;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author wangjianying
 * @Title: Main
 * @Description: ${END}
 * @date 2019/4/216:39
 */
public class Main {
    public static void main(String[] args) {
        NumberFormat ci = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String format = ci.format(1000d);
        System.out.println(ci);
    }
}
