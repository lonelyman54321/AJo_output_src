/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

final class zzgdr {
    static final /* synthetic */ int[] zza;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        RoundingMode roundingMode;
        int n7 = RoundingMode.values().length;
        int[] nArray = new int[n7];
        zza = nArray;
        try {
            roundingMode = RoundingMode.UNNECESSARY;
            n4 = roundingMode.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            roundingMode = RoundingMode.DOWN;
            n4 = roundingMode.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            roundingMode = RoundingMode.FLOOR;
            n4 = roundingMode.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            roundingMode = RoundingMode.UP;
            n4 = roundingMode.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            roundingMode = RoundingMode.CEILING;
            n4 = roundingMode.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            roundingMode = RoundingMode.HALF_DOWN;
            n4 = roundingMode.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            roundingMode = RoundingMode.HALF_UP;
            n4 = roundingMode.ordinal();
            nArray[n4] = n3 = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            roundingMode = RoundingMode.HALF_EVEN;
            n4 = roundingMode.ordinal();
            nArray[n4] = n3 = 8;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

