/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.JsonWriter
 */
package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import com.google.android.gms.ads.internal.util.client.zzk;
import com.google.android.gms.ads.internal.util.client.zzl;
import java.util.Map;

public final class zzg
implements zzk {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Map zzc;
    public final /* synthetic */ byte[] zzd;

    public /* synthetic */ zzg(String string2, String string3, Map map2, byte[] byArray) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = map2;
        this.zzd = byArray;
    }

    public final void zza(JsonWriter jsonWriter) {
        String string2 = this.zza;
        String string3 = this.zzb;
        Map map2 = this.zzc;
        byte[] byArray = this.zzd;
        zzl.zza(string2, string3, map2, byArray, jsonWriter);
    }
}

