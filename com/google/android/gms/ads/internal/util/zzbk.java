/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.zzbq;
import com.google.android.gms.internal.ads.zzari;
import com.google.android.gms.internal.ads.zzarj;
import com.google.android.gms.internal.ads.zzasj;
import java.util.Collections;
import java.util.Map;

final class zzbk
extends zzasj {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ zzl zzc;

    public zzbk(zzbq zzbq2, int n3, String string2, zzarj zzarj2, zzari zzari2, byte[] byArray, Map map2, zzl zzl2) {
        this.zza = byArray;
        this.zzb = map2;
        this.zzc = zzl2;
        super(n3, string2, zzarj2, zzari2);
    }

    public final Map zzl() {
        Map map2 = this.zzb;
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        return map2;
    }

    public final byte[] zzx() {
        byte[] byArray = this.zza;
        if (byArray == null) {
            byArray = null;
        }
        return byArray;
    }

    public final void zzz(String string2) {
        this.zzc.zzg(string2);
        super.zzz(string2);
    }
}

