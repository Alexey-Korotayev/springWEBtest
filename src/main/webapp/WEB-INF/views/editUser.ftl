<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit user</title>
    <script>
        function comeback() {
            window.location.href='/users';
        }
    </script>
</head>
<body>

<b> Edit users information</b>
<br>
<form name="user" action="/editUser" method="post" >
    <p>Id</p>
    <input title="Id" type="text" name="id" value="${user.id}" readonly>
    <br>
    <p>Name</p>
    <input title="Name" type="text" name="name" value="${user.name}">
    <br>
    <p>e-Mail</p>
    <input title="eMail" type="text" name="email" value="${user.email}">
    <br>
    <p>Age</p>
    <input title="Age" type="text" name="age" value="${user.age}">
    <br>
    <br>
    <input type ="submit" value="OK">
    <input type="button" onclick="comeback()" value="Cancel!">

</form>
</body>
</html>