/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbnn;
import com.google.android.gms.internal.ads.zzbns;
import com.google.android.gms.internal.ads.zzbnu;
import java.util.List;

public abstract class zzbnt
extends zzbae
implements zzbnu {
    public zzbnt() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static zzbnu zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        boolean bl2 = iInterface instanceof zzbnu;
        if (bl2) {
            return (zzbnu)iInterface;
        }
        iInterface = new zzbns(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 == n4) {
            Object object = zzbnn.CREATOR;
            object = parcel.createTypedArrayList(object);
            zzbaf.zzc(parcel);
            this.zzb((List)object);
            parcel2.writeNoException();
            return n4 != 0;
        }
        return false;
    }
}

