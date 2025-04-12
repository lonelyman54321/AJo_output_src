/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzay;
import com.google.android.gms.internal.ads.zzbc;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzbi;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbn;
import com.google.android.gms.internal.ads.zzbq;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzca;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.Collections;
import java.util.List;

public final class zzaw {
    private String zza;
    private Uri zzb;
    private final zzay zzc;
    private final zzbf zzd;
    private final List zze;
    private final zzgbc zzf;
    private final zzbi zzg;
    private final zzbq zzh;

    public zzaw() {
        Object object = new zzay();
        this.zzc = object;
        this.zzd = object = new zzbf(null);
        object = Collections.emptyList();
        this.zze = object;
        object = zzgbc.zzm();
        this.zzf = object;
        this.zzg = object = new zzbi();
        this.zzh = object = zzbq.zza;
    }

    public final zzaw zza(String string2) {
        this.zza = string2;
        return this;
    }

    public final zzaw zzb(Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzbu zzc() {
        zzbn zzbn2;
        Object object;
        zzbk zzbk2;
        zzbc zzbc2;
        zzaw zzaw2 = this;
        Object object2 = this.zzb;
        if (object2 != null) {
            zzbn zzbn3;
            List list = this.zze;
            zzgbc zzgbc2 = this.zzf;
            long l2 = -9223372036854775807L;
            zzbc2 = null;
            zzbk2 = null;
            object = zzbn3;
            zzbn2 = zzbn3 = new zzbn((Uri)object2, null, null, null, list, null, zzgbc2, null, l2, null);
        } else {
            zzbn2 = null;
        }
        object2 = zzaw2.zza;
        if (object2 == null) {
            object2 = "";
        }
        Object object3 = object2;
        object2 = zzaw2.zzc;
        zzbc2 = new zzbc((zzay)object2, null);
        object2 = zzaw2.zzg;
        zzbk2 = new zzbk((zzbi)object2, null);
        object2 = zzaw2.zzh;
        zzca zzca2 = zzca.zza;
        object = new zzbu((String)object3, zzbc2, zzbn2, zzbk2, zzca2, (zzbq)object2, null);
        return object;
    }
}

