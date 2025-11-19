//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Pizza basePizza = new Pizza(true);
//        basePizza.addExtraCheese();
//        basePizza.addExtraToppings();
//        basePizza.getBill();


        DeluxPizza dp = new DeluxPizza(false);
        dp.addExtraCheese();
        dp.addExtraCheese();
        dp.takeAway();
        dp.getBill();
    }
}