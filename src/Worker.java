public class Worker {

    protected String name;
    protected int age;
    protected double wage;
    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
        this.wage = 0; // Initialisera wage till 0
    }
    public void SetWage(double wage) {
        this.wage = wage;
    }
    public String GetName() {
        return name;
    }
    public int GetAge() {
        return age;
    }
    public double GetWage() {
        return wage;
    }




}

class BlueCollar extends Worker {
    public BlueCollar(String name, int age) {
        super(name, age);
    }
    public void Build() {
        System.out.println("Bygger...");
    }

    public void Repair() {
        System.out.println("Reperarar...");
    }

    public void Destroy() {
        System.out.println("Förstör...");
    }
}

class WhiteCollar extends Worker {
    // Konstruktor som tar emot namn och ålder
    public WhiteCollar(String name, int age) {
        super(name, age);
    }

    // Metoder för WhiteCollar
    public void DrinkCoffee() {
        System.out.println("Drinking coffee...");
    }

    public void AttendMeeting() {
        System.out.println("Attending a meeting...");
    }

    public void DoSpreadsheets() {
        System.out.println("Doing spreadsheets...");
    }
}







