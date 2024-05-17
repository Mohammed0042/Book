import java.util.ArrayList;
import java.util.Scanner;

public class Rock {
    private double weight;

    //konstruktor för vikt för att spara den i variabeln weight

    public Rock(double w){
        this.weight = w;
    }

    public double getWeight() {
        return weight;
    }
    public static void main(String[]args){
        //för att läsa använderens input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange hur många stenar som ska skapas:");
        int amountRocks = scanner.nextInt();

        ArrayList<Rock> rockList = new ArrayList<>();

        for (int i = 0; i < amountRocks; i++){
            System.out.println("Ange stenens vikt"+(i+1)+":");
            double weight = scanner.nextDouble();

            Rock rock = new Rock(weight);
            rockList.add(rock);
        }
        scanner.close();

        System.out.println("vikten på stenen är");
        for (int i = 0; i< rockList.size(); i++){
            System.out.println("Sten"+(i+1)+":"+rockList.get(i).getWeight()+"kg");
        }
    }
}
