<?php
require_once("Account.php");
require_once("Driver.php");
require_once("User.php");

$usuario1 = new User("Francisco", "052310413", "francisco@example.com", "contraseña");
$driver1 = new Driver("Daniel", "051230221", "daniel@example.com", "contraseña");

echo $usuario1;
echo $driver1;
?>