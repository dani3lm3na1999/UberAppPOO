from Driver import Driver
from User import User

usuario_1 = User("Francisco", "052310413", "francisco@example.com", "contraseña")
conductor_1 = Driver("Daniel", "051230221", "daniel@example.com", "contraseña")

print(usuario_1.__str__())
print()
print(conductor_1.__str__())