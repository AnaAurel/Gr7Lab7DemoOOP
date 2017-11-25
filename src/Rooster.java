public class Rooster extends Animal {

    Rooster() {
        super(1);
    }

    @Override
    public void noise() {
        System.out.println("zgomot de rooster ");
        new MakeASound().playMP3("rooster.wav");
    }
}
