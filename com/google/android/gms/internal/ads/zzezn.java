/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzezo;
import com.google.android.gms.internal.ads.zzezp;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzezn
implements Callable {
    public final /* synthetic */ zzezo zza;

    public /* synthetic */ zzezn(zzezo zzezo2) {
        this.zza = zzezo2;
    }

    public final Object call() {
        JSONObject jSONObject = new JSONObject();
        zzezp zzezp2 = new zzezp(jSONObject);
        return zzezp2;
    }
}

