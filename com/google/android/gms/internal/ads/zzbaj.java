/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

public final class zzbaj {
    private final String zza;
    private final JSONObject zzb;
    private final String zzc;
    private final String zzd;
    private final boolean zze;

    public zzbaj(String string2, VersionInfoParcel object, String string3, JSONObject jSONObject, boolean bl2, boolean bl3) {
        this.zzd = object = ((VersionInfoParcel)object).afmaVersion;
        this.zzb = jSONObject;
        this.zzc = string2;
        this.zza = string3;
        this.zze = bl3;
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() {
        return this.zzb;
    }

    public final boolean zze() {
        return this.zze;
    }
}

