import java.util.ArrayList;
import java.util.Scanner;

class Hardware {
    private String namn;
    private double pris;

    public Hardware(String namn, double pris) {
        this.namn = namn;
        this.pris = pris;
    }

    public String getNamn() {
        return namn;
    }

    public double getPris() {
        return pris;
    }
}

class HardDrive extends Hardware {
    private int kapacitet;

    public HardDrive(String namn, double pris, int kapacitet) {
        super(namn, pris);
        this.kapacitet = kapacitet;
    }

    public int getKapacitet() {
        return kapacitet;
    }
}

class Processor extends Hardware {
    private int kärnor;
    private double klockhastighet;

    public Processor(String namn, double pris, int kärnor, double klockhastighet) {
        super(namn, pris);
        this.kärnor = kärnor;
        this.klockhastighet = klockhastighet;
    }

    public int getKärnor() {
        return kärnor;
    }

    public double getKlockhastighet() {
        return klockhastighet;
    }

}
class GraphicsCard extends Hardware {
    private int minne;

    public GraphicsCard(String namn, double pris, int minne) {
        super(namn, pris);
        this.minne = minne;
    }

    public int getMinne() {
        return minne;
    }
}

public class HardwareManager {
    public static void main(String[] args) {
        ArrayList<Hardware> hardwareList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Vilken typ av hårdvara vill du skapa? (1: Hårddisk, 2: Processor, 3: Grafikkort, 0: Avsluta)");
            int val = scanner.nextInt();
            scanner.nextLine();

            if (val == 0) {
                break;
            }

            System.out.println("Ange namn:");
            String namn = scanner.nextLine();
            System.out.println("Ange pris:");
            double pris = scanner.nextDouble();

            if (val == 1) {
                System.out.println("Ange kapacitet (GB):");
                int kapacitet = scanner.nextInt();
                hardwareList.add(new HardDrive(namn, pris, kapacitet));
            } else if (val == 2) {
                System.out.println("Ange antal kärnor:");
                int kärnor = scanner.nextInt();
                System.out.println("Ange klockhastighet (GHz):");
                double klockhastighet = scanner.nextDouble();
                hardwareList.add(new Processor(namn, pris, kärnor, klockhastighet));
            } else if (val == 3) {
                System.out.println("Ange minne (GB):");
                int minne = scanner.nextInt();
                hardwareList.add(new GraphicsCard(namn, pris, minne));
            }
        }

        System.out.println("Skapade hårdvaror:");
        for (Hardware hw : hardwareList) {
            System.out.println("Namn: " + hw.getNamn() + ", Pris: " + hw.getPris());
            if (hw instanceof HardDrive) {
                System.out.println("Kapacitet: " + ((HardDrive) hw).getKapacitet() + " GB");
            } else if (hw instanceof Processor) {
                System.out.println("Kärnor: " + ((Processor) hw).getKärnor() + ", Klockhastighet: " + ((Processor) hw).getKlockhastighet() + " GHz");
            } else if (hw instanceof GraphicsCard) {
                System.out.println("Minne: " + ((GraphicsCard) hw).getMinne() + " GB");
            }
        }
    }
}
