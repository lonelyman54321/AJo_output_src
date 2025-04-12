/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzhd;
import java.util.ListIterator;

final class zzhb
implements ListIterator {
    final ListIterator zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzhd zzc;

    public zzhb(zzhd object, int n3) {
        this.zzc = object;
        this.zzb = n3;
        this.zza = object = zzhd.zza((zzhd)object).listIterator(n3);
    }

    public final /* synthetic */ void add(Object object) {
        object = (String)object;
        object = new UnsupportedOperationException();
        throw object;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final boolean hasPrevious() {
        return this.zza.hasPrevious();
    }

    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    public final int previousIndex() {
        return this.zza.previousIndex();
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final /* synthetic */ void set(Object object) {
        object = (String)object;
        object = new UnsupportedOperationException();
        throw object;
    }
}

