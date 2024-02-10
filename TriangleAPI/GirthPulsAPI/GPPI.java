package TriangleAPI.GirthPulsAPI;
class GPIPuls implements GPPI  {
    private final double A;
    private final double B;
    private final double C;
    public GPIPuls(double a, double b, double c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }
    public void getGirth_GPPI() {
        double a;
        double b;
        double c;
        if (this.A >= this.B && this.A >= this.C) {
            a = this.A;
            if (this.B >= this.C) {
                b = this.B;
                c = this.C;
            } else {
                b = this.C;
                c = this.B;
            }
        } else if (this.B >= this.A && this.B >= this.C) {
            a = this.B;
            if (this.A >= this.C) {
                b = this.A;
                c = this.C;
            } else {
                b = this.C;
                c = this.B;
            }
        } else {
            a = this.C;
            if (this.A >= this.B) {
                b = this.A;
                c = this.B;
            } else {
                b = this.B;
                c = this.A;
            }
        }

        if (a != 0.0 && b != 0.0 && c != 0.0 && !(a >= b + c)) {
            System.out.println("正在计算...");
            double Girth = this.A + this.B + this.C;
            System.out.println("三角形的边长分别是" + this.A + "," + this.B + "," + this.C);
            System.out.println("三角形的周长是" + Girth);
        } else {
            System.out.println("您输入的边长无法围成一个三角形");
        }

    }
}
