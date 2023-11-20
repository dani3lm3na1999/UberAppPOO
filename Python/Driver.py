from Account import Account

class Driver(Account):
    def __init__(self, name, document, email, password):
        super().__init__(name, document, email, password)

    def __str__(self):
        return "__Driver__\n" + super().__str__()