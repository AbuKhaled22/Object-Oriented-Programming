public class MainCoffee {
    public static void main(String[] args){
        CoffeeBag coffeeBag = new CoffeeBag(5.0, 2);
        System.out.println("Total price: " + coffeeBag.totalPrice());
        System.out.println("Total price with tax: " + coffeeBag.totalPriceWithTax(coffeeBag.totalPrice())); 



        
    } 
}
