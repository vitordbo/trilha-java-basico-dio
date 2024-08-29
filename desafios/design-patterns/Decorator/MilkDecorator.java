// Decorator que adiciona leite ao café
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String makeCoffee() {
        return decoratedCoffee.makeCoffee() + ", with Milk";
    }
}