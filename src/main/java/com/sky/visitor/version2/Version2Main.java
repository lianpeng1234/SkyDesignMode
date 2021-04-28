package com.sky.visitor.version2;

import java.util.ArrayList;
import java.util.List;

public class Version2Main {

    public static void main(String[] args) {
        Extract extract = new Extract();

        List<ResourceFile> list = resourceFiles(args[0]);
        for (ResourceFile file : list) {
            // 将指定文件中的文本提取到 txt 文件中
            // TODO 关键点，代码编译不过，因为 java函数重载是静态绑定的，
            //也就是说，调用类的哪个重载函数，是在编译期间，由参数的声明类型决定的，而非运行时，根据参数的实际类型决定的
            extract.extractToTxt(file);
        }
    }

    private static List<ResourceFile> resourceFiles(String filePath) {
        // 从 filePath 目录下读取文件
        List<ResourceFile> list = new ArrayList<>();
        list.add(new WordFile());
        list.add(new PdfFile());
        list.add(new PptFile());
        return list;
    }

}
