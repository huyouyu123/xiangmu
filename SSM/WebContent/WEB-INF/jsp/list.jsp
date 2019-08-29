<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>详情展示</title>
</head>
<body>

    <form action="/Allbooks" method="POST">
       
       <table  border="2" style="color: blue; border: 2px">
          <tr>
             <td>书名</td>
             <td>作者</td>
             <td>类型</td>
             <td>出版社</td>
             <td>库存</td>
          </tr>
          
          <c:forEach  var="books"  items="${listbook}">
             <tr>
               <td>${books.book_name}</td>
               <td>${books.book_author}</td>
               <td>${books.book_type}</td>
               <td>${books.book_publisher}</td>
               <td>${books.book_total}</td>
             </tr>
          </c:forEach>
          
       </table>
  
  </form>

</body>
</html>