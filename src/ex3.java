import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        String s;
        int firstPlacePoints, lastPlacePoints, victorysNedded, difference;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number of first place wins: ");
            firstPlacePoints = scn.nextInt();

            System.out.println("Enter number of last place wins: ");
            lastPlacePoints = scn.nextInt();

            difference = firstPlacePoints-lastPlacePoints;

            if(difference%3==0){
                victorysNedded = difference/3;
            } else{
                victorysNedded = (difference/3)+1;
            }

            System.out.println("Victorys needed: " + victorysNedded);

    }
}
