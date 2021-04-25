package body_calculation;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Orga o = new Orga();

        o.AllBodies.add(new Pyramide(10, 21, new Gold()));
        o.AllBodies.add(new Kegel(4,  new Platin()));
        o.AllBodies.add(new Quader(3, 76, new Silber()));
        o.AllBodies.add(new Zylinder(35, 12, new Gold()));

        System.out.println(o.GetFullWeight());
    }
}
