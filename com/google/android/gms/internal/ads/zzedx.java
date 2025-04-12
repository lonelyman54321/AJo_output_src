/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeea;
import com.google.android.gms.internal.ads.zzfip;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;

public final class zzedx
implements zzgfa {
    public final /* synthetic */ zzeea zza;

    public /* synthetic */ zzedx(zzeea zzeea2) {
        this.zza = zzeea2;
    }

    public final ListenableFuture zza(Object object) {
        return zzgft.zzh(zzfip.zza((InputStream)object));
    }
}

