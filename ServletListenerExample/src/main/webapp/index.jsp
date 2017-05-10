<%@page import="java.sql.Connection"%>
<%@page import="com.maroti.servlet.db.DbManager"%>
<html>
<body>
<%DbManager db=(DbManager)application.getAttribute("db");
Connection con=db.getConnection();
out.print(con.toString()); %>

</body>
</html>
