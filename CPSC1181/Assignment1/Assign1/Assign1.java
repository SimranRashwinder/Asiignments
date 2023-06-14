import javax.swing.*;

/** In this code I have used the knowledge and the JOptionPane code provided by the professor*/
public class Assign1 {
    //main method
    public static void main(String[] args) {
        System.out.println("lets play a mystery game!");
        int opt; //for continue or terminate
        int option;// for different levels
        do {
            String[] levels = {"Novice", "Intermediate", "Expert"};
            option = JOptionPane.showOptionDialog(null, "Which level would you like to play", "Novice",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    levels,
                    levels[1]
            );
            /** The code below helps to execute different levels of game where option 0= novice, 1= intermediate, 2= expert; */
            if (option == 0) {
                int b = playNovice();
                JOptionPane.showMessageDialog(null, "number=" + b);
            } else if (option == 1) {
                int d = playIntermediate();
                JOptionPane.showMessageDialog(null, "number=" + d);
            } else if (option == 2) {
                int f = playExpert();
                JOptionPane.showMessageDialog(null, "number=" + f);

            }
            /**This part is for continue or terminate after one part is played */
            String[] level = {"Yes", "No"};

            opt = JOptionPane.showOptionDialog(null, "Would you like to continue?", "Continue?",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,

                    null,
                    level,
                    level[1]); // use No as the default


            if (opt == 0)
                System.out.println("Continue....");
            else
                System.out.println("Terminate the program....");

        } while (opt == 0);


    }

 /** Method for playing novice level*/
    public static int playNovice(){
        String input = JOptionPane.showInputDialog(null, "Think of a number in your mind. Now, multiply that number with 10 and write the resulted number below: ", "Input", JOptionPane.QUESTION_MESSAGE);
        int a = Integer.parseInt(input);
        int b = a/10;
        return b;
    }

 /** Method for playing intermediate level*/
    public static int playIntermediate(){
        String input = JOptionPane.showInputDialog(null, "Think of a number in your mind. Now, multiply that number with 10 then add 12 into it and then subtract 6 from resulting number. Now, write the resulted number below: ", "Input", JOptionPane.QUESTION_MESSAGE);
        int c = Integer.parseInt(input);
        int d = c/10 +6;
        return d;
    }
 /** Method for playing expert level*/
    public static int playExpert(){
        String input = JOptionPane.showInputDialog(null, "Think of a number in your mind. Now, add 15 into it and subtract 6 from it , then multiply that result by 100 and then divide the resulting number by 5. Now, write the resulted number below: ", "Input", JOptionPane.QUESTION_MESSAGE);
        int e = Integer.parseInt(input);
        int f = ((e - 9)/100)*5;
        return f;
    }


}
