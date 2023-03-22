import javax.swing.JOptionPane;
import java.util.Arrays;


public class P606 {
    public static void main(String[] args) {
        float[] notas = {0f,0f,0f,0f,0f};
        float sum = 0f;


        for(int i = 0; i < 5; i++){
            do{
                notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Forneça a " + (i+1) + "a nota: "));
            }while(notas[i]>10||notas[i]<0);
            
            sum += notas[i];
        }
        Arrays.sort(notas);
        JOptionPane.showMessageDialog(null,  "Notas em ordem crecente: \n"
                                                            + "\n1a nota: " + notas[0]
                                                            + "\n2a nota: " + notas[1]
                                                            + "\n3a nota: " + notas[2]
                                                            + "\n4a nota: " + notas[3]
                                                            + "\n5a nota: " + notas[4]
                                                            + ("\n media: " + (sum/5)));
        
        
        System.exit(0);
    }
}
