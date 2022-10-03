package hello.core.singleton;

public class StatefulService {

    //싱글톤에선 global variable (공유 필드) 사용 자제!!
//    private int price; //상태를 유지하는 필드 10000 -> 20000

    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
//        this.price = price;
        return price;
    }

//    public int getPrice() {
//        return price;
//    }
}
