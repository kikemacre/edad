
package practicajavadoc;

import java.util.Scanner;

/**
 *
 * @author donky
 */
public class PracticaJavadoc {

    /**
     * @param args the command line arguments
     */
        
        public static void main(String args []){

            int edad;
            
            
            Scanner entrada = new Scanner(System.in);
            System.out.println("dime tu edad");
            
            edad= entrada.nextInt();
            
            if(edad>= 18){
                
                System.out.println("tu eres mayor de edad");
                
            }
            else{
                System.out.println("tu eres menor de edad");
            }
           
            
    }      
     
    }
    

