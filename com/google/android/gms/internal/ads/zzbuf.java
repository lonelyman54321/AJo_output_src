/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.internal.ads.zzbug;

final class zzbuf
implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbug zza;

    public zzbuf(zzbug zzbug2) {
        this.zza = zzbug2;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        this.zza.zzh("User canceled the download.");
    }
}

