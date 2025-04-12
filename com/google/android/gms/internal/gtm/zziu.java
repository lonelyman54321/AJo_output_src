/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zziv;
import com.google.android.gms.internal.gtm.zzix;

final class zziu
implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zziv zzc;

    public zziu(zziv zziv2, boolean bl2, String string2) {
        this.zza = bl2;
        this.zzb = string2;
        this.zzc = zziv2;
    }

    public final void run() {
        int n3;
        Object object = this.zzc.zza;
        int n4 = zzix.zza((zzix)object);
        if (n4 == (n3 = 2)) {
            boolean bl2;
            Object object2;
            n4 = (int)(this.zza ? 1 : 0);
            if (n4 != 0) {
                n4 = 3;
                zzix.zzl((zzix)object, n4);
                object = this.zzb;
                String string2 = "Container ";
                object2 = new StringBuilder(string2);
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(" loaded.");
                object = ((StringBuilder)object2).toString();
                zzhi.zzd((String)object);
            } else {
                n4 = 4;
                zzix.zzl((zzix)object, n4);
                object = String.valueOf(this.zzb);
                object2 = "Error loading container:";
                object = ((String)object2).concat((String)object);
                zzhi.zza((String)object);
            }
            while (!(bl2 = (object = zzix.zzi(this.zzc.zza)).isEmpty())) {
                object = this.zzc.zza;
                object2 = zzix.zzj((zzix)object);
                object = (Runnable)zzix.zzi((zzix)object).remove();
                object2.execute((Runnable)object);
            }
            return;
        }
        zzhi.zze("Container load callback completed after timeout");
    }
}

