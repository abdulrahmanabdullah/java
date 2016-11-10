package com.abdulrahman.abdullah.model;

import java.io.IOException;
import java.util.Formatter;

/**
 * Created by abdulrahman on 11/2/16.
 */
public class WriteFile {

    public static String locationDir ;

    public WriteFile(String loc){
        locationDir = loc;
    }

    public String getLocationDir() {
        return locationDir;
    }

    public void setLocationDir(String locationDir) {
       locationDir = locationDir;
    }



  public static void mWriteFile(String nameFile) throws IOException{

        Formatter w = new Formatter(locationDir+ nameFile);
        //System.out.println("Done");

    }

}
