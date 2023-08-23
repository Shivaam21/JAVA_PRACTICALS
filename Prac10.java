// Ques 10

class Dist2{
    int feet;
    int inch;

    Dist2(int f, int i) { // constructor
        feet = f;
        inch = i;
        System.out.println("Constructor");
    }

    void disp() {
        System.out.println("Feet: " + feet);
        System.out.println("Inch: " + inch);
    }

    Dist2(Dist2 clone) {// copy constructor
        feet = clone.feet;
        inch = clone.inch;
        System.out.println("Clone Constructor");
    }
}

public class Prac10{
  public static void main(String[] args) {
        Dist2 d1 = new Dist2(3, 5);
        Dist2 d2 = new Dist2(d1);
        d1.disp();
        d2.disp();
    }
}

