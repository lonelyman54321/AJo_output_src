/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.v1.ApplicationProcessState;

class GaugeManager$1 {
    static final /* synthetic */ int[] $SwitchMap$com$google$firebase$perf$v1$ApplicationProcessState;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ApplicationProcessState applicationProcessState;
        int n7 = ApplicationProcessState.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$firebase$perf$v1$ApplicationProcessState = nArray;
        try {
            applicationProcessState = ApplicationProcessState.BACKGROUND;
            n4 = applicationProcessState.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$firebase$perf$v1$ApplicationProcessState;
            applicationProcessState = ApplicationProcessState.FOREGROUND;
            n4 = applicationProcessState.ordinal();
            nArray[n4] = n3 = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

