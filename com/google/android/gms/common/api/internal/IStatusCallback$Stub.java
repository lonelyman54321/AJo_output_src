/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.zaby;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public abstract class IStatusCallback$Stub
extends zab
implements IStatusCallback {
    public IStatusCallback$Stub() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    public static IStatusCallback asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
        boolean bl2 = iInterface instanceof IStatusCallback;
        if (bl2) {
            return (IStatusCallback)iInterface;
        }
        iInterface = new zaby(iBinder);
        return iInterface;
    }

    public final boolean zaa(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 == n7) {
            Object object = Status.CREATOR;
            object = (Status)zac.zaa(parcel, object);
            zac.zab(parcel);
            this.onResult((Status)object);
            return n7;
        }
        return false;
    }
}

