public class DoTaxes {
  float rate;
  float doColorado() {
    SalesTaxRates str = new SalesTaxRates();
    rate = str.salesRate; // this should be a method call like:
    return rate;          // rate = str.getSalesRate("CO");
  }
}

class SalesTaxRates {
  public float salesRate; // should be private
  public float adjustedSalesRate; // should be private

  public float getSalesRate(String region) {
    salesRate = new DoTaxes().doColorado();
    return adjustedSalesRate;
  }
}
