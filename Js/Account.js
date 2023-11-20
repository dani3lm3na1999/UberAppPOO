class Account {
    constructor(nombre, document, email, password){
        this.name = nombre;
        this.document = document;
        this.email = email;
        this.password = password;
    }

    toString(){
        return `Nombre: ${this.name}\nDocument: ${this.document}\nEmail: ${this.email}`
    }
}