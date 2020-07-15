package br.com.bootcamp.statics;

public class Products {
    static private String name1 = "";
    static private String name2 = "";
    static private float price1 = 0;
    static private float price2 = 0;
    static private float priceTotal = 0;

    public Products(){}
    public Products(String name, float price){
        this.name1 = name;
        this.price1 = price;
        this.name2 = "";
        this.price2 = 0;
        this.priceTotal = price;
    }
    public static void addSecondProduct(String name, float price){
        if(name2.equals("")){
            name2 = name;
            price2 = price;
            priceTotal += price;
        }
    }

    public static String getName1() {
        return name1;
    }

    public static String getName2() {
        return name2;
    }

    public static float getPrice1() { return price1; }

    public static float getPrice2() { return price2; }

    public static float getSubTotal() {
        return priceTotal;
    }
}
