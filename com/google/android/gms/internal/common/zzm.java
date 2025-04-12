/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class zzm
implements Iterator {
    private Object zza;
    private int zzb = 2;

    public final boolean hasNext() {
        int n3 = this.zzb;
        int n4 = 4;
        if (n3 != n4) {
            int n7 = n3 + -1;
            if (n3 != 0) {
                n3 = 1;
                if (n7 != 0) {
                    int n8 = 2;
                    if (n7 != n8) {
                        Object object;
                        this.zzb = n4;
                        this.zza = object = this.zza();
                        n4 = this.zzb;
                        n7 = 3;
                        if (n4 != n7) {
                            this.zzb = n3;
                            return n3 != 0;
                        }
                    }
                    return false;
                }
                return n3 != 0;
            }
            throw null;
        }
        IllegalStateException illegalStateException = new IllegalStateException();
        throw illegalStateException;
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

