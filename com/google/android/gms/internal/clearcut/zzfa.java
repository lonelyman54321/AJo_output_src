/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcx;
import com.google.android.gms.internal.clearcut.zzfb;
import com.google.android.gms.internal.clearcut.zzfc;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzfa
extends AbstractList
implements zzcx,
RandomAccess {
    private final zzcx zzpb;

    public zzfa(zzcx zzcx2) {
        this.zzpb = zzcx2;
    }

    public static /* synthetic */ zzcx zza(zzfa zzfa2) {
        return zzfa2.zzpb;
    }

    public final /* synthetic */ Object get(int n3) {
        return (String)this.zzpb.get(n3);
    }

    public final Object getRaw(int n3) {
        return this.zzpb.getRaw(n3);
    }

    public final Iterator iterator() {
        zzfc zzfc2 = new zzfc(this);
        return zzfc2;
    }

    public final ListIterator listIterator(int n3) {
        zzfb zzfb2 = new zzfb(this, n3);
        return zzfb2;
    }

    public final int size() {
        return this.zzpb.size();
    }

    public final List zzbt() {
        return this.zzpb.zzbt();
    }

    public final zzcx zzbu() {
        return this;
    }
}

