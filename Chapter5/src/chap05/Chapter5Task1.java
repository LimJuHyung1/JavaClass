
public class Chapter5Task1{
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}		
	
	// 첫번째 요소를 제외한 나머지 요소의 합 반환
	public static int sumExceptFirst(int first, int... v) {
		int sum = 0;
		
		// foreach 문을 통해 첫번째 변수를 제외한 나머지 변수들을 모두 더해 반환함
		for (int i : v) {
			sum += i;
			// 마지막 요소가 아닐 경우
			if(i != v[v.length - 1])
				System.out.print(i + " + ");
			// 마지막 요소일 경우
			else System.out.print(i);
		}
		
		System.out.print(" = ");
		return sum;
	}
	
    public static void main(String[] args) {
    	printMyName();
    	
    	System.out.println(sumExceptFirst(1,2,3,4));
    	int arr[] = {2,3};
    	System.out.println(sumExceptFirst(1, arr));
    	System.out.println(sumExceptFirst(1,2,3,4,5));
		
    }
}
