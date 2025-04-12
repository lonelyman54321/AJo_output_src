/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public abstract class IAccountAccessor$Stub
extends zzb
implements IAccountAccessor {
    public IAccountAccessor$Stub() {
        super("com.google.android.gms.common.internal.IAccountAccessor");
    }

    public static IAccountAccessor asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        boolean bl2 = iInterface instanceof IAccountAccessor;
        if (bl2) {
            return (IAccountAccessor)iInterface;
        }
        iInterface = new zzw(iBinder);
        return iInterface;
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 2;
        if (n3 == n7) {
            Account account = this.zzb();
            parcel2.writeNoException();
            zzc.zzd(parcel2, (Parcelable)account);
            return true;
        }
        return false;
    }
}

