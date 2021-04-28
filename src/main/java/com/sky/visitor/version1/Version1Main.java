package com.sky.visitor.version1;

import java.util.ArrayList;
import java.util.List;

public class Version1Main {

    public static void main(String[] args) {
        List<ResourceFile> list = resourceFiles(args[0]);
        for (ResourceFile file : list) {
            // 将指定文件中的文本提取到 txt 文件中
            file.extractToTxt();
        }
    }

    // 从指定路径获取文件
    private static List<ResourceFile> resourceFiles(String filePath) {
        // 从 filePath 目录下读取文件
        List<ResourceFile> list = new ArrayList<>();
        list.add(new WordFile());
        list.add(new PdfFile());
        list.add(new PptFile());
        return list;
    }

}
