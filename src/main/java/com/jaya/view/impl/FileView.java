package com.jaya.view.impl;

import com.jaya.view.DefaultViewComponent;

import java.io.*;

/**
 * @author wangjianying
 * @Title: FileView
 * @Description: ${END}
 * @date 2019/4/217:07
 */
public class FileView extends DefaultViewComponent {
    private BufferedWriter bw;
    public FileView(String fileName) throws FileNotFoundException {
        super(new FileOutputStream(fileName));
        bw = new BufferedWriter(new OutputStreamWriter(out));
    }

    public void print(String lineString) {
        try {
            bw.write(lineString);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
