/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfqr;
import com.google.android.gms.internal.ads.zzfqs;
import com.google.android.gms.internal.ads.zzfqt;
import com.google.android.gms.internal.ads.zzfqu;
import java.util.HashSet;
import org.json.JSONObject;

public final class zzfqi {
    private JSONObject zza;
    private final zzfqr zzb;

    public zzfqi(zzfqr zzfqr2) {
        this.zzb = zzfqr2;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        zzfqs zzfqs2 = new zzfqs(this);
        this.zzb.zzb(zzfqs2);
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long l2) {
        zzfqt zzfqt2 = new zzfqt(this, hashSet, jSONObject, l2);
        this.zzb.zzb(zzfqt2);
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long l2) {
        zzfqu zzfqu2 = new zzfqu(this, hashSet, jSONObject, l2);
        this.zzb.zzb(zzfqu2);
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}

