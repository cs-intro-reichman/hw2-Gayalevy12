public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
         int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
         int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
         int minutesToAdd = Integer.parseInt(args[1]); 
         int totalminutes = (hours)*60 + minutes +minutesToAdd;
         int totalhours = totalminutes/60;
         int Newhours = totalhours % 24;
         int Newminutes = totalminutes-(totalhours*60);
         String FormatHours = "" + Newhours;
         String FormatMinutes = "" + Newminutes;

         if (Newhours<10)
         {
            FormatHours = "0" + Newhours;

         }

         if (Newminutes < 10)
         {
            FormatMinutes = "0" + Newminutes;
         }
            System.out.printf(FormatHours + ":" + FormatMinutes +"\n");
         

    }
}
