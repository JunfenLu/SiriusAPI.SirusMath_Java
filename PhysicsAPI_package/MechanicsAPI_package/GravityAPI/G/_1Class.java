package PhysicsAPI_package.MechanicsAPI_package.GravityAPI.G;
public class _1Class implements _1 {
    private final double M;
    public _1Class(double m) {
        this.M = m;
    }
    public void G() {
        double G = this.M * 9.800000190734863;
        System.out.println("重力为" + G);
    }
}
