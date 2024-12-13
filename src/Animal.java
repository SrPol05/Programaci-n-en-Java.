public abstract class Animal
{
    private String name;
    private String specie;
    private int age;

    public Animal(String name, String specie, int age)
    {
        this.name = name;
        this.specie = specie;
        this.age = age;
    }

    public String description() {
         String descriptions = String.format("El animal se llama " + name + " es un " + specie + " tiene " + age + "años.");
         return descriptions;
    }
}
