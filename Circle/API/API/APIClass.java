package Circle.API.API;

import Circle.API.PI.PIclass;

public class APIClass implements TestAPI {
    private float R;
    public APIClass(float r) {
        R = r;
    }
    public void Test() {
        PIclass test = new PIclass(R);
        test.ReadR();
        test.getArea();
        test.getGirth();
        test.draw();
    }
}
