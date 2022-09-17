package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD cd = new CD();
        DVD dvd = new DVD( "Interview with the Vampire");

        cd.spinDisc();
        dvd.spinDisc();

        cd.writeData("More data ");
        System.out.println(cd.readData());
        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
