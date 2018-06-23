package weapon;

public interface Weapon {
    float getRange();
    
    int getWeight();
    
    char getMobility();
    
    int getDamage();    //range 1-10
    
    void setRange(float r);
    
    void setWeight(int w);
    
    void setMobility(char m);
    
    void setDamage(int d);  


}
