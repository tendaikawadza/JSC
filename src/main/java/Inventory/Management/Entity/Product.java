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
	
	//@column(nullable=false,update=false)

	private Long productId;
	private Date date;
	private String productCode;
	private String productName;

	private int ReOrderLevel;
	private int Quantity;
	private String Sensitivity;

	public Product() {
	}

	public Product(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Product{" +
				"productId=" + productId +
				", date=" + date +
				", productName='" + productName + '\'' +
				", productCode='" + productCode + '\'' +
				", ReOrderLevel=" + ReOrderLevel +
				", Quantity=" + Quantity +
				", Sensitivity='" + Sensitivity + '\'' +
				'}';
	}
}
	


