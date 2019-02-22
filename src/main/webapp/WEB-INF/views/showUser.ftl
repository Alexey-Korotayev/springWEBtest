<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User</title>
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
        INPUT {
            background: aquamarine;
            color: black;
            border-radius: 10px;
            border: 1px solid #666;
            height: 30px;
            width: 200px;
        }
    </style>
</head>
<body>

<h1>User Info</h1>
<table>
    <tr>
        <th>Item</th>
        <th>Value</th>
    </tr>
    <tr>
        <td>ID</td>
        <td>${user.id}</td>
    </tr>
    <tr>
        <td>NAME</td>
        <td>${user.name}</td>
    </tr>
    <tr>
        <td>EMAIL</td>
        <td>${user.email}</td>
    </tr>
    <tr>
        <td>AGEE</td>
        <td>${user.age}</td>
    </tr>
</table>
<br>
<a href="/users">Return to List users</a>

<form action="/users">
    <input type="submit" value="Return" />
</form>

</body>
</html>