/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.tagmanager.zzaq;
import com.google.android.gms.tagmanager.zzcs;
import java.util.Map;

final class zzg
implements zzaq {
    private final Context zza;

    public zzg(Context context) {
        this.zza = context;
    }

    public final void zza(Map object) {
        boolean bl2;
        boolean bl3;
        String string2;
        Object object2 = object.get("gtm.url");
        if (object2 == null && (object = object.get(string2 = "gtm")) != null && (bl3 = object instanceof Map)) {
            object2 = object.get("url");
        }
        if (object2 != null && (bl2 = object2 instanceof String)) {
            object = Uri.parse((String)((String)object2));
            object2 = "referrer";
            if ((object = object.getQueryParameter(object2)) != null) {
                object2 = this.zza;
                zzcs.zzc(object2, (String)object);
            }
        }
    }
}

