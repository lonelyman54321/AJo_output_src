/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.play.core.assetpacks.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a
implements IInterface {
    private final IBinder a;
    private final String b;

    public a(IBinder iBinder, String string2) {
        this.a = iBinder;
        this.b = string2;
    }

    public final Parcel a() {
        Parcel parcel = Parcel.obtain();
        String string2 = this.b;
        parcel.writeInterfaceToken(string2);
        return parcel;
    }

    public final IBinder asBinder() {
        return this.a;
    }

    public final void b(int n3, Parcel parcel) {
        try {
            IBinder iBinder = this.a;
            int n4 = 1;
            iBinder.transact(n3, parcel, null, n4);
            return;
        }
        finally {
            parcel.recycle();
        }
    }
}

