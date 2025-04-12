/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.logger;

import com.google.firebase.logger.Logger$Level;

public final class Logger$AndroidLogger$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Logger$Level logger$Level;
        int n7 = Logger$Level.values().length;
        int[] nArray = new int[n7];
        try {
            logger$Level = Logger$Level.VERBOSE;
            n4 = logger$Level.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            logger$Level = Logger$Level.DEBUG;
            n4 = logger$Level.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            logger$Level = Logger$Level.INFO;
            n4 = logger$Level.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            logger$Level = Logger$Level.WARN;
            n4 = logger$Level.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            logger$Level = Logger$Level.ERROR;
            n4 = logger$Level.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

