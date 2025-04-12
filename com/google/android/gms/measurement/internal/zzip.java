/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzig;
import com.google.android.gms.measurement.internal.zzlw;
import com.google.android.gms.measurement.internal.zzou;

final class zzip
implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzig zze;

    public zzip(zzig zzig2, String string2, String string3, String string4, long l2) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = string4;
        this.zzd = l2;
        this.zze = zzig2;
    }

    public final void run() {
        Object object = this.zza;
        if (object == null) {
            object = zzig.zza(this.zze);
            String string2 = this.zzb;
            ((zzou)object).zza(string2, (zzlw)null);
            return;
        }
        String string3 = this.zzc;
        long l2 = this.zzd;
        zzlw zzlw2 = new zzlw(string3, (String)object, l2);
        object = zzig.zza(this.zze);
        string3 = this.zzb;
        ((zzou)object).zza(string3, zzlw2);
    }
}

