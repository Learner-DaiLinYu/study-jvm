package com.DLY.Dome;

/**
 * 用来测试的bean
 */
public class DlyBean {
    @DlyAnnotation("戴林宇Field")
    String name;

    @DlyAnnotation("戴林宇Method")
    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "DlyBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
