/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.internal.ads.zzegk;

public final class zzegg
implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzegk zza;
    public final /* synthetic */ Activity zzb;
    public final /* synthetic */ zzm zzc;

    public /* synthetic */ zzegg(zzegk zzegk2, Activity activity, zzm zzm2) {
        this.zza = zzegk2;
        this.zzb = activity;
        this.zzc = zzm2;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        zzegk zzegk2 = this.zza;
        Activity activity = this.zzb;
        zzm zzm2 = this.zzc;
        zzegk2.zzm(activity, zzm2, dialogInterface, n3);
    }
}

