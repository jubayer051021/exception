package com.bjit.exception.model;

public class Student extends User{
    private String  className;
    private String groupName;

    public Student() {
    }

    public Student(int id, String name, String className, String groupName) {
        super(id,name);
        this.className = className;
        this.groupName = groupName;
    }
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
