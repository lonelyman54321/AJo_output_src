/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgfy;
import com.google.android.gms.internal.ads.zzggc;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;

final class zzgfz
extends AbstractOwnableSynchronizer
implements Runnable {
    private final zzggc zza;

    public /* synthetic */ zzgfz(zzggc zzggc2, zzgfy zzgfy2) {
        this.zza = zzggc2;
    }

    public static /* synthetic */ void zza(zzgfz zzgfz2, Thread thread2) {
        zzgfz2.setExclusiveOwnerThread(thread2);
    }

    public final void run() {
    }

    public final String toString() {
        return this.zza.toString();
    }
}

