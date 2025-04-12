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
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.ICancelToken$Stub;
import com.google.android.gms.internal.plus.zza;
import com.google.android.gms.internal.plus.zzc;
import com.google.android.gms.plus.internal.zzb;
import com.google.android.gms.plus.internal.zzf;
import java.util.List;

public final class zzg
extends zza
implements zzf {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.plus.internal.IPlusService");
    }

    public final String getAccountName() {
        Parcel parcel = this.obtainAndWriteInterfaceToken();
        parcel = this.transactAndReadException(5, parcel);
        String string2 = parcel.readString();
        parcel.recycle();
        return string2;
    }

    public final ICancelToken zza(zzb zzb2, int n3, int n4, int n7, String string2) {
        Parcel parcel = this.obtainAndWriteInterfaceToken();
        zzc.zza(parcel, zzb2);
        parcel.writeInt(n3);
        parcel.writeInt(n4);
        parcel.writeInt(-1);
        parcel.writeString(string2);
        zzb2 = this.transactAndReadException(16, parcel);
        ICancelToken iCancelToken = ICancelToken$Stub.asInterface(zzb2.readStrongBinder());
        zzb2.recycle();
        return iCancelToken;
    }

    public final void zza() {
        Parcel parcel = this.obtainAndWriteInterfaceToken();
        this.transactAndReadExceptionReturnVoid(6, parcel);
    }

    public final void zza(zzb zzb2) {
        Parcel parcel = this.obtainAndWriteInterfaceToken();
        zzc.zza(parcel, zzb2);
        this.transactAndReadExceptionReturnVoid(19, parcel);
    }

    public final void zza(zzb zzb2, List list) {
        Parcel parcel = this.obtainAndWriteInterfaceToken();
        zzc.zza(parcel, zzb2);
        parcel.writeStringList(list);
        this.transactAndReadExceptionReturnVoid(34, parcel);
    }
}

