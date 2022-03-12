import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {
//        printString();
//        printArray();
        printList();
    }

    private static void printString() {
        String s = "fda";
        for (int i = 0; i < s.length(); i++) {
            System.out.println("" + s.charAt(i));
        }

        System.out.println("------------------------------");

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println("" + s.charAt(i));
        }
    }

    private static void printArray() {
        int[] a = new int[4];
        int[] b = new int[]{2, 4, 5, 6};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("------------------------------");

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        System.out.println("------------------------------");

        for (int i = b.length - 1; i >= 0; i--) {
            System.out.println(b[i]);
        }
    }

    private static void printList() {
        ArrayList list = new ArrayList(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
