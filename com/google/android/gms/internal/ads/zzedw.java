/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzexz;
import com.google.android.gms.internal.ads.zzezm;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

public final class zzedw
implements zzgfa {
    public final /* synthetic */ zzezm zza;

    public /* synthetic */ zzedw(zzezm zzezm2) {
        this.zza = zzezm2;
    }

    public final ListenableFuture zza(Object object) {
        object = (Void)object;
        object = this.zza.zza();
        JSONObject jSONObject = new JSONObject();
        Bundle bundle = new Bundle();
        return ((zzexz)object).zza(jSONObject, bundle);
    }
}

