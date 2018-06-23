package weapon;

public class RocketLaunch extends Ranged{
    float Delay;
    int VehDam;
    
    void setDelay(float d){
        Delay = d;
    }
    
    void setVehDam(int d){
        if(d>=10)
            VehDam = 10;
        else if(d>0 && d<10)
            VehDam = d;
        else
            VehDam = 0;
    }
    
    float getDelay(){
        return Delay;
    }
    
    float VehDam(){
        return VehDam;
    }
}
