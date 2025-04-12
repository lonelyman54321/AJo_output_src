/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.internal.gtm.zzgp;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zziv;
import com.google.android.gms.internal.gtm.zzix;
import com.google.android.gms.internal.gtm.zzjg;

final class zzin
implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzix zzc;

    public zzin(zzix zzix2, String string2, String string3, String string4) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = zzix2;
    }

    public final void run() {
        Object object = new StringBuilder("Starting to load container ");
        String string2 = this.zza;
        ((StringBuilder)object).append(string2);
        string2 = ".";
        ((StringBuilder)object).append(string2);
        zzhi.zzd(((StringBuilder)object).toString());
        object = this.zzc;
        int n3 = zzix.zza((zzix)object);
        int n4 = 1;
        if (n3 != n4) {
            object = zzix.zzb((zzix)object);
            zzgp.zzc("Unexpected state - container loading already initiated.", (Context)object);
            return;
        }
        zzix.zzl((zzix)object, 2);
        object = this.zzc;
        string2 = this.zza;
        String string3 = this.zzb;
        zzjg zzjg2 = zzix.zzg((zzix)object);
        zziv zziv2 = new zziv((zzix)object, null);
        zzjg2.zzc(string2, string3, null, zziv2);
    }
}

