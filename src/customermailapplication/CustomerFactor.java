package customermailapplication;

public class CustomerFactor {
    public static Customer createCustomer(String type){
        if (type == "Regular")
                return new RegularCustomer();
        if (type == "Mountain")
                return new MountainCustomer();
        if (type == "Delinquent")
                return new DelinquentCustomer(); 
        else return null;
        }
    }

