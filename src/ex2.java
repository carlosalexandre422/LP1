import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2 {
    public static void main(String[] args) {
        String s;
        float price, percentageOfDiscount, discount;
        BufferedReader date;

        try {
            System.out.println("Enter the price: ");
            date = new BufferedReader(new InputStreamReader(System.in));
            s = date.readLine();
            price = Float.parseFloat(s);

            System.out.println("Enter the percentage of discount: ");
            date = new BufferedReader(new InputStreamReader(System.in));
            s = date.readLine();
            percentageOfDiscount = Float.parseFloat(s);

            discount = price*percentageOfDiscount/100;

            System.out.println("Discount: R$" + discount);
            System.out.println("Discount price: R$" + (price-discount));

        } catch(IOException erro){
            System.out.println("There was an error in data entry" + erro.toString());
        } catch(NumberFormatException erro){
            System.out.println("There was an error in conversion, enter only numerical caracters " + erro.toString());
        }
    }
}
