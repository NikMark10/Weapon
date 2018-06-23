package weapon;

public class LMG extends Rifles{
    int Scope;  //Range 1-15
    
    public void setScope(int s){
        if(s>=15)
            Scope = 15;
        else if(s>0 && s<10)
            Scope = s;
        else
            Scope = 0;
    }
    
    public int Scope(){
        return Scope;
    }
}
