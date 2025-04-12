/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzy;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

final class zzfzx
extends AbstractCollection {
    final /* synthetic */ zzfzy zza;

    public zzfzx(zzfzy zzfzy2) {
        this.zza = zzfzy2;
    }

    public final void clear() {
        this.zza.zzp();
    }

    public final boolean contains(Object object) {
        boolean bl2;
        block1: {
            boolean bl3;
            Iterator iterator = this.zza.zzs().values().iterator();
            while (bl3 = iterator.hasNext()) {
                Collection collection = (Collection)iterator.next();
                bl3 = collection.contains(object);
                if (!bl3) continue;
                bl2 = true;
                break block1;
            }
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final Iterator iterator() {
        return this.zza.zzg();
    }

    public final int size() {
        return this.zza.zze();
    }
}

