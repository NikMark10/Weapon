package weapon;

public class Pistols extends Ranged{
    float MM;
    int MagQuant;
    
    public void setMM(float mm){
        MM = mm;
    }
    
    public void setMagQuant(int mag){
        MagQuant = mag;
    }
   
    public float getMM(){
        return MM;
    }
    
    public int getMagQuant(){
        return MagQuant;
    }
}
