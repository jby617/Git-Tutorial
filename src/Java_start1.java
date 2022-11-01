import java.util.Random;
import java.util.Scanner;

public class Java_start1 {
    public static void main(String[] args) {
        //입력 복습
//        Scanner sc = new Scanner(System.in);
//        System.out.println("input : ");
//        String input =sc.nextLine();
//        System.out.println("input String : " + input);

        //조건문 복습
//        int age = 0;
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("나이를 입력해주세요.(10~30대)");
//        age = sc1.nextInt();
//        if(age <= 9){
//            System.out.println("10대 이하");
//        }else if(age >= 10 && age < 20){
//            System.out.println("10대");
//        }else if(age >= 20 && age < 30){
//            System.out.println("20대");
//        }else if(age >= 30 && age < 40) {
//            System.out.println("30대");
//        }else{
//            System.out.println("그 이상");
//        }

        // 랜덤 숫자 맞추기 게임
        Random random = new Random();

        int randomnumber = random.nextInt(256);
        System.out.println(randomnumber);

//        try { //출력 속도 설정
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException();
//        }
//        System.out.println("qwe");
        Scanner sc3 = new Scanner(System.in);
        for (int i =0; i <8; i ++){
            System.out.println("입력하세요(0 ~ 256) : ");
            String input =sc3.nextLine();
            int g = Integer.parseInt(input);
            if(g == randomnumber){
                System.out.println("정답입니다.");
                break;
            }else if(g < randomnumber) {
                System.out.println("랜덤 숫자가 더 작습니다.");
            }else {
                System.out.println("랜덤 숫자가 더 큽니다.");
            }
            if(i == 7){
                System.out.println("기회가 끝났습니다.");
                System.out.println("게임 종료!");
            }
            System.out.println("남은 기회 : " + (7-i));

        }


    }
}
