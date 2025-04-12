/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzyr;
import com.google.android.gms.internal.gtm.zzyx;
import java.util.NoSuchElementException;

final class zzyq
extends zzyr {
    final /* synthetic */ zzyx zza;
    private int zzb = 0;
    private final int zzc;

    public zzyq(zzyx zzyx2) {
        int n3;
        this.zza = zzyx2;
        this.zzc = n3 = zzyx2.zzd();
    }

    public final boolean hasNext() {
        int n3 = this.zzb;
        int n4 = this.zzc;
        return n3 < n4;
    }

    public final byte zza() {
        int n3 = this.zzb;
        int n4 = this.zzc;
        if (n3 < n4) {
            this.zzb = n4 = n3 + 1;
            return this.zza.zzb(n3);
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

