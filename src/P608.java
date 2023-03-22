import javax.swing.JOptionPane;

public class P608 {
    public static void main(String[] args) {
        int[] moves = {0,0,0}; 
        int sum = 0;

        for(int i = 0; i < 3; i++){
            moves[i] = (int)(Math.random()*6)+1;
            sum += moves[i];
        }

        JOptionPane.showMessageDialog(null, "Raffled numbers: \n" + 
                                                            "First move: " + moves[0] + 
                                                            "\nSecond move: " + moves[1]  + 
                                                            "\nThird move: " + moves[2] + 
                                                            "\nSum: " + sum);
    }
}
