package JavaStudy;
//08:각 자리수의 합

//문제
//세자리의 정수 N (100~999)을 표현하는 각 자리의 숫자들의 합을 구하는
//프로그램을 작성하세요.
//[예] 932 정수의 각 자리 숫자들의 합계는 14 ( = 9 + 3 + 2)

//입력 예 : 474
//출력 예 : 15

//힌트
//%연산자와 /연산자를 활용하세요.
//932 % 10 = 2
//932 / 10 = 93

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        int num = 0;
        //int(integer, 정수), 정수 데이터를 저장하는 자료형
        //num: 사용할 변수의 이름
        // =0; : 변수에 처음넣는 값이 0
        int sum = 0;

        System.out.print("숫자를 입력하세요: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        while(num!=0){
            sum += num%10;
            num /= 10;
        }
        System.out.println("각 자리수의 합은 " +sum+"입니다.");
        System.out.println("프로그램을 종료합니다.");
    }
}
