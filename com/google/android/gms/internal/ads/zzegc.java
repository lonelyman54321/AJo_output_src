/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 */
package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;

public final class zzegc
implements DialogInterface.OnCancelListener {
    public final /* synthetic */ zzm zza;

    public /* synthetic */ zzegc(zzm zzm2) {
        this.zza = zzm2;
    }

    public final void onCancel(DialogInterface object) {
        object = this.zza;
        if (object != null) {
            ((zzm)object).zzb();
        }
    }
}

