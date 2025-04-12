/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.a.a;
import com.google.android.a.c;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

public class IGetInstallReferrerService$Stub$Proxy
extends a
implements IGetInstallReferrerService {
    public IGetInstallReferrerService$Stub$Proxy(IBinder iBinder) {
        super(iBinder);
    }

    public final Bundle c(Bundle bundle) {
        Parcel parcel = this.a();
        c.b(parcel, (Parcelable)bundle);
        bundle = this.b(parcel);
        parcel = Bundle.CREATOR;
        parcel = (Bundle)c.a((Parcel)bundle, (Parcelable.Creator)parcel);
        bundle.recycle();
        return parcel;
    }
}

