package com.kirwa.operators.area;

/**
 * ****************************
 * Created by Kirtesh Wani on 13-02-2015.
 * for JavaBasics
 * *****************************
 */
public class Area {
    public AreaTypes getAreaType() {
        return areaType;
    }

    private final AreaTypes areaType;
    private final double[] dimensions;
    public Area(AreaTypes areaType, double... dimension) {
        this.areaType=areaType;
        dimensions=dimension;
    }

    public double[] getDimensions() {
        return dimensions;
    }
}
