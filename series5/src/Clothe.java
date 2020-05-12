import java.util.Scanner;

public class Clothe<P1,P2> {
    private P1 esm;
    private P1 jens;
    private P1 noe;
    private P1 keshvar;
    private P2 vazn;
    private P2 gheymat;
    Scanner scanner=new Scanner(System.in);
    public Clothe() {
    }

    public Clothe(P1 esm, P1 jens, P1 noe, P1 keshvar, P2 vazn, P2 gheymat) {
        this.esm = esm;
        this.jens = jens;
        this.noe = noe;
        this.keshvar = keshvar;
        this.vazn = vazn;
        this.gheymat = gheymat;
    }

    public P1 getEsm() {
        return esm;
    }

    public void setEsm(P1 esm) {
        this.esm = esm;
    }

    public P1 getJens() {
        return jens;
    }

    public void setJens(P1 jens) {
        this.jens = jens;
    }

    public P1 getNoe() {
        return noe;
    }

    public void setNoe(P1 noe) {
        this.noe = noe;
    }

    public P1 getKeshvar() {
        return keshvar;
    }

    public void setKeshvar(P1 keshvar) {
        this.keshvar = keshvar;
    }

    public P2 getVazn() {
        return vazn;
    }

    public void setVazn(P2 vazn) {
        this.vazn = vazn;
    }

    public P2 getGheymat() {
        return gheymat;
    }

    public void setGheymat(P2 gheymat) {
        this.gheymat = gheymat;
    }

    public void showInformation(Clothe c){
        System.out.println("esm= "+c.getEsm()+" | jens= "+c.getJens()+" | noe= "+c.getNoe()+
                " | keshvar tolid konnande= "+c.getKeshvar()+" | vazn= "+c.getVazn()+
                " | gheymat nahaei mahsul= "+c.getGheymat());
    }
    public void gheymatBaTakhfif(Clothe c){
        System.out.println("aya in mahsul shamel takhfif mibashad ?");
        System.out.println("1.bale\t| 2.kheyr");
        System.out.print("select: ");
        if (Integer.parseInt(scanner.nextLine())==1){
            System.out.print("chand darsad: ");
            int darsadTakhfif=Integer.parseInt(scanner.nextLine());
            c.setGheymat((float)c.getGheymat() - (float)c.getGheymat()*darsadTakhfif/100);
            System.out.println("gheymate nahaei ba ehtesabe takhfif= "+c.getGheymat());
        }
        else
            c.setGheymat(c.getGheymat());
    }
    public void maliatVaAvaresz(Clothe c){
        System.out.println("maliat va avarez har mahsul 3 darsad ast");
        System.out.println("maliat va avarez= "+(float)c.getGheymat()*3/100);
    }
    public void varedati(Clothe c){
        System.out.println("haghe gomroki har mahsul 10 darsad ast");
        c.setGheymat((float)c.getGheymat() + (float)c.getGheymat()*10/100);
        System.out.println("gheymate nahaei ba ehtesabe haghe gomroki= "+c.getGheymat());
    }
    public void dakheli(Clothe c){
        System.out.println("sude tolid konnande har mahsul 20 darsad ast");
        c.setGheymat((float)c.getGheymat() + (float)c.getGheymat()*20/100);
        System.out.println("gheymate nahaei mahsul ba ehtesabe sude tolid konnande= "+c.getGheymat());
    }
}
