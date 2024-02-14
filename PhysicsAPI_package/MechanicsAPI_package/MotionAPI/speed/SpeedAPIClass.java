package PhysicsAPI_package.MechanicsAPI_package.MotionAPI.speed;
public class SpeedAPIClass implements SpeedAPI{
    private final double Time;
    private final double Distance;
    public SpeedAPIClass(double time,double distance){
        Time = time;
        Distance = distance;
    }
    public void speed() {
        System.out.println("请确保单位是km与h");
        if (Time==0&&Distance>0){
            System.out.println("错误(error:时间为零而路程却在变化)");
        }else {
            if (Time==0){
                System.out.println("错误(error:时间不能为零)");
            }else {
                if (Distance == 0) {
                    System.out.println("此物体并没有在运动");
                } else {
                    double speed = Distance / Time;
                    System.out.println("速度是" + speed+"km/h");
                }
            }
        }
    }
}
