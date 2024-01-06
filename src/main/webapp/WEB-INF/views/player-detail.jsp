<!DOCTYPE html>
<html>
<head>
    <title>Player Details</title>
</head>
<body>
<h2>Player info</h2>
<hr>

<br><br>
<%--Player name : ＄{param.playerName}--%>
<%--request.getAttribute("playerName")--%>
Player name : <%= request.getParameter("playerName") %>

</body>
</html>