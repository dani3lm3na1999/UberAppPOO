class Driver extends Account {
    constructor(nombre, document, email, password){
        super(nombre, document, email, password);
    }

    toString() {
        return "__Driver__" + super.toString(); 
    }
}