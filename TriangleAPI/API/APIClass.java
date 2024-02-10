package TriangleAPI.API;

import TriangleAPI.PI.PIClass;

public class APIClass {
    private final double Base;
    private final double Height;
    public APIClass(double base, double height) {
        this.Base = base;
        this.Height = height;
    }
    public void test() {
        PIClass test = new PIClass(this.Base, this.Height);
        test.readBase_TPI();
        test.readHeight_TPI();
        test.getArea_TPI();
        test.draw_TPI();
    }
}
