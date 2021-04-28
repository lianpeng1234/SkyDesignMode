package com.sky.visitor.version4;

public class CompressImpl implements VisitorInterface {

    @Override
    public void visitor(PdfFile file) {
        // 进行压缩工作，将 pdf 文件进行压缩
    }

    @Override
    public void visitor(PptFile file) {
        // 进行压缩工作，将 ppt 文件进行压缩
    }

    @Override
    public void visitor(WordFile file) {
        // 进行压缩工作，将 word 文件进行压缩
    }
}
