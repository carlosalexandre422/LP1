import javax.swing.JOptionPane;


public class P609 {
    public static void main(String[] args) {
        float price;
        float rounded;

        do{
            price = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the price: "));
            price += 0.12*price;
            rounded = Math.round(price);

            if(price==0){
                JOptionPane.showMessageDialog(null, "leaving...");
                System.exit(0);
            }

            JOptionPane.showMessageDialog(null, "R$"+(rounded));
        } while(price!=0);
    }
}
