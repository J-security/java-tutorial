/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymethod;

/**
 *
 * @author omage
 */
public class Mymethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int result = max(1,8);
        System.out.println(result);
    }
    
    public static int max(int a, int b)
    {
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }
}
