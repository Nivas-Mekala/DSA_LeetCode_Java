package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> multiArray = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // initialisation
        for (int i=0; i<3; i++){
            multiArray.add(new ArrayList<>());
        }

        // add elements
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                multiArray.get(i).add(sc.nextInt());
            }
        }

        System.out.println(multiArray);
    }
}
