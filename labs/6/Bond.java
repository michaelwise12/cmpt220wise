
public class Bond {

	double coupon;
	int payments;
	double interest;
	double valueMaturity;
	
	public Bond() {}
	
	Bond(double coupon, int payments, double interest, double valueMaturity) {
		this.coupon = coupon;
		this.payments = payments;
		this.interest = interest;
		this.valueMaturity = valueMaturity;
	}
	
	double getPrice() {
		return (coupon * (1 - (1 / Math.pow((1 + interest), payments)))) + 
				(valueMaturity * ((1 / Math.pow((1 + interest), payments))));
	}
}

