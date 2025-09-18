/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;
    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        //question 12
        int age = calculateAge(2025);
        //age=age-yearOfBirth;
        if(age>=16){
            System.out.println("Employee can drive");
            return true;
        }
        else{
            System.out.println("Employee cannot drive");
            return false;
        }
        }
    

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(double hoursWorked){
        //question 13
        //double totalHourlyWage;
        //double hoursWorked;
        //double pay;
        double totalHourlyWage=hourlyWage*hoursWorked;
        double grossNet=totalHourlyWage+unpaidHours;
        double netPay= grossNet - (grossNet*0.30);
        return netPay;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(double hoursWorked){
        //question 14
        //calculatePay();
        double netpay = calculatePay(hoursWorked);
        System.out.println(fullname+" "+"has received a wire transfer of"+" "+netpay+"CAD");
        unpaidHours=0.0;
    }
}