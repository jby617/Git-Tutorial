import java.util.Scanner;

public class Java_start1 {
    public static void main(String[] args) {
        //입력 복습
//        Scanner sc = new Scanner(System.in);
//        System.out.println("input : ");
//        String input =sc.nextLine();
//        System.out.println("input String : " + input);

        //조건문 복습
        int age = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("나이를 입력해주세요.(10~30대)");
        age = sc1.nextInt();
        if(age <= 9){
            System.out.println("10대 이하");
        }else if(age >= 10 && age < 20){
            System.out.println("10대");
        }else if(age >= 20 && age < 30){
            System.out.println("20대");
        }else if(age >= 30 && age < 40) {
            System.out.println("30대");
        }else{
            System.out.println("그 이상");
        }

    }
}
