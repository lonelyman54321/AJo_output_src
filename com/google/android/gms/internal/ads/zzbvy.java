/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbwd;
import java.util.List;

final class zzbvy
extends zzbvu {
    final /* synthetic */ UpdateImpressionUrlsCallback zza;

    public zzbvy(zzbwd zzbwd2, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza = updateImpressionUrlsCallback;
    }

    public final void zze(String string2) {
        this.zza.onFailure(string2);
    }

    public final void zzf(List list) {
        this.zza.onSuccess(list);
    }
}

