package readfile;


public class Entity {
	//BNB-> USDT	ETH-> USDT	BNB->ETH
	
	private double bnbUsdt;
	private double ethUsdt;
	private float bnbEth;
	
	public Entity() {
	}
	
	public String toString() {
		return ""+this.bnbUsdt;
	}

	
	public Entity(double bnbUsdt, double ethUsdt, float bnbEth) {
		this.bnbUsdt = bnbUsdt;
		this.ethUsdt = ethUsdt;
		this.bnbEth = bnbEth;
	}
	public double getBnbUsdt() {
		return bnbUsdt;
	}
	public void setBnbUsdt(double bnbUsdt) {
		this.bnbUsdt = bnbUsdt;
		System.out.println("input BnbUsdt: "+ this.bnbUsdt);
	}
	public double getEthUsdt() {
		return ethUsdt;
	}
	public void setEthUsdt(double ethUsdt) {
		this.ethUsdt = ethUsdt;
		System.out.println("input EthUsdt: "+ this.ethUsdt);
	}
	public float getBnbEth() {
		return bnbEth;
	}
	public void setBnbEth(float bnbEth) {
		this.bnbEth = bnbEth;
		System.out.println("input BnbEth: "+ this.bnbEth);
	}

}

