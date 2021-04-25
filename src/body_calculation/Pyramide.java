package body_calculation;

public class Pyramide extends Body
{
    public Pyramide(int a, int h, Material m)
    {
        this.h = h;
        this.a = a;
        this.m=  m;
    }

    @Override double getVolume()
    {
        return (this.a*this.a*this.h)/3;
    }
}
