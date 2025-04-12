/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcus;
import com.google.android.gms.internal.ads.zzehl;
import java.util.Map;

public final class zzcur
implements zzcus {
    private final Map zza;

    public zzcur(Map map2) {
        this.zza = map2;
    }

    public final zzehl zza(int n3, String string2) {
        return (zzehl)this.zza.get(string2);
    }
}

