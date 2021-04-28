package com.sky.visitor.version3;

public abstract class ResourceFile {

    // TODO 关键点，“资源”对象拥有“操作”对象的引用
    public abstract void extractToTxt(Extract extract);

}
