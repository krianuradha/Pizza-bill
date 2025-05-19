public class deluxePizza extends pizza{
    public deluxePizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraTopping(); //not giving right to user to choose already adding
    }

    @Override
    public void addExtraCheese() {
    }

    @Override
    public void addExtraTopping() {

    }
}
