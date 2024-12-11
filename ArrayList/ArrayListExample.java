package ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(57);
        list.add(55);
        list.add(48);
        list.add(22);

        System.out.println(list.size());
    }
}
