/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitcompat;

import com.google.android.play.core.splitcompat.SplitCompat;
import java.util.Set;

final class zzr
implements Runnable {
    final /* synthetic */ Set zza;
    final /* synthetic */ SplitCompat zzb;

    public zzr(SplitCompat splitCompat, Set set) {
        this.zzb = splitCompat;
        this.zza = set;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void run() {
        SplitCompat splitCompat;
        try {
            splitCompat = this.zzb;
        }
        catch (Exception exception) {
            return;
        }
        Set set = this.zza;
        SplitCompat.zzc(splitCompat, set);
    }
}

