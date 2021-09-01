package customermailapplication;

public class CustomerFactor {
    public static Customer createCustomer(int type){
        if (type == 1)
                return new RegularCustomer();
        if (type == 2)
                return new MountainCustomer();
        if (type == 3)
                return new DelinquentCustomer(); 
        else return null;
        }
    }

