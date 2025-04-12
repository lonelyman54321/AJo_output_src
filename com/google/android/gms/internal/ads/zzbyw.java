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
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzbyx;

public abstract class zzbyw
extends zzbae
implements zzbyx {
    public zzbyw() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static zzbyx zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        boolean bl2 = iInterface instanceof zzbyx;
        if (bl2) {
            return (zzbyx)iInterface;
        }
        iInterface = new zzbyv(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 != n7) {
            n4 = 2;
            if (n3 != n4) {
                return false;
            }
            n3 = this.zze();
            parcel2.writeNoException();
            parcel2.writeInt(n3);
        } else {
            String string2 = this.zzf();
            parcel2.writeNoException();
            parcel2.writeString(string2);
        }
        return n7;
    }
}

