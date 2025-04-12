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
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.common.zzb;

public abstract class ICancelToken$Stub
extends zzb
implements ICancelToken {
    public ICancelToken$Stub() {
        super("com.google.android.gms.common.internal.ICancelToken");
    }

    public static ICancelToken asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
        boolean bl2 = iInterface instanceof ICancelToken;
        if (bl2) {
            return (ICancelToken)iInterface;
        }
        iInterface = new zzx(iBinder);
        return iInterface;
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 2;
        if (n3 == n7) {
            this.cancel();
            return true;
        }
        return false;
    }
}

