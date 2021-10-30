import javax.swing.JOptionPane;

public class Selection2 {
	public static void main(String[] args) throws Exception 
    {
      String name;
            
      name = JOptionPane.showInputDialog("Input?");
       System.out.println("Hello " + name);
       

		char num = name.charAt(0);
       
       if (num == '+')
       {
      		 System.out.println ("plus never");
       }
       else 
      	 if (num == '-' )
      	 {    
      	     System.out.println ("minus");
      	 }
      	 else
      		 System.out.println ("not a good selection");
        
    
    }

	
	
	}