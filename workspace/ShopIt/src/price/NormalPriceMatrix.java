package price;

public class NormalPriceMatrix extends PriceMatrix {

	int nId;

	public NormalPriceMatrix() {
		this.price = 100;
	}

	@Override
	public int getPrice() {
		return this.price;

	}
}
