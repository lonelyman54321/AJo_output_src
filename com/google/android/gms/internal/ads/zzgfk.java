/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgfl;
import com.google.android.gms.internal.ads.zzgfu;
import com.google.common.util.concurrent.ListenableFuture;

public class zzgfk
extends zzgfu {
    public static zzgfk zzu(ListenableFuture listenableFuture) {
        boolean bl2 = listenableFuture instanceof zzgfk;
        if (bl2) {
            listenableFuture = (zzgfk)listenableFuture;
        } else {
            zzgfl zzgfl2 = new zzgfl(listenableFuture);
            listenableFuture = zzgfl2;
        }
        return listenableFuture;
    }
}

