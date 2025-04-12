/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

public final class zzecc
implements zzgfa {
    public final ListenableFuture zza(Object object) {
        Throwable throwable = ((Throwable)(object = (ExecutionException)object)).getCause();
        if (throwable != null) {
            object = ((Throwable)object).getCause();
        }
        return zzgft.zzg((Throwable)object);
    }
}

