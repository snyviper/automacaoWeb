package br.com.bootcamp.statics;

public class OrderData {
    static private String country = "";
    static private String city = "";
    static private String address = "";
    static private String zipCode = "";
    static private String phoneNumber = "";
    static private String paymentMethod = "";
    static private String shippingMethod = "";
    static private boolean pickUpInStore = false;

    public OrderData(){}
    public OrderData(String country, String city, String address, String zipCode, String phoneNumber){
        this.country = country;
        this.city = city;
        this.address = address;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.paymentMethod = "";
        this.shippingMethod = "";
        this.pickUpInStore = false;
    }

    public static void setPickUpInStore(boolean pickUpInStore) { OrderData.pickUpInStore = pickUpInStore; }

    public static void setPaymentMethod(String method) { paymentMethod = method; }

    public static void setShippingMethod(String method) { shippingMethod = method; }

    public static String getCountry() { return country; }

    public static String getCity() { return city; }

    public static String getAddress() { return address; }

    public static String getZipCode() { return zipCode; }

    public static String getPhoneNumber() { return phoneNumber; }

    public static boolean isPickUpInStore() { return pickUpInStore; }

    public static String getPaymentMethod() { return paymentMethod; }

    public static String getShippingMethod() { return shippingMethod; }
}
