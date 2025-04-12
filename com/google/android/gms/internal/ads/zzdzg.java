/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

public final class zzdzg
implements zzgfa {
    public final ListenableFuture zza(Object object) {
        return zzgft.zzg(((ExecutionException)object).getCause());
    }
}

