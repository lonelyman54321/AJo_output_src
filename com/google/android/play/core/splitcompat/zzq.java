/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitcompat;

import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitcompat.zze;

final class zzq
implements Runnable {
    final /* synthetic */ SplitCompat zza;

    public zzq(SplitCompat splitCompat) {
        this.zza = splitCompat;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void run() {
        Object object;
        try {
            object = this.zza;
        }
        catch (Exception exception) {
            return;
        }
        object = SplitCompat.zza((SplitCompat)object);
        ((zze)object).zzk();
    }
}

