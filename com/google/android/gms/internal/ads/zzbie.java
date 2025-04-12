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
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzbif;

public abstract class zzbie
extends zzbae
implements zzbif {
    public zzbie() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzbif zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        boolean bl2 = iInterface instanceof zzbif;
        if (bl2) {
            return (zzbif)iInterface;
        }
        iInterface = new zzbid(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    return false;
                }
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzb(iObjectWrapper);
            } else {
                this.zzd();
            }
        } else {
            IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
            zzbaf.zzc(parcel);
            this.zzc(iObjectWrapper);
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}

