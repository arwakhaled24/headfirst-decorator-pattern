//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());

    Beverage beverage2 = new DarkRoast();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);

    System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    // Dark Roast Coffee, Mocha, Mocha, Whip $1.49
}
