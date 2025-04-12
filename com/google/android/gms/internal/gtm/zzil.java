/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.gtm.zzgp;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzim;
import com.google.android.gms.internal.gtm.zzix;

final class zzil
implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzim zzf;
    private boolean zzg = false;

    public zzil(zzim zzim2, String string2, Bundle bundle, String string3, long l2, String string4) {
        this.zza = string2;
        this.zzb = bundle;
        this.zzc = string3;
        this.zzd = l2;
        this.zze = string4;
        this.zzf = zzim2;
    }

    public final void run() {
        int n3;
        int n4;
        Object object = this.zzf.zza;
        int n7 = zzix.zza((zzix)object);
        if (n7 == (n4 = 3)) {
            String string2 = this.zza;
            Bundle bundle = this.zzb;
            String string3 = this.zzc;
            long l2 = this.zzd;
            zzix.zzg((zzix)object).zzb(string2, bundle, string3, l2, false);
            return;
        }
        n7 = zzix.zza((zzix)object);
        String string4 = ".";
        String string5 = ", params = ";
        String string6 = ", origin = ";
        int n8 = 1;
        if (n7 != n8 && (n7 = zzix.zza((zzix)object)) != (n3 = 2)) {
            n7 = zzix.zza((zzix)object);
            if (n7 == (n8 = 4)) {
                object = this.zza;
                String string7 = this.zze;
                Bundle bundle = this.zzb;
                object = og_1.a("Container failed to load: skipping event listener by ignoring the event: name = ", (String)object, string6, string7, string5);
                ((StringBuilder)object).append(bundle);
                ((StringBuilder)object).append(string4);
                zzhi.zzd(((StringBuilder)object).toString());
                return;
            }
            object = hj0_0.a(zzix.zza((zzix)object), "Unexpected state:");
            Context context = zzix.zzb(this.zzf.zza);
            zzgp.zzc((String)object, context);
            return;
        }
        boolean bl2 = this.zzg;
        if (!bl2) {
            object = this.zza;
            String string8 = this.zze;
            Bundle bundle = this.zzb;
            object = og_1.a("Container not loaded yet: deferring event listener by enqueuing the event: name = ", (String)object, string6, string8, string5);
            ((StringBuilder)object).append(bundle);
            ((StringBuilder)object).append(string4);
            zzhi.zzd(((StringBuilder)object).toString());
            this.zzg = n8;
            zzix.zzi(this.zzf.zza).add(this);
            return;
        }
        zzhi.zze("Invalid state - not expecting to see a deferred event during container loading.");
    }
}

