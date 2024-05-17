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
