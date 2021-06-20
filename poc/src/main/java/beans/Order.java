package beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order {
	@Id
	int orderId;
	int orderNo;
	int userId;
	int addressId;
	int discountId;
	String orderDate;
	String shipingDate;
	int totalAmount;
	String isDelivered;
	String isPayment;
	public Order( int orderNo, int userId, int addressId, int discountId, String orderDate,
			String shipingDate, int totalAmount, String isDelivered, String isPayment) {
		this.orderNo = orderNo;
		this.userId = userId;
		this.addressId = addressId;
		this.discountId = discountId;
		this.orderDate = orderDate;
		this.shipingDate = shipingDate;
		this.totalAmount = totalAmount;
		this.isDelivered = isDelivered;
		this.isPayment = isPayment;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getDiscountId() {
		return discountId;
	}
	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getShipingDate() {
		return shipingDate;
	}
	public void setShipingDate(String shipingDate) {
		this.shipingDate = shipingDate;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getIsDelivered() {
		return isDelivered;
	}
	public void setIsDelivered(String isDelivered) {
		this.isDelivered = isDelivered;
	}
	public String getIsPayment() {
		return isPayment;
	}
	public void setIsPayment(String isPayment) {
		this.isPayment = isPayment;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderNo=" + orderNo + ", userId=" + userId + ", addressId=" + addressId
				+ ", discountId=" + discountId + ", orderDate=" + orderDate + ", shipingDate=" + shipingDate
				+ ", totalAmount=" + totalAmount + ", isDelivered=" + isDelivered + ", isPayment=" + isPayment + "]";
	}
	
}
