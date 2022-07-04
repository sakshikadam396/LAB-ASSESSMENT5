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
   <form action="student/save"methode="post">
   <table>
   <tr>
   <tr>name</td><td><input type="text"value="${student.name}" name="student name"/> </td>td></tr>tr>
   <tr>
      <tr>department</td><td><input type="text"value="${student.department}" name="department"/> </td>td></tr>tr>
   <tr>
      <tr>country</td><td><input type="text"value="${student.country}" name="country"/> </td>td></tr>tr>
   
   </table>
   </form>
   <body>
   <html>