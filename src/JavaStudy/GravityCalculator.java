package JavaStudy;

//자유낙하 물체의 고도 구하기
//문제
//1000 미터 높이에서 가만히 떨어뜨린 자유낙하하는 물체의
//t 초 후 고도를 구하는 프로그램을 제공되는 코드를 활용하여 작성해주세요.
//(등가속운동을 하는 물체의 이동거리 공식을 이용할 것)

import java.util.Scanner;
public class GravityCalculator {
    public static void main(String[] arguments) {
        // 키보드로부터 입력받기 위한 변수
        Scanner input = new Scanner(System.in);
        // 중력 가속도
        double gravity = -9.81;
        // 떨어지는 시간
        double fallingTime = input.nextDouble();
        // 초기 높이
        double initialPosition = 1000.0;
        // x(t) = 0.5at^2 + v0t + x0
        double finalPosition = 0.0; /* 이부분을 수정하여 프로그램을 완성하세요 */
        System.out.printf("%.2f 초 후, 물체의 고도는 %.2f m\n", fallingTime, finalPosition);
    }
}