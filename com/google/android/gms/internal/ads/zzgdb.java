/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgde;
import java.util.AbstractSet;
import java.util.Collection;

abstract class zzgdb
extends AbstractSet {
    public boolean removeAll(Collection collection) {
        return zzgde.zze(this, collection);
    }

    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}

