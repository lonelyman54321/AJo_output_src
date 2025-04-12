/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.zzp;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzo
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final Context zzd;
    private final boolean zze;
    private final boolean zzf;

    static {
        zzp zzp2 = new zzp();
        CREATOR = zzp2;
    }

    public zzo(String string2, boolean bl2, boolean bl3, IBinder iBinder, boolean bl4, boolean bl5) {
        this.zza = string2;
        this.zzb = bl2;
        this.zzc = bl3;
        string2 = (Context)ObjectWrapper.unwrap(IObjectWrapper$Stub.asInterface(iBinder));
        this.zzd = string2;
        this.zze = bl4;
        this.zzf = bl5;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, (String)object, false);
        boolean bl2 = this.zzb;
        SafeParcelWriter.writeBoolean(parcel, 2, bl2);
        bl2 = this.zzc;
        SafeParcelWriter.writeBoolean(parcel, 3, bl2);
        object = ObjectWrapper.wrap(this.zzd);
        SafeParcelWriter.writeIBinder(parcel, 4, (IBinder)object, false);
        bl2 = this.zze;
        SafeParcelWriter.writeBoolean(parcel, 5, bl2);
        bl2 = this.zzf;
        SafeParcelWriter.writeBoolean(parcel, 6, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

