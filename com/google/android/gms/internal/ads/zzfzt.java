/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzr;
import com.google.android.gms.internal.ads.zzfzs;
import com.google.android.gms.internal.ads.zzfzu;
import com.google.android.gms.internal.ads.zzfzv;
import java.util.List;
import java.util.ListIterator;

final class zzfzt
extends zzfzr
implements ListIterator {
    final /* synthetic */ zzfzu zzd;

    public zzfzt(zzfzu zzfzu2) {
        this.zzd = zzfzu2;
        super(zzfzu2);
    }

    public zzfzt(zzfzu zzfzu2, int n3) {
        this.zzd = zzfzu2;
        ListIterator listIterator = ((List)zzfzu2.zzb).listIterator(n3);
        super(zzfzu2, listIterator);
    }

    public final void add(Object object) {
        zzfzu zzfzu2 = this.zzd;
        boolean bl2 = zzfzu2.isEmpty();
        this.zza();
        ListIterator listIterator = (ListIterator)this.zza;
        listIterator.add(object);
        object = this.zzd.zzf;
        int n3 = zzfzv.zzd((zzfzv)object) + 1;
        zzfzv.zzn((zzfzv)object, n3);
        if (bl2) {
            object = this.zzd;
            ((zzfzs)object).zza();
        }
    }

    public final boolean hasPrevious() {
        this.zza();
        return ((ListIterator)this.zza).hasPrevious();
    }

    public final int nextIndex() {
        this.zza();
        return ((ListIterator)this.zza).nextIndex();
    }

    public final Object previous() {
        this.zza();
        return ((ListIterator)this.zza).previous();
    }

    public final int previousIndex() {
        this.zza();
        return ((ListIterator)this.zza).previousIndex();
    }

    public final void set(Object object) {
        this.zza();
        ((ListIterator)this.zza).set(object);
    }
}

