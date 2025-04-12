/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.initialization;

public final class AdapterStatus$State
extends Enum {
    public static final /* enum */ AdapterStatus$State NOT_READY;
    public static final /* enum */ AdapterStatus$State READY;
    private static final /* synthetic */ AdapterStatus$State[] zza;

    static {
        AdapterStatus$State adapterStatus$State;
        AdapterStatus$State adapterStatus$State2;
        NOT_READY = adapterStatus$State2 = new AdapterStatus$State("NOT_READY", 0);
        int n3 = 1;
        READY = adapterStatus$State = new AdapterStatus$State("READY", n3);
        AdapterStatus$State[] adapterStatus$StateArray = new AdapterStatus$State[2];
        adapterStatus$StateArray[0] = adapterStatus$State2;
        adapterStatus$StateArray[n3] = adapterStatus$State;
        zza = adapterStatus$StateArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AdapterStatus$State() {
        void var2_-1;
        void var1_-1;
    }

    public static AdapterStatus$State valueOf(String string2) {
        return Enum.valueOf(AdapterStatus$State.class, string2);
    }

    public static AdapterStatus$State[] values() {
        return (AdapterStatus$State[])zza.clone();
    }
}

