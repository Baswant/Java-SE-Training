package com.se.training.InterfacesAndInheritance;

/**
 * Created by baswantdasari on 5/23/17.
 */
public abstract class BankTransfer {

    protected boolean status ;

    public abstract void transfer( int amount, String srcAccount, String destAccount);

    public void printstatus(){

        if (status){
            System.out.println(" Funds transfered successfully");
        }
        else{
            System.out.println(" Funds transfered failed");
        }
    }
}
