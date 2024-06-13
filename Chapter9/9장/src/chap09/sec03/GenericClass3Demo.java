package sec03;

import sec03.generic.Cup;

public class GenericClass3Demo {
    public static void main(String[] args) {
        Cup c = new Cup();		// 최상위 부모로 하겠다 - Object(?)

        c.setBeverage(new Beer());

//        Beer beer = c.getBeverage();
        Beer beer = (Beer) c.getBeverage();		// Object 이므로 캐스팅 필요
    }
}