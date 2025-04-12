/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzlz;
import java.util.ListIterator;

final class zzly
implements ListIterator {
    private ListIterator zza;
    private final /* synthetic */ int zzb;
    private final /* synthetic */ zzlz zzc;

    public zzly(zzlz object, int n3) {
        this.zzc = object;
        this.zzb = n3;
        this.zza = object = zzlz.zza((zzlz)object).listIterator(n3);
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

    public final /* synthetic */ Object next() {
        return (String)this.zza.next();
    }

    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return (String)this.zza.previous();
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

