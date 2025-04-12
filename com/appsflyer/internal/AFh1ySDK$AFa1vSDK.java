/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger$LogLevel;

public final class AFh1ySDK$AFa1vSDK {
    public static final /* synthetic */ int[] getMediationNetwork;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        AFLogger$LogLevel aFLogger$LogLevel;
        int n7 = AFLogger$LogLevel.values().length;
        int[] nArray = new int[n7];
        try {
            aFLogger$LogLevel = AFLogger$LogLevel.DEBUG;
            n4 = aFLogger$LogLevel.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aFLogger$LogLevel = AFLogger$LogLevel.INFO;
            n4 = aFLogger$LogLevel.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aFLogger$LogLevel = AFLogger$LogLevel.WARNING;
            n4 = aFLogger$LogLevel.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aFLogger$LogLevel = AFLogger$LogLevel.VERBOSE;
            n4 = aFLogger$LogLevel.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aFLogger$LogLevel = AFLogger$LogLevel.ERROR;
            n4 = aFLogger$LogLevel.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aFLogger$LogLevel = AFLogger$LogLevel.NONE;
            n4 = aFLogger$LogLevel.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        getMediationNetwork = nArray;
    }
}

