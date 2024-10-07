package datastructures.classes;

public class Main {
    public static void main(String[] args) {

        Cookie cookie1 = new Cookie("Green");
        Cookie cookie2 = new Cookie("Blue");
        cookie2.setColor("green");


        System.out.println(cookie1.getColor());
        System.out.println(cookie2.getColor());

        LinkedList linkedList = new LinkedList(4);
    }
}