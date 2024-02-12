public class CoffeeBag {
    private Double weight;
    private int noOfBags;
    private final Double pricePerKg=8.99;
    private final Double taxRate=0.0625;
    
    public CoffeeBag(Double weight, int noOfBags){
        this.weight=weight;
        this.noOfBags=noOfBags;
        
    }
    public Double totalPrice( ) {
        return (weight*noOfBags*pricePerKg);
    }
    public Double totalPriceWithTax( Double totalPrice) {
        return totalPrice+(totalPrice*taxRate);
    }
    

}




