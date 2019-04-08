package com.jaya.view.impl;

import com.jaya.view.DefaultViewComponent;

import java.io.OutputStream;
import java.io.PrintStream;

/**
 * @author wangjianying
 * @Title: ConsoleView
 * @Description: ${END}
 * @date 2019/4/216:56
 */
public class ConsoleView extends DefaultViewComponent {

    public ConsoleView() {
        super(System.out);
    }

    public void print(String lineString) {
        ((PrintStream)out).print(lineString);
    }
}
