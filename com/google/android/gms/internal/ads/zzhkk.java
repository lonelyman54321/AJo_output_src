/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhkm;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhky;
import java.util.AbstractMap;
import java.util.LinkedHashMap;

public class zzhkk {
    final LinkedHashMap zza;

    public zzhkk(int n3) {
        LinkedHashMap linkedHashMap;
        this.zza = linkedHashMap = zzhkm.zzb(n3);
    }

    public final zzhkk zza(Object object, zzhky zzhky2) {
        zzhkx.zza(object, "key");
        zzhkx.zza(zzhky2, "provider");
        ((AbstractMap)this.zza).put(object, zzhky2);
        return this;
    }
}

