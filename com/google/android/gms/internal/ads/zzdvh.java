/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import com.google.android.gms.internal.ads.zzdvk;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzdvh
extends zzdvk {
    private final CsiParamDefaults zzg;

    public zzdvh(Executor object, zzr zzr2, CsiParamDefaults csiParamDefaults, CsiUrlBuilder csiUrlBuilder, Context context) {
        super((Executor)object, zzr2, csiUrlBuilder, context);
        this.zzg = csiParamDefaults;
        object = this.zzb;
        csiParamDefaults.set((Map)object);
    }

    public final Map zza() {
        Map map2 = this.zzb;
        HashMap hashMap = new HashMap(map2);
        return hashMap;
    }
}

