/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzgc$zza$zzd;
import com.google.android.gms.internal.measurement.zzgc$zza$zze;
import com.google.android.gms.internal.measurement.zzs;

final class zzht {
    static final /* synthetic */ int[] zza;
    static final /* synthetic */ int[] zzb;
    static final /* synthetic */ int[] zzc;

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
        int n10 = zzgc$zza$zzd.values().length;
        int[] nArray = new int[n10];
        zzc = nArray;
        int n14 = 1;
        try {
            object4 = zzgc$zza$zzd.zzc;
            n8 = ((Enum)object4).ordinal();
            nArray[n8] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n10 = 2;
        try {
            object4 = zzc;
            object3 = zzgc$zza$zzd.zzb;
            n7 = ((Enum)object3).ordinal();
            object4[n7] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = zzgc$zza$zze.values().length;
        object4 = new int[n8];
        zzb = (int[])object4;
        try {
            object3 = zzgc$zza$zze.zzb;
            n7 = ((Enum)object3).ordinal();
            object4[n7] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object4 = zzb;
            object3 = zzgc$zza$zze.zzc;
            n7 = ((Enum)object3).ordinal();
            object4[n7] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 3;
        try {
            object3 = zzb;
            object2 = zzgc$zza$zze.zzd;
            n4 = ((Enum)object2).ordinal();
            object3[n4] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = 4;
        try {
            object2 = zzb;
            enum_ = zzgc$zza$zze.zze;
            n3 = enum_.ordinal();
            object2[n3] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = zzs.values().length;
        object2 = new int[n4];
        zza = (int[])object2;
        try {
            enum_ = zzs.zza;
            n3 = enum_.ordinal();
            object2[n3] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object = zza;
            object2 = zzs.zzb;
            n4 = ((Enum)object2).ordinal();
            object[n4] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            object = (Object)zzs.zze;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            object = zzs.zzd;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n7;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

