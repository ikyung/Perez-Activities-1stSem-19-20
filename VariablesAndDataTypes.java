public class VariablesAndDataTypes{

        public static void main (String[] args){
          String sentence = "The temperature in Baguio City has warmed throughout the years.";
          char a = 'A';
          float degreesDawn = 16;
          double degreesNoon = 23.5;
          byte hours = 24;
          short days = 7;
          int weeks = 4;
          long months = 12;
          boolean b = true;
          
          if (b == true) { 
            System.out.print(sentence + "\n\t" + a + " recent news article stated that the City has been averaging " + degreesDawn);
            System.out.println(" degrees celsius at dawn and " + degreesNoon + " at noon. " );
            System.out.print("\t\t" + "Regardless, lowlanders still feel cold " + hours + " hours a day, " + days + " days a week, " + weeks + " weeks per month and " + months + " months each year.");
          }
          else {
            System.out.println("The boolean was changed to a False value.");
          
          }
        }
 }