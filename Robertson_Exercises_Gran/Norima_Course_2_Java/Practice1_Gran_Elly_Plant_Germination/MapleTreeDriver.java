import java.util.Scanner;
import java.util.*;

public class MapleTreeDriver {
    
    //These are the three private instance variables that are needed.
    private String plantDate;
    private double height;
    private String heightDate;
    
    //Based on the instruction given, The plant method only needs for the user input about the date.
    public void plant(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Plant Date (dd/mm/yyyy): ");
        plantDate = sc.nextLine();
    }

    //Based on the instruction given, The germinate method needs to prompt the user for Germination date and height.
    public void germinate(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Germination Date (dd/mm/yyyy): ");
        heightDate = sc.nextLine();
        System.out.println("Enter observed height in meters: ");
        height = sc.nextDouble();
    }

    //Based on the instruction given, dumpData Methhod only displays the summary of all the datas.
    public void dumpData(){
        System.out.println("Plant Date: " + plantDate);
        System.out.println("Germinate Date: " + heightDate);
        System.out.println("Initial Height: " + height);
    }
}
