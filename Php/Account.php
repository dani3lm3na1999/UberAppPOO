<?php 
class Account {
    private $id;
    private $name;
    private $document;
    private $email;
    private $password;

    public function __construct($name, $document, $email, $password){
        $this->name = $name;
        $this->document = $document;
        $this->email = $email;
        $this->password = $password;
    }

    public function __toString(){
        return "Name: ".$this->name."\nDocument: ".$this->document."\nEmail: ".$this->email;
    }
}
?>