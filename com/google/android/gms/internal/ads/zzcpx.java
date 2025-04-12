/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri$Builder
 *  android.view.InputEvent
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.InputEvent;
import com.google.android.gms.internal.ads.zzcqd;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzcpx
implements zzgfa {
    public final /* synthetic */ zzcqd zza;
    public final /* synthetic */ Uri.Builder zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ InputEvent zzd;

    public /* synthetic */ zzcpx(zzcqd zzcqd2, Uri.Builder builder, String string2, InputEvent inputEvent) {
        this.zza = zzcqd2;
        this.zzb = builder;
        this.zzc = string2;
        this.zzd = inputEvent;
    }

    public final ListenableFuture zza(Object object) {
        zzcqd zzcqd2 = this.zza;
        Uri.Builder builder = this.zzb;
        String string2 = this.zzc;
        InputEvent inputEvent = this.zzd;
        object = (Integer)object;
        return zzcqd2.zzd(builder, string2, inputEvent, (Integer)object);
    }
}

