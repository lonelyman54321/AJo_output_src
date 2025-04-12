/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzqo;
import java.util.Iterator;

final class zzql
implements Iterator {
    final /* synthetic */ Iterator zza;

    public zzql(zzqo zzqo2, Iterator iterator) {
        this.zza = iterator;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final void remove() {
        this.zza.remove();
    }
}

