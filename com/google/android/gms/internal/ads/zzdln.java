/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzdlo;
import com.google.android.gms.internal.ads.zzgfp;

final class zzdln
implements zzgfp {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdlo zzb;

    public zzdln(zzdlo zzdlo2, View view) {
        this.zza = view;
        this.zzb = zzdlo2;
    }

    public final void zza(Throwable throwable) {
        Object object = zzbep.zzfj;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = "omid native display exp";
            object2 = zzu.zzo();
            ((zzcby)object2).zzv(throwable, (String)object);
        }
    }
}

