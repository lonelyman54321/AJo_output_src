/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class zzfxl
implements Iterator {
    private Object zza;
    private int zzb = 2;

    public final boolean hasNext() {
        Object object;
        int n3 = this.zzb;
        boolean bl2 = true;
        int n4 = 4;
        if (n3 != n4) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        zzfyg.zzj(n3 != 0);
        n3 = this.zzb;
        int n7 = n3 + -1;
        if (n3 != 0) {
            if (n7 != 0) {
                n3 = 2;
                if (n7 != n3) {
                    this.zzb = n4;
                    this.zza = object = this.zza();
                    n3 = this.zzb;
                    n4 = 3;
                    if (n3 != n4) {
                        this.zzb = bl2;
                        return bl2;
                    }
                }
                return false;
            }
            return bl2;
        }
        throw null;
    }

    public final Object next() {
        boolean bl2 = this.hasNext();
        if (bl2) {
            this.zzb = 2;
            Object object = this.zza;
            this.zza = null;
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public abstract Object zza();

    public final Object zzb() {
        this.zzb = 3;
        return null;
    }
}

