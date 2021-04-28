package com.sky.visitor.version3;

public class PdfFile extends ResourceFile {

    @Override
    public void extractToTxt(Extract extract) {
        // TODO 关键点，“资源”将自身作为参数传递给“操作”
        extract.extractToTxt(this);
    }
}
