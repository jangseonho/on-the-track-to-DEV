package day7;

import java.text.DecimalFormat;

public class DeliveryDTO {

	// Field
	// 필드
	// フィールド
	private int id;
	private String name;
	private int price;
	private int stock;
	private int total;
	
	// Constructor
	// 생성자
	// コンストラクタ
	public DeliveryDTO() {}
	public DeliveryDTO(int id, String name, int price, int stock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.total = price * stock;
	}
	
	// Getter & Setter
	// ゲッター & セッター
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
		setTotal();
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
		setTotal();
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = this.price * this.stock;
	}
	
	// toString method
	// toStirng メソッド
	DecimalFormat df = new DecimalFormat("#,###");

	@Override
	public String toString() {
		return String.format("[번호: %d, 품명: %s, 가격 %s원, 수량: %d개]", id, name, df.format(price), stock);
	}
	
	
}
