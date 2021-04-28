package com.sky.visitor.version4;

public class WordFile extends ResourceFile {
    @Override
    public void dispose(VisitorInterface visitor) {
        // TODO 关键点，“资源”将自身作为参数传递给“操作”
        visitor.visitor(this);
    }
}
