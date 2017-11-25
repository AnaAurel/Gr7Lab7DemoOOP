import sun.applet.Main;

import java.io.IOException;

public class MainPerson{

    static String bau;
    public void metoda () throws Exception{

        Person p = new Person();
        p.setName("ionel");

            p.setAge(330);


    }

    public static void main(String[] args){

        try {
            new MainPerson().metoda();
        }


        catch (IOException e) {
            System.out.println("mesaj ca nu ai facut bine");
        }
        catch (NullPointerException e) {
            System.out.println("mesaj ca nu ai facut bine");
        }

        catch (Exception e) {
            System.out.println("mesaj ca nu ai facut bine");
        }

        System.out.println("cucu bau ");


        //

        ///

        if(bau!=null && bau.contains("ana are mere"))
            System.out.println("da, contine");
        else
            System.out.println("nu contine");


        System.out.println("continua programul ");

    }
}
