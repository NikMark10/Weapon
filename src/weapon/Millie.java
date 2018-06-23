package weapon;
        
public abstract class Millie implements Weapon{
    int Effort;    //Range 1-10
    int Sharp;  //Range 1-15
    
    void setEffort(int e){
        if(e>=10)
            Effort = 10;
        else if(e>0 && e<10)
            Effort = e;
        else
            Effort = 0;
    }
    
    void setSharp(int s){
        if(s>=15)
            Sharp = 15;
        else if(s>0 && s<15)
            Sharp = s;
        else
            Sharp = 0;
    }
}
