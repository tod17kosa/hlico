<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import = "com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
    <%@ page import = "com.oreilly.servlet.MultipartRequest" %>
  
    <%@ page import = "java.io.File"%>
    
   <%
   // 파일 업로드 라이브러리
   // cos.jar
   //Multipart Parser
   
   String uploadPath = "/WAS/WebApps/simple/FILE";
   int maxFileSize = 1024 * 1024 * 1024 ; //file 크기 제한
   String encoding = "utf-8";
   
   MultipartRequest multi = new MultipartRequest(request, uploadPath, maxFileSize, encoding, new DefaultFileRenamePolicy());
   //DefaultFileRenamePolicy : 같은 이름의 파일이 들어오면 자동으로 1을 붙여준다.
   
//    out.println(multi.getFilesystemName("upload1") + "<br/>"); //변경된 파일명
   //매개 변수로는 input type의 name을 입력
//    out.println(multi.getOriginalFileName("upload1") + "<br/>"); //실제 파일명
   
    String upload = multi.getFilesystemName("upload1");
   
   %>
   
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

업로드 링크 : <a href = "./upload/<%=upload %>"><%=upload %></a><br/><br/>

무조건 다운로드 : <a href = "./download.jsp?filename=<%=upload %>"><%=upload %></a><br/>

</body>
</html>
