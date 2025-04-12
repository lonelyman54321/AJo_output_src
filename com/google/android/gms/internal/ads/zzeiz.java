/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzczy;
import com.google.android.gms.internal.ads.zzdjp;

public final class zzeiz
implements zzdjp {
    public final /* synthetic */ zzccn zza;

    public /* synthetic */ zzeiz(zzccn zzccn2) {
        this.zza = zzccn2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zza(boolean bl2, Context context, zzczy zzczy2) {
        Object object = this.zza;
        try {
            zzu.zzi();
            object = ((zzccn)object).get();
        }
        catch (Exception exception) {
            return;
        }
        object = (AdOverlayInfoParcel)object;
        boolean bl3 = true;
        zzn.zza(context, (AdOverlayInfoParcel)object, bl3);
    }
}

