<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <#--<link href="WEB-INF/views/tableStyle1.css" type="text/css" rel="stylesheet" />-->
    <style type="text/css">
    TABLE {
    border: 1px solid black;
    font-size: 16px;
    }
    TD, TH {
    padding: 5px;
    }
    TH {
    text-align: left;
    background: black;
    color: white;
    }
    </style>
    <title>Users</title>
</head>
<body>
<form action="/addUser">
    <input type="submit" value="Add new user" />
</form>

    <h1>Users list</h1>
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Age</th>
            <th></th>
            <th></th>
        </tr>
    <#list users as user>
    <tr>
        <td>${user.id}</td>
        <td><a href="/user/${user.id}">${user.name}</a></td>
        <td>${user.email}</td>
        <td>${user.age}</td>
        <td><a href="/update/${user.id}">edit</a></td>
        <td><a href="/delete/${user.id}">delete</a></td>
    </tr>
    </#list>
    </table>
</body>
</html>