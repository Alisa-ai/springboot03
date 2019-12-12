package com.aaa.springboot03.dao;

import com.aaa.springboot03.entity.Class;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface ClassDao {
      //查询所有方法
    @Select("select*from class")
    public List<Class> findAll();
    //删除
    @Delete("delete from class where classid=#{classid}")
    public int del(int classid);
}
