<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Enterprise Sample Application</title>

 <script type="text/javascript">
            function validate()
            {
                if(document.frm.A.value=="")
                {
                  alert("Please enter the numbers ");
                  document.frm.A.focus();
                  return true;
                }
                if(document.frm.password.value=="")
                {
                  alert("Please enter the numbers ");
                  document.frm.B.focus();
                  return true;
                }
            }

        </script>
</head>
<body>
	<br />
	
	<%=request.getAttribute("name")%>
</body>
<form action="${pageContext.request.contextPath}/VishnuServeletTwo" name = "frm" onsubmit="return validate();"
	method="post" >

<input type="number" name="A"  />
<b></b><b></b> 
<input type="number" name="B" />
<b></b> <b></b> 
<input type="submit" name="button1" value="GetSum" />

</form>
</html>