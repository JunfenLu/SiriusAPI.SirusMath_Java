package PhysicsAPI_package.MechanicsAPI_package.MotionAPI.time;
public class timeClass implements time {
    private final double Speed;
    private final double Distance;
    public timeClass(double speed,double distance){
        this.Speed = speed;
        this.Distance = distance;
    }
    public void time() {
        System.out.println("���ڼ��...");
        if (Distance < 0){
            System.out.println("����(error:·��Ϊ��ֵ)");
        }else{
            if (Distance == 0){
                System.out.println("����(error:·��Ϊ��,���岻���˶�)");
            }else{
                if (Speed < 0){
                    System.out.println("����(error:�ٶ�Ϊ��ֵ)");
                }else{
                    if (Speed == 0){
                        System.out.println("����(error:�ٶ�Ϊ��)");
                    }else{
                        System.out.println("���ڼ���...");
                        double time = Distance / Speed;
                        if (time < 0){
                            System.out.println("����(error:ʱ��Ϊ��ֵ)");
                        }else{
                            if (time == 0){
                                System.out.println("����(error:ʱ��Ϊ��)");
                            }else{
                                System.out.println("ʱ����"+time);
                            }
                        }
                    }
                }
            }
        }
    }
}
