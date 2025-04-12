/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzjv;
import com.google.android.gms.internal.vision.zzly;
import com.google.android.gms.internal.vision.zzmb;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzlz
extends AbstractList
implements zzjv,
RandomAccess {
    private final zzjv zza;

    public zzlz(zzjv zzjv2) {
        this.zza = zzjv2;
    }

    public static /* synthetic */ zzjv zza(zzlz zzlz2) {
        return zzlz2.zza;
    }

    public final /* synthetic */ Object get(int n3) {
        return (String)this.zza.get(n3);
    }

    public final Iterator iterator() {
        zzmb zzmb2 = new zzmb(this);
        return zzmb2;
    }

    public final ListIterator listIterator(int n3) {
        zzly zzly2 = new zzly(this, n3);
        return zzly2;
    }

    public final int size() {
        return this.zza.size();
    }

    public final void zza(zzht serializable) {
        serializable = new UnsupportedOperationException();
        throw serializable;
    }

    public final Object zzb(int n3) {
        return this.zza.zzb(n3);
    }

    public final List zzd() {
        return this.zza.zzd();
    }

    public final zzjv zze() {
        return this;
    }
}

