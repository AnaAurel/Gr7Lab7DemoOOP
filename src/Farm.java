public class Farm {


    private Animal[] animals = new Animal[5];

    public static void main(String[] args) {

        Farm f = new Farm();
        f.init();
        f.concert();


    }

    public void init() {
        animals[0] = new Cow("joiana");
//        animals[1]=new Rooster();
//        animals[2]=new Rooster();
//        animals[3]=new Dog();
//        animals[4]=new Cat();
    }

    public void concert() {

        for (int i = 0; i < animals.length; i++) {

            if (animals[i] != null) {
                animals[i].noise();
                System.out.println(animals[i].day);
            }
        }

    }


}
