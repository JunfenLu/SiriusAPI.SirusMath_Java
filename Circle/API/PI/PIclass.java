package Circle.API.PI;
public class PIclass implements CirclePiusAPI {
    private float radius;
    public PIclass(float r) {
        radius = r;
    }
    public void getArea() {
        float area = 3.14159F * this.radius * this.radius;
        System.out.println("圆的面积是" + area);
    }
    public void getGirth() {
        float circuGirth = 3.14159F * this.radius * 2.0F;
        System.out.println("圆的周长是" + circuGirth);
    }
    public void draw() {
        System.out.println("在这里绘制了一个圆");
    }
    public void ReadR() {
        System.out.println("圆的半径是" + this.radius);
    }
}
