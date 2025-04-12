/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzccm;
import com.google.android.gms.internal.ads.zzcit;
import com.google.android.gms.internal.ads.zzelj;

public final class zzdoq
implements zzcit {
    public final /* synthetic */ zzccm zza;

    public /* synthetic */ zzdoq(zzccm zzccm2) {
        this.zza = zzccm2;
    }

    public final void zza(boolean bl2, int n3, String string2, String string3) {
        zzccm zzccm2 = this.zza;
        if (bl2) {
            zzccm2.zzb();
            return;
        }
        CharSequence charSequence = Fh3.a(n3, "Image Web View failed to load. Error code: ", ", Description: ", string2, ", Failing URL: ");
        charSequence.append(string3);
        charSequence = charSequence.toString();
        zzelj zzelj2 = new zzelj(1, (String)charSequence);
        zzccm2.zzd(zzelj2);
    }
}

