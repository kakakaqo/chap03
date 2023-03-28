package class26.exam02;

public class ProductMain {
	public static void main(String[] args) {

/*		
		// 첫번째 객체 생성
		Product product = new Product();
			
		// 첫번째 객체의 값 입력
		product.id = 202103001;
		product.name = "냉장고";
		product.price = 500;
		product.quantity = 5;
		product.amount = 2500;
	
		// 첫번째 객체의 값 출력
		System.out.println("id : " + product.id);
		System.out.println("name : " + product.name);
		System.out.println("price : " + product.price);
		System.out.println("quantity : " + product.quantity);
		System.out.println("amount : " + product.amount);
		System.out.println();

		// 두번째 객체 생성(생성자 호출하면서 값저장)
		Product product2 = new Product(202103001, "세탁기", 250, -15, -3750);

		// 두번째 객체의 값출력
		System.out.println("id : " + product2.id);
		System.out.println("name : " + product2.name);
		System.out.println("price : " + product2.price);
		System.out.println("quantity : " + product2.quantity);
		System.out.println("amount : " + product2.amount);
		System.out.println();
*/

		Product product1 = new Product(202103001, "냉장고", 500, 5, 2500);
		// 객체의 값출력하는 또다른 방법(showCarInfo 메소드)
		// 첫번째 객체의 값출력
		product1.showProductInfo();
		System.out.println();

		Product product2 = new Product(202103001, "세탁기", 250, -15, -3750);
		// 두번째 객체의 값출력
		product2.showProductInfo();
	}
}