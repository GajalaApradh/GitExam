import java.util.Scanner;
public class MenuDriven
 {
 public static void main(String args[])
 {
         int ch; 
         String str,str1,str2;
         boolean str3;
         int length;
         
         Scanner sc = new Scanner(System.in); 
         
         while(true)
         {
         
          // displaying the menu
        	 
          System.out.println("\n1: Length Of String");
          System.out.println("2: String Concatenation");
         
          System.out.println("3: Quit");
         
             System.out.print("\n Make your choice: ");  
             ch = sc.nextInt(); 
              switch (ch)
              {
                case 1: 
                	sc.nextLine();
                	System.out.println("Enter string: ");
               	    str=sc.nextLine();
               	    length = str.length();
               	    System.out.println("Length of string: " + length);
                break;
                
                case 2: 
                	sc.nextLine();
                	System.out.println("Enter First string: ");
               	    str=sc.nextLine();
               	    System.out.println("Enter Second string: ");
            	    str1=sc.nextLine();
               	    str2 = str.concat(str1);
               	    System.out.println("First String: "+ str);
             	    System.out.println("Second String: "+ str1);
             	    System.out.println("\nConcatenated string: "+ str2);
                 
                 break;
                 
              
                 
                case 3:
                	System.exit(0);
                
                default:
                 System.out.println("Invalid choice!!! Please make a valid choice. \n\n");
               }
              }
	    }
 }