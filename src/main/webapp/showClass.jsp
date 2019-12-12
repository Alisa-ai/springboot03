<%--
  Created by IntelliJ IDEA.
  User: 董朝哲
  Date: 2019/9/14
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <base href="http://localhost:8088/springboot/">
    <title>Title</title>
    <script src="js/jquery-1.8.3.min.js"></script>
    <script>
        function del(classid){
            $.post("class/delete",{"classid":classid},function (data) {
             if(data){
                 alert("删除成功")
                 window.location.href="http://localhost:8088/springboot/class/findAll";
                }else{
                 alert("删除失败")
                }
        })
        }
    </script>
</head>
<body>
<table border="1px">
    <thead>
    <tr>
        <td>班级编号</td>
        <td>班级名称</td>
        <td>开学日期</td>
        <td>放假日期</td>
        <td>年级编号</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
      <c:forEach items="${list}" var="list">
           <tr>
               <td>${list.classid}</td>
               <td>${list.classname}</td>
               <td>${list.begintime}</td>
               <td>${list.endtime}</td>
               <td>${list.gradeid}</td>
               <td><a href="javaScript:del(${list.classid})">删除</a></td>
           </tr>

      </c:forEach>

    </tbody>
</table>
</body>

</html>
