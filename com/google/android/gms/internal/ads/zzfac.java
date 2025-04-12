/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfad;
import com.google.android.gms.internal.ads.zzfae;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzfac
implements Callable {
    public final /* synthetic */ zzfad zza;

    public /* synthetic */ zzfac(zzfad zzfad2) {
        this.zza = zzfad2;
    }

    public final Object call() {
        JSONObject jSONObject = new JSONObject();
        zzfae zzfae2 = new zzfae(jSONObject);
        return zzfae2;
    }
}

