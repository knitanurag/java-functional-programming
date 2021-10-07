package designpattern;

import java.util.function.UnaryOperator;

public class DecoratorPattern {
    public static void main(String[] args) {
        System.out.println(new BurgerShop(burger -> burger.addCheese("cheese")).use(new Burger("tikki")));
    }
}

class BurgerShop{
    UnaryOperator<Burger> decorator;

    public BurgerShop(UnaryOperator<Burger> makeBurger) {
        this.decorator = makeBurger;
    }

    public Burger use(Burger baseBurger){
       return decorator.apply(baseBurger);
    }
}

class Burger{
    private String burgerType;

    public Burger() {
        this.burgerType = "";
    }

    public Burger(String burgerType) {
        this.burgerType = burgerType;
    }

    public Burger addCheese(String  burgerType){
        return  new Burger(this.burgerType + burgerType);
    }
    public Burger addTikki(String  burgerType){
        return  new Burger(this.burgerType  + burgerType);
    }

    @Override
    public String toString() {
        return "Burger{" +
                "burgerType='" + burgerType + '\'' +
                '}';
    }
}

