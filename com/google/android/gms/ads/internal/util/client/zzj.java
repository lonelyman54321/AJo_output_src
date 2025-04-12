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

public final class zzj
implements zzk {
    public final /* synthetic */ int zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzj(int n3, Map map2) {
        this.zza = n3;
        this.zzb = map2;
    }

    public final void zza(JsonWriter jsonWriter) {
        int n3 = this.zza;
        Map map2 = this.zzb;
        zzl.zzb(n3, map2, jsonWriter);
    }
}

