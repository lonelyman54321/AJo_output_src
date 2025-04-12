/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfw$zzd$zza;
import com.google.android.gms.internal.measurement.zzfw$zzf$zza;

final class zzw {
    static final /* synthetic */ int[] zza;
    static final /* synthetic */ int[] zzb;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        int n3;
        Enum enum_;
        int n4;
        Object object2;
        int n7;
        Object object3;
        int n8;
        Object object4;
        int n10 = zzfw$zzd$zza.values().length;
        int[] nArray = new int[n10];
        zzb = nArray;
        int n14 = 1;
        try {
            object4 = zzfw$zzd$zza.zzb;
            n8 = ((Enum)object4).ordinal();
            nArray[n8] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n10 = 2;
        try {
            object4 = zzb;
            object3 = zzfw$zzd$zza.zzc;
            n7 = ((Enum)object3).ordinal();
            object4[n7] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 3;
        try {
            object3 = zzb;
            object2 = zzfw$zzd$zza.zzd;
            n4 = ((Enum)object2).ordinal();
            object3[n4] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = 4;
        try {
            object2 = zzb;
            enum_ = zzfw$zzd$zza.zze;
            n3 = enum_.ordinal();
            object2[n3] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = zzfw$zzf$zza.values().length;
        object2 = new int[n4];
        zza = (int[])object2;
        try {
            enum_ = zzfw$zzf$zza.zzb;
            n3 = enum_.ordinal();
            object2[n3] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object = zza;
            object2 = zzfw$zzf$zza.zzc;
            n4 = ((Enum)object2).ordinal();
            object[n4] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            object = zzfw$zzf$zza.zzd;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            object = zzfw$zzf$zza.zze;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            object = zzfw$zzf$zza.zzf;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n8 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            object = zzfw$zzf$zza.zzg;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n8 = 6;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

