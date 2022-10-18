package pardalheranca;

import java.util.Scanner;

public class APP {

    public static void main(String[] args) {
        System.out.println("HELLO");

        Carro car = new Carro(100.0);
        car.acelerar();
        System.out.println(car.getLitro());
        //5X ACELARACAO
        Ferrari ferrari = new Ferrari(19.0);
        ferrari.acelerar();
        System.out.println("FERRARI SOBROU DE GASOLINA: " + ferrari.getLitro() + " LT");
        ferrari.acelerar();
        System.out.println("FERRARI SOBROU DE GASOLINA: " + ferrari.getLitro() + " LT");
        ferrari.acelerar();
        System.out.println("FERRARI SOBROU DE GASOLINA: " + ferrari.getLitro() + " LT");
        ferrari.acelerar();
        System.out.println("FERRARI SOBROU DE GASOLINA: " + ferrari.getLitro() + " LT");
        ferrari.acelerar();
        System.out.println("FERRARI SOBROU DE GASOLINA: " + ferrari.getLitro() + " LT");

        Fusca fusca = new Fusca(4.0);
        fusca.acelerar();
        System.out.println("FUSCA GASTA DE GASOLINA: " + fusca.getLitro() + " LT");
        //3X ACELARACAO
        fusca.acelerar();
        System.out.println("FUSCA GASTA DE GASOLINA: " + fusca.getLitro() + " LT");
        fusca.acelerar();
        System.out.println("FUSCA GASTA DE GASOLINA: " + fusca.getLitro() + " LT");
        fusca.acelerar();
        System.out.println("FUSCA GASTA DE GASOLINA: " + fusca.getLitro() + " LT");
        fusca.acelerar();
        System.out.println("FUSCA GASTA DE GASOLINA: " + fusca.getLitro() + " LT");

    }
}
