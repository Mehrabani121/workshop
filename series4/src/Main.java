public class Main {
    public static void main(String[] args) {
        BmwFactory b=new BmwFactory();
        if (b.pardakhteMaliat()==true && b.pardakhteAvarez()==true && b.keifiat()==true && b.alayande()==true){
            System.out.println("shoma mitavanid mahsulate khod ra erae konid ");
            Car car1=new Car("benzini",24,268,"paydari khodro",5,5,7);
            Car car2=new Car("benzini",26,270,"paydari khodro",5,5,5);
            Car car3=new Car("benzini",28,280,"paydari khodro",5,5,3);
            System.out.println("1.motor= "+car1.getMotor()+" | supsp= "+car1.getSupap()+" | ghodrat= "+car1.getGhodrat()
                    +" | tormoz= "+car1.getTormoz()+" | emtiaz keifiat= "+car1.getEmtiazeKeifiat() +" | emtiaz alayande= "
                    +car1.getEmtiazeAlayande()+" | mojudi= "+car1.getMojudi());
            System.out.println("2.motor= "+car2.getMotor()+" | supsp= "+car2.getSupap()+" | ghodrat= "+car2.getGhodrat()
                    +" | tormoz= "+car2.getTormoz()+" | emtiaz keifiat= "+car2.getEmtiazeKeifiat() +" | emtiaz alayande= "
                    +car2.getEmtiazeAlayande()+" | mojudi= "+car2.getMojudi());
            System.out.println("3.motor= "+car3.getMotor()+" | supsp= "+car3.getSupap()+" | ghodrat= "+car3.getGhodrat()
                    +" | tormoz= "+car3.getTormoz()+" | emtiaz keifiat= "+car3.getEmtiazeKeifiat() +" | emtiaz alayande= "
                    +car3.getEmtiazeAlayande()+" | mojudi= "+car3.getMojudi());

        }
        else
            System.out.println("shoma nemitavanid mahsulate khod ra erae konid ");

        if (b.pardakhteMaliat()==true && b.pardakhteAvarez()==true && b.keifiat()==true && b.alayande()==true){
            System.out.println("shoma mitavanid mahsulate khod ra erae konid ");
            carshasi car1=new carshasi("otomat",2,268,3);
            carshasi car2=new carshasi("otomat",2,270,2);
            carshasi car3=new carshasi("dasti",1,280,1);
            System.out.println("differansie="+car1.getDiffransiel()+"tedad dufferansiel = "+car1.getTedadDif()+"ghodrat="+car1.getghodrat()+"mojoudi="+car1.getMojoudi());
            System.out.println("differansie="+car2.getDiffransiel()+"tedad dufferansiel = "+car2.getTedadDif()+"ghodrat="+car2.getghodrat()+"mojoudi="+car2.getMojoudi());
            System.out.println("differansie="+car3.getDiffransiel()+"tedad dufferansiel = "+car3.getTedadDif()+"ghodrat="+car3.getghodrat()+"mojoudi="+car3.getMojoudi());


        }
        else
            System.out.println("shoma nemitavanid mahsulate khod ra erae konid ");

    }
}
