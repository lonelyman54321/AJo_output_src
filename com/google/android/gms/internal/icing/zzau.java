/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.icing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.icing.zza;
import com.google.android.gms.internal.icing.zzat;
import com.google.android.gms.internal.icing.zzc;

public final class zzau
extends zza
implements IInterface {
    public zzau(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.internal.ISearchAuthService");
    }

    public final void zzd(zzat zzat2, String string2, String string3) {
        Parcel parcel = this.zza();
        zzc.zzc(parcel, zzat2);
        parcel.writeString(string2);
        parcel.writeString(string3);
        this.zzc(1, parcel);
    }

    public final void zze(zzat zzat2, String string2, String string3) {
        Parcel parcel = this.zza();
        zzc.zzc(parcel, zzat2);
        parcel.writeString(string2);
        parcel.writeString(string3);
        this.zzc(2, parcel);
    }
}

