import java.io.*;
public class ageBR{
	public static void main(String[] args)throws IOException {
	  	
	  BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 		
      int age;
 
 			while(true){
 				try{ 
 	
 					System.out.print("Enter your age: ");
 					age = Integer.parseInt(read.readLine());
	
					if (age <0 || age >122){
	 					System.out.println("ERROR!\nPlease try again.");
					}
          else if (age <=3)
          {
            System.out.println("You're just a baby!");
   				break;
   				}
          else if (age <=12){
 				 	  System.out.println("You're just a child!");
  				break;
					}
          else if (age <=19){
			     	System.out.println("You're now a teen!");
			    break;
  				}
          else if (age <=32){
  			   	System.out.println("You're a young adult!");
  			  break;
  				}
          else if (age <=45){
   					System.out.println("You're in middle age!");
          break;
    			}
          else if (age <=59){
 					  System.out.println("You're now adult!");
  				break;
  				}
          else if (age <=122){
             System.out.println("You are about to die!");
 					break;
   			  }	    		
 				}	
 				
 				catch (Exception ex){
 					System.out.println("ERROR!\nPlease try again.");
 				   	
 				}						  
      }
	}
}
