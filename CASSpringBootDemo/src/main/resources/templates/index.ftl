<!DOCTYPE html>  
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"  
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">  
    <head>  
        <title>CAS</title>  
    </head>  
    <body>
       <center>       
        
	       	<table border="1" >
		        <tr>
		            <td>用户名:</td>
		            <td>${cn}</td>
		        </tr>
		        <tr>
		            <td>姓名:</td>
		            <td>${displayName}</td>
		        </tr>
		        <tr>
		            <td>手机:</td>
		            <td>${mobile}</td>
		        </tr>
		        <tr>
		            <td>邮箱:</td>
		            <td>${email}</td>
		        </tr>
		        <tr>
		            <td>公司:</td>
		            <td>${company}</td>
		        </tr>
		    </table>
	    
	    	<a href="logout" >退出登录</a>
       
       </center>
    </body>  
</html>