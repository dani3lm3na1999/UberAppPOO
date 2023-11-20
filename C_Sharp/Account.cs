namespace C_Sharp
{
    public class Account
    {
        private int id;
        private string name;
        private string document;
        private string email;
        private string password;

        public Account(string name, string document, string email, string password)
        {
            this.name = name;
            this.document = document;
            this.email = email;
            this.password = password;
        }

        public override string ToString()
        {
            return $"Nombre: {this.name}\nDocumento: {this.document}\nEmail: {this.email}";
        }
    }
}
