/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbmf;
import com.google.android.gms.internal.ads.zzbpw;
import com.google.android.gms.internal.ads.zzccn;
import org.json.JSONObject;

final class zzbmd
implements zzbme {
    final /* synthetic */ zzccn zza;

    public zzbmd(zzbmf zzbmf2, zzccn zzccn2) {
        this.zza = zzccn2;
    }

    public final void zza(String string2) {
        zzbpw zzbpw2 = new zzbpw(string2);
        this.zza.zzd(zzbpw2);
    }

    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}

