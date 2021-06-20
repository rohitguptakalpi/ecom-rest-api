package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="discount")
public class Discount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int discountId;
	String discountName;
	int discount;
	String validTillDate;
	int upToDiscount;
	
	
	public Discount(int discountId, String discountName, int discount, String validTillDate, int upToDiscount) {
		this.discountId = discountId;
		this.discountName = discountName;
		this.discount = discount;
		this.validTillDate = validTillDate;
		this.upToDiscount = upToDiscount;
	}
	
	public int getDiscountId() {
		return discountId;
	}
	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}
	public String getDiscountName() {
		return discountName;
	}
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getValidTillDate() {
		return validTillDate;
	}
	public void setValidTillDate(String validTillDate) {
		this.validTillDate = validTillDate;
	}
	public int getUpToDiscount() {
		return upToDiscount;
	}
	public void setUpToDiscount(int upToDiscount) {
		this.upToDiscount = upToDiscount;
	}
	
	@Override
	public String toString() {
		return "Discount [discountId=" + discountId + ", discountName=" + discountName + ", discount=" + discount
				+ ", validTillDate=" + validTillDate + ", upToDiscount=" + upToDiscount + "]";
	}	
	
}
