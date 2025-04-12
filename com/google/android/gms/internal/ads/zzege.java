/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.internal.ads.zzegk;

public final class zzege
implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzegk zza;
    public final /* synthetic */ zzm zzb;

    public /* synthetic */ zzege(zzegk zzegk2, zzm zzm2) {
        this.zza = zzegk2;
        this.zzb = zzm2;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        zzegk zzegk2 = this.zza;
        zzm zzm2 = this.zzb;
        zzegk2.zzk(zzm2, dialogInterface, n3);
    }
}

