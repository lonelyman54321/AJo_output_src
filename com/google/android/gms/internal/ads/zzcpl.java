/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcot;
import com.google.android.gms.internal.ads.zzfgs;
import java.util.Map;

public final class zzcpl
implements zzcot {
    private final zzfgs zza;

    public zzcpl(zzfgs zzfgs2) {
        this.zza = zzfgs2;
    }

    public final void zza(Map object) {
        Object object2 = "render_in_browser";
        boolean bl2 = TextUtils.isEmpty((CharSequence)(object = (String)object.get(object2)));
        if (!bl2) {
            try {
                object2 = this.zza;
            }
            catch (Exception exception) {
                object2 = new IllegalStateException("Invalid render_in_browser state", exception);
                throw object2;
            }
            boolean bl3 = Boolean.parseBoolean((String)object);
            ((zzfgs)object2).zzb(bl3);
            return;
        }
    }
}

