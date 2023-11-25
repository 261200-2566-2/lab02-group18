
public class Main {
    public static class AirPurifier
    {
        String Model;
        String serialNo;
        String mode = "Auto";
        double width;
        double length;
        double height;
        boolean power;
        int Card;

        static int model_4ProCount;
        static int model4_Count;

        AirPurifier(String model, String serialNo)
        {
            this.Model = model;
            this.serialNo = serialNo;

            if(model.equals("4 Pro"))
            {
                width = 27.5;
                length = 27.5;
                height = 68;
                Card = 500;
                model_4ProCount++;
            }
            else
            {
                width = 25;
                length = 25;
                height = 55.5;
                Card = 400;
                model4_Count++;
            }
        }

        void size()
        {
            System.out.println(width + " * " + length + " * " + height + " cm");
        }

        void on_off()
        {
            power = !power;
        }

        void changMode()
        {
            if(power)
            {
                if (mode.equals("Auto")) mode = "Sleep";
                else if (mode.equals("Sleep")) mode = "Turbo";
                else mode = "Auto";
            }
        }

        void screen()
        {
            if(power)
            {
                System.out.print("On , ");
                System.out.println("Mode : " + mode);
            }
        }

        static String mostPopularModel()
        {
            System.out.print("The most popular model : ");
            if(model_4ProCount > model4_Count) return "4 Pro";
            else if(model_4ProCount < model4_Count) return "4";
            else return "None";
        }
    }

    public static void main(String[] args)
    {
        AirPurifier x = new AirPurifier("4 Pro", "1170");
        System.out.println(x.Model + " " + "number serial is " + x.serialNo);
        x.size();
        System.out.println(x.Card);
        System.out.println(x.mode);
        x.changMode();
        x.on_off();
        x.screen();
        x.changMode();
        x.screen();
        System.out.println("4Pro Count = " + AirPurifier.model_4ProCount);
        System.out.println("4 Count = " + AirPurifier.model4_Count);
        System.out.println(AirPurifier.mostPopularModel());

        System.out.println();

        AirPurifier y = new AirPurifier("Pro", "1275");
        System.out.println(y.Model + " " + "number serial is " + y.serialNo);
        y.size();
        System.out.println(y.Card);
        System.out.println(y.mode);
        y.on_off();
        y.changMode();
        y.changMode();
        y.screen();
        System.out.println("4Pro Count = " + AirPurifier.model_4ProCount);
        System.out.println("4 Count = " + AirPurifier.model4_Count);
        System.out.println(AirPurifier.mostPopularModel());
    }
}