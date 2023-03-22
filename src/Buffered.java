import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Buffered {
    public static void main(String[] args) {
        String s;
        float length, width, area, perimeter;
        BufferedReader date;

        try {
            System.out.println("Enter the length: ");
            date = new BufferedReader(new InputStreamReader(System.in));
            s = date.readLine();
            length = Float.parseFloat(s);

            System.out.println("Enter the width: ");
            date = new BufferedReader(new InputStreamReader(System.in));
            s = date.readLine();
            width = Float.parseFloat(s);

            area = length*width;
            perimeter = 2*length + 2*width;

            System.out.println("Area of the triangle: " + area);
            System.out.println("Perimeter: " + perimeter);

        } catch(IOException erro){
            System.out.println("There was an error in data entry" + erro.toString());
        } catch(NumberFormatException erro){
            System.out.println("There was an error in conversion, enter only numerical caracters " + erro.toString());
        }
    }
}
