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
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbrm;
import com.google.android.gms.internal.ads.zzbro;

public abstract class zzbrn
extends zzbae
implements zzbro {
    public zzbrn() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzbro zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        boolean bl2 = iInterface instanceof zzbro;
        if (bl2) {
            return (zzbro)iInterface;
        }
        iInterface = new zzbrm(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 != n7) {
            n4 = 2;
            if (n3 != n4) {
                return false;
            }
            n3 = (int)(this.zzf() ? 1 : 0);
            parcel2.writeNoException();
            n4 = zzbaf.zza;
            parcel2.writeInt(n3);
        } else {
            IObjectWrapper iObjectWrapper = this.zze();
            parcel2.writeNoException();
            zzbaf.zzf(parcel2, iObjectWrapper);
        }
        return n7;
    }
}

