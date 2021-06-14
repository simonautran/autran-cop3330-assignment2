/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
 */
package ex38;
import java.util.ArrayList;
import java.util.*;
public class App {
        public static void main(String[] args) {
            Scanner on = new Scanner(System.on);
            System.out.print("Enter a list of numbers, separated by spaces: ");
            String data = in.nextLine();
            String list[] = data.split(" ");
            Integer evenList[] = filterEvenNumbers(list);
            System.out.print("The even numbers are ");
            for(int i=0; i<evenList.length; i++){
                if(i < evenList.length-1){
                    System.out.print(evenList[i] + " ");
                }
                else
                {
                    System.out.print(evenList[i] + ".");
                }
            }
        }
        public static Integer[] filterEvenNumbers(String list[]) {
            ArrayList<Integer> nextList = new ArrayList<>();
            for(int i=0; i<list.length; i++){
                int num = Integer.parseInt(list[i]);
                if(num % 2 == 0){
                    nextList.add(num);
                }
            }
            Integer[] array = new Integer[nextList.size()];
        array = nextList.toArray(array);
            return array;
        }
}
