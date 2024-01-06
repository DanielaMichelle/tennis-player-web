<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Player Confirmation</title>
</head>
<body>
<h2>Player Confirmation</h2>
<hr>

<br><br>
The player has been added.

<br><br>
<b>Name</b> : <%= request.getAttribute("athlete").getClass().getMethod("getLastName")%>

<br><br>
<b>Country</b> : ${athlete.country}

<br><br>
<b>Handedness</b> : ${athlete.handedness}

<br><br>
<b>Grand Slam Titles</b> :
<ul>
    <c:forEach items="${athlete.grandSlams}" var="grandSlam">
        <li>${grandSlam}</li>
    </c:forEach>
</ul>

</body>
</html>
