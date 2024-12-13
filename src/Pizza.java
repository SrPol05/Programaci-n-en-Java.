public class Pizza
{
    private String size;
    private String type;

    public Pizza(String size, String type)
    {
        this.size = size;
        this. type= type;
    }

    public void presss() {
        System.out.println("Pizza " + this.size + this.type);
    }
}
