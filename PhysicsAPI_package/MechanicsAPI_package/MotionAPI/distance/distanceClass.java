package PhysicsAPI_package.MechanicsAPI_package.MotionAPI.distance;
public class distanceClass implements Distance {
    private final double Speed;
    private final double Time;
    public distanceClass(double speed,double time){
        this.Speed = speed;
        this.Time = time;
    }
    public void distance() {
        System.out.println("���ڼ��...");
        if (Time < 0){
            System.out.println("����(error:ʱ��Ϊ��ֵ)");
        }else{
            if (Time == 0){
                System.out.println("����(error:ʱ��Ϊ��)");
            }else{
                if (Speed < 0){
                    System.out.println("����(error:�ٶ�Ϊ��ֵ)");
                }else{
                    if (Speed == 0){
                        System.out.println("����(error:�ٶ�Ϊ��)");
                    }else{
                        System.out.println("���ڼ���...");
                        double distance = Speed * Time;
                        /*
                         *·�̼���ǲ���Ҫ��
                         *����ɾ��
                         */
                        if (distance < 0){
                            System.out.println("����(error:·��Ϊ��ֵ)");
                        }else{
                            if (distance == 0){
                                System.out.println("����(error:·��Ϊ��,���岻���˶�)");
                            }else{
                                System.out.println("·����"+distance);
                            }
                        }
                    }
                }
            }
        }
    }
}
