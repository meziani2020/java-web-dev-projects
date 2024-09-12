
package main.org.exeercicefiles;

import java.util.Arrays;

public class MainApp {

   public static void main(String[] args) {

       // added ligne to test git  test 2  test 3
       System.out.println("no yes ");
       int[] inntArray={2,1,2,3,4,5,8};
      for (int nbr: inntArray){
           System.out.println(nbr);
      }
      //---------------------
       String txt="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
      String[] subtxts=txt.split(" ");
      System.out.println(Arrays.toString(subtxts));


    }
}
