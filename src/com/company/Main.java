package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Leo");

        KeksDose kD = new KeksDose();
        kD.addKeks(new Keks(50));
        kD.addKeks(new GlasierterKeks(100,100));

        System.out.println(kD.gesamtEnergie());
    }
}
