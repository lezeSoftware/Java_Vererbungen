package body_calculation;

public class Kugel extends Body
{
    public Kugel(int r, Material m)
    {
        this.r = r;
        this.m = m;
    }

    @Override double getVolume()
    {
        return 4*3.1415*r*r*r/3;
    }
}
