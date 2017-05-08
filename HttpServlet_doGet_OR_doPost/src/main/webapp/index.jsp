<html>
<title>doGet OR doPost</title>
<head>
<link rel="stylesheet" href="./custome.css">
</head>
<body>

<div style="border:1px solid black;padding:10px 10px 10px 10px; margin-left:500px; margin-right: 500px; ">
<h2 style="border-bottom: 1px solid black; text-align: center;">Fill Data</h2>
<form action="show" method="post">
	<pre>
	Name    <input type="text" name="name"><br>
	ADDRESS <input type="text" name="address"><br>
	MOBILE  <input type="text" name="mobile"><br>
	<h3>Select Subjects:</h3><br>
	<input type="checkbox" name="java" value="Java" checked> JAVA<br>
	<input type="checkbox" name="servlet" value="Servlet" checked>SERVLET<br>
	<input type="checkbox" name="jsp" value="Jsp" checked> JSP<br>
	        <input type="submit" value="SUBMIT">
	</pre>
</form>
</div>
</body>
</html>
