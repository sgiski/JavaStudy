package JavaStudy;
//04:쇼핑리스트 출력하기
//클래스
public class ShoppingList {
    //메인 메소드
    public static void main(String[] args) {
        //변수생성
        String item1 = "한우 꽃등심";
        int price1 = 112500;
        String item2 = "참치 선물팩";
        int price2 = 25500;
        String item3 = "맥스봉 한팩";
        int price3 = 500;

        //형식에 따른 출력
        System.out.printf("품명: %-10s 가격: %8d\n", item1, price1);
        System.out.printf("품명: %-10s 가격: %8d\n", item2, price2);
        System.out.printf("품명: %-10s 가격: %8d\n", item3, price3);
        //%-10s %8d 이런거 아직도 이해못하게기
    }
}