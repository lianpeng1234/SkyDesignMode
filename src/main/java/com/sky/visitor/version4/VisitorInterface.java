package com.sky.visitor.version4;

public interface VisitorInterface {

    public void visitor(PdfFile file);
    public void visitor(PptFile file);
    public void visitor(WordFile file);

}
