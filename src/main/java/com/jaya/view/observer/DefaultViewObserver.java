package com.jaya.view.observer;

import com.jaya.view.ViewComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangjianying
 * @Title: DefaultViewObserver
 * @Description: ${END}
 * @date 2019/4/315:00
 */
public class DefaultViewObserver {
    private List<ViewComponent> observeredList = new ArrayList<>();

    public void add(ViewComponent viewComponent) {
        observeredList.add(viewComponent);
    }

    public void exe(String lineString) {
        for (ViewComponent viewComponent : observeredList) {
            viewComponent.print(lineString);
        }
    }
}
