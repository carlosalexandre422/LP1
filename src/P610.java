import javax.swing.JOptionPane;

public class P610 {
   public static void main(String[] args) {
   String phrase = JOptionPane.showInputDialog(null, "Enter the phrase: ");


       phrase = phrase.replace(" ", "");
       String reversePhrase = new
       StringBuilder(phrase).reverse().toString();

       JOptionPane.showMessageDialog(null, reversePhrase);
   }
}
