/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;

public final class zzy
extends zza
implements zzaa {
    public zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final int zzc() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzB(2, parcel);
        int n3 = parcel2.readInt();
        parcel2.recycle();
        return n3;
    }

    public final IObjectWrapper zzd() {
        Parcel parcel = this.zza();
        return ak3_1.a(this.zzB(1, parcel));
    }
}

