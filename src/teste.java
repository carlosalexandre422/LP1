import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
 
class GFG {
    public static void main(String[] args)
    {
        String phrase = JOptionPane.showInputDialog(null, "Phrase: ");

        List<String> letters = new ArrayList<>(
            Arrays.asList(phrase));
       
            
        JOptionPane.showMessageDialog(null, "Reverse order of given List :- ");
 
 
        for (int k = 0, j = letters.size() - 1; k < j; k++)
        {
            letters.add(k, letters.remove(j));
        }
 
        JOptionPane.showMessageDialog(null, letters);
    }
}