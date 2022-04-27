import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BillTest {
	private Bill f = new Bill(10);

	@Test
	void testCalculateVat() {
		f.calculateVat();
		assertEquals(f.getTotal(), f.getSubtotal() * 1.21);
	}

	@Test
	void testCalculateReducedVat() {
		f.calculateReducedVat();
		assertEquals(f.getTotal(), f.getSubtotal() * 1.04);
	}

	@Test
	void testCalculateSpecialDiscount() {
		f.calculateSpecialDiscount();
		assertEquals(f.getTotal(), f.getSubtotal() * 1.21 * 0.9);
	}

}
