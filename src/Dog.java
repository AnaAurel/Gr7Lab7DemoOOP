public class Dog extends Animal {

  Dog() {
      super(1);
  }

    @Override
    public void noise() {
        System.out.println("zgomot de dog ");
        new MakeASound().playMP3("dog.wav");
    }
}
