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

final class zzapr {
    private final List zza;
    private final zzafa[] zzb;

    public zzapr(List zzafaArray) {
        this.zza = zzafaArray;
        zzafaArray = new zzafa[zzafaArray.size()];
        this.zzb = zzafaArray;
    }

    public final void zza(long l2, zzfu zzfu2) {
        int n3;
        int n4 = zzfu2.zzb();
        if (n4 >= (n3 = 9)) {
            n4 = zzfu2.zzg();
            n3 = zzfu2.zzg();
            int n7 = zzfu2.zzm();
            int n8 = 434;
            if (n4 == n8 && n3 == (n4 = 1195456820) && n7 == (n4 = 3)) {
                zzafa[] zzafaArray = this.zzb;
                zzadf.zzb(l2, zzfu2, zzafaArray);
            }
        }
    }

    public final void zzb(zzadx zzadx2, zzapo zzapo2) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((zzafa[])(object = this.zzb)).length); ++i3) {
            String string2;
            zzapo2.zzc();
            n3 = zzapo2.zza();
            int n4 = 3;
            object = zzadx2.zzw(n3, n4);
            zzafa[] zzafaArray = (zzan)this.zza.get(i3);
            String string3 = zzafaArray.zzn;
            Object object2 = "application/cea-608";
            boolean bl2 = ((String)object2).equals(string3);
            boolean bl3 = true;
            if (!bl2 && !(bl2 = ((String)(object2 = "application/cea-708")).equals(string3))) {
                bl3 = false;
                string2 = null;
            }
            object2 = String.valueOf(string3);
            String string4 = "Invalid closed caption MIME type provided: ";
            object2 = string4.concat((String)object2);
            zzeq.zze(bl3, object2);
            object2 = new zzal();
            string2 = zzapo2.zzb();
            ((zzal)object2).zzK(string2);
            ((zzal)object2).zzX(string3);
            int n7 = zzafaArray.zzf;
            ((zzal)object2).zzZ(n7);
            string3 = zzafaArray.zze;
            ((zzal)object2).zzO(string3);
            n7 = zzafaArray.zzF;
            ((zzal)object2).zzw(n7);
            zzafaArray = zzafaArray.zzp;
            ((zzal)object2).zzL((List)zzafaArray);
            zzafaArray = ((zzal)object2).zzad();
            object.zzl((zzan)zzafaArray);
            zzafaArray = this.zzb;
            zzafaArray[i3] = object;
        }
    }
}

