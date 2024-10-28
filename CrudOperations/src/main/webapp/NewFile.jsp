<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table,th,td{
	border:1px solid black;
	border-collapse:collapse;
	padding:2px;
	text-align:center
}
table{
	width:80%;
	margin:50px;
}
th{
	background:lightblue;
}
</style>
</head>
<body>

<%
try{
	String url = "com.mysql.cj.jdbc.Driver";
	String dburl = "jdbc:mysql://localhost/shiva";
	String uname = "root";
	String pwd = "";
	Class.forName(url);
	Connection con = DriverManager.getConnection(dburl,uname,pwd);
	String sql = "select *from employee";
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(sql);

	out.print("<table>");
	out.print("<tr>");
	out.print("<th>Employee_Id</th>");
	out.print("<th>Name</th>");
	out.print("<th>JobRole</th>");
	out.print("<th>Salary</th>");
	out.print("<th>Location</th>");
	out.print("</tr>");
	while(rs.next()){
		out.print("<tr>");
		for(int x = 1;x<=5;x++){
			out.print("<td>"+rs.getString(x)+"</td>");
		}
		out.print("</tr>");	
	}
	out.print("</table>");
}
catch(Exception e){
	out.print("Exception:"+e.getMessage());
}
%>
</body>
</html>