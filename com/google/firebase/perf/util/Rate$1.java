/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;

class Rate$1 {
    static final /* synthetic */ int[] $SwitchMap$java$util$concurrent$TimeUnit;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        TimeUnit timeUnit;
        int n7 = TimeUnit.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$java$util$concurrent$TimeUnit = nArray;
        try {
            timeUnit = TimeUnit.NANOSECONDS;
            n4 = timeUnit.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$java$util$concurrent$TimeUnit;
            timeUnit = TimeUnit.MICROSECONDS;
            n4 = timeUnit.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$java$util$concurrent$TimeUnit;
            timeUnit = TimeUnit.MILLISECONDS;
            n4 = timeUnit.ordinal();
            nArray[n4] = n3 = 3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

