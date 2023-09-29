package Palindrom;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Palindrom {
    public static void main(String[] args) {
        String str = "MADAM";
        char[] strings = str.toCharArray();
        List<Character> characterList = new LinkedList<>();
        for (char ch : strings) {
            characterList.add(ch);
        }
        System.out.println(characterList);

        ListIterator<Character> listIterator = characterList.listIterator();
        ListIterator<Character> listIterator1 = characterList.listIterator(characterList.size());
        boolean isPalindrom = true;
        while (listIterator.hasNext() && listIterator1.hasPrevious()) {
            if (listIterator.next() != listIterator1.previous()) {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) System.out.println("palindrom");
        else System.out.println("not palindrom");
    }
}
