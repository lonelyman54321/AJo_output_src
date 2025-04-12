/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.tagmanager;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.gtm.zzas;
import com.google.android.gms.internal.gtm.zzat;
import com.google.android.gms.tagmanager.zzbz;
import com.google.android.gms.tagmanager.zzcb;
import com.google.android.gms.tagmanager.zzci;
import com.google.android.gms.tagmanager.zzck;
import com.google.android.gms.tagmanager.zzco;
import com.google.android.gms.tagmanager.zzcq;

public abstract class zzcp
extends zzas
implements zzcq {
    public zzcp() {
        super("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
    }

    public static zzcq asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
        boolean bl2 = iInterface instanceof zzcq;
        if (bl2) {
            return (zzcq)iInterface;
        }
        iInterface = new zzco(iBinder);
        return iInterface;
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 == n4) {
            Object object;
            boolean bl2;
            Object object2 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
            IBinder iBinder = parcel.readStrongBinder();
            IInterface iInterface = null;
            object = iBinder == null ? null : ((bl2 = (object = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementProxy")) instanceof zzck) ? (zzck)object : new zzci(iBinder));
            iBinder = parcel.readStrongBinder();
            if (iBinder != null) {
                iInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
                bl2 = iInterface instanceof zzcb;
                iInterface = bl2 ? (zzcb)iInterface : new zzbz(iBinder);
            }
            zzat.zzc(parcel);
            object2 = this.getService((IObjectWrapper)object2, (zzck)object, (zzcb)iInterface);
            parcel2.writeNoException();
            zzat.zze(parcel2, object2);
            return n4 != 0;
        }
        return false;
    }
}

