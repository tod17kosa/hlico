<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*"%>
<%@ page import="java.nio.charset.Charset"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String word="file 인코딩테스트";
String System_enc = new java.io.OutputStreamWriter(System.out).getEncoding();
String FileEncoding = System.getProperty("file.encoding");

// jvm 마지막에 설정된 file.encoding 설정
System.out.println("FileEncoding by property: " + FileEncoding);
out.println("FileEncoding by property: " + FileEncoding);

// 실제 반영된 system property 설정 
System.out.println("FileEncoding by charSet: " + Charset.defaultCharset());
out.println("FileEncoding by charSet: " + Charset.defaultCharset());
System.out.println("system default encoding = " + System_enc);
out.println("system default encoding = " + System_enc);

System.out.println("#### 인코딩테스트 결과####");
System.out.println("word = " + word);
out.println("#### 인코딩테스트 결과####");
out.println("word = " + word);

%>
</body>
</html>
