/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaf;
import com.google.android.gms.internal.measurement.zzas;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzae
implements Iterator {
    private final /* synthetic */ Iterator zza;
    private final /* synthetic */ Iterator zzb;

    public zzae(zzaf zzaf2, Iterator iterator, Iterator iterator2) {
        this.zza = iterator;
        this.zzb = iterator2;
    }

    public final boolean hasNext() {
        Iterator iterator = this.zza;
        boolean bl2 = iterator.hasNext();
        if (bl2) {
            return true;
        }
        return this.zzb.hasNext();
    }

    public final /* synthetic */ Object next() {
        Object object = this.zza;
        boolean bl2 = object.hasNext();
        if (bl2) {
            String string2 = ((Integer)this.zza.next()).toString();
            object = new zzas(string2);
            return object;
        }
        object = this.zzb;
        bl2 = object.hasNext();
        if (bl2) {
            String string3 = (String)this.zzb.next();
            object = new zzas(string3);
            return object;
        }
        object = new NoSuchElementException();
        throw object;
    }
}

