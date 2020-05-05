public class carshasi  extends Car{

    private String diffransiel;
    private int tedadDif;
    private float ghodrat;
    private int Mojoudi;
     public carshasi(String diffransiel,int tedadDif,float ghodrat,int Mojoudi){
         this.diffransiel=diffransiel;
         this.tedadDif=tedadDif;
         this.ghodrat=ghodrat;
         this.Mojoudi=Mojoudi;

     }


    @Override
    public boolean pardakhteMaliat() {
        return super.pardakhteMaliat();
    }

    public String getDiffransiel() {
        return diffransiel;
    }

    public void setDiffransiel(String diffransiel) {
        this.diffransiel = diffransiel;
    }

    public float getghodrat() {
        return ghodrat;
    }

    public void setghodrat(float ghodrat) {
        this.ghodrat = ghodrat;
    }

    public int getTedadDif() {
        return tedadDif;
    }

    public void setTedadDif(int tedadDif) {
        this.tedadDif = tedadDif;
    }


    public int getMojoudi() {
        return super.getMojudi();
    }

    public void setMojoudi(int mojoudi) {
        Mojoudi = mojoudi;
    }
}
