package iot.ua.lviv.lab1;

public class main {
    public static void main(String[] args) {
        stadion one = new stadion();
        stadion two = new stadion(50000,"Etihad", 300);


        System.out.println(one.toString());
        System.out.println(two.toString());

    }
}