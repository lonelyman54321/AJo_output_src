/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcf;
import com.google.android.gms.internal.icing.zzdo;
import com.google.android.gms.internal.icing.zzfg;
import com.google.android.gms.internal.icing.zzfh;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzfi
extends AbstractList
implements RandomAccess,
zzdo {
    private final zzdo zza;

    public zzfi(zzdo zzdo2) {
        this.zza = zzdo2;
    }

    public static /* synthetic */ zzdo zza(zzfi zzfi2) {
        return zzfi2.zza;
    }

    public final Iterator iterator() {
        zzfh zzfh2 = new zzfh(this);
        return zzfh2;
    }

    public final ListIterator listIterator(int n3) {
        zzfg zzfg2 = new zzfg(this, n3);
        return zzfg2;
    }

    public final int size() {
        return this.zza.size();
    }

    public final void zzf(zzcf serializable) {
        serializable = new UnsupportedOperationException();
        throw serializable;
    }

    public final Object zzg(int n3) {
        return this.zza.zzg(n3);
    }

    public final List zzh() {
        return this.zza.zzh();
    }

    public final zzdo zzi() {
        return this;
    }
}

