package lesson02;

import javawebinar.webapp.model.Link;

/**
 * GKislin
 * 19.12.2014.
 */
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Main m1 = new Main();
//        m1.main("a b".split(""));

        int i = 5;
        Link l1 = new Link("JavaWebinar", "javawebinar.ru");
        Link l2 = l1;
        Link l3 = new Link(l1);
        System.out.println(l1.getClass());
        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));
        System.out.println(l1);

        System.out.println(Link.EMPTY);
        System.out.println(Link.empty());
        char c = 'A';
        Integer obj = null;
        printInt(c);
    }

/*
    static void printInt(Integer obj) {
        System.out.println("Object: " + obj);
    }

*/
    static void printInt(int i) {
        System.out.println("Primitive: " + i);
    }
}
