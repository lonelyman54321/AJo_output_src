/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhkp;
import java.util.Collections;
import java.util.Map;

abstract class zzhkl
implements zzhkp {
    private final Map zza;

    public zzhkl(Map map2) {
        this.zza = map2 = Collections.unmodifiableMap(map2);
    }

    public final Map zza() {
        return this.zza;
    }
}

