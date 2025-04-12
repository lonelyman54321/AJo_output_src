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
import com.google.android.gms.internal.ads.zzbmm;
import com.google.android.gms.internal.ads.zzbmo;

public abstract class zzbmn
extends zzbae
implements zzbmo {
    public zzbmn() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    public static zzbmo zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        boolean bl2 = iInterface instanceof zzbmo;
        if (bl2) {
            return (zzbmo)iInterface;
        }
        iInterface = new zzbmm(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 == n4) {
            String string2 = parcel.readString();
            zzbaf.zzc(parcel);
            this.zzb(string2);
            parcel2.writeNoException();
            return n4 != 0;
        }
        return false;
    }
}

