public class Task01
{
    ///////enum

    public static class Human
    {
        public String name;

        public int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Builder extends Human
    {
        private int countProjects;
        private int salary;
        public Builder(String name, int age, int countProjects)
        {
            super(name, age);
            this.countProjects = countProjects;
        }

        public void work()
        {
            System.out.println("I'm Build...");
        }
    }

    static class Sailor extends Human
    {
        public Sailor(String name, int age) {
            super(name, age);
        }

        public void work()
        {
            System.out.println("works on a ship");
        }
    }

    static class Pilot extends Human
    {
        public Pilot(String name, int age) {
            super(name, age);
        }

        public void work()
        {
            System.out.println("Operate and controlling aircraft along planned routes and during takeoffs and landings");
        }
    }

    public static void main(String[] arg)
    {
        Human h = new Human("Name", 36);
        System.out.println(h.age);

        Builder builder = new Builder("Rafael Jacobson", 44, 4);
        Sailor sailor = new Sailor("Serena Miranda", 26);
        Pilot pilot = new Pilot("Gregory Hutchinson", 29);

        builder.work();
        sailor.work();
        pilot.work();
    }
}