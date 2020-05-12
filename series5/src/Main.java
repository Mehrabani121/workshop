import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        ClothingStore clothingStore=new ClothingStore();
        int n;
        System.out.println("Tedade mahsulat ra vared konid:");
        n=Integer.parseInt(input.nextLine());
        Clothe<String,Float>[] c=new Clothe[n];
        for (int i=0;i<n;i++){
            c[i]=new Clothe<String,Float>();
            System.out.println("Esme mahsul ");
            c[i].setEsm(input.nextLine());
            System.out.println("Jense mahsul ");
            c[i].setJens(input.nextLine());
            System.out.println("Noe mahsul ");
            c[i].setNoe(input.nextLine());
            System.out.println("Keshvare tolid konnade  mahsul ");
            c[i].setKeshvar(input.nextLine());
            System.out.println("Vazne mahsul ");
            c[i].setVazn(Float.parseFloat(input.nextLine()));
            System.out.println("Gheymate  mahsul  ba ehtesabe maliat va avarez");
            c[i].setGheymat(Float.parseFloat(input.nextLine()));
            if (c[i].getKeshvar().equalsIgnoreCase("iran")){
                c[i].maliatVaAvaresz(c[i]);
                clothingStore.clotheList.add(c[i]);


            }
            else{
                c[i].maliatVaAvaresz(c[i]);
                c[i].varedati(c[i]);
                c[i].gheymatBaTakhfif(c[i]);
                clothingStore.clotheList.add(c[i]);
            }
        }
        System.out.println("List mahsulat:");
        for (Clothe cl:clothingStore.clotheList) {
            cl.showInformation(cl);
        }


    }
}
