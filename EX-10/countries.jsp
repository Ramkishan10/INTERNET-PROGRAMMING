<%-- 
    Document   : countries
    Created on : 2 Apr, 2023, 7:22:42 PM
    Author     : C.B.RAMKISHAN
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page import="array_class.class_array"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Movie</title>
        
    </head>
    <body>
        <%
            class_array con = new class_array("USA", "Washington D.C.", "USD", 328200000);
            class_array con1 = new class_array("Canada", "Ottawa", "CAD", 38000000);
            class_array con2 = new class_array("Mexico", "Mexico City", "MXN", 130000000);
            ArrayList<class_array> obj = new ArrayList<class_array>();
            obj.add(con);
            obj.add(con1);
            obj.add(con2);
String s="name-capital-currency-population";
pageContext.setAttribute("s", s);
pageContext.setAttribute("obj", obj);
        %>
        <table border="2px">
  <thead>
    <tr>
      <th>Name</th>
      <th>Capital</th>
      <th>Currency</th>
      <th>Population</th>
    </tr>
  </thead>
    <tbody>
    <c:forEach items="${pageScope.obj}" var="i">
            <tr>
                <td><c:out value="${i.getName()}"></c:out></td>
                <td><c:out value="${i.getCapital()}"></c:out></td>
                <td><c:out value="${i.getCurrency()}"></c:out></td>
                <td><c:out value="${i.getPopulation()}"></c:out></td>
            </tr>
        </c:forEach>  
  </tbody>
</table>
          

    </body> 
</html>

