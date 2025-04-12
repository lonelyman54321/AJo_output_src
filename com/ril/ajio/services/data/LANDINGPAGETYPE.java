/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

public final class LANDINGPAGETYPE
extends Enum {
    private static final /* synthetic */ LANDINGPAGETYPE[] $VALUES;
    public static final /* enum */ LANDINGPAGETYPE BANNER;
    public static final /* enum */ LANDINGPAGETYPE INDIE;
    public static final /* enum */ LANDINGPAGETYPE WOMEN;

    private static /* synthetic */ LANDINGPAGETYPE[] $values() {
        LANDINGPAGETYPE lANDINGPAGETYPE = WOMEN;
        lANDINGPAGETYPE = INDIE;
        lANDINGPAGETYPE = BANNER;
        LANDINGPAGETYPE[] lANDINGPAGETYPEArray = new LANDINGPAGETYPE[]{lANDINGPAGETYPE, lANDINGPAGETYPE, lANDINGPAGETYPE};
        return lANDINGPAGETYPEArray;
    }

    static {
        LANDINGPAGETYPE lANDINGPAGETYPE;
        WOMEN = lANDINGPAGETYPE = new LANDINGPAGETYPE("WOMEN", 0);
        INDIE = lANDINGPAGETYPE = new LANDINGPAGETYPE("INDIE", 1);
        BANNER = lANDINGPAGETYPE = new LANDINGPAGETYPE("BANNER", 2);
        $VALUES = LANDINGPAGETYPE.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LANDINGPAGETYPE() {
        void var2_-1;
        void var1_-1;
    }

    public static LANDINGPAGETYPE valueOf(String string2) {
        return Enum.valueOf(LANDINGPAGETYPE.class, string2);
    }

    public static LANDINGPAGETYPE[] values() {
        return (LANDINGPAGETYPE[])$VALUES.clone();
    }
}

