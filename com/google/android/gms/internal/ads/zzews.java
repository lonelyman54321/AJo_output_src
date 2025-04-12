/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzewy;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzews
implements Callable {
    public final /* synthetic */ List zza;
    public final /* synthetic */ Bundle zzb;

    public /* synthetic */ zzews(List list, Bundle bundle) {
        this.zza = list;
        this.zzb = bundle;
    }

    public final Object call() {
        Object object;
        boolean bl2;
        Object object2 = new JSONArray();
        Bundle bundle = this.zza.iterator();
        while (bl2 = bundle.hasNext()) {
            object = (ListenableFuture)bundle.next();
            JSONObject jSONObject = (JSONObject)object.get();
            if (jSONObject == null) continue;
            object = object.get();
            object2.put(object);
        }
        int n3 = object2.length();
        if (n3 == 0) {
            return null;
        }
        bundle = this.zzb;
        object2 = object2.toString();
        object = new zzewy((String)object2, bundle);
        return object;
    }
}

