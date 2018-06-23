package weapon;

public abstract class Ranged implements Weapon{
    
    float Range,Retime;
    int Weight,Damage,Armeff;   //Armeff range 1-10
    char Mobility;
    
    @Override
    public float getRange(){
        return Range;
    }
    
    @Override
    public int getWeight(){
        return Weight;
    }
    
    @Override
    public int getDamage(){
        return Damage;
    }
    
    @Override
    public char getMobility(){
        return Mobility;
    }
    
    @Override
    public void setRange(float r){
        Range = r;
    }
    @Override
    public void setWeight(int w){
        Weight = w;
    }
    
    @Override
    public void setDamage(int d){
        if(d>=10)
            Damage = 10;
        else if(d>0 && d<10)
            Damage = d;
        else
            Damage = 0;
    }
    
    @Override
    public void setMobility(char m){
        Mobility = m;
    }
    
    public float getRetime(){
        return Retime;
    }
    
    public void setRetime(float r){
        Retime = r;
    }
    
    public int getArmeff(){
        return Armeff;
    }
    
    public void setArmeff(int a){
        if(a>=10)
            Armeff = 10;
        else if(a>0 && a<10)
            Armeff = a;
        else
            Armeff = 0;
    }
    
    
    
}
