namespace C_Sharp
{
    public class Driver : Account
    {
        public Driver(string name, string document, string email, string password)
         : base(name, document, email, password)
        {
        }

        public override string ToString()
        {
            return "__Driver__\n" + base.ToString();
        }
    }
}
