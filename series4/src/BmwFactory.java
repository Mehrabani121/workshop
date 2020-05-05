import java.util.Scanner;

public class BmwFactory {
    Scanner scanner=new Scanner(System.in);
    public boolean pardakhteMaliat(){
        System.out.println("aya maliat pardakht shode ast ?");
        System.out.println("1.bale\t| 2.kheyr ");
        System.out.print("select: ");
        if (Integer.parseInt(scanner.nextLine())==1)
            return true;
        return false;
    }
    public boolean pardakhteAvarez(){
        System.out.println("aya avarez pardakht shode ast ?");
        System.out.println("1.bale\t| 2.kheyr ");
        System.out.print("select: ");
        if (Integer.parseInt(scanner.nextLine())==1)
            return true;
        return false;
    }
    public boolean keifiat(){
        System.out.println("aya keifiat mahsulat taeid shode ast ?");
        System.out.println("1.bale\t| 2.kheyr ");
        System.out.print("select: ");
        if (Integer.parseInt(scanner.nextLine())==1)
            return true;
        return false;
    }
    public boolean alayande(){
        System.out.println("aya estandarde alayandegi mahsulat taeid shode ast ?");
        System.out.println("1.bale\t| 2.kheyr ");
        System.out.print("select: ");
        if (Integer.parseInt(scanner.nextLine())==1)
            return true;
        return false;

    }
}
