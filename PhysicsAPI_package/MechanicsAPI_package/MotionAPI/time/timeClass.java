package PhysicsAPI_package.MechanicsAPI_package.MotionAPI.time;
public class timeClass implements time {
    private final double Speed;
    private final double Distance;
    public timeClass(double speed,double distance){
        this.Speed = speed;
        this.Distance = distance;
    }
    public void time() {
        System.out.println("正在检查...");
        if (Distance < 0){
            System.out.println("错误(error:路程为负值)");
        }else{
            if (Distance == 0){
                System.out.println("错误(error:路程为零,物体不在运动)");
            }else{
                if (Speed < 0){
                    System.out.println("错误(error:速度为负值)");
                }else{
                    if (Speed == 0){
                        System.out.println("错误(error:速度为零)");
                    }else{
                        System.out.println("正在计算...");
                        double time = Distance / Speed;
                        if (time < 0){
                            System.out.println("错误(error:时间为负值)");
                        }else{
                            if (time == 0){
                                System.out.println("错误(error:时间为零)");
                            }else{
                                System.out.println("时间是"+time);
                            }
                        }
                    }
                }
            }
        }
    }
}
