/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.84
 * Generated at: 2023-10-12 09:55:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class jumlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/db.jsp", Long.valueOf(1697098831472L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("java.sql.DriverManager");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Class.forName("oracle.jdbc.OracleDriver");
	Connection con = DriverManager.getConnection(
			"jdbc:oracle:thin:@//localhost:1521/xe","system","1234");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>jumlist</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("<section style=\"position: fixed; top: 70px; left: 0px; width: 100%; height: 100%; \r\n");
      out.write("background-color: lightgray\">\r\n");
      out.write("<h2 style=\"text-align: center\">성적현황</h2>\r\n");
      out.write("<form action=\"\" style=\"display: flex; align-items: center; justify-content: center; text-align: center\">\r\n");
      out.write("	<table border=\"1\">\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>학번</td>\r\n");
      out.write("			<td>성명</td>\r\n");
      out.write("			<td>교과목</td>\r\n");
      out.write("			<td>교과목코드</td>\r\n");
      out.write("			<td>담당교수</td>\r\n");
      out.write("			<td>중간</td>\r\n");
      out.write("			<td>기말</td>\r\n");
      out.write("			<td>출석</td>\r\n");
      out.write("			<td>레포트</td>\r\n");
      out.write("			<td>기타</td>\r\n");
      out.write("			<td>평균</td>\r\n");
      out.write("			<td>총점</td>\r\n");
      out.write("			<td>학점</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		");

			request.setCharacterEncoding("utf-8");
			try{
				String sql = "select st.stuid, sname, subname, sc.subcode, proname, midscore, finalscore, attend, report, etc, "+
							" TO_CHAR((midscore+finalscore+attend+report+etc)/5, '999'), "+
						 	" TO_CHAR((midscore*0.3) + (finalscore*0.3)+(attend*0.2)+(report*0.1)+(etc*0.1),'999.0'), "+
							" (midscore*0.3) + (finalscore*0.3)+(attend*0.2)+(report*0.1)+(etc*0.1)  "+
							" from tbl_student_202210 st, tbl_score_202210 sc, tbl_subject_202210 su "+
						 	" where st.stuid=sc.sid and sc.subcode=su.subcode "+
							" order by sname";
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					int sum = rs.getInt(13);
					String grade = "";
					if(sum>=95){
						grade = "A+";
					} else if(sum>=90){
						grade = "A";
					} else if(sum >= 85){
						grade = "B+";
					} else if(sum >= 80){
						grade = "B";
					} else if(sum >= 75){
						grade = "C+";
					} else if(sum >= 70){
						grade = "C";
					} else if(sum >= 65){
						grade = "D+";
					} else if(sum >= 60){
						grade = "D";
					} else {
						grade = "F";
					}
		
      out.write("\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>");
      out.print(rs.getString(1) );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(rs.getString(2) );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(rs.getString(3) );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(rs.getString(4) );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(rs.getString(5) );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(rs.getString(6) );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(rs.getString(7) );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(rs.getString(8) );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(rs.getString(9) );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(rs.getString(10) );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(rs.getString(11) );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(rs.getString(12) );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(grade );
      out.write("</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("		");
 
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		
      out.write("\r\n");
      out.write("	</table>\r\n");
      out.write("</form>\r\n");
      out.write("</section>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
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
