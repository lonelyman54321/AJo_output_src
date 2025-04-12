/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcot;
import com.google.android.gms.internal.ads.zzdya;
import java.util.Map;

public final class zzcpr
implements zzcot {
    private final zzdya zza;

    public zzcpr(zzdya zzdya2) {
        this.zza = zzdya2;
    }

    public final void zza(Map object) {
        Object object2 = "test_mode_enabled";
        boolean bl2 = TextUtils.isEmpty((CharSequence)(object = (String)object.get(object2)));
        if (bl2) {
            return;
        }
        object2 = this.zza;
        boolean bl3 = ((String)object).equals("true");
        ((zzdya)object2).zzo(bl3);
    }
}

