/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.zzg;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.internal.ads.zzbda;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbyf;

public final class zzbcx
extends zzc {
    public zzbcx(Context context, Looper looper, BaseGmsClient$BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks, BaseGmsClient$BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener) {
        Context context2 = zzbyf.zza(context);
        super(context2, looper, 123, baseGmsClient$BaseConnectionCallbacks, baseGmsClient$BaseOnConnectionFailedListener, null);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
            boolean bl2 = iInterface instanceof zzbda;
            if (bl2) {
                object = iInterface;
                object = (zzbda)iInterface;
            } else {
                iInterface = new zzbda((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }

    public final Feature[] getApiFeatures() {
        return zzg.zzb;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean zzp() {
        boolean bl2;
        Object[] objectArray = this.getAvailableFeatures();
        Object object = zzbep.zzbR;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl3 = (Boolean)object;
        return bl3 && (bl2 = ArrayUtils.contains(objectArray, object = zzg.zza));
    }

    public final zzbda zzq() {
        return (zzbda)this.getService();
    }
}

