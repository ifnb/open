package cn.allms.open.project.domain.entity;

import java.io.Serializable;

/**
 * @author xieYj
 * @date 2021/4/30 10:53
 */
public class Employee implements Serializable {
    private String name;
    private Integer age;

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
