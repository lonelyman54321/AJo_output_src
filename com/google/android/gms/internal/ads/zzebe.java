/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdce;
import com.google.android.gms.internal.ads.zzdzd;
import com.google.android.gms.internal.ads.zzebc;
import com.google.android.gms.internal.ads.zzebd;
import com.google.android.gms.internal.ads.zzebg;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhlg;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

public final class zzebe
implements zzebg {
    private final Map zza;
    private final zzgge zzb;
    private final zzdce zzc;

    public zzebe(Map map2, zzgge zzgge2, zzdce zzdce2) {
        this.zza = map2;
        this.zzb = zzgge2;
        this.zzc = zzdce2;
    }

    public static /* bridge */ /* synthetic */ zzdce zza(zzebe zzebe2) {
        return zzebe2.zzc;
    }

    public final ListenableFuture zzb(zzbxu object) {
        this.zzc.zzdn((zzbxu)object);
        int n3 = 3;
        Object object2 = new zzdzd(n3);
        object2 = zzgft.zzg((Throwable)object2);
        zzbeg object3 = zzbep.zzin;
        String string2 = (String)zzba.zzc().zza(object3);
        String string3 = ",";
        String[] stringArray = string2.split(string3);
        int n4 = stringArray.length;
        for (int i3 = 0; i3 < n4; ++i3) {
            Object object4 = this.zza;
            String string5 = stringArray[i3];
            string5 = string5.trim();
            zzhlg zzhlg2 = (zzhlg)object4.get(string5);
            if (zzhlg2 == null) continue;
            object4 = new zzebc(zzhlg2, (zzbxu)object);
            zzgge zzgge2 = this.zzb;
            Class<zzdzd> clazz = zzdzd.class;
            object2 = zzgft.zzf((ListenableFuture)object2, clazz, (zzgfa)object4, zzgge2);
        }
        object = new zzebd(this);
        zzgge zzgge3 = zzcci.zzf;
        zzgft.zzr((ListenableFuture)object2, (zzgfp)object, zzgge3);
        return object2;
    }
}

