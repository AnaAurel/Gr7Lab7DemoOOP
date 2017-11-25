public class Cow extends Animal{

    String name;
    public Cow(String name)
    {
        super(1);
     this.name=name;
        System.out.println("se naste o vaca");

    }

    @Override
    public void noise() {
        System.out.println("zgomot de cow ");
        new MakeASound().playMP3("cow.wav");
    }
}
