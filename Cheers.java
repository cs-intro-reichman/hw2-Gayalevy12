//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String Name = args[0];
        int Number = Integer.parseInt(args[1]);
        String Spelling = "AEFHILMNORSX"; 
        for (int i=0; i < Name.length(); i++)
        {
            char currentLetter = Character.toUpperCase(Name.charAt(i));
            
            if (Spelling.indexOf(currentLetter) == -1)
            {
                System.out.println("Give me a  " + currentLetter + ": " + currentLetter + "!");
            }
            else
            System.out.println("Give me an " + currentLetter + ": " + currentLetter + "!");
        }
        System.out.println("What does that spell?");
        for(int j = 0; j < Number; j++)
        {
            System.out.printf(Name.toUpperCase() + "!!!" + "\n");
        }
}
}

      