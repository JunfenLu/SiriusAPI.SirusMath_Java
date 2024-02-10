package TriangleAPI.RightTriangleAPI;

public class APIClass implements RtAPI {
    private final double Diagonal;
    private final double RightAnglEdedge1;
    private final double RightAnglEdedge2;
    public APIClass(double diagonal, double rightAnglEdedge1, double rightAnglEdedge2) {
        this.Diagonal = diagonal;
        this.RightAnglEdedge1 = rightAnglEdedge1;
        this.RightAnglEdedge2 = rightAnglEdedge2;
    }
    public void readDiagonal() {
        System.out.println("�����ε�б�߳���" + this.Diagonal);
    }

    public void RightAnglEdedge1() {
        System.out.println("�����ε�һ��б�߳���" + this.RightAnglEdedge1);
    }

    public void RightAnglEdedge2() {
        System.out.println("�����εĶ���б�߳���" + this.RightAnglEdedge2);
    }

    public void inspect() {
        double a;
        double b;
        double c;
        if (this.Diagonal >= this.RightAnglEdedge1 && this.Diagonal >= this.RightAnglEdedge2) {
            a = this.Diagonal;
            if (this.RightAnglEdedge1 >= this.RightAnglEdedge2) {
                b = this.RightAnglEdedge1;
                c = this.RightAnglEdedge2;
            } else {
                b = this.RightAnglEdedge2;
                c = this.RightAnglEdedge1;
            }
        } else if (this.RightAnglEdedge1 >= this.Diagonal && this.RightAnglEdedge1 >= this.RightAnglEdedge2) {
            a = this.RightAnglEdedge1;
            if (this.Diagonal >= this.RightAnglEdedge2) {
                b = this.Diagonal;
                c = this.RightAnglEdedge2;
            } else {
                b = this.RightAnglEdedge2;
                c = this.Diagonal;
            }
        } else {
            a = this.RightAnglEdedge2;
            if (this.Diagonal >= this.RightAnglEdedge1) {
                b = this.Diagonal;
                c = this.RightAnglEdedge1;
            } else {
                b = this.RightAnglEdedge1;
                c = this.Diagonal;
            }
        }

        if (a != 0.0 && b != 0.0 && c != 0.0 && !(a >= b + c)) {
            APIClass inspect = new APIClass(this.Diagonal, this.RightAnglEdedge1, this.RightAnglEdedge2);
            inspect.readDiagonal();
            inspect.RightAnglEdedge1();
            inspect.RightAnglEdedge2();
            inspect.getArea();
            inspect.getGirth();
            inspect.darw();
        } else {
            System.out.println("������ı߳��޷�Χ��һ��������");
        }

    }
    public void getArea() {
        double Area = this.RightAnglEdedge1 * this.RightAnglEdedge2;
        System.out.println("ֱ�������ε������" + Area);
    }
    public void getGirth() {
        double Girth = this.Diagonal + this.RightAnglEdedge1 + this.RightAnglEdedge2;
        System.out.println("ֱ�������ε��ܳ���" + Girth);
    }
    public void darw() {
        System.out.println("�����������һ��ֱ��������");
    }
}
