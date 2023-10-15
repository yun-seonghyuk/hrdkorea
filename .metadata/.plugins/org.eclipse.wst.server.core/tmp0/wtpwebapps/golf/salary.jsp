<%@page import="java.text.DecimalFormat"%>
<%@page import="java.sql.ResultSet"%>
<%@include file="db.jsp" %>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>salary</title>
<style type="text/css">
	td{
		width: 150px;
	}
</style>
</head>
<body>
<jsp:include page="header.jsp"/>
<section style="position: fixed; top: 70px; left: 0px; width: 100%; height: 100%; background-color: lightgray">
<h2 style="text-align: center">강사매출현황</h2>
<form action="" style="display: flex; align-items: center; justify-content: center; text-align: center">
<table border="1">
	<tr>
		<td>강사코드</td>
		<td>강의명</td>
		<td>강사명</td>
		<td>총매출</td>
	</tr>
	<%
		request.setCharacterEncoding("utf-8");
		String sql = "select cl.teacher_code, class_name, teacher_name, sum(tuition) as salary "+
					" from tbl_teacher_202201 te, tbl_class_202201 cl "+
					" where te.teacher_code=cl.teacher_code "+
					" group by cl.teacher_code, class_name, teacher_name "+
					" order by cl.teacher_code";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			int salary = rs.getInt(4);
			DecimalFormat transformat = new DecimalFormat("￦ ###,###,###");
			String salary2 = transformat.format(salary);
	%>
		<tr>
			<td><%=rs.getString(1) %></td>
			<td><%=rs.getString(2) %></td>
			<td style="text-align: right"><%=rs.getString(3) %></td>
			<td style="text-align: right"><%= salary2%></td>
		</tr>
	<% 
		}
		
		try{
			
		}catch(Exception e){
			e.printStackTrace();
		}
	%>
</table>
</form>
</section>
<jsp:include page="footer.jsp"/>
</body>
</html>