/**
 * 상품 클래스
 */

package class26.exam02;

public class Product {

	// 필드 선언
	public int id;
	public String name;
	public int price;
	public int quantity;
	public int amount;

	// 기본 생성자
	public Product() {
	}
/*
	// 오버로딩 생성자(파라미터)
	public Product(int id, String name, int price, int quantity, int amount) {

		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.amount = amount;
	}
*/
	
	// 오버로딩 생성자(파라미터)
		public Product(int id, String name, int price, int quantity, int amount) {

			this.id = id;
			this.name = name;
			this.price = price;
			this.quantity = quantity;
			this.amount = amount;
		}
		
		public int getAmount() {
			return this.price * this.quantity;
		}

	// 객체의 정보를 보여주는 메소드()
	public void showProductInfo() {
		System.out.println("id : " + this.id);
		System.out.println("name : " + this.name);
		System.out.println("price : " + this.price);
		System.out.println("quantity : " + this.quantity);
		System.out.println("amount : " + this.getAmount());
		//System.out.println("amount : " + this.amount);
	}
}