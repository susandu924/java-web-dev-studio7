package org.launchcode.studio7;

import java.util.HashMap;

public abstract class BaseDisc {

    private String discData;
    private HashMap<String, String> discInfo;


    private final int storageCapacityInMB;
    private final int spinSpeedInRPM;

    public BaseDisc(int storageCapacity, int spinSpeed){
       this.discData="";
       this.discInfo = new HashMap<String, String>();


       this.storageCapacityInMB = storageCapacity;
       this.spinSpeedInRPM = spinSpeed;

       this.discInfo.put("Storage Capacity: ", String.valueOf(storageCapacity) );
       this.discInfo.put("Spin Speed", String.valueOf(spinSpeed) );

    }

    public BaseDisc(int storageCapacity, int spinSpeed, String title){
        this(storageCapacity, spinSpeed);this.discInfo.put("Title", title);
    }

    protected void writeData(String data){
//        only children can use this(protected)
        this.discData += data;
//        any data that comes in here will be appended to our class variable

    }



    public int getStorageCapacity(){
        return this.storageCapacityInMB;
    }

    public int getSpinSpeed(){
        return this.spinSpeedInRPM;
    }

    public String readData(){
       return this.discData;
    }

    public HashMap<String, String> getInfo(){
        return this.discInfo;
    }


}

