import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc1 = new Scanner(System.in);
        float weight = sc1.nextFloat();

        Scanner sc2 = new Scanner(System.in);
        float height = sc2.nextFloat();

        System.out.println("IMC: "+((weight/height)*100));
    }
}
