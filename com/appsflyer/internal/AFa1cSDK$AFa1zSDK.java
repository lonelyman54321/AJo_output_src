/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.appsflyer.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

final class AFa1cSDK$AFa1zSDK
implements IInterface {
    private final IBinder getCurrencyIso4217Code;

    public AFa1cSDK$AFa1zSDK(IBinder iBinder) {
        this.getCurrencyIso4217Code = iBinder;
    }

    public final IBinder asBinder() {
        return this.getCurrencyIso4217Code;
    }

    public final String getCurrencyIso4217Code() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
        try {
            parcel.writeInterfaceToken(string2);
            string2 = this.getCurrencyIso4217Code;
            int n3 = 1;
            string2.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            string2 = parcel2.readString();
            return string2;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public final boolean getMediationNetwork() {
        boolean bl2;
        Parcel parcel;
        Parcel parcel2;
        block4: {
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            String string2 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
            try {
                parcel2.writeInterfaceToken(string2);
                bl2 = true;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            parcel2.writeInt((int)(bl2 ? 1 : 0));
            IBinder iBinder = this.getCurrencyIso4217Code;
            int n3 = 2;
            iBinder.transact(n3, parcel2, parcel, 0);
            parcel.readException();
            int n4 = parcel.readInt();
            if (n4 != 0) break block4;
            bl2 = false;
            string2 = null;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl2;
    }
}

