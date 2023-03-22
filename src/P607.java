import java.math.*;
import javax.swing.JOptionPane;
;
public class P607 {
    public static void main(String[] args) {
        String[] months = {"january","february","march","april", "may", "june", "july", "august", "september", "october", "november", "december"};
        int month = (int)(Math.random()*12);

        JOptionPane.showMessageDialog(null, "number: " + month + "\nmonth: " + months[month]);
    }
}
