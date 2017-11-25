public class DemoRec {

    public long factorial(long n) {
      //  if(n==1)   // conditia de iesire din recursivitate
        //    return 1;
        //else

        long v = 0;

        try {
            v = (n * factorial(n - 1));
        }
        catch(Throwable t ) {
            System.out.println("ba, prea mare numar in pana mea ");
        }
        return v;   /// recursivitate

    }
    public static void main(String[] args) {


        System.out.println(new DemoRec().factorial(20));

    }
}

// 4! = 4 * 3!   (24)
// 3! = 3 * 2!   (6)
// 2! = 2 * 1!    (2)
// 1! = 1         (1)

