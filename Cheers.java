//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String Name = args[0];
                int number = Integer.parseInt(args[1]);
                String spelling = "AEFHILMNORSX";
                for (int i=0; i<Name.length(); i++)
                {
                        if (spelling.indexOf(Name.charAt(i))== -1)
                        {
                                System.out.println(" Give me a " + Name.charAt(i) + " : " + Name.charAt(i) + "!");
                        }
                        else
                        System.out.println(" Give me an " + Name.charAt(i) + " : " + Name.charAt(i) + "!");
                
                        
                }
                System.out.println("What dous thet spell?");
                for(int j = 0; j<number; j++)
                {
                        System.out.printf(Name + "!!!" + "\n");
                }
	    // Replace this comment with your code
        }
}
