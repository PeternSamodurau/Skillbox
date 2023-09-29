package BinariSearch;

import java.util.Arrays;

public class BinarySearch {
    public class Main {
        public static void main(String[] args) {
            int[] ints = {9, 3, 5, 6, 1, 8, 7, 2, 4};
            Arrays.sort(ints);
            int value = 8;
            print(value,binarySearch(ints,value));
        }
        public static int binarySearch(int[] arr, int elementToSearch){
            int firstIndex = 0;
            int lastIndex = arr.length - 1;

            // условие прекращения (элемент не представлен)
            while(firstIndex <= lastIndex) {
                int middleIndex = (firstIndex + lastIndex) / 2;
                // если средний элемент - целевой элемент, вернуть его индекс
                if (arr[middleIndex] == elementToSearch) {
                    return middleIndex;
                }

                // если средний элемент меньше
                // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
                else if (arr[middleIndex] < elementToSearch)
                    firstIndex = middleIndex + 1;

                    // если средний элемент больше
                    // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
                else if (arr[middleIndex] > elementToSearch)
                    lastIndex = middleIndex - 1;

            }
            return -1;
        }
        public static void print(int value, int index ){
            if (index == -1){
                System.out.println(value + " " + "element not found");
            }
            else {
                System.out.println("index  - " + index + " value - " + value);
            }
        }
    }

}
