/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeec;
import com.google.android.gms.internal.ads.zzeei;
import com.google.android.gms.internal.ads.zzfxu;
import java.util.Map;
import org.json.JSONObject;

public final class zzeds
implements zzfxu {
    public final /* synthetic */ zzeec zza;

    public /* synthetic */ zzeds(zzeec zzeec2) {
        this.zza = zzeec2;
    }

    public final Object apply(Object object) {
        zzeec zzeec2 = this.zza;
        Map map2 = zzeec2.zzc;
        object = (JSONObject)object;
        zzeei.zza(map2, (JSONObject)object);
        return zzeec2;
    }
}

