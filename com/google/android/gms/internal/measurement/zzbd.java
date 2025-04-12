/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzbv;

final class zzbd {
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
            zzbv2 = zzbv.zzv;
            n4 = zzbv2.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            zzbv2 = zzbv.zzai;
            n4 = zzbv2.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            zzbv2 = zzbv.zzaj;
            n4 = zzbv2.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            zzbv2 = zzbv.zzak;
            n4 = zzbv2.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            zzbv2 = zzbv.zzal;
            n4 = zzbv2.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            zzbv2 = zzbv.zzan;
            n4 = zzbv2.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            zzbv2 = zzbv.zzao;
            n4 = zzbv2.ordinal();
            nArray[n4] = n3 = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            zzbv2 = zzbv.zzat;
            n4 = zzbv2.ordinal();
            nArray[n4] = n3 = 8;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

