/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzdxf;

public final class zzdwv
implements Runnable {
    public final /* synthetic */ zzdxf zza;
    public final /* synthetic */ zzccn zzb;

    public /* synthetic */ zzdwv(zzdxf zzdxf2, zzccn zzccn2) {
        this.zza = zzdxf2;
        this.zzb = zzccn2;
    }

    public final void run() {
        Object object = zzu.zzo().zzi().zzh().zzc();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        zzccn zzccn2 = this.zzb;
        if (!bl2) {
            zzccn2.zzc(object);
            return;
        }
        object = new Exception();
        zzccn2.zzd((Throwable)object);
    }
}

