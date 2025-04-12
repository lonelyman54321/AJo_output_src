/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.ValueCallback
 */
package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import com.google.android.gms.internal.ads.zzcic;

public final class zzchw
implements Runnable {
    public final /* synthetic */ zzcic zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ ValueCallback zzc;

    public /* synthetic */ zzchw(zzcic zzcic2, String string2, ValueCallback valueCallback) {
        this.zza = zzcic2;
        this.zzb = string2;
        this.zzc = valueCallback;
    }

    public final void run() {
        zzcic zzcic2 = this.zza;
        String string2 = this.zzb;
        ValueCallback valueCallback = this.zzc;
        zzcic2.zzaU(string2, valueCallback);
    }
}

