/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.util;

public final class GmsVersion {
    public static final int VERSION_HALLOUMI = 4100000;
    public static final int VERSION_JARLSBERG = 4300000;
    public static final int VERSION_KENAFA = 4400000;
    public static final int VERSION_LONGHORN = 5000000;
    public static final int VERSION_MANCHEGO = 6000000;
    public static final int VERSION_ORLA = 7000000;
    public static final int VERSION_PARMESAN = 0x6DDD00;
    public static final int VERSION_QUESO = 7500000;
    public static final int VERSION_REBLOCHON = 7800000;
    public static final int VERSION_SAGA = 8000000;

    private GmsVersion() {
    }

    public static boolean isAtLeastFenacho(int n3) {
        int n4 = 3200000;
        return n3 >= n4;
    }
}

