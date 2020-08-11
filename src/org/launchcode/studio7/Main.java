package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    CD greatAlbum = new CD("RocketMan",9.0,"RW", true);

    DVD greatMovie = new DVD("Ad Astra", 15.7, "RW", false);

        greatMovie.storeData(new Data(2.2, "First Act"));
        greatAlbum.storeData(new Data(3.1, "Bonus Track"));
        greatMovie.storeData(new Data(7.2, "Second Act"));

        greatMovie.spinDisc();
        greatAlbum.spinDisc();
    }
}