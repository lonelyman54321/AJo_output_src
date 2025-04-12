/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzcot;
import java.util.Map;

public final class zzcox
implements zzcot {
    private final zzg zza;

    public zzcox(zzg zzg2) {
        this.zza = zzg2;
    }

    public final void zza(Map map2) {
        boolean bl2 = Boolean.parseBoolean((String)map2.get("content_vertical_opted_out"));
        this.zza.zzA(bl2);
    }
}

