/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public abstract class zzz
extends zzb
implements zzaa {
    public zzz() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static zzaa zzg(IBinder iBinder) {
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        boolean bl2 = iInterface instanceof zzaa;
        if (bl2) {
            return (zzaa)iInterface;
        }
        iInterface = new zzy(iBinder);
        return iInterface;
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 != n7) {
            n4 = 2;
            if (n3 != n4) {
                return false;
            }
            n3 = this.zzc();
            parcel2.writeNoException();
            parcel2.writeInt(n3);
        } else {
            IObjectWrapper iObjectWrapper = this.zzd();
            parcel2.writeNoException();
            zzc.zze(parcel2, iObjectWrapper);
        }
        return n7;
    }
}

