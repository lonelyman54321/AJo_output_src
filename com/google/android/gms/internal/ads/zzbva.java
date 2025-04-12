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
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbux;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbvc;

public final class zzbva
extends zzbad
implements zzbvc {
    public zzbva(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    public final zzbuz zze(IObjectWrapper iObjectWrapper, zzbrf object, int n3) {
        Object object2 = this.zza();
        zzbaf.zzf(object2, iObjectWrapper);
        zzbaf.zzf(object2, object);
        object2.writeInt(241806000);
        int n4 = 1;
        iObjectWrapper = this.zzdb(n4, (Parcel)object2);
        object = iObjectWrapper.readStrongBinder();
        if (object == null) {
            object = null;
        } else {
            object2 = object.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            boolean bl2 = object2 instanceof zzbuz;
            if (bl2) {
                object = object2;
                object = (zzbuz)object2;
            } else {
                object2 = new zzbux((IBinder)object);
                object = object2;
            }
        }
        iObjectWrapper.recycle();
        return object;
    }
}

