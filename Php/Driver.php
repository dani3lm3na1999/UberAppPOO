<?php 
class Driver extends Account {
    public function __construct($name, $document, $email, $password){
        parent::__construct($name, $document, $email, $password);
    }

    public function __toString(){
        return "__Driver__\n".parent::__toString();
    }
}

?>