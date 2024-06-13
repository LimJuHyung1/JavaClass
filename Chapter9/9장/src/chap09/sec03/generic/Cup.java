package sec03.generic;

public class Cup<T> {
    private T beverage;

    public T getBeverage() {
        return beverage;
    }

    public void setBeverage(T beverage) {
        this.beverage = beverage;
    }
    
    public void printMyType() {
    	System.out.println("제 타입은 " + beverage.getClass() + " 입니다");
    }
}