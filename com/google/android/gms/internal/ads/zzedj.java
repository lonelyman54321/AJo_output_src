/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzedq;
import com.google.android.gms.internal.ads.zzfip;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;

public final class zzedj
implements zzgfa {
    public final /* synthetic */ zzedq zza;

    public /* synthetic */ zzedj(zzedq zzedq2) {
        this.zza = zzedq2;
    }

    public final ListenableFuture zza(Object object) {
        return zzgft.zzh(zzfip.zza((InputStream)object));
    }
}

