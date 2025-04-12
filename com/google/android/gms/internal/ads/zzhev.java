/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhcm;
import com.google.android.gms.internal.ads.zzhet;
import com.google.android.gms.internal.ads.zzheu;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzhev
extends AbstractList
implements RandomAccess,
zzhcm {
    private final zzhcm zza;

    public zzhev(zzhcm zzhcm2) {
        this.zza = zzhcm2;
    }

    public static /* bridge */ /* synthetic */ zzhcm zza(zzhev zzhev2) {
        return zzhev2.zza;
    }

    public final Iterator iterator() {
        zzheu zzheu2 = new zzheu(this);
        return zzheu2;
    }

    public final ListIterator listIterator(int n3) {
        zzhet zzhet2 = new zzhet(this, n3);
        return zzhet2;
    }

    public final int size() {
        return this.zza.size();
    }

    public final zzhcm zzd() {
        return this;
    }

    public final Object zze(int n3) {
        return this.zza.zze(n3);
    }

    public final List zzh() {
        return this.zza.zzh();
    }

    public final void zzi(zzhac serializable) {
        serializable = new UnsupportedOperationException();
        throw serializable;
    }
}

