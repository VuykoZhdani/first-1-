package iot.ua.lviv.lab1;

public class main {
    public static void main(String[] args) {
        Stadion one = new Stadion();
        Stadion two = new Stadion(50000,"Etihad", 300);
        Stadion three = new Stadion(1000,"Forum", 200);

        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
    }
}