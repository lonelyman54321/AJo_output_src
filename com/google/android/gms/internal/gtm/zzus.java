/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzur;
import com.google.android.gms.internal.gtm.zzuv;
import com.google.android.gms.internal.gtm.zzuw;
import java.util.HashMap;
import java.util.Map;

final class zzus
extends zzuw {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzus(zzur object, zzuv hashMap) {
        HashMap hashMap2;
        this.zza = hashMap = new HashMap();
        this.zzb = hashMap2 = new HashMap();
        Map map2 = zzur.zzc((zzur)object);
        hashMap.putAll(map2);
        object = zzur.zzb((zzur)object);
        hashMap2.putAll(object);
    }
}

