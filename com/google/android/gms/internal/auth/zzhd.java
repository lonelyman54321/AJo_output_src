/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzfe;
import com.google.android.gms.internal.auth.zzhb;
import com.google.android.gms.internal.auth.zzhc;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzhd
extends AbstractList
implements RandomAccess,
zzfe {
    private final zzfe zza;

    public zzhd(zzfe zzfe2) {
        this.zza = zzfe2;
    }

    public static /* bridge */ /* synthetic */ zzfe zza(zzhd zzhd2) {
        return zzhd2.zza;
    }

    public final Iterator iterator() {
        zzhc zzhc2 = new zzhc(this);
        return zzhc2;
    }

    public final ListIterator listIterator(int n3) {
        zzhb zzhb2 = new zzhb(this, n3);
        return zzhb2;
    }

    public final int size() {
        return this.zza.size();
    }

    public final zzfe zze() {
        return this;
    }

    public final List zzg() {
        return this.zza.zzg();
    }
}

