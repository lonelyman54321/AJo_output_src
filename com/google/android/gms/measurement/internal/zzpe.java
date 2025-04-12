/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzjm;

final class zzpe {
    static final /* synthetic */ int[] zza;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        zzjm zzjm2;
        int n7 = zzjm.values().length;
        int[] nArray = new int[n7];
        zza = nArray;
        try {
            zzjm2 = zzjm.zzb;
            n4 = zzjm2.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            zzjm2 = zzjm.zzd;
            n4 = zzjm2.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            zzjm2 = zzjm.zzc;
            n4 = zzjm2.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            zzjm2 = zzjm.zza;
            n4 = zzjm2.ordinal();
            nArray[n4] = n3 = 4;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

