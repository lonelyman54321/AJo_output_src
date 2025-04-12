/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.common;

import com.google.android.gms.internal.common.zzae;
import java.util.Iterator;

public final class zzah
extends zzae {
    public zzah() {
        throw null;
    }

    public zzah(int n3) {
        super(4);
    }

    public final zzah zzb(Object object) {
        this.zza(object);
        return this;
    }

    public final zzah zzc(Iterator iterator) {
        boolean bl2;
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            this.zza(e2);
        }
        return this;
    }
}

