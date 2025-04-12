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
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.internal.ads.zzbae;

public abstract class zzcv
extends zzbae
implements zzcw {
    public zzcv() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static zzcw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        boolean bl2 = iInterface instanceof zzcw;
        if (bl2) {
            return (zzcw)iInterface;
        }
        iInterface = new zzcu(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 != n7) {
            n4 = 2;
            if (n3 != n4) {
                return false;
            }
            String string2 = this.zzf();
            parcel2.writeNoException();
            parcel2.writeString(string2);
        } else {
            String string3 = this.zze();
            parcel2.writeNoException();
            parcel2.writeString(string3);
        }
        return n7;
    }
}

