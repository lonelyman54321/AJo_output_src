/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.internal.ads.zzdey;

public final class zzdee
implements zzdey {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdee(String string2, String string3) {
        this.zza = string2;
        this.zzb = string3;
    }

    public final void zza(Object object) {
        object = (AppEventListener)object;
        String string2 = this.zza;
        String string3 = this.zzb;
        object.onAppEvent(string2, string3);
    }
}

