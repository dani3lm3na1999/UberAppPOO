namespace C_Sharp
{
    public class User : Account
    {
        public User(string name, string document, string email, string password)
         : base(name, document, email, password)
        {

        }

        public override string ToString()
        {
            return "__User__\n" + base.ToString();
        }
    }
}
