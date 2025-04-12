/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzgxn;

final class zzgot {
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
        int n7 = zzgwg.values().length;
        int[] nArray = new int[n7];
        zzb = nArray;
        int n8 = 1;
        try {
            object2 = zzgwg.zzb;
            n4 = ((Enum)object2).ordinal();
            nArray[n4] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = 2;
        try {
            object2 = zzb;
            enum_ = zzgwg.zzc;
            n3 = enum_.ordinal();
            object2[n3] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = zzgxn.values().length;
        object2 = new int[n4];
        zza = (int[])object2;
        try {
            enum_ = zzgxn.zzb;
            n3 = enum_.ordinal();
            object2[n3] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object = zza;
            object2 = zzgxn.zzc;
            n4 = ((Enum)object2).ordinal();
            object[n4] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            object = zzgxn.zzd;
            n8 = ((Enum)object).ordinal();
            nArray[n8] = n4 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            object = zzgxn.zze;
            n8 = ((Enum)object).ordinal();
            nArray[n8] = n4 = 4;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

