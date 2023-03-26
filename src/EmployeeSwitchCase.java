import java.sql.SQLOutput;

public class EmployeeSwitchCase {
    public static void main(String[] args) {
        int partTimeEmp=1;
        int fullTimeEmp=2;
        int empHrs=0;
        int wagePerHrs=20;
        int randomCheck=(int)Math.floor(Math.random() * 10) % 4;
        switch (randomCheck){
            case 1:
                System.out.println("Employee is Part time");
                empHrs=4;
                System.out.println("Part time employee daily wage = "+wagePerHrs*4);
                break;
            case 2:
                System.out.println("Employee is full time");
                empHrs=8;
                System.out.println("Full time employee daily wage = "+wagePerHrs*8);
                break;
            case 3:
                System.out.println("Employee is absent");
                System.out.println("dailywage = "+wagePerHrs*0);
                break;
        }

    }
}
