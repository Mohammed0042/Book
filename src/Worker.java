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

