package me.ken;

public class Address {
    private static String city;
    private static String zipcode;
    private static String street;
    private static String suite;
    private static Geo geo;

    public static String getStreet() {
        return street;
    }

    public static void setStreet(String street) {
        Address.street = street;
    }

    public static String getSuite() {
        return suite;
    }

    public static void setSuite(String suite) {
        Address.suite = suite;
    }


    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Address.city = city;
    }

    public static String getZipcode() {
        return zipcode;
    }

    public static void setZipcode(String zipcode) {
        Address.zipcode = zipcode;
    }

    public static Geo getGeo() {
        return geo;
    }

    public static void setGeo(Geo geo) {
        Address.geo = geo;
    }


}
