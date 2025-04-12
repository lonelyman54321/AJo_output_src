/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbn;
import com.google.android.gms.ads.internal.util.zzbq;
import com.google.android.gms.internal.ads.zzari;
import com.google.android.gms.internal.ads.zzarn;

final class zzbj
implements zzari {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbn zzb;

    public zzbj(zzbq zzbq2, String string2, zzbn zzbn2) {
        this.zza = string2;
        this.zzb = zzbn2;
    }

    public final void zza(zzarn object) {
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder("Failed to load URL: ");
        String string2 = this.zza;
        stringBuilder.append(string2);
        stringBuilder.append("\n");
        stringBuilder.append((String)object);
        zzm.zzj(stringBuilder.toString());
        this.zzb.zza(null);
    }
}

