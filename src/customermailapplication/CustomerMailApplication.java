/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    static private Customer customer ;
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        
        
        switch(type) {
            case 1:
                customer = CustomerFactor.createCustomer("Regular");
                break;
            case 2:
                customer = CustomerFactor.createCustomer("Mountain");
                break;
            case 3:
                customer = CustomerFactor.createCustomer("Delinquent");
                break;

        }
        System.out.println(customer.createMail());

    }
}
