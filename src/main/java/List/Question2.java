package List;

//2. Write a Java program to iterate through all elements in a array list.

import java.util.ArrayList;

public class Question2 {

    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<String>();

        colors .add("Red");
        colors.add("Green");
        colors.add("Yellow");

        for(String stringElements : colors){
            System.out.println(stringElements);
        }




    }
}