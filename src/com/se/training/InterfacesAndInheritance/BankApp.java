package com.se.training.InterfacesAndInheritance;


/**
 * Created by baswantdasari on 5/23/17.
 */
public class BankApp {

        public static void main(String[] args) {
            BankTransfer bankTransfer = null;
            if(args[0].equals("BOA")){
                bankTransfer = new BOATransfer();
            }

            if(args[0].equals("CITI")){
                bankTransfer = new BOATransfer();
            }

            if(args[0].equals("Wells Fargo")){
                bankTransfer = new BOATransfer();
            }

            bankTransfer.transfer(Integer.parseInt(args[1]), args[2], args[3]);
            bankTransfer.printstatus();


        }
    }

