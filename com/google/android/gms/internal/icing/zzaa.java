/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.gms.internal.icing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.icing.zza;
import com.google.android.gms.internal.icing.zzac;
import com.google.android.gms.internal.icing.zzc;
import com.google.android.gms.internal.icing.zzx;

public final class zzaa
extends zza
implements IInterface {
    public zzaa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    }

    public final void zzd(zzac zzac2, String string2, zzx[] zzxArray) {
        string2 = this.zza();
        zzc.zzc((Parcel)string2, zzac2);
        string2.writeString(null);
        string2.writeTypedArray((Parcelable[])zzxArray, 0);
        this.zzc(1, (Parcel)string2);
    }

    public final void zze(zzac zzac2, com.google.firebase.appindexing.internal.zzc[] zzcArray) {
        Parcel parcel = this.zza();
        zzc.zzc(parcel, zzac2);
        parcel.writeTypedArray((Parcelable[])zzcArray, 0);
        this.zzc(7, parcel);
    }
}

