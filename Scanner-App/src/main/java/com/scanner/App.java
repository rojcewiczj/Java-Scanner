package com.scanner;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Mapy map = new Mapy();


        for(String key : map.connections.connections.keySet()){
            System.out.print(key + " : ");
            for(String neighbor : map.connections.connections.get(key)){
                System.out.print(neighbor + ", ");
            }
            System.out.println();

        }
    }
}
