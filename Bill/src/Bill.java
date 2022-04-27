
/**
 * Class to make invoices and apply VAT
 * 
 * @author Programador Bajeril
 *
 */
public class Bill {
	private static final double VAT = 0.21d;
	private static final double REDUCED_VAT = 0.04d;
	private static final double SPECIAL_DISCOUNT = 0.10d;
	private double subtotal;
	private double total;

	public Bill(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * the normal VAT is applied to the subtotal and it is saved in the total
	 */
	public void calculateVat() {
		this.total = subtotal + (subtotal * VAT);
	}

	/**
	 * the reduced VAT is applied to the subtotal and it is saved in the total
	 */
	public void calculateReducedVat() {
		this.total = subtotal + (subtotal * REDUCED_VAT);
	}

	/**
	 * applies a fixed special discount to the subtotal that applies to VIP clients
	 */
	public void calculateSpecialDiscount() {
		calculateVat();
		this.total = total - (total * SPECIAL_DISCOUNT);
	}
}