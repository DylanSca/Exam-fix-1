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
        int age = calculateAge(2025);
        age=age-yearOfBirth;
        if(age>16){
            System.out.println("Employee can drive");
        }
        else{
            System.out.println("Employee cannot drive");
        }
        }
    

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(double hoursWorked){
        double totalHourlyWage;
        double hoursWorked;
        double pay;
        totalHourlyWage=hourlyWage*hoursWorked
        totalHourlyWage=totalHourlyWage+unpaidHours
        pay=totalHourlyWage*0.30
        return pay;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        calculatePay();
        System.out.println(fullName+" "+"has recived a wire transfer of"+" "+pay+"CAD");
        unpaidHours=0.0;
    }
}