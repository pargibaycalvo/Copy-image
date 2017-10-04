/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyimage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 *
 * @author oracle PED90
 */
public class image {
    
    public void copy() throws FileNotFoundException{
        try{
            FileInputStream origen = new FileInputStream("/home/oracle/NetBeansProjects/copyimage/zombie.jpg");
            FileOutputStream destino = new FileOutputStream("/home/oracle/NetBeansProjects/copyimage/zombie1.jpg");
            FileChannel inChannel = origen.getChannel();
            FileChannel outChannel = destino.getChannel();
            inChannel.transferTo(0, inChannel.size(), outChannel);
            origen.close();
            destino.close();
            System.out.println("Imagen copiada con éxito");
        
        }catch(IOException ioe){
            System.out.println("ERROR");
        }
    }
    
    public void buffered() throws FileNotFoundException, IOException{
        try{
        String nombre = "/home/oracle/NetBeansProjects/copyimage/zombie.jpg";
        String paranombre = "/home/oracle/NetBeansProjects/copyimage/zombiesss.jpg";
        BufferedInputStream or = new BufferedInputStream(new FileInputStream(nombre));
        BufferedOutputStream de = new BufferedOutputStream(new FileOutputStream(paranombre));
        byte[]buff=new byte[32*1024];
        int len;
        while((len=or.read(buff))>0)
            de.write(buff,0,len);
        or.close();
        de.close();
            System.out.println("Imagen copiada con éxito");
    }catch(IOException ioe){
            System.out.println("ERROR");
    }
}
}
