package JavaStudy;
//05:밥값 계산하기
//돈까스 16인분, 칼국수 8인분, 왕만두 1인분을 시켰을때, 계산서를 출력 예와 같이 작성해 주세요. 가격표는 아래와 같습니다.
//돈까스: 8000원
//칼국수: 6000원
//왕만두: 5000원

//출력 예
//돈가스 x 16 = 128000
//칼국수 x  8 =  80000
//왕만두 x  1 =   5000
//===================
//총합: 213000

public class BobGap {
    public static void main(String[] args){
        int DonPrice = 8000; //돈가스 가격
        int KalPrice = 10000; //칼국수
        int KingPrice = 5000; //왕만두

        int DonNumber = 16; //돈가스 수량
        int KalNumber = 8; //칼국수
        int KingNumber = 1; //왕만두

        //결과 출력
        System.out.printf("%s x %2d = %6d\n", "돈가스", DonNumber, DonPrice * DonNumber);
        System.out.printf("%s x %2d = %6d\n", "칼국수", KalNumber, KalPrice * KalNumber);
        System.out.printf("%s x %2d = %6d\n", "왕만두", KingNumber, KingPrice * KingPrice);
        System.out.println("===================");
        int sum = DonPrice * DonNumber + KalPrice * KalNumber + KingPrice * KingNumber;
        System.out.printf("%s: %d\n", "총합", sum);


//        String food1 = "돈가스";
//        int price1 = 8000;
//        String food2 = "칼국수";
//        int price2 = 10000;
//        String food3 = "왕만두";
//        int price3 = 5000;
    }
}
