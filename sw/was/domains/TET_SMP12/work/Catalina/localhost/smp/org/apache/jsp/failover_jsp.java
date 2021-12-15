/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.30.redhat-4
 * Generated at: 2021-05-21 21:59:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public final class failover_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

 
  private int totalHits = 0;

  private static String seconds(double l) {
	NumberFormat nf = new DecimalFormat("#.#####");
	return nf.format(l);
  }

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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.text.DecimalFormat");
    _jspx_imports_classes.add("java.text.NumberFormat");
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

      out.write(" \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write(' ');
      out.write('\r');
      out.write('\n');

double start = System.nanoTime();
//out.println("Start: " + start+" nano seconds"); 
session = request.getSession(true);

Integer ival = (Integer)session.getAttribute("simplesession.counter");

if (ival == null) 
  ival = new Integer(1);
else 
  ival = new Integer(ival.intValue() + 1);

session.setAttribute("simplesession.counter", ival);
System.out.println("[SessionTest] count = " + ival + " " + session.getId());

Integer cnt = (Integer)application.getAttribute("simplesession.hitcount");

if (cnt == null)
  cnt = new Integer(1);
else
  cnt = new Integer(cnt.intValue() + 1);

application.setAttribute("simplesession.hitcount", cnt); 
//System.out.println("[SessionTest] count = " + ival );

try{ 
}catch(Exception e){
	e.printStackTrace();
}

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>database Session Failover Test</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\t::selection{ background-color: #E13300; color: white; }\r\n");
      out.write("\t::moz-selection{ background-color: #E13300; color: white; }\r\n");
      out.write("\t::webkit-selection{ background-color: #E13300; color: white; }\r\n");
      out.write("\r\n");
      out.write("\tbody {\r\n");
      out.write("\t\tbackground-color: #fff;\r\n");
      out.write("\t\tmargin: 40px;\r\n");
      out.write("\t\tfont: 13px/20px normal Helvetica, Arial, sans-serif;\r\n");
      out.write("\t\tcolor: #4F5155; \r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\ta {\r\n");
      out.write("\t\tcolor: #003399;\r\n");
      out.write("\t\tbackground-color: transparent;\r\n");
      out.write("\t\tfont-weight: normal;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\th1 {\r\n");
      out.write("\t\tcolor: #444;\r\n");
      out.write("\t\tbackground-color: transparent;\r\n");
      out.write("\t\tborder-bottom: 1px solid #D0D0D0;\r\n");
      out.write("\t\tfont-size: 19px;\r\n");
      out.write("\t\tfont-weight: normal;\r\n");
      out.write("\t\tmargin: 0 0 14px 0;\r\n");
      out.write("\t\tpadding: 14px 15px 10px 15px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tcode {\r\n");
      out.write("\t\tfont-family: Consolas, Monaco, Courier New, Courier, monospace;\r\n");
      out.write("\t\tfont-size: 12px;\r\n");
      out.write("\t\tbackground-color: #f9f9f9;\r\n");
      out.write("\t\tborder: 1px solid #D0D0D0;\r\n");
      out.write("\t\tcolor: #002166;\r\n");
      out.write("\t\tdisplay: block;\r\n");
      out.write("\t\tmargin: 14px 0 14px 0;\r\n");
      out.write("\t\tpadding: 12px 10px 12px 10px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t#body{\r\n");
      out.write("\t\tmargin: 0 15px 0 15px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tp.footer{\r\n");
      out.write("\t\ttext-align: right;\r\n");
      out.write("\t\tfont-size: 11px;\r\n");
      out.write("\t\tborder-top: 1px solid #D0D0D0;\r\n");
      out.write("\t\tline-height: 32px;\r\n");
      out.write("\t\tpadding: 0 10px 0 10px;\r\n");
      out.write("\t\tmargin: 20px 0 0 0;\r\n");
      out.write("\t} \r\n");
      out.write("\t\r\n");
      out.write("\t#container{\r\n");
      out.write("\t\tmargin: 10px;\r\n");
      out.write("\t\tborder: 1px solid #D0D0D0;\r\n");
      out.write("\t\t-webkit-box-shadow: 0 0 8px #D0D0D0;\r\n");
      out.write("\t}\r\n");
      out.write("\t#colLine {\r\n");
      out.write("\t float:left;\r\n");
      out.write("\t border-top:1px solid #cccccc;\r\n");
      out.write("\t border-left:1px solid #cccccc; \r\n");
      out.write("\t}\r\n");
      out.write("\t#colLine .ddiv\r\n");
      out.write("\t{\r\n");
      out.write("\t clear:both;\r\n");
      out.write("\t}\r\n");
      out.write("\t#colLine .ddiv div {\r\n");
      out.write("\t float:left;\r\n");
      out.write("\t border-right:1px solid #cccccc;\r\n");
      out.write("\t border-bottom:1px solid #cccccc;\r\n");
      out.write("\t height:100px;\r\n");
      out.write("\t width:300px; \r\n");
      out.write("\t} \r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body topmargin=\"0\"> \r\n");
      out.write("\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("\t<h1>Session Failover Test Page13</h1>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"body\"> \r\n");
      out.write("\t\t<p>Session info : </p>\r\n");
      out.write("\t\t<div> JSESSIONID<font color=red>.JvmRoute</font> : ");
      out.print(session.getId());
      out.write("</div>\r\n");
      out.write("\t\t<div> CREATION TIME : ");
      out.print(session.getCreationTime());
      out.write("</div>\r\n");
      out.write("\t\t<div> TIMEOUT IN SEC : ");
      out.print(session.getMaxInactiveInterval());
      out.write("</div> \r\n");
      out.write("\t\t<div> IS New : ");
      out.print(session.isNew());
      out.write("</div> \r\n");
      out.write(" \t\t\r\n");
      out.write("\t\t<div style=\"clear:both;\"></div>\r\n");
      out.write(" \t\t<p>Failover Test : </p>\r\n");
      out.write(" \t\t<div id=\"colLine\">   \r\n");
      out.write("\t\t\t<div class=\"ddiv\">\r\n");
      out.write("\t\t\t\t<div style=\"text-align:center\">\r\n");
      out.write("\t\t\t\t\tYou have hit this page <BR/><BR/> \r\n");
      out.write("\t\t\t\t\t<font color=red size=15> ");
      out.print( ival );
      out.write("</font> time");
      out.print( (ival.intValue() == 1) ? "" : "s" );
      out.write(", <BR/> \r\n");
      out.write("\t\t\t\t\tbefore the session times out.\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"text-align:center\">\r\n");
      out.write("\t\t\t\t\t You have hit this page a total of <BR/><BR/> \r\n");
      out.write("\t\t\t\t\t <font color=green size=15> ");
      out.print( cnt );
      out.write("</font> time");
      out.print( (cnt.intValue() == 1) ? "" : "s" );
      out.write("!\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div> \r\n");
      out.write("\t\t<div style=\"clear:both;\"></div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
  
double end = System.nanoTime();  
double elapsedTime = (end - start)/1000000000; 
//out.println("End  : " + end+" nano seconds");
//out.println("The process took approximately: " + elapsedTime + " nano seconds");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<p class=\"footer\">Page rendered in <strong>");
      out.print(seconds(elapsedTime));
      out.write("</strong> seconds</p>\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
