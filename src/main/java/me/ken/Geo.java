package me.ken;

public class Geo {
    private static String lat;
    private static String lng;

    public static void setLat(String l) {
        lat = l;
    }

    public static void setLng(String l) {
        lng = l;
    }

    public static String getLat() {
        return lat;
    }

    public static String getLng() {
        return lng;
    }
}
