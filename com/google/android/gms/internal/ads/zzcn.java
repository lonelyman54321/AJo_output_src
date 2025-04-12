/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzah;
import com.google.android.gms.internal.ads.zzcp;

public final class zzcn {
    private final zzaf zza;

    public zzcn() {
        zzaf zzaf2;
        this.zza = zzaf2 = new zzaf();
    }

    public final zzcn zza(int n3) {
        this.zza.zza(n3);
        return this;
    }

    public final zzcn zzb(zzcp object) {
        int n3;
        object = zzcp.zza((zzcp)object);
        for (int i3 = 0; i3 < (n3 = ((zzah)object).zzb()); ++i3) {
            zzaf zzaf2 = this.zza;
            int n4 = ((zzah)object).zza(i3);
            zzaf2.zza(n4);
        }
        return this;
    }

    public final zzcn zzc(int ... nArray) {
        int n3;
        for (int i3 = 0; i3 < (n3 = 20); ++i3) {
            zzaf zzaf2 = this.zza;
            int n4 = nArray[i3];
            zzaf2.zza(n4);
        }
        return this;
    }

    public final zzcn zzd(int n3, boolean bl2) {
        if (bl2) {
            zzaf zzaf2 = this.zza;
            zzaf2.zza(n3);
        }
        return this;
    }

    public final zzcp zze() {
        Object object = this.zza;
        object = ((zzaf)object).zzb();
        zzcp zzcp2 = new zzcp((zzah)object, null);
        return zzcp2;
    }
}

