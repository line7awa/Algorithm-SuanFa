package com.linjh.dome240707;

public class PeoPle {

    String name;
    Integer age;

    public PeoPle() {
    }

    @Override
    public String toString() {
        return "PeoPle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public PeoPle(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
