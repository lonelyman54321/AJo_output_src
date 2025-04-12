/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  org.json.JSONException
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import java.util.List;
import org.json.JSONException;

public final class zzcze
extends zzdm {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzehq zzh;
    private final Bundle zzi;

    public zzcze(zzfgt object, String object2, zzehq zzehq2, zzfgw zzfgw2, String string2) {
        boolean bl2;
        String string3 = null;
        String string4 = object == null ? null : ((zzfgt)object).zzac;
        this.zzb = string4;
        this.zzc = string2;
        if (zzfgw2 == null) {
            bl2 = false;
            string2 = null;
        } else {
            string2 = zzfgw2.zzb;
        }
        this.zzd = string2;
        string2 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        bl2 = string2.equals(object2);
        if (bl2 || (bl2 = (string2 = "com.google.ads.mediation.customevent.CustomEventAdapter").equals(object2))) {
            try {
                object = ((zzfgt)object).zzw;
                string2 = "class_name";
            }
            catch (JSONException jSONException) {}
            string3 = object.getString(string2);
        }
        if (string3 != null) {
            object2 = string3;
        }
        this.zza = object2;
        this.zze = object = zzehq2.zzc();
        this.zzh = zzehq2;
        long l2 = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        long l3 = 1000L;
        this.zzf = l2 /= l3;
        object = zzbep.zzgZ;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl3 = (Boolean)object;
        if (bl3 && zzfgw2 != null) {
            object = zzfgw2.zzj;
            this.zzi = object;
        } else {
            object = new Bundle();
            this.zzi = object;
        }
        object = zzbep.zzjl;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        bl3 = (Boolean)object;
        object = bl3 && zzfgw2 != null && !(bl3 = TextUtils.isEmpty((CharSequence)(object = zzfgw2.zzh))) ? zzfgw2.zzh : "";
        this.zzg = object;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final Bundle zze() {
        return this.zzi;
    }

    public final zzu zzf() {
        zzehq zzehq2 = this.zzh;
        if (zzehq2 != null) {
            return zzehq2.zza();
        }
        return null;
    }

    public final String zzg() {
        return this.zza;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        return this.zzb;
    }

    public final List zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}

