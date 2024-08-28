public class InternetBill {
  // This is the constant variable
  private static final double INTERNET5_PRICE = 24.99;
  private static final int INTERNET5_ALLOWED_GB = 25;
  private static final double INTERNET5_EXTRA_COST_PER_GB = 5.0;

  // Attributes of InternetBill table
  private String customerName;
  private String packageName;
  private int usage;
  
  // Default constructor
  public InternetBill() {
      this.customerName = "";
      this.packageName = "";
      this.usage = 0;
  }
  
  // 2nd constructor
  public InternetBill(String newName, String newPack, int newUsage) {
      this.customerName = newName;
      this.packageName = newPack;
      this.usage = newUsage;
  }

  // I create these method(gerCustomerName,...) or call "Getter" to retrieves the value of a field
  public String getCustomerName() {   
      return customerName;
  }
  public String getPackageName() {
      return packageName;
  }
  public int getUsage() {
      return usage;
  }

  // This is Setter or mutator method - changes value of a field. 
  public void setCustomerName(String newName) {
      this.customerName = newName;
  }

  public void setPackageName(String newName) {
      this.packageName = newName;
  }

  public void setUsage(int newUsage) {
      this.usage = newUsage;
  }

  // Calculate total charges
  public double charges(int allowedGB, double extraCharge, double packPrice) {
      if (usage > allowedGB) {
          int extraUsage = usage - allowedGB;
          return packPrice + (extraUsage * extraCharge);
      } else {
          return packPrice;
      }
  }

  // Calculate usage cost
  public double usageCost() {
      double price = INTERNET5_PRICE;
      int allowed = INTERNET5_ALLOWED_GB;
      double extraCost = INTERNET5_EXTRA_COST_PER_GB;

      return charges(allowed, extraCost, price);
  }
}
