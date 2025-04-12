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
import com.google.android.gms.internal.ads.zzbnp;
import com.google.android.gms.internal.ads.zzbnr;

public abstract class zzbnq
extends zzbae
implements zzbnr {
    public zzbnq() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzbnr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        boolean bl2 = iInterface instanceof zzbnr;
        if (bl2) {
            return (zzbnr)iInterface;
        }
        iInterface = new zzbnp(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 2;
        if (n3 != n4) {
            n4 = 3;
            if (n3 != n4) {
                return false;
            }
            String string2 = parcel.readString();
            zzbaf.zzc(parcel);
            this.zze(string2);
        } else {
            this.zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}

