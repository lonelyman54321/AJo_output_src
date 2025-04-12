/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzdya;
import java.util.Map;

public final class zzblq
implements zzblp {
    private final zzdya zza;

    public zzblq(zzdya zzdya2) {
        Preconditions.checkNotNull(zzdya2, "The Inspector Manager must not be null");
        this.zza = zzdya2;
    }

    public final void zza(Object object, Map map2) {
        Object object2;
        boolean bl2;
        if (map2 != null && (bl2 = map2.containsKey(object = "persistentData")) && !(bl2 = TextUtils.isEmpty((CharSequence)(object2 = (CharSequence)map2.get(object))))) {
            object2 = this.zza;
            object = (String)map2.get(object);
            ((zzdya)object2).zzj((String)object);
        }
    }
}

