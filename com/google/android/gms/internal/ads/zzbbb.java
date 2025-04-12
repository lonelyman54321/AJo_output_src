/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzca;

public final class zzbbb
extends zzca {
    private final AppEventListener zza;

    public zzbbb(AppEventListener appEventListener) {
        this.zza = appEventListener;
    }

    public final AppEventListener zzb() {
        return this.zza;
    }

    public final void zzc(String string2, String string3) {
        this.zza.onAppEvent(string2, string3);
    }
}

