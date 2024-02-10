package TriangleAPI.RightTriangleAPI.PythagoreanTheoremAPI.Determine;
public class APIClass_3 implements PTPI_3 {
    private final double a;
    private final double b;
    private final double c;
    public APIClass_3(double RightAngledEdge1, double RightAngledEdge2, double hypotenuse) {
        this.a = RightAngledEdge1;
        this.b = RightAngledEdge2;
        this.c = hypotenuse;
    }
    public void determine() {
        if (Math.pow(this.c, 2.0) == Math.pow(this.a, 2.0) + Math.pow(this.b, 2.0)) {
            System.out.println("您输入的边长能围成一个直角三角形");
        } else if (this.a != 0.0 && this.b != 0.0 && this.c != 0.0 && !(this.c >= this.a + this.b)) {
            System.out.println("您输入的边长能围成一个三角形,但无法围成一个直角三角形");
        } else {
            System.out.println("您输入的边长无法围成一个三角形");
        }

    }
}
