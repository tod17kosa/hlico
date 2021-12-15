<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Client IP </title>
</head>
<body>
        Remote IP: <%= request.getRemoteAddr()%>
</body>
</html>

<%
String ip = request.getHeader("X-Forwarded-For");

if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
    ip = request.getHeader("Proxy-Client-IP");
}
if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
    ip = request.getHeader("WL-Proxy-Client-IP");
}
if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
    ip = request.getHeader("HTTP_CLIENT_IP");
}
if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
    ip = request.getHeader("HTTP_X_FORWARDED_FOR");
}
if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
    ip = request.getRemoteAddr();
}
System.out.println("ip :" + ip );
%>

