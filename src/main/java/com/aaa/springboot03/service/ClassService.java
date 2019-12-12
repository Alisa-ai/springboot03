package com.aaa.springboot03.service;

import com.aaa.springboot03.dao.ClassDao;
import com.aaa.springboot03.entity.Class;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassService {
   @Resource
   ClassDao dao;
   public List<Class>findAll(){
       return dao.findAll();
   }
   public boolean delete(int classid){
       int i=dao.del(classid);
       if(i==1){
           return true;
       }else{
           return false;
       }
   }
}
