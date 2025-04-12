/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcot;
import java.util.Map;

final class zzcpg
implements zzcot {
    public final void zza(Map object) {
        Object object2 = zzbep.zzkt;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2 && !(bl2 = object.isEmpty()) && !(bl2 = TextUtils.isEmpty((CharSequence)(object = (String)object.get(object2 = "is_topics_ad_personalization_allowed"))))) {
            boolean bl3 = Boolean.parseBoolean((String)object);
            object2 = zzu.zzo().zzi();
            object2.zzJ(bl3);
        }
    }
}

