package br.com.bootcamp.statics;

public abstract class Products {
    private static String name1 = "";
    private static String name2 = "";
    private static float price1 = 0;
    private static float price2 = 0;
    private static float priceSubTotal = 0;


    public static void addFirstProduct(String name, float price){
        name1 = name;
        price1 = price;
        name2 = "";
        price2 = 0;
        priceSubTotal = price;
    }
    public static void addSecondProduct(String name, float price){
        if(name2.equals("")){
            name2 = name;
            price2 = price;
            priceSubTotal += price;
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
        return priceSubTotal;
    }
}
