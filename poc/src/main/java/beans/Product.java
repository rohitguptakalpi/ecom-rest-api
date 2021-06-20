package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int productId;
	@Column(name="product_name")
	String productName;
	@Column(name="product_discription")
	String productDescription;
	@Column(name="product_price")
	int prices;
	@Column(name="product_available")
	String stockAvailable;
	
	public Product(int productId, String productName, String productDescription, int prices, String stockAvailable) {
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.prices = prices;
		this.stockAvailable = stockAvailable;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getPrices() {
		return prices;
	}

	public void setPrices(int prices) {
		this.prices = prices;
	}

	public String getstockAvailable() {
		return stockAvailable;
	}

	public void setstockAvailable(String stockAvailable) {
		this.stockAvailable = stockAvailable;
	}

	@Override
	public String toString() {
		return "product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", prices=" + prices + ", stockAvaible=" + stockAvailable + "]";
	}

}
