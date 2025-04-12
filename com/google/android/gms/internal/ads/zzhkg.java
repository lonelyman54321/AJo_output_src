/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhkf;
import com.google.android.gms.internal.ads.zzhkh;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class zzhkg
extends AbstractList {
    private static final zzhkh zzc = zzhkh.zzb(zzhkg.class);
    final List zza;
    final Iterator zzb;

    public zzhkg(List list, Iterator iterator) {
        this.zza = list;
        this.zzb = iterator;
    }

    public final Object get(int n3) {
        Object object = this.zza;
        int n4 = object.size();
        if (n4 > n3) {
            return this.zza.get(n3);
        }
        object = this.zzb;
        n4 = (int)(object.hasNext() ? 1 : 0);
        if (n4 != 0) {
            object = this.zza;
            Object e2 = this.zzb.next();
            object.add(e2);
            return this.get(n3);
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final Iterator iterator() {
        zzhkf zzhkf2 = new zzhkf(this);
        return zzhkf2;
    }

    public final int size() {
        boolean bl2;
        Object object = zzc;
        ((zzhkh)object).zza("potentially expensive size() call");
        String string2 = "blowup running";
        ((zzhkh)object).zza(string2);
        while (bl2 = (object = this.zzb).hasNext()) {
            object = this.zza;
            string2 = this.zzb.next();
            object.add(string2);
        }
        return this.zza.size();
    }
}

