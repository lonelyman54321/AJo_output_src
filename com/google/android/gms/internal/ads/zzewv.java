/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzfxu;

public final class zzewv
implements zzfxu {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzewv(String string2) {
        this.zza = string2;
    }

    public final Object apply(Object object) {
        object = (Throwable)object;
        object = String.valueOf(this.zza);
        zzm.zzg("Error calling adapter: ".concat((String)object));
        return null;
    }
}

