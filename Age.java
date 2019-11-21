import java.util.Scanner;
public class Age {
  public static void main(String[] args){

      Scanner x = new Scanner(System.in);
        System.out.println("What is your name?");
        String main = x.nextLine();
    
      Scanner fun = new Scanner(System.in);
   
     while(true){
     try{
    
        System.out.println("How old are you?");
      int age = fun.nextInt();
    
      if(age >0 && age <=3){
        System.out.println("You are just a baby " + main + "!");
        break;
      }
      else if(age >=4 && age <=12){
        System.out.println("You are just a child " + main + "!");
        break;
      }
      else if(age >=13 && age <=19){
        System.out.println(main +", you are now a teen!");
        break;
      }
      else if(age >=20 && age <=32){
        System.out.println(main +", you are a young adult!");
        break;
      }
      else if(age >=33 && age <=45){
        System.out.println(main + ", you are in middle age!");
        break;
      }
      else if(age >=46 && age <=59){
        System.out.println(main + ", you are now adult!");
        break;
      }
      else if(age >=60 && age <=122){
        System.out.println("You are about to die, " + main + ". R.I.P.");
        break;
      }
      else{
        System.out.println("ERROR!\nPlease try again.");
      }
    }
     catch (Exception e){
      System.out.println("ERROR!\nPlease try again.");
      fun.next();
     }
   } 
 }
}