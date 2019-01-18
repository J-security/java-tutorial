/*
 * command line argument in this lesson
 */
package agurme;

/**
 *
 * @author omage
 */
public class Agurme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          adder(23,334,344,4545,455,45,455,55,66,345,34);
        
    }
    
    public static void adder (int... numbers){
        if(numbers.length == 0){
            System.out.println("Please pass your Information");
            return;
        }
        
        int total = 0;
        
        for (int num: numbers){
            
            total +=num;
        }
        System.out.println(total);
    }
}
