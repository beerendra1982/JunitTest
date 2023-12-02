package com.beeru.junit;

public final class ArithmeticOperation {
    public static float Addition(Float... flt){
        float  retVal = 0;
            if (flt != null && flt.length > 0) {
                for (Float ft : flt) {
                    if (ft != null) {
                        retVal=retVal+ ft;
                    }
                }
            }
            return retVal;
    }
}
