/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadf;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfu;
import java.util.List;

public final class zzapd {
    private final List zza;
    private final zzafa[] zzb;

    public zzapd(List zzafaArray) {
        this.zza = zzafaArray;
        zzafaArray = new zzafa[zzafaArray.size()];
        this.zzb = zzafaArray;
    }

    public final void zza(long l2, zzfu zzfu2) {
        zzafa[] zzafaArray = this.zzb;
        zzadf.zza(l2, zzfu2, zzafaArray);
    }

    public final void zzb(zzadx zzadx2, zzapo zzapo2) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((zzafa[])(object = this.zzb)).length); ++i3) {
            zzal zzal2;
            zzapo2.zzc();
            n3 = zzapo2.zza();
            int n4 = 3;
            object = zzadx2.zzw(n3, n4);
            zzafa[] zzafaArray = (zzan)this.zza.get(i3);
            String string2 = zzafaArray.zzn;
            String string3 = "application/cea-608";
            boolean bl2 = string3.equals(string2);
            boolean bl3 = true;
            if (!bl2 && !(bl2 = (string3 = "application/cea-708").equals(string2))) {
                bl3 = false;
                zzal2 = null;
            }
            string3 = String.valueOf(string2);
            String string4 = "Invalid closed caption MIME type provided: ";
            string3 = string4.concat(string3);
            zzeq.zze(bl3, string3);
            string3 = zzafaArray.zzb;
            if (string3 == null) {
                string3 = zzapo2.zzb();
            }
            zzal2 = new zzal();
            zzal2.zzK(string3);
            zzal2.zzX(string2);
            int n7 = zzafaArray.zzf;
            zzal2.zzZ(n7);
            string2 = zzafaArray.zze;
            zzal2.zzO(string2);
            n7 = zzafaArray.zzF;
            zzal2.zzw(n7);
            zzafaArray = zzafaArray.zzp;
            zzal2.zzL((List)zzafaArray);
            zzafaArray = zzal2.zzad();
            object.zzl((zzan)zzafaArray);
            zzafaArray = this.zzb;
            zzafaArray[i3] = object;
        }
    }
}

