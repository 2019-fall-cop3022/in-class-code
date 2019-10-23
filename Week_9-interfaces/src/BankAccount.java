
public class BankAccount {
	private String type;
	private Amount balance;
	
	BankAccount (String amount)
	{
		this.balance = new Amount(amount);
		System.out.println(this.balance.cents);
	}
	
	public String getBalance ()
	{
		return this.balance.getBalance();
	}
	
	private class Amount
	{
		private int dollars;
		private int cents;
		
		Amount (String amount)
		{
			String[] parts = amount.split("\\.");
			this.dollars = Integer.parseInt(parts[0]);
			this.cents = Integer.parseInt(parts[1]);
		}
		
		public String getBalance ()
		{
			return "$"+this.dollars+"."+String.format("%02d", this.cents);
		}
	}
}
