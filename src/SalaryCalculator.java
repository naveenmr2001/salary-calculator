import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] inputForWeek = new int[7];

        System.out.println("Enter the Working Hours Of Jeevitha: ");
        for(int iterator = 0;iterator<7;iterator++){
            inputForWeek[iterator] = scan.nextInt();
        }

        int totalSalary = 0;

        int totalHours = 0;

        for(int iterator = 0;iterator<inputForWeek.length;iterator++){

            if(iterator == 0){

                totalSalary+=(inputForWeek[iterator]*100)+((inputForWeek[iterator]*100)*0.50);

            }else if(iterator == 6){

                totalSalary+=(inputForWeek[iterator]*100)+((inputForWeek[iterator]*100)*0.25);

            }else{

                if(inputForWeek[iterator]>8){

                    if(totalHours>40){

                        totalSalary+=25;

                    }

                    int extraHours = inputForWeek[iterator]-8;

                    totalSalary+=(inputForWeek[iterator]*100);

                    totalSalary+=(extraHours*15);

                }else{

                    if(totalHours>40){

                        totalSalary+=25;

                    }

                    totalSalary+=(inputForWeek[iterator]*100);

                }

            }

            totalHours+=inputForWeek[iterator];

        }

        System.out.println(totalSalary);

    }
}