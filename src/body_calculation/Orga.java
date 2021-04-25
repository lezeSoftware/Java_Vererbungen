package body_calculation;

import java.util.ArrayList;

public class Orga
{
    public static ArrayList<Body> AllBodies = new ArrayList<Body>();

    public static double GetFullWeight()
    {
        double weight = 0;
        double allWeight = 0;
        for(Body k : AllBodies)
        {
            weight = k.getWeight();
            allWeight = weight + allWeight;
        }

        return allWeight;
    }
}
