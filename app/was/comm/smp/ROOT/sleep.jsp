<%@ page import="thread.*"%>
<%@ page import="java.util.*, java.text.*"%>
<%
 Thread.sleep(10000);

 java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
 String today = formatter.format(new java.util.Date());
 System.out.println("sleep test : " + today);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test Page</title>
</head>
<body>
<table>
<tr>
<td><img src="/simple/image/apache.png" width="450" height="300"></td>
<td><img src="/simple/image/docker.png" width="450" height="300"></td>
<td><img src="/simple/image/jboss7.png" width="450" height="300"></td>
<td><img src="/simple/image/tomcat7.png" width="450" height="300"></td>
</tr>
<tr>
<td><img src="/simple/image/loadrunner.jpg" width="450" height="300"></td>
<td><img src="/simple/image/NGINX.png" width="450" height="300"></td>
<td><img src="/simple/image/OpenShift.png" width="450" height="300"></td>
<td><img src="/simple/image/wildfly.png" width="450" height="300"></td>
</tr>
</table>
</body>
</html>

