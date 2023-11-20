class Account:
    def __init__(self, name, document, email, password):
        self.__name = name
        self.__document = document
        self.__email = email
        self.__password = password

    def __str__(self):
        return f"Nombre: {self.__name}\nDocumento: {self.__document}\nEmail: {self.__email}"