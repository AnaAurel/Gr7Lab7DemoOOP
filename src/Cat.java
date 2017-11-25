public class Cat extends Animal {

    Cat() {
        super(1);
    }

    @Override
    public void noise() {
        System.out.println("zgomot de cat ");
        new MakeASound().playMP3("cat.wav");
    }
}
