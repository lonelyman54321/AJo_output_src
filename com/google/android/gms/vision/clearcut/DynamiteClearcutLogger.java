/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.vision.clearcut;

import android.content.Context;
import com.google.android.gms.internal.vision.zze;
import com.google.android.gms.internal.vision.zzf;
import com.google.android.gms.internal.vision.zzfi$zzo;
import com.google.android.gms.internal.vision.zzi;
import com.google.android.gms.vision.L;
import com.google.android.gms.vision.clearcut.VisionClearcutLogger;
import com.google.android.gms.vision.clearcut.zza;
import com.google.android.gms.vision.clearcut.zzb;
import java.util.concurrent.ExecutorService;

public class DynamiteClearcutLogger {
    private static final ExecutorService zza;
    private zzb zzb;
    private VisionClearcutLogger zzc;

    static {
        zzf zzf2 = zze.zza();
        int n3 = zzi.zza;
        zza = zzf2.zza(2, n3);
    }

    public DynamiteClearcutLogger(Context context) {
        Object object = new zzb(0.03333333333333333);
        this.zzb = object;
        this.zzc = object = new VisionClearcutLogger(context);
    }

    public static /* synthetic */ VisionClearcutLogger zza(DynamiteClearcutLogger dynamiteClearcutLogger) {
        return dynamiteClearcutLogger.zzc;
    }

    public final void zza(int n3, zzfi.zzo zzo2) {
        Object object;
        int n4 = 3;
        if (n3 == n4 && (n4 = (int)(((zzb)(object = this.zzb)).zza() ? 1 : 0)) == 0) {
            Object[] objectArray = new Object[]{};
            L.v("Skipping image analysis log due to rate limiting", objectArray);
            return;
        }
        object = zza;
        zza zza2 = new zza(this, n3, zzo2);
        object.execute(zza2);
    }
}

