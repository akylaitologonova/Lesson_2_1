package com.company;

public class Main {

    public static void main(String[] args) {
        Shelter romashka = new Shelter("Romashka",
                "Lermantova 10");

     Dog Layka = new Dog ("Layka", "Овчарка",
             Color.BLACK, romashka);

     Dog Sharik = new Dog ("Sharik", "Бродяга",
             Color.WHITE, romashka, new String[]{"Сидеть ",
     "Лежать ",  "Кусать "});

        System.out.println(Layka.getInfo());
        System.out.println("______________________");
        System.out.println(Sharik.getInfo());
        System.out.println("______________________");
        Layka.makeVoice("Гав гав");
        Layka.makeVoice("Гув гув", 3);



    }
}
