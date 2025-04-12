/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyh;
import com.google.android.gms.internal.ads.zzfzd;
import java.util.Iterator;

final class zzgbj
extends zzfzd {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfyh zzb;

    public zzgbj(Iterator iterator, zzfyh zzfyh2) {
        this.zza = iterator;
        this.zzb = zzfyh2;
    }

    public final Object zza() {
        Iterator iterator;
        boolean bl2;
        while (bl2 = (iterator = this.zza).hasNext()) {
            iterator = this.zza;
            zzfyh zzfyh2 = this.zzb;
            boolean bl3 = zzfyh2.zza(iterator = iterator.next());
            if (!bl3) continue;
            return iterator;
        }
        this.zzb();
        return null;
    }
}

