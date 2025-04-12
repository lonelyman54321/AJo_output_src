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
import java.util.concurrent.atomic.AtomicInteger;

public final class zzar
implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ AtomicInteger zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ int zze;

    public /* synthetic */ zzar(zzau zzau2, AtomicInteger atomicInteger, int n3, int n4, int n7) {
        this.zza = zzau2;
        this.zzb = atomicInteger;
        this.zzc = n3;
        this.zzd = n4;
        this.zze = n7;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        zzau zzau2 = this.zza;
        AtomicInteger atomicInteger = this.zzb;
        int n4 = this.zzc;
        int n7 = this.zzd;
        int n8 = this.zze;
        zzau2.zzh(atomicInteger, n4, n7, n8, dialogInterface, n3);
    }
}

