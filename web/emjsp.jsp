<%-- 
    Document   : emjsp
    Created on : 10 Jul, 2017, 8:46:04 AM
    Author     : Abhishek Nigam
--%>

<link rel="stylesheet" href="res/Site.css"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<s:setDataSource driver="com.mysql.jdbc.Driver" 
                 url="jdbc:mysql://localhost:3306/rcpl"
                 user="root" password="123"/>
<s:query var="rs" sql="select *from movie"/>
<h3 class="green" align="center">EXPENSE MANAGER</h3>

<table align="center" border="1" class="table">
    <tr class="gridheader">
        <th>S_NO</th><th>NAME</th><th>TYPE</th><th>EXPENSE</th><th>R-DATE</th>
        <th>OPERATIONS</th>
    </tr>
<c:forEach var="data" items="${rs.rows}" varStatus="s">
     <tr class="gridrow">
        <td>${s.count}</td>
        <td>${data.name}</td>
        <td>${data.type}</td>
        <td>
            <c:forEach begin="1" end="${data.rating}">
                <img src="res/star.png" width="20px" height="20px"/>
            </c:forEach>
        </td>
        <td>${data.rdate}</td>
        <td>
            <a href="#">EDIT</a> | 
            <a href="delmovie.jsp?mid='${data.mid}'" onclick="return confirm('Are your Sure to delete?')" >DELETE</a>
        </td>
     </tr>
</c:forEach>
     <tr class="gridrow">
     <form action="addmovie.jsp">
         <td>ADD NEW</td>
         <td><input type="text" name="n"/></td>
         <td><input type="text" name="t"/></td>
         <td><input type="number" min="1" max="5" style="width: 70px;" name="r"/></td>
         <td><input type="date" name="rd"/></td>
         <td><input type="submit" value="ADD"/></td>
     </form>
     </tr>
</table>
            ${requestScope.msg}