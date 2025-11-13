// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) 
	{ 
		int number = Integer.parseInt(args[0]);
		int Denominator = 1;
		double sum = 0;
		for(int i=0; i<number; i++)
		{
            if (i % 2 == 0) 
			{
               sum = sum + (1.0/Denominator);

            }         
			  else 
			  {
                   sum= sum - (1.0/Denominator);
               }
           Denominator = Denominator +2 ;
			}
		sum=sum*4;
		  
		   System.out.println("pi according to Java: 3.141592653589793");
		   System.out.println("pi, approximated:     " + sum);
	
}
}

	    