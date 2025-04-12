/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri$Builder
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzcpz
implements zzgfa {
    public final /* synthetic */ Uri.Builder zza;

    public /* synthetic */ zzcpz(Uri.Builder builder) {
        this.zza = builder;
    }

    public final ListenableFuture zza(Object object) {
        object = zzbep.zzkj;
        object = (String)zzba.zzc().zza((zzbeg)object);
        Uri.Builder builder = this.zza;
        builder.appendQueryParameter((String)object, "12");
        return zzgft.zzh(builder.toString());
    }
}

