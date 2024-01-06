<!DOCTYPE html>
<html>
<head>
    <title>Player Details</title>
</head>
<body>
<h2>Player info</h2>
<hr>

<br><br>
Player name : <%= request.getAttribute("name")%>
<br><br>
DoB: <%= request.getAttribute("dob")%>
<br><br>
Country: <%= request.getAttribute("country")%>
<br><br>
Titles: <%= request.getAttribute("titles")%>


</body>
</html>