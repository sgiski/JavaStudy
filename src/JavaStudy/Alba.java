package JavaStudy;
//06:급여계산기
import java.util.Scanner; //스캐너를 사용하기 위해 반드시 import해야함. 이거 입력하면 밑에 실행칸에서 계산기 가능

//클래스
public class Alba {
    //메인메소드
    public static void main(String[] args) {
        //키보드로부터 입력을 받기위한 변수 생성 (Scanner!)
        Scanner input = new Scanner(System.in);

        //키보드로부터 정수값을 입력받아 시급에 대입
        int basePay = input.nextInt();
        //키보드로부터 정수값을 입력받아 일한 시간에 대입
        int workingHours = input.nextInt();
        //급여 = 시급 * 일한시간
        int pay = basePay * workingHours;

        //출기
        System.out.println(pay);
    }
}
