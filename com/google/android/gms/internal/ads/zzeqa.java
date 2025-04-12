/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzeqb;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeqa
implements zzexw {
    private final Context zza;

    public zzeqa(Context context) {
        this.zza = context;
    }

    public final int zza() {
        return 2;
    }

    /*
     * WARNING - void declaration
     */
    public final ListenableFuture zzb() {
        Object object = zzbep.zzcR;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean n3 = (Boolean)object;
        if (n3) {
            void var3_7;
            object = this.zza;
            String string2 = "com.google.android.gms.permission.AD_ID";
            int n4 = t70.checkSelfPermission((Context)object, string2);
            if (n4 == 0) {
                boolean bl2 = true;
            } else {
                boolean bl3 = false;
                object = null;
            }
            object2 = new zzeqb((boolean)var3_7);
            return zzgft.zzh(object2);
        }
        return zzgft.zzh(null);
    }
}

