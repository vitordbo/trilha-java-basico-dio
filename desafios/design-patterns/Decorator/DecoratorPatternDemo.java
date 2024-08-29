public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Cria um café simples
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.makeCoffee());

        // Adiciona leite ao café
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println(milkCoffee.makeCoffee());

        // Adiciona açúcar ao café com leite
        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println(sugarMilkCoffee.makeCoffee());

        // Outra combinação: Café simples com açúcar
        Coffee sugarCoffee = new SugarDecorator(new SimpleCoffee());
        System.out.println(sugarCoffee.makeCoffee());
    }
}
