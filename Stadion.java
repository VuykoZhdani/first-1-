package iot.ua.lviv.lab1;

public record Stadion(int watchmen,String name,int power,String counrty,int Hight,int Lenght) {
    public static String Filling="Full";
    public Stadion(){
        this(0,"",0,"",0,0);
    }

    public Stadion(int watchmen,String name,int white_power) {
        this(watchmen,name, white_power ,"Confederates", 1000, 2000);

    }


    @Override
    public String toString() {
        return "Stadion:\n" +
                "\twatchmen -> " + watchmen + "\n" +
                "\tname -> " + name + "\n" +
                "\twhite -> " + power + "\n" +
                "\tcounrty -> " + counrty + "\n" +
                "\tHight -> " + Hight + "\n" +
                "\tLenght -> " + Lenght + "\n"+
                "\tfulliness -> " + Filling + "\n";
    }



}