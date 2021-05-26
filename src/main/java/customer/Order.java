package customer;

public class Order {
	private int id;
	private int userid;
	private String itemname;
	 private String quantity;
	 private String address;
	 private String price;
	 
	 public Order(int id, int userid, String itemname, String quantity, String address, String price) {
			
			this.id = id;
			this.userid = userid;
			this.itemname = itemname;
			this.quantity = quantity;
			this.address = address;
			this.price = price;
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	 
	 
	
}
