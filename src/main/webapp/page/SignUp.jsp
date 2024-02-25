<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="design/SignUp/design.css">
</head>
<body>
	<h2>Sing Up</h2>
    <div class="container">
        <form action="storeDetails">
            <div class="name">
                <label for="Username">Username</label>
                <input type="text" name="username" id="Username">
            </div>
            <div class="gmail">
                <label for="gmail">Gmail</label>
                <input type="text" name="gmail" id="gmail">
            </div>
            <div class="mobile">
                <label for="mobile">Mobile</label>
                <input type="text" name="mobile" id="mobile">
            </div>
            <div class="password">
                <label for="password">Password</label>
                <input type="text" name="password" id="password">
            </div>
            <button type="submit" >Sign Ups</button>
            
        </form>
    </div>
</body>
</html>