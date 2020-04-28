package model.util;

/**
 * The class represents the total price of the <code>Sale</code>. It contains the fields
 * priceWithoutVAT and totalVAT. Both store as an <code>Amount</code>-object.
 *
 */
public class TotalPrice {

	private Amount priceWithoutVAT;
	private Amount totalVAT;
	
	/**
	 *  Creates a new instance.
	 */
	public TotalPrice() {
		this.priceWithoutVAT = new Amount(0);
		this.totalVAT = new Amount(0);
		
	}
	
	/**
	 * Adds a <code>Amount</code> to the current total price.
	 * @param newAmount	represents the amount to be added.
	 */
	public void addToTotalPrice(Amount newAmount) {
		this.priceWithoutVAT = this.priceWithoutVAT.addAmounts(newAmount);
		
	}
	
	/**
	 * Updates the totalVAT field by adding a new <code>Amount</code>
	 * @param number represent the amount to be added.
	 */
	public void addToTotalVAT(Amount number) {
		
		this.totalVAT = this.totalVAT.addAmounts(number);
		
	}
	
	/**
	 * Returns the final total price, ie. price-without-VAT and VAT-total added together.
	 * @return the final total price as an <code>Amount</code>-object.
	 */
	public Amount getFinalPrice() {
		return this.priceWithoutVAT.addAmounts(totalVAT);
	}
	
	/**
	 *  Get the <code>Amount</code> priceWithoutVat field.
	 * @return priceWithoutVAT
	 */
	public Amount getPriceWithoutVAT() {
		return priceWithoutVAT;
	}
	
	/**
	 * Gets the <code>Amount</code> totalVAT field.
	 * @return totalVAT
	 */
	public Amount getTotalVAT() {
		return totalVAT;
	}

}
