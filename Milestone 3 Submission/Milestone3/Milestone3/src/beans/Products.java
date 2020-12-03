package beans;

import java.util.ArrayList;

import java.util.List;

import javax.faces.bean.ManagedBean;


@ManagedBean

public class Products {
	
    // Creates a product arraylist to be used in the default constructor.
	List<Product> products = new ArrayList<Product>();
	
    // In the default constructor a list of new products are added to a data grid 
	public Products() {
		products.add(new Product("1", "Macbook", (float)1200, 1));
		products.add(new Product("2", "Iphone ", (float)800, 1));
		products.add(new Product("3", "Airpods", (float)120, 3));
		products.add(new Product("4", "Dell laptop", (float)1100, 1));
		products.add(new Product("5", "Speaker", (float)400, 1));
	}
	
    
    // Getter and Setter Methods
	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
