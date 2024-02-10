package TriangleAPI.PI;
public class PIClass implements TrianglePI{
    private final double Base;
    private final double Height;
    public PIClass(double base, double height) {
        this.Base = base;
        this.Height = height;
    }
    public void readBase_TPI() {
        System.out.println("三角形的底长" + this.Base);
    }
    public void readHeight_TPI() {
        System.out.println("三角形的高长" + this.Height);
    }
    public void getArea_TPI() {
        int a = 2;
        double Area = this.Base * this.Height / (double)a;
        System.out.println("三角形的面积为" + Area);
    }
    public void draw_TPI() {
        System.out.println("在这里绘制了一个圆");
    }
}
