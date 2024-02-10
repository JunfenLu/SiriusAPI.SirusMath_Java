package TriangleAPI.RightTriangleAPI.PythagoreanTheoremAPI._2;
public class APIClass_2 {
    private final double Diagonal;
    private final double High;
    public APIClass_2(double diagonal, double high) {
        this.Diagonal = diagonal;
        this.High = high;
    }
    public void knowDiagonal() {
        double result = Math.sqrt(Math.pow(this.Diagonal, 2.0) - Math.pow(this.High, 2.0));
        if (this.Diagonal >= result + this.High) {
            System.out.println("您输入的边无法围成一个三角形");
        } else {
            System.out.println("直角边长" + result);
        }

    }
}
