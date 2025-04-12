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
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.internal.ads.zzbae;

public abstract class zzcr
extends zzbae
implements zzcs {
    public zzcr() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    public static zzcs zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        boolean bl2 = iInterface instanceof zzcs;
        if (bl2) {
            return (zzcs)iInterface;
        }
        iInterface = new zzcq(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 == n7) {
            this.zze();
            parcel2.writeNoException();
            return n7;
        }
        return false;
    }
}

