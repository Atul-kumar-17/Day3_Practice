public class EmpMonthlySalary {
    public static void main(String[] args) {
        int wagePerHrs = 20;
        int totalWorkingDays = 20;
        int empHrs = 0;
        int partTimeHrs = 4;
        int part_Time = 1;
        int full_Time = 2;
        int empMaxHrs=100;
        int totalWage=empMaxHrs*wagePerHrs;
        while(empHrs<=empMaxHrs && day <= totalWorkingDays ) {
            day++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 0:
                    part_Time:
                    empHrs = 4;
                    break;
                case 1:
                    full_Time:
                    empHrs = 8;
                    break;
            }
        }
           System.out.println("Employee's total Wage = "+totalWage);
    }
}