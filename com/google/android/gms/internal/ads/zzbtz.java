/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.internal.ads.zzbua;

final class zzbtz
implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbua zza;

    public zzbtz(zzbua zzbua2) {
        this.zza = zzbua2;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        this.zza.zzh("Operation denied by user.");
    }
}

