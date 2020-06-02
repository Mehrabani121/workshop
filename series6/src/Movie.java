public class Movie {
    private String name;
    private String janr;
    private int sal;
    private float gheymat;
    public Movie() {
    }

    public Movie(String name, String janr, int sal, float gheymat) {
        this.name=name;
        this.janr = janr;
        this.sal = sal;
        this.gheymat = gheymat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJanr() {
        return janr;
    }

    public void setJanr(String janr) {
        this.janr = janr;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public float getGheymat() {
        return gheymat;
    }

    public void setGheymat(float gheymat) {
        this.gheymat = gheymat;
    }
    public String showInformation(){
        return "name: "+this.getName()+" | janr: "+this.getJanr()+" | sal: "+this.getSal()+
                " | gheymat: "+this.getGheymat();
    }
}
