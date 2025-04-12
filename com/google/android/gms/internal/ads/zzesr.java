/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzesq;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfdr;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzesr
implements zzexw {
    private final zzfdr zza;

    public zzesr(zzfdr zzfdr2) {
        this.zza = zzfdr2;
    }

    public final int zza() {
        return 15;
    }

    public final ListenableFuture zzb() {
        boolean bl2;
        String string2;
        Object object = this.zza;
        zzesq zzesq2 = null;
        if (object != null && (string2 = ((zzfdr)object).zza()) != null && !(bl2 = ((String)(object = ((zzfdr)object).zza())).isEmpty())) {
            zzesq2 = new zzesq(this);
        }
        return zzgft.zzh(zzesq2);
    }

    public final /* synthetic */ void zzc(Bundle bundle) {
        String string2 = this.zza.zza();
        bundle.putString("key_schema", string2);
    }
}

