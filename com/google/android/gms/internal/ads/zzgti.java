/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgtk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgti {
    private HashMap zza;

    public zzgti() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
    }

    public final zzgtk zza() {
        Object object = this.zza;
        if (object != null) {
            Map map2 = Collections.unmodifiableMap(this.zza);
            object = new zzgtk(map2, null);
            this.zza = null;
            return object;
        }
        object = new IllegalStateException("cannot call build() twice");
        throw object;
    }
}

