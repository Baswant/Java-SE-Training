package com.se.training.InterfacesAndInheritance;

/**
 * Created by baswantdasari on 5/23/17.
 */
public class CITITransfer extends BankTransfer {

    public void transfer( int amount, String srcAccount, String destAccount){
        System.out.println("This a CITI logic");
        if( amount < 0) {
            status = false;
        }
        else{
            status = true;
            System.out.println(amount + " is been transfered to " + destAccount);
        }

    }
}
