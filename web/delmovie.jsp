<%-- 
    Document   : delmovie
    Created on : 10 Jul, 2017, 8:49:39 AM
    Author     : Abhishek Nigam
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<s:setDataSource driver="com.mysql.jdbc.Driver" 
                 url="jdbc:mysql://localhost:3306/rcpl"
                 user="root" password="123"/>

<s:update var="dr" sql="delete from movie where mid=${param.mid}"/>

<c:set var="msg" value="MOVIE DELETED SUCCESSFULLY!!" scope="request"/>

<jsp:forward page="emjsp.jsp"/>
