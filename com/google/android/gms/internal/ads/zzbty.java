/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 */
package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbua;

final class zzbty
implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbua zza;

    public zzbty(zzbua zzbua2) {
        this.zza = zzbua2;
    }

    public final void onClick(DialogInterface object, int n3) {
        object = this.zza;
        Intent intent = ((zzbua)object).zzb();
        zzu.zzp();
        zzt.zzT(zzbua.zza((zzbua)object), intent);
    }
}

