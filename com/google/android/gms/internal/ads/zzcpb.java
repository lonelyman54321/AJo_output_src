/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

public final class zzcpb
implements zzgfa {
    public final ListenableFuture zza(Object object) {
        object = (Throwable)object;
        Object object2 = zzbep.zzku;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = "GetTopicsApiWithRecordObservationActionHandlerUnsampled";
            object3 = zzu.zzo();
            ((zzcby)object3).zzx((Throwable)object, (String)object2);
        } else {
            object2 = "GetTopicsApiWithRecordObservationActionHandler";
            object3 = zzu.zzo();
            ((zzcby)object3).zzv((Throwable)object, (String)object2);
        }
        object2 = zzgbc.zzm();
        object = new nz0_0((List)object2);
        return zzgft.zzh(object);
    }
}

