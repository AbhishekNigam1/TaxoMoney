<%-- 
    Document   : addmovie
    Created on : 10 Jul, 2017, 8:48:54 AM
    Author     : Abhishek Nigam
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<s:setDataSource driver="com.mysql.jdbc.Driver" 
                 url="jdbc:mysql://localhost:3306/rcpl"
                 user="root" password="123"/>

<s:update var="ir">
    insert into movie(name,type,rating,rdate) values('${param.n}','${param.t}',${param.r},'${param.rd}')
</s:update>

<c:set var="msg" value="ADD DELETED SUCCESSFULLY!!" scope="request"/>

<jsp:forward page="emjsp.jsp"/>