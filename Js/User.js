class User extends Account {
    constructor(nombre, document, email, password){
        super(nombre, document, email, password);
    }

    toString() {
        return "__User__" + super.toString(); 
    }
}