package com.sky.visitor.version3;

import java.util.ArrayList;
import java.util.List;

public class Version3Main {

    public static void main(String[] args) {
        Extract extract = new Extract();

        List<ResourceFile> list = resourceFiles(args[0]);
        for (ResourceFile file : list) {
            // TODO 关键点，看上去“操作”（extract）像是在“资源”（resource）内部进行的，其实内部只是将“资源”（resource）本身作为参数传递给“操作”（extract)
            file.extractToTxt(extract);
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
