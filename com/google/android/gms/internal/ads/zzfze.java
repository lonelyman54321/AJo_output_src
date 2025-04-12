/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzv;
import com.google.android.gms.internal.ads.zzgbn;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

class zzfze
extends zzfzv
implements zzgbn {
    public zzfze(Map map2) {
        super(map2);
    }

    public final Collection zzb(Collection collection) {
        return Collections.unmodifiableList(collection);
    }

    public final Collection zzc(Object object, Collection collection) {
        collection = (List)collection;
        return this.zzh(object, (List)collection, null);
    }
}

