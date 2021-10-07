package designpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StrategyPattern {
    public static void main(String[] args) {
        List<Stock> list = List.of(new Stock(1, "A"),
                new Stock(2, "B"),
                new Stock(3, "C"),
                new Stock(4, "A"));
        StockFactory.getStockList(list, stock -> stock.getPrice() > 2).forEach(System.out::println);
        StockFactory.getStockList(list, stock -> stock.getSymbol().equals("A")).forEach(System.out::println);
    }
}

class StockFactory {

    public static List<Stock> getStockList(List<Stock> list, Predicate<Stock> predicate) {
        List<Stock> newList = new ArrayList<>();
        for (Stock stock : list) {
            if (predicate.test(stock))
                newList.add(stock);
        }
        return newList;
    }
}

class Stock {
    int price;
    String symbol;

    public Stock(int price, String symbol) {
        this.price = price;
        this.symbol = symbol;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "price=" + price +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}
