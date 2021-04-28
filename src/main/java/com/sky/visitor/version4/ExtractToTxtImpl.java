package com.sky.visitor.version4;

public class ExtractToTxtImpl implements VisitorInterface {

    @Override
    public void visitor(PdfFile file) {
        // 进行转换工作，将 pdf 文件中的文本进行提取
    }

    @Override
    public void visitor(PptFile file) {
        // 进行转换工作，将 ppt 文件中的文本进行提取
    }

    @Override
    public void visitor(WordFile file) {
        // 进行转换工作，将 word 文件中的文本进行提取
    }
}
