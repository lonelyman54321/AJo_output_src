/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzaus;
import com.google.android.gms.internal.ads.zzaxh;
import com.google.android.gms.internal.ads.zzaxw;
import com.google.android.gms.internal.ads.zzaxx;
import com.google.android.gms.internal.ads.zzayf;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzayn;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfrx;
import com.google.android.gms.internal.ads.zzfth;
import java.util.HashMap;
import java.util.Map;

final class zzaxy
implements zzfth {
    private final zzfrg zza;
    private final zzfrx zzb;
    private final zzayl zzc;
    private final zzaxx zzd;
    private final zzaxh zze;
    private final zzayn zzf;
    private final zzayf zzg;
    private final zzaxw zzh;

    public zzaxy(zzfrg zzfrg2, zzfrx zzfrx2, zzayl zzayl2, zzaxx zzaxx2, zzaxh zzaxh2, zzayn zzayn2, zzayf zzayf2, zzaxw zzaxw2) {
        this.zza = zzfrg2;
        this.zzb = zzfrx2;
        this.zzc = zzayl2;
        this.zzd = zzaxx2;
        this.zze = zzaxh2;
        this.zzf = zzayn2;
        this.zzg = zzayf2;
        this.zzh = zzaxw2;
    }

    private final Map zze() {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Object object = this.zza;
        Object object2 = this.zzb.zzb();
        object = ((zzfrg)object).zzb();
        hashMap.put("v", object);
        object = this.zza.zzc();
        String string2 = "gms";
        hashMap.put(string2, object);
        object = ((zzaus)object2).zzi();
        hashMap.put("int", object);
        boolean bl2 = this.zzd.zza();
        object = bl2;
        hashMap.put("up", object);
        object = new Throwable();
        object2 = "t";
        hashMap.put(object2, object);
        object = this.zzg;
        if (object != null) {
            object = ((zzayf)object).zzc();
            hashMap.put("tcq", object);
            object = this.zzg.zzg();
            hashMap.put("tpq", object);
            object = this.zzg.zzd();
            hashMap.put("tcv", object);
            object = this.zzg.zzh();
            hashMap.put("tpv", object);
            object = this.zzg.zzb();
            hashMap.put("tchv", object);
            object = this.zzg.zzf();
            hashMap.put("tphv", object);
            object = this.zzg.zza();
            hashMap.put("tcc", object);
            long l2 = this.zzg.zze();
            object = l2;
            object2 = "tpc";
            hashMap.put(object2, object);
        }
        return hashMap;
    }

    public final Map zza() {
        Object object = this.zzc;
        Map map2 = this.zze();
        object = ((zzayl)object).zza();
        map2.put("lts", object);
        return map2;
    }

    public final Map zzb() {
        long l2;
        Object object = this.zza;
        Object object2 = this.zzb;
        Map map2 = this.zze();
        object2 = ((zzfrx)object2).zza();
        object = ((zzfrg)object).zzd();
        map2.put("gai", object);
        object = ((zzaus)object2).zzh();
        map2.put("did", object);
        object = ((zzaus)object2).zzc().zza();
        String string2 = "dst";
        map2.put(string2, object);
        boolean bl2 = ((zzaus)object2).zzaq();
        object = bl2;
        object2 = "doo";
        map2.put(object2, object);
        object = this.zze;
        if (object != null) {
            l2 = ((zzaxh)object).zza();
            object = l2;
            object2 = "nt";
            map2.put(object2, object);
        }
        if ((object = this.zzf) != null) {
            object = ((zzayn)object).zzc();
            map2.put("vs", object);
            l2 = this.zzf.zzb();
            object = l2;
            object2 = "vf";
            map2.put(object2, object);
        }
        return map2;
    }

    public final Map zzc() {
        Object object = this.zzh;
        Map map2 = this.zze();
        if (object != null) {
            String string2 = "vst";
            object = ((zzaxw)object).zza();
            map2.put(string2, object);
        }
        return map2;
    }

    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}

