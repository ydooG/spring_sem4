<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<html>
  <head>
    <title>Main page</title>
  </head>
  <body>
    <h1>Hello, wanderer</h1>
    <ul>
      <li><h3><a href="${s:mvcUrl('DC#main').build()}">Main</a></h3></li>
    </ul>
  </body>
</html>
