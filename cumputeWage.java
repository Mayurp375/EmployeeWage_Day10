package emplyoyee_Multy;

public class cumputeWage extends employeeCalculationWage {
    public String company;
    public int RatePerHour;
    public int numberOfWorkngDays;
    public int maxHourPerMonth;
    public int TotalWage;

    public cumputeWage(String company, int ratePerHour, int numberOfWorkngDays, int maxHourPerMonth) {
        this.company = company;
        this.RatePerHour = ratePerHour;
        this.numberOfWorkngDays = numberOfWorkngDays;
        this.maxHourPerMonth = maxHourPerMonth;
    }
    public void TotalWage(){
        this.TotalWage= TotalWage;
    }


    public void toPrint(){
        System.out.println("company Name"+this.company+"totalWage"+this.TotalWage);
    }


}
