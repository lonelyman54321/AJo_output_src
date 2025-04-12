/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import java.math.RoundingMode;

class BigIntegerMath$1 {
    static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

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
        $SwitchMap$java$math$RoundingMode = nArray;
        try {
            roundingMode = RoundingMode.UNNECESSARY;
            n4 = roundingMode.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$java$math$RoundingMode;
            roundingMode = RoundingMode.DOWN;
            n4 = roundingMode.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$java$math$RoundingMode;
            roundingMode = RoundingMode.FLOOR;
            n4 = roundingMode.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$java$math$RoundingMode;
            roundingMode = RoundingMode.UP;
            n4 = roundingMode.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$java$math$RoundingMode;
            roundingMode = RoundingMode.CEILING;
            n4 = roundingMode.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$java$math$RoundingMode;
            roundingMode = RoundingMode.HALF_DOWN;
            n4 = roundingMode.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$java$math$RoundingMode;
            roundingMode = RoundingMode.HALF_UP;
            n4 = roundingMode.ordinal();
            nArray[n4] = n3 = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$java$math$RoundingMode;
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

