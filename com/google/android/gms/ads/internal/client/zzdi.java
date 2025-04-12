/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;

public abstract class zzdi
extends zzbae
implements zzdj {
    public zzdi() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 == n4) {
            String string2 = parcel.readString();
            IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
            IObjectWrapper iObjectWrapper2 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
            zzbaf.zzc(parcel);
            this.zze(string2, iObjectWrapper, iObjectWrapper2);
            parcel2.writeNoException();
            return n4 != 0;
        }
        return false;
    }
}

