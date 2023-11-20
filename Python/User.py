from Account import Account

class User(Account):
    def __init__(self, name, document, email, password):
        super().__init__(name, document, email, password)

    def __str__(self):
        return "__User__\n" + super().__str__()