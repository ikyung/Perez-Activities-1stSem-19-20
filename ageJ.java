import javax.swing.JOptionPane;

public class ageJ{
	public static void main(String[] args) {

        while(true){
 				try{ 
 	
          int age = 0;
          String x;
          x = JOptionPane.showInputDialog("Enter age:");
      
            if(x == null){
              System.exit(0);
            }  
            else if(x != null){
            age = Integer.parseInt(x);
	
            if (age <0 || age >122){
              JOptionPane.showMessageDialog(null, "ERROR!\nPlease try again.");
            }
            else if (age <=3){
              JOptionPane.showMessageDialog(null, "You're just a baby!");
            break;
            }
            else if (age <=12){
              JOptionPane.showMessageDialog(null, "You're just a child!");
            break;
            }
            else if (age <=19){
              JOptionPane.showMessageDialog(null, "You are now teen!");
            break;
            }
            else if (age <=32){
              JOptionPane.showMessageDialog(null, "You're young adult!");
            break;
            }
            else if (age <=45){
              JOptionPane.showMessageDialog(null, "You're in middle age!");
            break;
            }
            else if (age <=59){
              JOptionPane.showMessageDialog(null, "You're now adult!");
            break;
            }
            else if (age <=122){
              JOptionPane.showMessageDialog(null, "You're about to die!");
            break;
   			  	}	    		
            }	
 				}
            catch (Exception ex){
              JOptionPane.showMessageDialog(null, "ERROR!\nPlease try again.");   			
            }
        }
 }
}