package stockmanagement;

public class StockManagement {
	
	String stockName;
	int numberOfShares;
	double sharePrice;
	
	public StockManagement() {
		
	}
	
	public StockManagement(String stockName, int numberOfShares, double sharePrice) {
		this.stockName = stockName;
		this.numberOfShares = numberOfShares;
		this.sharePrice = sharePrice;
	}
	
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	public double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	
	
	
	

}
