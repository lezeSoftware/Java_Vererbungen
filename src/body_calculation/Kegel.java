package body_calculation;

public class Kegel extends Body
{
    public Kegel(int r, Material m)
    {
        this.r = r;
        this.m = m;
    }

    @Override double getVolume()
    {
        return r*r*h/3;
    }
}
