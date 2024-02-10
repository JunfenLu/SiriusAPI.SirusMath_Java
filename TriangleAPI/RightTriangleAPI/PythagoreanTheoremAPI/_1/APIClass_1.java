package TriangleAPI.RightTriangleAPI.PythagoreanTheoremAPI._1;
public class APIClass_1 implements PTPI_1 {
        private final double RightAngledEdge1;
        private final double RightAngledEdge2;

        public APIClass_1(double rightAngledEdge1, double rightAngledEdge2) {
            this.RightAngledEdge1 = rightAngledEdge1;
            this.RightAngledEdge2 = rightAngledEdge2;
        }

        public void knowRightAngledEdge() {
            double a = this.RightAngledEdge1 * this.RightAngledEdge1 + this.RightAngledEdge2 * this.RightAngledEdge2;
            double result = Math.sqrt(a);
            double A;
            double B;
            if (this.RightAngledEdge1 >= this.RightAngledEdge2) {
                A = this.RightAngledEdge1;
                B = this.RightAngledEdge2;
            } else {
                A = this.RightAngledEdge2;
                B = this.RightAngledEdge1;
            }

            if (result != 0.0 && A != 0.0 && B != 0.0 && !(result >= A + B)) {
                System.out.println(result);
            } else {
                System.out.println("您输入的边长无法围成一个三角形");
            }

        }
}
