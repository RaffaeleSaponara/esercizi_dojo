package designPattern;

public class Singleton
{
    private static Singleton istanza;

    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        if (istanza == null)
        {
            istanza = new Singleton();
        }

        return istanza;
    }

    public void helloWorld()
    {
        System.out.println("Hello World");
    }
}

class usaSingleton
{
    public static void main(String args[])
    {
        Singleton.getInstance().helloWorld();
    }
}