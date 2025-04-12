/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.util.zzau;

public final class zzao
implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ int zze;
    public final /* synthetic */ int zzf;

    public /* synthetic */ zzao(zzau zzau2, int n3, int n4, int n7, int n8, int n10) {
        this.zza = zzau2;
        this.zzb = n3;
        this.zzc = n4;
        this.zzd = n7;
        this.zze = n8;
        this.zzf = n10;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        zzau zzau2 = this.zza;
        int n4 = this.zzb;
        int n7 = this.zzc;
        int n8 = this.zzd;
        int n10 = this.zze;
        int n14 = this.zzf;
        zzau2.zzj(n4, n7, n8, n10, n14, dialogInterface, n3);
    }
}

