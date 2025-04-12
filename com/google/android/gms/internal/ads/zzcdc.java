/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcdi;

final class zzcdc
implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcdi zzc;

    public zzcdc(zzcdi zzcdi2, String string2, String string3) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = zzcdi2;
    }

    public final void run() {
        Object object = this.zzc;
        Object object2 = zzcdi.zzi((zzcdi)object);
        if (object2 != null) {
            object2 = this.zza;
            String string2 = this.zzb;
            object = zzcdi.zzi((zzcdi)object);
            object.zzb((String)object2, string2);
        }
    }
}

