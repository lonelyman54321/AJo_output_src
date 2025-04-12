/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.vision;

import com.google.android.gms.vision.MultiProcessor;
import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.zze;

final class MultiProcessor$zza {
    private Tracker zza;
    private int zzb = 0;

    private MultiProcessor$zza(MultiProcessor multiProcessor) {
    }

    public /* synthetic */ MultiProcessor$zza(MultiProcessor multiProcessor, zze zze2) {
        this(multiProcessor);
    }

    public static /* synthetic */ int zza(MultiProcessor$zza multiProcessor$zza, int n3) {
        multiProcessor$zza.zzb = 0;
        return 0;
    }

    public static /* synthetic */ Tracker zza(MultiProcessor$zza multiProcessor$zza) {
        return multiProcessor$zza.zza;
    }

    public static /* synthetic */ Tracker zza(MultiProcessor$zza multiProcessor$zza, Tracker tracker) {
        multiProcessor$zza.zza = tracker;
        return tracker;
    }

    public static /* synthetic */ int zzb(MultiProcessor$zza multiProcessor$zza) {
        int n3;
        int n4 = multiProcessor$zza.zzb;
        multiProcessor$zza.zzb = n3 = n4 + 1;
        return n4;
    }

    public static /* synthetic */ int zzc(MultiProcessor$zza multiProcessor$zza) {
        return multiProcessor$zza.zzb;
    }
}

