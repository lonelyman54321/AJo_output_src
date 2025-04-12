/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzbx
extends Binder
implements IInterface {
    public zzbx(String string2) {
        this.attachInterface(this, string2);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 0xFFFFFF;
        if (n3 > n7) {
            n7 = (int)(super.onTransact(n3, parcel, parcel2, n4) ? 1 : 0);
        } else {
            String string2 = this.getInterfaceDescriptor();
            parcel.enforceInterface(string2);
            n7 = 0;
            string2 = null;
        }
        if (n7 != 0) {
            return true;
        }
        return this.zza(n3, parcel, parcel2, n4);
    }

    public boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        return false;
    }
}

