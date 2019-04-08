package com.jaya.view;

import java.io.OutputStream;

/**
 * @author wangjianying
 * @Title: DefaultViewComponent
 * @Description: ${END}
 * @date 2019/4/216:54
 */
public abstract class DefaultViewComponent implements ViewComponent {
    protected OutputStream out;

    public DefaultViewComponent(OutputStream out) {
        this.out = out;
    }

    abstract public void print(String lineString) ;
}
