/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbrf;

public final class zzdk
extends zzbad
implements IInterface {
    public zzdk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final zzdj zze(IObjectWrapper iObjectWrapper, zzbrf object, int n3) {
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
            object2 = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            boolean bl2 = object2 instanceof zzdj;
            if (bl2) {
                object = object2;
                object = (zzdj)object2;
            } else {
                object2 = new zzdh((IBinder)object);
                object = object2;
            }
        }
        iObjectWrapper.recycle();
        return object;
    }
}

