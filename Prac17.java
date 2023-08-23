import Protect.*;
public interface Prac17 {
    public static void main(String args[]) {
        Protect2 p2 = new Protect2();
        Protect2 p1 = new Protect2();
        p1.readString();
        p2.readStringextends();
        System.out.println("Public string accessible outside package :" + p1.str1);
        System.out.println("Private string is not accessible outside package");
        System.out.println("Protected string is not accessible outside package");

    }
}
