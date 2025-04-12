/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import com.google.android.gms.internal.ads.zzcaa;

public final class zzbzw
implements Runnable {
    public final /* synthetic */ zzcaa zza;
    public final /* synthetic */ Bitmap zzb;

    public /* synthetic */ zzbzw(zzcaa zzcaa2, Bitmap bitmap) {
        this.zza = zzcaa2;
        this.zzb = bitmap;
    }

    public final void run() {
        zzcaa zzcaa2 = this.zza;
        Bitmap bitmap = this.zzb;
        zzcaa2.zzf(bitmap);
    }
}

