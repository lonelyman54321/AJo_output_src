/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzix;
import com.google.android.gms.internal.vision.zzjm;

final class zziy {
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
        int n8 = zzjm.values().length;
        int[] nArray = new int[n8];
        zzb = nArray;
        int n10 = 1;
        try {
            object3 = zzjm.zzh;
            n7 = object3.ordinal();
            nArray[n7] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 2;
        try {
            object3 = zzb;
            object2 = zzjm.zzj;
            n4 = ((Enum)object2).ordinal();
            object3[n4] = (zzjm)n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = 3;
        try {
            object2 = zzb;
            enum_ = zzjm.zzg;
            n3 = enum_.ordinal();
            object2[n3] = (zzjm)n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = zzix.values().length;
        object2 = new int[n4];
        zza = (int[])object2;
        try {
            enum_ = zzix.zzd;
            n3 = enum_.ordinal();
            object2[n3] = (zzjm)n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object = zza;
            object2 = zzix.zzb;
            n4 = ((Enum)object2).ordinal();
            object[n4] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            object = (Object)zzix.zza;
            n10 = ((Enum)object).ordinal();
            nArray[n10] = n7;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

