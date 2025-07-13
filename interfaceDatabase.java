interface interfaceDatabase
{
    void connect();
    void disconnect();
}
class MySQL implements interfaceDatabase
{
    public void connect()
    {
        System.out.println("MySQL Database Connected");
    }


    public void disconnect() {
        System.out.println("MySQL Database Dis-Connected");
    }

    public static void main(String[] args) {
        interfaceDatabase ref = new MySQL();
        ref.connect();
//        ref.disconnect();
    }
}
