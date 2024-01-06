<!DOCTYPE html>
<html>
<head>
    <title>Player Form</title>
</head>
<body>
<h2>Player Form</h2>
<br>
<%--The <form> element sends the data to the path processPlayerForm.--%>
<%--a GET request is generated for /processPlayerForm--%>
<form action = "processPlayerForm" method ="GET">
    Enter player name: <input type = "text" name = "playerName" />
    <input type = "submit" value = "Submit"/>
</form>
</body>
</html>