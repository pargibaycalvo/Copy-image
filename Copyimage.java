/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyimage;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class Copyimage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        image cop = new image();
        //cop.copy();
        cop.buffered();
        
    }
    
}
