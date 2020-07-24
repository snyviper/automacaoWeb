package br.com.bootcamp.statics;

public abstract class OrderData {
    static private String country = "";
    static private String city = "";
    static private String address = "";
    static private String zipCode = "";
    static private String phoneNumber = "";
    static private String paymentMethod = "";
    static private String shippingMethod = "";
    static private boolean pickUpInStore = false;

    public static void setFullContact(String Country, String City, String Address, String ZipCode, String PhoneNumber){
        country = Country;
        city = City;
        address = Address;
        zipCode = ZipCode;
        phoneNumber = PhoneNumber;
        paymentMethod = "";
        shippingMethod = "";
        pickUpInStore = false;
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
