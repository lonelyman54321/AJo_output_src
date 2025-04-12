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
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;

public abstract class zzca
extends zzbae
implements zzcb {
    public zzca() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static zzcb zzd(IBinder iBinder) {
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        boolean bl2 = iInterface instanceof zzcb;
        if (bl2) {
            return (zzcb)iInterface;
        }
        iInterface = new zzbz(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 == n4) {
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            zzbaf.zzc(parcel);
            this.zzc(string2, string3);
            parcel2.writeNoException();
            return n4 != 0;
        }
        return false;
    }
}

