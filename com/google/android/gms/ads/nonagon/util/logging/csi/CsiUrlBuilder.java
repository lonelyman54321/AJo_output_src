/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 */
package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzbge;
import java.util.Map;

public class CsiUrlBuilder {
    private final String zza;

    public CsiUrlBuilder() {
        String string2;
        this.zza = string2 = (String)zzbge.zzb.zze();
    }

    public String generateUrl(Map object) {
        boolean bl2;
        Uri.Builder builder = Uri.parse((String)this.zza).buildUpon();
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            object2 = (String)object2.getValue();
            builder.appendQueryParameter(string2, (String)object2);
        }
        return builder.build().toString();
    }
}

