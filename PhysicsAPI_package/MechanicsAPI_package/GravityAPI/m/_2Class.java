package PhysicsAPI_package.MechanicsAPI_package.GravityAPI.m;
public class _2Class implements _2 {
    private final double G;

    public _2Class(double g) {
        this.G = g;
    }

    public void M() {
        double m = this.G /9.8;
        System.out.println("质量为" + m);
    }
}
