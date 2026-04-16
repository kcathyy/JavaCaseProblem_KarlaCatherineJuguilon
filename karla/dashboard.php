<?php
session_start();

if (!isset($_SESSION['user'])) {
    header("Location: index.php");
    exit();

}
?>


<!DOCTYPE html>
<html lang="en">
<head>
    <title>Document</title>
</head>
<body>
    <h1> Welcome, <?php echo $_SESSION['user']; ?>!</h1>
    <a href="logout.php">Logout</a>

    <a href="add.php">Add Student</a>
</body>
</html>
