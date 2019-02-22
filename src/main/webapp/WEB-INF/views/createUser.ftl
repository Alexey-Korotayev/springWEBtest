<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create user</title>
    <script>
        function comeback() {
            window.location.href='/users';
        }
    </script>
</head>
<body>

<b> Create new user</b>
<form name="user" action="/addUser" method="post">
    <p>Name</p>
    <input title="Name" type="text" name="name">
    <br>
    <p>e-Mail</p>
    <input title="eMail" type="text" name="email">
    <br>
    <p>Age</p>
    <input title="Age" type="text" name="age">
    <br>
    <input type = "submit" value="OK">
    <input type="button" onclick="comeback()" value="Cancel!">
</form>
</body>
</html>