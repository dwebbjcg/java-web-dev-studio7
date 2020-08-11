package org.launchcode.studio7;

import org.launchcode.studio7.Interfaces.OpticalDisc;

public class CD extends BaseDisc implements OpticalDisc {
    private static final Integer minSpinSpeed = 200;
    private static final Integer maxSpinSpeed = 500;

    public CD(String name, double capacity, String discType, boolean isBranded) {
        super(name, capacity, discType, isBranded);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

        @Override
        public void spinDisc() {
            System.out.println("A CD spins at a rate of " + minSpinSpeed + " - " + maxSpinSpeed + " rpm.");
            for(Data content : this.getContents()){
                System.out.println(content.getType() + "===>" + content.getSize());
            }
            System.out.println("\n" + this.getName() + " \n" + "Max Capacity ==> " + this.getCapacity());

            System.out.println("\nCompleted");
        }

        @Override
        public void storeData(Data data) {
            if(getDiscType().equals("RW") && isSpaceRemaining(data.getSize())){
                addToContent(data);
            }
        }

        @Override
        public void wipeDisc() {
        }
}
