/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzcw;
import com.google.android.gms.internal.consent_sdk.zzdk;
import java.util.NoSuchElementException;

abstract class zzcy
extends zzdk {
    private final int zza;
    private int zzb;

    public zzcy(int n3, int n4) {
        zzcw.zzb(n4, n3, "index");
        this.zza = n3;
        this.zzb = n4;
    }

    public final boolean hasNext() {
        int n3 = this.zzb;
        int n4 = this.zza;
        return n3 < n4;
    }

    public final boolean hasPrevious() {
        int n3 = this.zzb;
        return n3 > 0;
    }

    public final Object next() {
        int n3 = this.hasNext();
        if (n3 != 0) {
            int n4;
            n3 = this.zzb;
            this.zzb = n4 = n3 + 1;
            return this.zza(n3);
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final int nextIndex() {
        return this.zzb;
    }

    public final Object previous() {
        int n3 = this.hasPrevious();
        if (n3 != 0) {
            this.zzb = n3 = this.zzb + -1;
            return this.zza(n3);
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final int previousIndex() {
        return this.zzb + -1;
    }

    public abstract Object zza(int var1);
}

