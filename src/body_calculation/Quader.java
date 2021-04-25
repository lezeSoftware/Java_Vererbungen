package body_calculation;

public class Quader extends Body
{
    public Quader(int a, int b, Material m)
    {
        this.b = b;
        this.a = a;
        this.m=  m;
    }

    @Override double getVolume()
    {
        return a*b*h;
    }
}
