/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzbv;

final class zzbj {
    static final /* synthetic */ int[] zza;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        zzbv zzbv2;
        int n7 = zzbv.values().length;
        int[] nArray = new int[n7];
        zza = nArray;
        try {
            zzbv2 = zzbv.zzb;
            n4 = zzbv2.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            zzbv2 = zzbv.zzas;
            n4 = zzbv2.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            zzbv2 = zzbv.zzav;
            n4 = zzbv2.ordinal();
            nArray[n4] = n3 = 3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

