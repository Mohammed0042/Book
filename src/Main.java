public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker("Joe", 20);
        BlueCollar blueCollar = new BlueCollar("Mo", 30);
        WhiteCollar whiteCollar = new WhiteCollar("Sean", 35);


        worker.SetWage(23000);
        blueCollar.SetWage(33000);
        whiteCollar.SetWage(23000);

        System.out.println("Worker Name: " + worker.GetName());
        System.out.println("Worker Age: " + worker.GetAge());
        System.out.println("Worker Wage: " + worker.GetWage());

        System.out.println("BlueCollar Name: " + blueCollar.GetName());
        System.out.println("BlueCollar Age: " + blueCollar.GetAge());
        System.out.println("BlueCollar Wage: " + blueCollar.GetWage());

        System.out.println("WhiteCollar Name: " + whiteCollar.GetName());
        System.out.println("WhiteCollar Age: " + whiteCollar.GetAge());
        System.out.println("WhiteCollar Wage: " + whiteCollar.GetWage());


        blueCollar.Build();

        blueCollar.Repair();

        blueCollar.Destroy();

        whiteCollar.DrinkCoffee();

        whiteCollar.AttendMeeting();

        whiteCollar.DoSpreadsheets();
    }}