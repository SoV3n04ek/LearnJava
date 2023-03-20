public class Task04 {
    public static class Device
    {
        private String name;
        private String description;

        public Device()
        {
            name = "device";
            description = "device description";
        }

        public Device(String name, String description)
        {
            this.name = name;
            this.description = description;
        }

        public void Sound()
        {
            System.out.println("Device sound");
        }

        public void Show()
        {
            System.out.println(name);
        }

        public void Desc()
        {
            System.out.println(description);
        }


        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Kettle extends Device
    {
        public Kettle(String name, String description)
        {
            super(name, description);
        }

        @Override
        public void Sound()
        {
            System.out.println("Whiiiiiiiiiistle");
        }

        @Override
        public void Show()
        {
            System.out.println("Kettle " + getName());
        }


        @Override
        public void Desc()
        {
            System.out.println("A modern stovetop kettle is a metal vessel, with a flat bottom, used to heat water on a stovetop or hob.\n" +
                    "They usually have a handle on top, a spout, and a lid.\n" +
                    "Some also have a steam whistle that indicates when the water has reached boiling point.\n");
        }
    }

    public static class MicrowaveOven extends Device
    {
        public MicrowaveOven(String name, String description)
        {
            super(name, description);
        }




    }



    public static void main(String[] args)
    {

    }

}
