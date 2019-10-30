<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>这是我的动态网页制作</title>

</head>


<body>
<%!
	int d=0;
	int a,b,c;
	public String panduan(int d){
		if(d>0){
			return "<p style=\"color:red;\">d>0</p>";
		}
		else{
			return "d<=0";	
		}
	}
%>



<%=panduan(-2) %>

<%
	out.println("dsfsdfsd");
%>
<br>

<%
out.println("Your IP address is " + request.getRemoteAddr());
%>
<p>
   今天的日期是: <%= (new java.util.Date()).toLocaleString()%>
</p>
<br><br><br><br>
<%@ include file="NewFile.jsp" %>
<!-- <h1>gjhjhjhjh</h1> 

<p style="font-size:25px; color:red; float:right;">sdfsdfsf</p>
<a href="http:\\www.bilibili.com" target="_blank"> sajkdlajsl</a>

-->
</body>
</html>