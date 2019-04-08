package com.jaya.view.factory;

import javax.swing.text.View;
import java.io.IOException;
import java.util.*;

/**
 * @author wangjianying
 * @Title: ViewConfiguration
 * @Description: ${END}
 * @date 2019/4/218:34
 */

public class ViewConfiguration {
    private String name;
    private List<String> args;
    private static Properties properties;
    private static Map<String, ViewConfiguration> views;

    private ViewConfiguration() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    public static ViewConfiguration getConfiguration(String name) {
        if (views == null) {
            synchronized (ViewConfiguration.class) {
                if (views == null) {
                    properties = new Properties();
                    views = new HashMap<String, ViewConfiguration>();
                    try {
                        properties.load(ViewConfiguration.class.getClassLoader().getResourceAsStream("view.properties"));
                        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
                        for (Map.Entry<Object, Object> entry : entries) {
                            String value = (String) entry.getValue();
                            String[] values = value.split(" ");
                            ViewConfiguration viewConfiguration = new ViewConfiguration();
                            viewConfiguration.setName(values[0]);
                            if (values.length > 1) {
                                viewConfiguration.setArgs(Arrays.asList(values[1]));
                            }
                            views.put(values[0], viewConfiguration);
                        }
                        properties.list(System.out);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return views.get(name);
    }
}
