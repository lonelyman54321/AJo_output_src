/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzbmu;
import com.google.android.gms.internal.ads.zzbrf;

public final class zzbms
extends zzbad
implements zzbmu {
    public zzbms(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    public final zzbmr zze(IObjectWrapper iObjectWrapper, zzbrf object, int n3, zzbmo zzbmo2) {
        Object object2 = this.zza();
        zzbaf.zzf(object2, iObjectWrapper);
        zzbaf.zzf(object2, object);
        object2.writeInt(241806000);
        zzbaf.zzf(object2, zzbmo2);
        int n4 = 1;
        iObjectWrapper = this.zzdb(n4, (Parcel)object2);
        object = iObjectWrapper.readStrongBinder();
        if (object == null) {
            object = null;
        } else {
            object2 = object.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            boolean bl2 = object2 instanceof zzbmr;
            if (bl2) {
                object = object2;
                object = (zzbmr)object2;
            } else {
                object2 = new zzbmp((IBinder)object);
                object = object2;
            }
        }
        iObjectWrapper.recycle();
        return object;
    }
}

