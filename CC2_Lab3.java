public class CC2_Lab3{
    public static void main(String[] args) {
      
      char character = 'Y';
      char dash = '-';   
      int ascii = (int) character;
        System.out.print(character);
        System.out.print(" " + dash);
        System.out.println(" " + ascii);
      
      char character1 = 'O';    
      int ascii1 = (int) character1;
        System.out.print(character1);
        System.out.print(" " + dash);
        System.out.println(" " + ascii1);
      
      char character2 = 'N';    
      int ascii2 = (int) character2;
        System.out.print(character2);
        System.out.print(" " + dash);
        System.out.println(" " + ascii2);
      
      char character3 = 'G';  
      int ascii3 = (int) character3;
        System.out.print(character3);
        System.out.print(" " + dash);
        System.out.println(" " + ascii3);
      
      char character4 = '!';  
      int ascii4 = (int) character4;
        System.out.print(character4);
        System.out.print(" " + dash);
        System.out.println(" " + ascii4);
      
      int sum = character + character1 + character2 + character3 + character4;
      int prod = character * character1 * character2 * character3 * character4;
      int avg = character + character1 + character2 + character3 /4;
      int r = prod % avg;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + prod);
        System.out.println("Average: " + avg);
        System.out.println("Remainder: " + r);
      
  }

}