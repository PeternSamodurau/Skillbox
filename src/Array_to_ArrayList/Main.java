package Array_to_ArrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      //  int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] strings = {"A","B","C"};
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (String str :strings){
            stringArrayList.add(str);
        }
        System.out.println(stringArrayList);
        stringArrayList.addAll(Arrays.asList(strings));
        System.out.println(stringArrayList);


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        int[] array = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext()){
            System.out.print(integerIterator.next() + " ");
        }


        for (int arr: array) System.out.print(arr + " ");
        System.out.println();

        System.out.println(Arrays.toString(array));

        HashSet<String> stringHashSet = new HashSet<>(stringArrayList);
        System.out.println(stringHashSet);


    }
}
