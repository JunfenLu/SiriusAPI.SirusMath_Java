package PhysicsAPI_package.MechanicsAPI_package.MotionAPI.distance;
public class distanceClass implements Distance {
    private final double Speed;
    private final double Time;
    public distanceClass(double speed,double time){
        this.Speed = speed;
        this.Time = time;
    }
    public void distance() {
        System.out.println("正在检查...");
        if (Time < 0){
            System.out.println("错误(error:时间为负值)");
        }else{
            if (Time == 0){
                System.out.println("错误(error:时间为零)");
            }else{
                if (Speed < 0){
                    System.out.println("错误(error:速度为负值)");
                }else{
                    if (Speed == 0){
                        System.out.println("错误(error:速度为零)");
                    }else{
                        System.out.println("正在计算...");
                        double distance = Speed * Time;
                        /*
                         *路程检查是不必要的
                         *可以删除
                         */
                        if (distance < 0){
                            System.out.println("错误(error:路程为负值)");
                        }else{
                            if (distance == 0){
                                System.out.println("错误(error:路程为零,物体不在运动)");
                            }else{
                                System.out.println("路程是"+distance);
                            }
                        }
                    }
                }
            }
        }
    }
}
