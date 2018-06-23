package weapon;

public class Rifles extends Ranged{
    float MM;
    float Length;
    int MagQuant;
    
    public void setMM(float mm){
        MM = mm;
    }
    
    public void setLength(float len){
        Length = len;
    }
    
    public void setMagQuant(int mag){
        MagQuant = mag;
    }
    
    public float getMM(){
        return MM;
    }
    
    public float getLength(){
        return Length;
    }
    
    public int getMagQuant(){
        return MagQuant;
    }
}
