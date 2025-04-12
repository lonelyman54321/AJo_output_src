/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.a.b;
import com.google.android.a.c;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService$Stub$Proxy;

public abstract class IGetInstallReferrerService$Stub
extends b
implements IGetInstallReferrerService {
    public static IGetInstallReferrerService b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        boolean bl2 = iInterface instanceof IGetInstallReferrerService;
        if (bl2) {
            return (IGetInstallReferrerService)iInterface;
        }
        iInterface = new IGetInstallReferrerService$Stub$Proxy(iBinder);
        return iInterface;
    }

    public final boolean a(int n3, Parcel parcel, Parcel parcel2) {
        int n4 = 1;
        if (n3 == n4) {
            Parcelable.Creator creator = Bundle.CREATOR;
            creator = (Bundle)c.a(parcel, creator);
            creator = this.c((Bundle)creator);
            parcel2.writeNoException();
            c.c(parcel2, (Parcelable)creator);
            return n4;
        }
        return false;
    }
}

