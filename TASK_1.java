import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TASK_1{
        Scanner sc=new Scanner(System.in);
        //CREATING AN OBJECT FOR THE RANDOM CLASS
        Random r=new Random();
        ArrayList<Integer> ar=new ArrayList<>();
        int random=r.nextInt((101-1+1)+1);
        int accuracy=0;
        public  void round(int round_number){
            System.out.println("ROUND "+round_number);
            for(int i=1;i<=5;i++){
            System.out.print("\tenter number: ");
            int n=sc.nextInt();
            if(n==random){
                System.out.println("\tGuessed number is matched successfully");
                accuracy=i;
                break;
            }
            
            else{
                int temp=random/2;
                int temp1=(random+100)/2;
                if(n<temp){
                    System.out.println("\tGuessed number is too low");
                }   
                else if(n>=temp && n<random){
                    System.out.println("\tGuessed number is low");
                }
                else if(n>random && n<=temp1){
                    System.out.println("\tGuessed number is high");
                }
                else{
                    System.out.println("\tGuessed number is too high");
                }
                accuracy=i;
                if(i==5){
                    System.out.println("\t5 ATTEMPTS ARE COMPLETED IN ROUND "+round_number);
                }
                continue;
            }
            }
            ar.add((20*(5-accuracy)));
    }
            public void score(){
                int result=0;
                for(int i=0;i<ar.size();i++)
                result+=ar.get(i);
                System.out.println();
                System.out.println("Overall Score : "+(float)result/ar.size());
            }
    public static void main(String[] args) {
        TASK_1 t=new TASK_1();
        int round_num=1;
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("\t* WELCOME TO THE NUMBER GAME *");
        System.out.println();
        System.out.println("\t<--NOTE: Number of attempts = 5-->");
        System.out.println();
        t.round(round_num);
        while (true) {
                System.out.print("\tPress 1 to play again and 2 to view score:");
                int choice=sc.nextInt();
                if(choice==1){
                    round_num++;
                    t.round(round_num);
                }
                else if(choice==2){
                    break;
                }
        }
        t.score();
        sc.close();
    }
}