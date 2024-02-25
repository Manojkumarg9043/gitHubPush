<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="design/Login/design.css">
</head>
<body>
	<h2>Login</h2>
    <div class="container">
        <form action="LoginPage">
            <div class="name">
                <label for="Username">Username</label>
                <input type="text" name="username" id="Username">
            </div>
            <div class="password">
                <label for="password">Password</label>
                <input type="password" name="password" id="password">
            </div>
            <button type="submit">Login</button>
        </form>
    </div>
</body>
</html>