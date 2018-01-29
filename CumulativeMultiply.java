/**
 * Created by Ethan on 1/18/2018.
 * This program takes an array of numbers and returns an array that multiplies each one by the next, with an addition of 3 on each.
 * Example: for {1,2,3} it would return {1,5,18}
 * Think of it as a factorial for any ordering of numbers (with an addition of 3 on the end of each operation)
 * The goal here is to look at the 5 commented violations and correct them.  Good luck!
 */

import java.util.ArrayList;

public class CumulativeMultiply {

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>(5);
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        list.add(4.0);
        list.add(5.0);
        ArrayList<Double> newList = multiplyArray(list);
        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i) + " ");
        }
    }

    private static ArrayList<Double> multiplyArray(ArrayList<Double> l) {   //Violation #1: fixed by adding a type
          //Violation #2: fixed by declaring the varible inside the for loop
        for (int i = 0; i < l.size() - 1; i++) {
            if (l.get(i) == 0) {  //Violation #3: fixed by changing the assignment operator to the equality operator 
                l.set(i + 1, 0.0); //Violation #4: fixed by adding braces
            }
            else {
                l.set(i + 1, (3 + l.get(i)) * l.get(i+1)); //Violation #5: fixed by adding parentheses
            }
        }
        return l;
    }

}
