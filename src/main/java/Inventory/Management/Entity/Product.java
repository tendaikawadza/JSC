package Inventory.Management.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="product")

public class Product  implements Serializable {
	
	@Id	
	@SequenceGenerator(
			
			name="product_sequence",
			sequenceName="product_seuence",
			allocationSize=1
			
			)
	@GeneratedValue(
			strategy=GenerationType.AUTO,
			generator="product_auto"
			
			
			)
	
	
	private Long productId;
	private Date date;
	private String productName;	
	private String productCode;
	private int ReOrderLevel;
	private String Sensitivity;
	public Product() {
		super();
	}
	public Product(Date date, String productName, String productCode, int reOrderLevel, String sensitivity) {
		super();
		this.date = date;
		this.productName = productName;
		this.productCode = productCode;
		ReOrderLevel = reOrderLevel;
		Sensitivity = sensitivity;
	}
	public Product(Long productId, Date date, String productName, String productCode, int reOrderLevel,
			String sensitivity) {
		super();
		this.productId = productId;
		this.date = date;
		this.productName = productName;
		this.productCode = productCode;
		ReOrderLevel = reOrderLevel;
		Sensitivity = sensitivity;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getReOrderLevel() {
		return ReOrderLevel;
	}
	public void setReOrderLevel(int reOrderLevel) {
		ReOrderLevel = reOrderLevel;
	}
	public String getSensitivity() {
		return Sensitivity;
	}
	public void setSensitivity(String sensitivity) {
		Sensitivity = sensitivity;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", date=" + date + ", productName=" + productName + ", productCode="
				+ productCode + ", ReOrderLevel=" + ReOrderLevel + ", Sensitivity=" + Sensitivity + "]";
	}
	
	
	
	
	
	
	}	
	


