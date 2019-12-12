package com.aaa.springboot03.entity;

import java.util.Date;

public class Class {
    private int classid;
    private String classname;
    private Date begintime;
    private Date endtime;
    private int gradeid;

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public int getGradeid() {
        return gradeid;
    }

    public void setGradeid(int gradeid) {
        this.gradeid = gradeid;
    }

    @Override
    public String toString() {
        return "classs{" +
                "classid=" + classid +
                ", classname='" + classname + '\'' +
                ", begintime=" + begintime +
                ", endtime=" + endtime +
                ", gradeid=" + gradeid +
                '}';
    }
}
