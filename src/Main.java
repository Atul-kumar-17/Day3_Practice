public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
 //    Check Employee is Present or Absent  using Random
        int randomCheck= (int)Math.floor(Math.random() * 10) % 2;
        if(randomCheck==1){
            System.out.println("Employee is Present");
        }else{
            System.out.println("Employee is Absent");
        }

    }
}