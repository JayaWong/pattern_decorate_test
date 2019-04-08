package com.jaya.view.factory;

import com.jaya.view.ViewComponent;
import com.jaya.view.impl.ConsoleView;
import com.jaya.view.impl.FileView;

import java.io.FileNotFoundException;

/**
 * @author wangjianying
 * @Title: DefaultViewFactory
 * @Description: ${END}
 * @date 2019/4/218:32
 */
public class DefaultViewFactory {
    public final static String VIEW_CONSOLE = "console";
    public final static String VIEW_FILE = "file";
    public ViewComponent getView(ViewConfiguration viewConfiguration) {
        String name = viewConfiguration.getName();
        switch (name) {
            case VIEW_CONSOLE:
                return new ConsoleView();
            case VIEW_FILE:
                try {
                    return new FileView(viewConfiguration.getArgs().get(0));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            default:
                return null;
        }
    }
}
