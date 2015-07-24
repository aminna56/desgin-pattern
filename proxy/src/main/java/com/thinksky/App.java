package com.thinksky;

import com.thinksky.proxy.Image;
import com.thinksky.proxy.ProxyImage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display(); 
        System.out.println("");
        
        //image will not be loaded from disk
        image.display(); 	
    }
}
