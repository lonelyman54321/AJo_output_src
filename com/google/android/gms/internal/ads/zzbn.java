/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzav;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zzbl;
import com.google.android.gms.internal.ads.zzbm;
import com.google.android.gms.internal.ads.zzbs;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzn;
import java.util.List;

public final class zzbn {
    public static final zzn zza;
    private static final String zzl;
    private static final String zzm;
    private static final String zzn;
    private static final String zzo;
    private static final String zzp;
    private static final String zzq;
    private static final String zzr;
    private static final String zzs;
    public final Uri zzb;
    public final String zzc;
    public final zzbg zzd;
    public final zzav zze;
    public final List zzf;
    public final String zzg;
    public final zzgbc zzh;
    public final List zzi;
    public final Object zzj;
    public final long zzk;

    static {
        int n3 = 36;
        zzl = Integer.toString(0, n3);
        zzm = Integer.toString(1, n3);
        zzn = Integer.toString(2, n3);
        zzo = Integer.toString(3, n3);
        zzp = Integer.toString(4, n3);
        zzq = Integer.toString(5, n3);
        zzr = Integer.toString(6, n3);
        zzs = Integer.toString(7, n3);
        zzbl zzbl2 = new zzbl();
        zza = zzbl2;
    }

    public /* synthetic */ zzbn(Uri uri, String object, zzbg zzbg2, zzav zzav2, List list, String string2, zzgbc zzgbc2, Object object2, long l2, zzbm zzbm2) {
        this.zzb = uri;
        uri = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzf = list;
        this.zzg = null;
        this.zzh = zzgbc2;
        object = new zzgaz();
        int n3 = zzgbc2.size();
        if (n3 <= 0) {
            this.zzi = object = ((zzgaz)object).zzi();
            this.zzj = null;
            this.zzk = -9223372036854775807L;
            return;
        }
        object = (zzbs)zzgbc2.get(0);
        throw null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof zzbn;
        if (!bl3) {
            return false;
        }
        object = (zzbn)object;
        Uri uri = this.zzb;
        Object object2 = ((zzbn)object).zzb;
        bl3 = uri.equals(object2);
        if (bl3) {
            long l2;
            boolean bl4;
            List list;
            bl3 = false;
            uri = null;
            boolean bl5 = zzgd.zzG(null, null);
            if (bl5 && (bl5 = zzgd.zzG(null, null)) && (bl5 = zzgd.zzG(null, null)) && (bl5 = (object2 = this.zzf).equals(list = ((zzbn)object).zzf)) && (bl5 = zzgd.zzG(null, null)) && (bl4 = ((zzgbc)(object2 = this.zzh)).equals(object = ((zzbn)object).zzh)) && (bl4 = zzgd.zzG(null, null)) && (bl4 = zzgd.zzG(object = Long.valueOf(l2 = -9223372036854775807L), object))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zzb.hashCode() * 923521;
        List list = this.zzf;
        n3 = ne_0.a(n3, 961, list);
        return (int)((long)((this.zzh.hashCode() + n3) * 31) * (long)31 + -9223372036854775807L);
    }
}

