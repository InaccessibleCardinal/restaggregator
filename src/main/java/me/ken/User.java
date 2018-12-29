package me.ken;

public class User {
    private static String id;
    private static String username;
    private static String email;
    private static Address address;
    private static String phone;
    private static String website;
    private static Company company;

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        User.id = id;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        User.username = username;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        User.email = email;
    }

    public static Address getAddress() {
        return address;
    }

    public static void setAddress(Address address) {
        User.address = address;
    }

    public static String getPhone() {
        return phone;
    }

    public static void setPhone(String phone) {
        User.phone = phone;
    }

    public static String getWebsite() {
        return website;
    }

    public static void setWebsite(String website) {
        User.website = website;
    }

    public static Company getCompany() {
        return company;
    }

    public static void setCompany(Company company) {
        User.company = company;
    }
}
