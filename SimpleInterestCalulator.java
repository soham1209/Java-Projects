import java.util.Scanner;

class Farmer {
    int pa;
    float td;
    static float ri;
    float si;

    static {
        ri = 4.5f;
    }

    void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount required");
        pa = input.nextInt();
        System.out.println("Enter the time duration in year");
        td = input.nextFloat();
    }

    void compute() {
        si = (pa * ri * td) / 100f;
    }

    void getSi() {
        System.out.println("Simple Intrest is :" + si);
    }
}

public class SimpleInterestCalulator {

    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        Farmer f2 = new Farmer();

        f1.input();
        f1.compute();
        f1.getSi();

        f2.input();
        f2.compute();
        f2.getSi();
    }
}
