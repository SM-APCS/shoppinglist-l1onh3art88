/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinglist;

/**
 *
 * @author spenc_000
 */
public class Sorts {
    public static void insertionSort (Comparable[] objects){
        for (int index =1; index<objects.length; index++)
        {
            Comparable key = objects[index];
            int position = index;
            
            //shift larger values to the right
            while(position > 0 && objects[position-1].compareTo(key)>0){
                objects[position]=objects[position-1];
                position--;
            }
            objects[position]=key;
        }
    }
}
