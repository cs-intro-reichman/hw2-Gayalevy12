// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[])
	 {
	    int firstseed = Integer.parseInt(args[0]);
		String vorc = args[1];
        int Num = firstseed;
        int Count = 1;
		if (vorc.equals("v"))
		{
        for (int i = 0; i < firstseed; i++) {
            Num = i+1;
            System.out.print(Num + " ");
            do 
			{
                if (Num % 2 == 0) {
                    Num = Num / 2;
                    System.out.print(Num + " ");
                } 
				else 
				{
                    Num = (Num * 3) + 1;
                    System.out.print(Num + " ");
                }
                Count ++;
            } 
			while (Num != 1);
            System.out.print("(" + (Count) + ")");
            System.out.println();
            Count = 1;
        }
		System.out.println("Every one of the first " + firstseed + " hailstone sequences reached 1.");
	  }
	  else {
        System.out.println("Every one of the first " + firstseed  + " hailstone sequences reached 1.");
	  }

	}
}
