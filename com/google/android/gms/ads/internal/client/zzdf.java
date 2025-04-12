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
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;

public abstract class zzdf
extends zzbae
implements zzdg {
    public zzdf() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        boolean bl2 = iInterface instanceof zzdg;
        if (bl2) {
            return (zzdg)iInterface;
        }
        iInterface = new zzde(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                return false;
            }
            n3 = (int)(this.zzf() ? 1 : 0);
            parcel2.writeNoException();
            n7 = zzbaf.zza;
            parcel2.writeInt(n3);
        } else {
            Object object = zzs.CREATOR;
            object = (zzs)zzbaf.zza(parcel, object);
            zzbaf.zzc(parcel);
            this.zze((zzs)object);
            parcel2.writeNoException();
        }
        return n4 != 0;
    }
}

