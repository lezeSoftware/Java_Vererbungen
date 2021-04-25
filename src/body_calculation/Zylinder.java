package body_calculation;

public class Zylinder extends Body
{
    public Zylinder(int h, int r, Material m)
    {
        this.h = h;
        this.r = r;
        this.m = m;
    }

    @Override double getVolume()
    {
        return h*3.1415*r*r;
    }
}
