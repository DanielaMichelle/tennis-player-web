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
<%--POST, the URL string will no longer contain the player name.--%>
<form action = "processPlayerForm" method ="POST">
    Enter player name: <input type = "text" name = "playerName" />
    <input type = "submit" value = "Submit"/>
</form>
</body>
</html>