/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzddr;
import com.google.android.gms.internal.ads.zzepc;

public final class zzdcu
implements zzddr {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdcu(String string2, String string3) {
        this.zza = string2;
        this.zzb = string3;
    }

    public final void zza(Object object) {
        object = (zzepc)object;
        String string2 = this.zza;
        String string3 = this.zzb;
        ((zzepc)object).onAppEvent(string2, string3);
    }
}

