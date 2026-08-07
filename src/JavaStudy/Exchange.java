package JavaStudy;
//07:환전하기

//유로, 달러 순으로 입력
//58 32
//출력 예
//58유로 + 32달러 = 109268 원

import java.util.Scanner; // 키보드로 입력을 받기 위해 반드시 추가, 입력하니까 실행쪽에서 키보드로 입력가능해짐

//클래스
public class Exchange {
    //메인메소드
    public static void main(String[] args){
        System.out.print("유로와 달러를 입력하세요: ");
        //키보드로부터 입력을 받음
        Scanner input = new Scanner(System.in);
        int euro = input.nextInt();
        int dollar = input.nextInt();

        //환율 변수 생성
        double eurRate = 1320.48026;
        double dallarRate = 1063.82979;

        //8월 7일 기준 환율
        //환율 ㅈㄴ비쌈
//        double eurRate = 1635.10;
//        double dallarRate = 1419.40;
        //1,635라고 입력하면 ","를 따로 인식해버려서 무조건 빼고 입력



        //환율 출력
        int won = (int)(euro * eurRate + dollar * dallarRate);
        //System.out.println("58유로 + 32달러 ="+ won +" 원");
        // 이러면 어떤 값을 넣든 58유로+32달러 =110630원으로밖에 안나옴

        System.out.println(won + " 원");
        // 10 10 30545에
        //이래야 계산기라도 되는거지ㅋ
        //"유로 + 달러 =" +
    }
}
