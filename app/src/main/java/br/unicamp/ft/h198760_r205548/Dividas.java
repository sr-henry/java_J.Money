package br.unicamp.ft.h198760_r205548;

import java.util.ArrayList;

public class Dividas {

    public static ArrayList<Divida> list = new ArrayList<>();

    public static void populateList(){
        list.add(new Divida(200.00, 6, "Henrique", 0));
        list.add(new Divida(300.00, 5, "Fufu",1));
        list.add(new Divida(400.00, 4, "Wallace",0));
    }

}
