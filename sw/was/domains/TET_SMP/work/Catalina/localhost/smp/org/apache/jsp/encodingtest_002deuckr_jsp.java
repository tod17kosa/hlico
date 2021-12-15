/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.30.redhat-4
 * Generated at: 2021-05-21 21:59:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class encodingtest_002deuckr_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=euc-kr");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

        
    String first = null ;
    String word = null;
    
    if ( request.getParameter("data") != null )
    {
	    first = request.getParameter("data");
	    word = first;
	    
	    System.out.println("Default Encoding        : " + word);
	    
	     
	    System.out.println("utf-8 -> utf-8        : " + new String(word.getBytes("utf-8"), "utf-8"));
	    System.out.println("utf-8 -> euc-kr        : " + new String(word.getBytes("utf-8"), "euc-kr"));
	    System.out.println("utf-8 -> iso-8859-1    : " + new String(word.getBytes("utf-8"), "iso-8859-1"));
	    System.out.println("iso-8859-1 -> iso-8859-1        : " + new String(word.getBytes("iso-8859-1"), "iso-8859-1"));
	    System.out.println("iso-8859-1 -> euc-kr        : " + new String(word.getBytes("iso-8859-1"), "euc-kr"));
	    System.out.println("iso-8859-1 -> utf-8         : " + new String(word.getBytes("iso-8859-1"), "utf-8"));
	    System.out.println("euc-kr -> euc-kr         : " + new String(word.getBytes("euc-kr"), "euc-kr"));
	    System.out.println("euc-kr -> utf-8         : " + new String(word.getBytes("euc-kr"), "utf-8"));
	    System.out.println("euc-kr -> iso-8859-1    : " + new String(word.getBytes("euc-kr"), "iso-8859-1"));
	    
	    System.out.println("data:" + first); 
    } else first = "NULL";
    

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\">\r\n");
      out.write("<title>encoding test result</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction send_by_post(){\r\n");
      out.write("\t\tvar frm=document.encoding;\r\n");
      out.write("\t\tfrm.method=\"post\";\r\n");
      out.write("\t\tfrm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction send_by_get(){\r\n");
      out.write("\t\tvar frm=document.encoding;\r\n");
      out.write("\t\tfrm.method=\"get\";\r\n");
      out.write("\t\tfrm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"encoding\">\r\n");
      out.write("<table border=\"1\" cellspacing=\"0\" width=\"500\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th width=\"10%\">구분</th><th width=\"25%\">입력값</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("      <td>Input Data</td>\r\n");
      out.write("      <td><input name=\"data\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("      <td colspan=2>\r\n");
      out.write("      \t\t<input type=\"button\" value=\"Send by Post\" onclick=\"javascript:send_by_post()\">\r\n");
      out.write("      \t\t<input type=\"button\" value=\"Send by Get\" onclick=\"javascript:send_by_get()\">\r\n");
      out.write("      </td>     \r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("# Encoding Result\r\n");
      out.write("<br>\r\n");

    if ( first.equals("NULL"))
    {
	  out.println("입력값 : " + first);
    } else 
    {
        out.println("입력값 : " + first);
        out.println("<br><br>");

      out.write("\r\n");
      out.write("    \t<table border=\"1\" cellspacing=\"0\" width=\"800\">\r\n");
      out.write("    \t  <tr>\r\n");
      out.write("    \t    <th width=\"10%\">구분</th><th width=\"25%\">결과값</th>\r\n");
      out.write("    \t  </tr>\r\n");
      out.write("    \t  <tr>\r\n");
      out.write("    \t      <td>Default</td>\r\n");
      out.write("    \t      <td>\r\n");
      out.write("    \t      ");

    	        out.println(word);
    	      
      out.write("\r\n");
      out.write("    \t      </td>\r\n");
      out.write("    \t  </tr>\r\n");
      out.write("    \t  <tr>\r\n");
      out.write("    \t      <td>utf-8 -> utf-8</td>\r\n");
      out.write("    \t      <td>\r\n");
      out.write("    \t      ");

    	        out.println(new String(word.getBytes("utf-8"), "utf-8"));
    	      
      out.write("\r\n");
      out.write("    \t      </td>\r\n");
      out.write("    \t  </tr>\r\n");
      out.write("    \t  <tr>\r\n");
      out.write("    \t      <td>utf-8 -> euc-kr</td>\r\n");
      out.write("    \t      <td>\r\n");
      out.write("    \t      ");

    	        out.println(new String(word.getBytes("utf-8"), "euc-kr"));
    	      
      out.write("\r\n");
      out.write("    \t      </td>\r\n");
      out.write("    \t  </tr>\r\n");
      out.write("    \t  <tr>\r\n");
      out.write("    \t      <td>utf-8 -> iso-8859-1</td>\r\n");
      out.write("    \t      <td>\r\n");
      out.write("    \t      ");

    	      out.println(new String(word.getBytes("utf-8"), "iso-8859-1"));
    	      
      out.write("\r\n");
      out.write("    \t      </td>\r\n");
      out.write("    \t  </tr>\r\n");
      out.write("    \t  <tr>\r\n");
      out.write("    \t      <td>iso-8859-1 -> euc-kr</td>\r\n");
      out.write("    \t      <td>\r\n");
      out.write("    \t      ");

    	      out.println(new String(word.getBytes("iso-8859-1"), "euc-kr"));
    	      
      out.write("\r\n");
      out.write("    \t      </td>\r\n");
      out.write("    \t  </tr>\r\n");
      out.write("    \t  <tr>\r\n");
      out.write("    \t      <td>iso-8859-1 -> iso-8859-1</td>\r\n");
      out.write("    \t      <td>\r\n");
      out.write("    \t      ");

    	      out.println(new String(word.getBytes("iso-8859-1"), "iso-8859-1"));
    	      
      out.write("\r\n");
      out.write("    \t      </td>\r\n");
      out.write("    \t  </tr>\r\n");
      out.write("\r\n");
      out.write("    \t  <tr>\r\n");
      out.write("    \t      <td>iso-8859-1 -> utf-8</td>\r\n");
      out.write("    \t      <td>\r\n");
      out.write("    \t      ");

    	      out.println(new String(word.getBytes("iso-8859-1"), "utf-8"));
    	      
      out.write("\r\n");
      out.write("    \t      </td>\r\n");
      out.write("    \t  </tr>\r\n");
      out.write("    \t  <tr>\r\n");
      out.write("    \t      <td>euc-kr -> euc-kr</td>\r\n");
      out.write("    \t      <td>\r\n");
      out.write("    \t      ");

    	      out.println(new String(word.getBytes("euc-kr"),"euc-kr"));
    	      
      out.write("\r\n");
      out.write("    \t      </td>\r\n");
      out.write("    \t  </tr>\r\n");
      out.write("    \t  <tr>\r\n");
      out.write("    \t      <td>euc-kr -> utf-8</td>\r\n");
      out.write("    \t      <td>\r\n");
      out.write("    \t      ");

    	      out.println(new String(word.getBytes("euc-kr"),"utf-8"));
    	      
      out.write("\r\n");
      out.write("    \t      </td>\r\n");
      out.write("    \t  </tr>\r\n");
      out.write("\r\n");
      out.write("    \t  <tr>\r\n");
      out.write("    \t      <td>euc-kr -> iso-8859-1</td>\r\n");
      out.write("    \t      <td>\r\n");
      out.write("    \t      ");

    	      out.println(new String(word.getBytes("euc-kr"), "iso-8859-1"));
    	      
      out.write("\r\n");
      out.write("    \t      </td>\r\n");
      out.write("    \t  </tr>\r\n");
      out.write("\r\n");
      out.write("    \t</table>\r\n");

    }

      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
