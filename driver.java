package java10aug;


import java.util.*;
class Address{
    private String street ;
    private String city;
    private int pincode;
    private String country;
    Address(String street,String city,int pincode,String country){
        this.street = street;
        this.city = city;
        this.pincode = pincode;
        this.country = country;
    }
    public void displayDetail(){
        System.out.println("Street:"+this.street);
        System.out.println("City:"+this.city);
        System.out.println("Pincode:"+this.pincode);
        System.out.println("Country:"+this.country);
    }
}
class Customer{
    private String customerName;
    private String customerEmail;
    private String customerType;
    private Address address;
    Customer(String customerName,String customerEmail,String customerType,Address address){
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerType = customerType;
        this.address = address;
    }
    public void displayDetail(){
        System.out.println("Name:"+this.customerName);
        System.out.println("E-Mail:"+this.customerEmail);
        System.out.println("Type:"+this.customerType);
        this.address.displayDetail();
    }
}

class driver{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the customer details");
        System.out.println("Enter the name");
        String name = input.next();
        System.out.println("Enter the email");
        String email = input.next();
        System.out.println("Enter the type");
        String type = input.next();
        System.out.println("Enter the customer address");
        System.out.println("Enter the street");
        String street = input.next();
        System.out.println("Enter the city");
        String city = input.next();
        System.out.println("Enter the pincode");
        int pincode = input.nextInt();
        System.out.println("Enter the country");
        String country = input.next();
        Address address = new Address(street,city,pincode,country);
        Customer customer = new Customer(name,email,type,address);
        customer.displayDetail();
    }
}