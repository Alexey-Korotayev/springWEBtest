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
    <h1>Users list</h1>
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Age</th>
        </tr>
    <#list users as user>
    <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.email}</td>
        <td>${user.age}</td>
    </tr>
    </#list>
    </table>
</body>
</html>