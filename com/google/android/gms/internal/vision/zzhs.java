/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzhu;
import java.util.NoSuchElementException;

final class zzhs
extends zzhu {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzht zzc;

    public zzhs(zzht zzht2) {
        int n3;
        this.zzc = zzht2;
        this.zzb = n3 = zzht2.zza();
    }

    public final boolean hasNext() {
        int n3 = this.zza;
        int n4 = this.zzb;
        return n3 < n4;
    }

    public final byte zza() {
        int n3 = this.zza;
        int n4 = this.zzb;
        if (n3 < n4) {
            this.zza = n4 = n3 + 1;
            return this.zzc.zzb(n3);
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

