import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoInterf {

    public static void main(String[] args) {

        List<Animal> listaDeAnimale;

        listaDeAnimale = new LinkedList<>(); // pot sa schimb implementarea
        listaDeAnimale.add(new Rooster());
        listaDeAnimale.add(new Cow("joiana"));

        //

        Animal a = listaDeAnimale.get(1);

        a.noise();


    }
}
