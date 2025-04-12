/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzfxs;
import com.google.android.gms.internal.ads.zzgdm;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.nio.charset.Charset;

public final class zzebn
implements zzgfa {
    public final /* synthetic */ zzbxu zza;

    public /* synthetic */ zzebn(zzbxu zzbxu2) {
        this.zza = zzbxu2;
    }

    public final ListenableFuture zza(Object object) {
        object = (InputStream)object;
        object = zzgdm.zzb((InputStream)object);
        Charset charset = zzfxs.zzc;
        String string2 = new String((byte[])object, charset);
        object = this.zza;
        ((zzbxu)object).zzj = string2;
        return zzgft.zzh(object);
    }
}

