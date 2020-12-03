package beans;

// Creates a Product object to be used when creating a product for the product data grid.
public class Product {
	
    // Declares  global variables for the Product object
    String ProductNumber = "";
	String ProductName = "";
	float Price = 0;
	int Quantity = 0;
	
    // default constructor
	public Product(String Number, String Name, float Price, int Quantity){
		this.ProductNumber = Number;
		this.ProductName = Name;
		this.Price = Price;
		this.Quantity = Quantity;	
    }
    
    // Getter and Setter Methods
	public String getProductNumber() {
		return ProductNumber;
	}

	public void setProductNumber(String productNumber) {
		ProductNumber = productNumber;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
}
