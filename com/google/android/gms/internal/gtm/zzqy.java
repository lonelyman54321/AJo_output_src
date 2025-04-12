/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzqz;
import java.util.Iterator;

final class zzqy
implements Iterator {
    final /* synthetic */ zzqz zza;
    private int zzb = 0;

    public zzqy(zzqz zzqz2) {
        this.zza = zzqz2;
    }

    public final boolean hasNext() {
        Object object = this.zza;
        int n3 = this.zzb;
        int n4 = ((String)(object = zzqz.zzj((zzqz)object))).length();
        return n3 < n4;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

