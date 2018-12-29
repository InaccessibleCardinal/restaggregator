package me.ken;

public class Company {
    private static String name;
    private static String catchPhrase;
    private static String bs;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Company.name = name;
    }

    public static String getCatchPhrase() {
        return catchPhrase;
    }

    public static void setCatchPhrase(String catchPhrase) {
        Company.catchPhrase = catchPhrase;
    }

    public static String getBs() {
        return bs;
    }

    public static void setBs(String bs) {
        Company.bs = bs;
    }

}
/*
*
* "company": {
      "name": "Romaguera-Crona",
      "catchPhrase": "Multi-layered client-server neural-net",
      "bs": "harness real-time e-markets"
    }*/