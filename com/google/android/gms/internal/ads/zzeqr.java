/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeqs;
import com.google.android.gms.internal.ads.zzeqt;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;

public final class zzeqr
implements zzgfa {
    public final ListenableFuture zza(Object object) {
        boolean bl2 = (object = (Throwable)object) instanceof TimeoutException;
        if (bl2) {
            object = new zzeqs();
            object = zzgft.zzh(object);
        } else {
            object = new zzeqt();
            object = zzgft.zzh(object);
        }
        return object;
    }
}

