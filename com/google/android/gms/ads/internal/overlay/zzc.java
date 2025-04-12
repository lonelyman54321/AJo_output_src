/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.overlay.zzb;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzc
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final Intent zzh;
    public final zzy zzi;
    public final boolean zzj;

    static {
        zzb zzb2 = new zzb();
        CREATOR = zzb2;
    }

    public zzc(Intent intent, zzy zzy2) {
        IBinder iBinder = ObjectWrapper.wrap(zzy2).asBinder();
        this(null, null, null, null, null, null, null, intent, iBinder, false);
    }

    public zzc(String object, String string2, String string3, String string4, String string5, String string6, String string7, Intent intent, IBinder iBinder, boolean bl2) {
        this.zza = object;
        this.zzb = string2;
        this.zzc = string3;
        this.zzd = string4;
        this.zze = string5;
        this.zzf = string6;
        this.zzg = string7;
        this.zzh = intent;
        this.zzi = object = (zzy)ObjectWrapper.unwrap(IObjectWrapper$Stub.asInterface(iBinder));
        this.zzj = bl2;
    }

    public zzc(String string2, String string3, String string4, String string5, String string6, String string7, String string8, zzy zzy2) {
        IBinder iBinder = ObjectWrapper.wrap(zzy2).asBinder();
        this(string2, string3, string4, string5, string6, string7, string8, null, iBinder, false);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        String string3 = this.zzb;
        SafeParcelWriter.writeString(parcel, 3, string3, false);
        string3 = this.zzc;
        SafeParcelWriter.writeString(parcel, 4, string3, false);
        string3 = this.zzd;
        SafeParcelWriter.writeString(parcel, 5, string3, false);
        string3 = this.zze;
        SafeParcelWriter.writeString(parcel, 6, string3, false);
        string3 = this.zzf;
        SafeParcelWriter.writeString(parcel, 7, string3, false);
        string3 = this.zzg;
        SafeParcelWriter.writeString(parcel, 8, string3, false);
        string3 = this.zzh;
        SafeParcelWriter.writeParcelable(parcel, 9, (Parcelable)string3, n3, false);
        IBinder iBinder = ObjectWrapper.wrap(this.zzi).asBinder();
        SafeParcelWriter.writeIBinder(parcel, 10, iBinder, false);
        boolean bl2 = this.zzj;
        SafeParcelWriter.writeBoolean(parcel, 11, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

