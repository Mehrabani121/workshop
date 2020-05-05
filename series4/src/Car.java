public class Car extends BmwFactory {
    private String Motor;
    private int supap;
    private float ghodrat;
    private String tormoz;
    private float emtiazeKeifiat;
    private float emtiazeAlayande;
    private int mojudi;

    public Car() {
    }

    public Car(String motor, int supap, float ghodrat, String tormoz, float emtiazeKeifiat, float emtiazeAlayande,int mojudi) {
        Motor = motor;
        this.supap = supap;
        this.ghodrat = ghodrat;
        this.tormoz = tormoz;
        this.emtiazeKeifiat = emtiazeKeifiat;
        this.emtiazeAlayande = emtiazeAlayande;
        this.mojudi=mojudi;
    }

    @Override
    public boolean pardakhteMaliat() {
        System.out.println("aya maliat in khodro pardakht shode ast ?");
        System.out.println("1.bale\t| 2.kheyr ");
        System.out.print("select: ");
        if (Integer.parseInt(scanner.nextLine())==1)
            return true;
        else{
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("maliate in khodro pardakht nashode ast");
                return false;
            }
        }
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String motor) {
        Motor = motor;
    }

    public int getSupap() {
        return supap;
    }

    public void setSupap(int supap) {
        this.supap = supap;
    }

    public float getGhodrat() {
        return ghodrat;
    }

    public void setGhodrat(float ghodrat) {
        this.ghodrat = ghodrat;
    }

    public String getTormoz() {
        return tormoz;
    }

    public void setTormoz(String tormoz) {
        this.tormoz = tormoz;
    }

    public float getEmtiazeKeifiat() {
        return emtiazeKeifiat;
    }

    public void setEmtiazeKeifiat(float emtiazeKeifiat) {
        this.emtiazeKeifiat = emtiazeKeifiat;
    }

    public float getEmtiazeAlayande() {
        return emtiazeAlayande;
    }

    public void setEmtiazeAlayande(float emtiazeAlayande) {
        this.emtiazeAlayande = emtiazeAlayande;
    }

    public int getMojudi() {
        return mojudi;
    }

    public void setMojudi(int mojudi) {
        this.mojudi = mojudi;
    }
}
