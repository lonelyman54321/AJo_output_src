/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.vision.clearcut;

import com.google.android.gms.internal.vision.zzfi$zzo;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.clearcut.VisionClearcutLogger;

final class zza
implements Runnable {
    private final /* synthetic */ int zza;
    private final /* synthetic */ zzfi$zzo zzb;
    private final /* synthetic */ DynamiteClearcutLogger zzc;

    public zza(DynamiteClearcutLogger dynamiteClearcutLogger, int n3, zzfi$zzo zzfi$zzo) {
        this.zzc = dynamiteClearcutLogger;
        this.zza = n3;
        this.zzb = zzfi$zzo;
    }

    public final void run() {
        VisionClearcutLogger visionClearcutLogger = DynamiteClearcutLogger.zza(this.zzc);
        int n3 = this.zza;
        zzfi$zzo zzfi$zzo = this.zzb;
        visionClearcutLogger.zza(n3, zzfi$zzo);
    }
}

