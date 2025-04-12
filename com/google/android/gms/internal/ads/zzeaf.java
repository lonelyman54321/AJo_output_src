/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdzd;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;

public final class zzeaf
implements zzgfa {
    public final ListenableFuture zza(Object object) {
        object = (TimeoutException)object;
        object = new zzdzd(5);
        return zzgft.zzg((Throwable)object);
    }
}

