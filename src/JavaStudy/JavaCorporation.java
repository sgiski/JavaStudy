package JavaStudy;

//임금 계산하기
//당신은 Java 기업의 사장이 되었습니다. 어느덧 월급날이 다가오는데..
//
//문제
//회사의 직원들에게 지급할 임금을 계산하는 프로그램을 작성해주세요.
//
//        요구사항
//직원의 임금은 주급으로 정산하며, (근무시간) X (기본시급)을 기준으로 한다.
//주당 근무시간이 40시간을 초과시, 초과급여는 (초과시간) X (기본시급) X (1.5)으로 한다.
//기본시급은 최저 $8.00이며, 이보다 작을 경우 에러를 출력한다.
//주당 근무시간이 60시간을 초과하는 경우 에러를 출력한다.

public class JavaCorporation {
    public static void printPay(double basePay, int hours) {
        // 메소드를 구현하세요..
        //최저시급 미달 체크
        if (basePay < 8.00) {
            System.out.println("ERROR: 최저시급 불이행");
        }

        //주당 근무시간 초과 체크
        if (hours > 60) {
            System.out.println("ERROR: 제한 근무시간 초과");
        }

        //임금계산
        double totalPay = 0;

        if (hours > 40) {
            // 40시간 초과 1.5배 수당, 그래서 40*베이스 + 총 근무시간-기본시간 후 베이스페이 * 초과근무수당
            totalPay = (40 * basePay) + ((hours - 40) * basePay * 1.5);
        } else {
            totalPay = hours * basePay;
        }

        System.out.println("$ " + totalPay);
    }
        public static void main (String[]args){
            printPay(7.50, 35);
            printPay(8.20, 47);
            printPay(10.00, 73);
        }

}