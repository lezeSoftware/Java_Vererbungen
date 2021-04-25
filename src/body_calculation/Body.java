package body_calculation;

public abstract class Body
{
    int h;
    int a;
    int b;
    int r;
    Material m;

    double getWeight()
    {
        return m.weight() * getVolume();
    }
    abstract double getVolume();
}