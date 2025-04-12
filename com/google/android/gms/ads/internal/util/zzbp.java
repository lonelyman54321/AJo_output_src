/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.internal.ads.zzaqn;
import com.google.android.gms.internal.ads.zzara;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzari;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzccn;
import java.util.Map;

public final class zzbp
extends zzare {
    private final zzccn zza;
    private final zzl zzb;

    public zzbp(String string2, Map object, zzccn zzccn2) {
        object = new zzbo(zzccn2);
        super(0, string2, (zzari)object);
        this.zza = zzccn2;
        this.zzb = object = new zzl(null);
        ((zzl)object).zzd(string2, "GET", null, null);
    }

    public final zzark zzh(zzara zzara2) {
        zzaqn zzaqn2 = zzasb.zzb(zzara2);
        return zzark.zzb(zzara2, zzaqn2);
    }
}

