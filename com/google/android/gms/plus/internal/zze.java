/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.plus.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.plus.zza;
import com.google.android.gms.internal.plus.zzc;
import com.google.android.gms.plus.internal.zzd;

public final class zze
extends zza
implements zzd {
    public zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.plus.internal.IPlusOneButtonCreator");
    }

    public final IObjectWrapper zza(IObjectWrapper iObjectWrapper, int n3, int n4, String string2, int n7) {
        Parcel parcel = this.obtainAndWriteInterfaceToken();
        zzc.zza(parcel, iObjectWrapper);
        parcel.writeInt(n3);
        parcel.writeInt(n4);
        parcel.writeString(string2);
        parcel.writeInt(n7);
        return ak3_1.a(this.transactAndReadException(1, parcel));
    }
}

