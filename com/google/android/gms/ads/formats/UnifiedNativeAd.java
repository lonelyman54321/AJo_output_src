/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.ads.formats;

import android.os.Bundle;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd$Image;
import java.util.List;

public abstract class UnifiedNativeAd {
    public abstract void performClick(Bundle var1);

    public abstract boolean recordImpression(Bundle var1);

    public abstract void reportTouchEvent(Bundle var1);

    public abstract VideoController zza();

    public abstract NativeAd$Image zzb();

    public abstract Double zzc();

    public abstract Object zzd();

    public abstract String zze();

    public abstract String zzf();

    public abstract String zzg();

    public abstract String zzh();

    public abstract String zzi();

    public abstract String zzj();

    public abstract List zzk();
}

