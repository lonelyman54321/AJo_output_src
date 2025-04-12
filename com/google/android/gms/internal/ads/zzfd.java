/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfe;
import com.google.android.gms.internal.ads.zzfg;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class zzfd
implements Runnable {
    public final /* synthetic */ CopyOnWriteArraySet zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzfe zzc;

    public /* synthetic */ zzfd(CopyOnWriteArraySet copyOnWriteArraySet, int n3, zzfe zzfe2) {
        this.zza = copyOnWriteArraySet;
        this.zzb = n3;
        this.zzc = zzfe2;
    }

    public final void run() {
        boolean bl2;
        Iterator iterator = this.zza.iterator();
        while (bl2 = iterator.hasNext()) {
            zzfe zzfe2 = this.zzc;
            int n3 = this.zzb;
            zzfg zzfg2 = (zzfg)iterator.next();
            zzfg2.zza(n3, zzfe2);
        }
    }
}

