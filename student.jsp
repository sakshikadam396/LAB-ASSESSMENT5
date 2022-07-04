<%@ page launguage ="java" content type="text/html;charset=ISO-8859-1"
    page encoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
   <!DOCTYPE html>
   <html>
   <head>
   <meta charset="ISO-8859-1">
   <title>Debate Event</title>
   </head>
   <body>
   <table border border="1">
   <thread>
   <tr><th>Title</th><th>Department/th><th>country</th>th>Action</thread>/th>
   </thread>
   <tbody>
   <c:forEach items="studentlist" var="student">
   <tr><td>${Student.title}</td>td><td>${student.department }
   </c:forEach>
   </tbody>
   </table>
   </body>
   </html>
