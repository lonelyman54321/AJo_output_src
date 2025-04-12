/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzap;
import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzfz;
import com.google.android.gms.measurement.internal.zzga;
import com.google.android.gms.measurement.internal.zzgf;
import com.google.android.gms.measurement.internal.zzog;
import com.google.android.gms.measurement.internal.zzop;
import com.google.android.gms.measurement.internal.zzp;
import com.google.android.gms.measurement.internal.zzpm;
import java.util.List;

public final class zzgb
extends zzbu
implements zzfz {
    public zzgb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final zzap zza(zzp zzp2) {
        Object object = this.b_();
        zzbw.zza(object, zzp2);
        zzp2 = this.zza(21, (Parcel)object);
        object = zzap.CREATOR;
        object = (zzap)zzbw.zza((Parcel)zzp2, (Parcelable.Creator)object);
        zzp2.recycle();
        return object;
    }

    public final List zza(zzp zzp2, Bundle object) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzp2);
        zzbw.zza(parcel, (Parcelable)object);
        zzp2 = this.zza(24, parcel);
        object = zzog.CREATOR;
        object = zzp2.createTypedArrayList((Parcelable.Creator)object);
        zzp2.recycle();
        return object;
    }

    public final List zza(zzp zzp2, boolean bl2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzp2);
        zzbw.zza(parcel, bl2);
        zzp2 = this.zza(7, parcel);
        Object object = zzpm.CREATOR;
        object = zzp2.createTypedArrayList((Parcelable.Creator)object);
        zzp2.recycle();
        return object;
    }

    public final List zza(String string2, String object, zzp zzp2) {
        Parcel parcel = this.b_();
        parcel.writeString(string2);
        parcel.writeString((String)object);
        zzbw.zza(parcel, zzp2);
        string2 = this.zza(16, parcel);
        object = zzag.CREATOR;
        object = string2.createTypedArrayList((Parcelable.Creator)object);
        string2.recycle();
        return object;
    }

    public final List zza(String string2, String object, String string3) {
        Parcel parcel = this.b_();
        parcel.writeString(string2);
        parcel.writeString((String)object);
        parcel.writeString(string3);
        string2 = this.zza(17, parcel);
        object = zzag.CREATOR;
        object = string2.createTypedArrayList((Parcelable.Creator)object);
        string2.recycle();
        return object;
    }

    public final List zza(String string2, String object, String string3, boolean bl2) {
        Parcel parcel = this.b_();
        parcel.writeString(string2);
        parcel.writeString((String)object);
        parcel.writeString(string3);
        zzbw.zza(parcel, bl2);
        string2 = this.zza(15, parcel);
        object = zzpm.CREATOR;
        object = string2.createTypedArrayList((Parcelable.Creator)object);
        string2.recycle();
        return object;
    }

    public final List zza(String string2, String object, boolean bl2, zzp zzp2) {
        Parcel parcel = this.b_();
        parcel.writeString(string2);
        parcel.writeString((String)object);
        zzbw.zza(parcel, bl2);
        zzbw.zza(parcel, zzp2);
        string2 = this.zza(14, parcel);
        object = zzpm.CREATOR;
        object = string2.createTypedArrayList((Parcelable.Creator)object);
        string2.recycle();
        return object;
    }

    public final void zza(long l2, String string2, String string3, String string4) {
        Parcel parcel = this.b_();
        parcel.writeLong(l2);
        parcel.writeString(string2);
        parcel.writeString(string3);
        parcel.writeString(string4);
        this.zzb(10, parcel);
    }

    public final void zza(Bundle bundle, zzp zzp2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, (Parcelable)bundle);
        zzbw.zza(parcel, zzp2);
        this.zzb(19, parcel);
    }

    public final void zza(zzag zzag2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzag2);
        this.zzb(13, parcel);
    }

    public final void zza(zzag zzag2, zzp zzp2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzag2);
        zzbw.zza(parcel, zzp2);
        this.zzb(12, parcel);
    }

    public final void zza(zzbl zzbl2, zzp zzp2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzbl2);
        zzbw.zza(parcel, zzp2);
        this.zzb(1, parcel);
    }

    public final void zza(zzbl zzbl2, String string2, String string3) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzbl2);
        parcel.writeString(string2);
        parcel.writeString(string3);
        this.zzb(5, parcel);
    }

    public final void zza(zzp zzp2, Bundle bundle, zzga zzga2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzp2);
        zzbw.zza(parcel, (Parcelable)bundle);
        zzbw.zza(parcel, zzga2);
        this.zzb(31, parcel);
    }

    public final void zza(zzp zzp2, zzae zzae2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzp2);
        zzbw.zza(parcel, zzae2);
        this.zzb(30, parcel);
    }

    public final void zza(zzp zzp2, zzop zzop2, zzgf zzgf2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzp2);
        zzbw.zza(parcel, zzop2);
        zzbw.zza(parcel, zzgf2);
        this.zzb(29, parcel);
    }

    public final void zza(zzpm zzpm2, zzp zzp2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzpm2);
        zzbw.zza(parcel, zzp2);
        this.zzb(2, parcel);
    }

    public final byte[] zza(zzbl zzbl2, String object) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzbl2);
        parcel.writeString((String)object);
        zzbl2 = this.zza(9, parcel);
        object = zzbl2.createByteArray();
        zzbl2.recycle();
        return object;
    }

    public final String zzb(zzp zzp2) {
        Object object = this.b_();
        zzbw.zza(object, zzp2);
        zzp2 = this.zza(11, (Parcel)object);
        object = zzp2.readString();
        zzp2.recycle();
        return object;
    }

    public final void zzc(zzp zzp2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzp2);
        this.zzb(27, parcel);
    }

    public final void zzd(zzp zzp2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzp2);
        this.zzb(4, parcel);
    }

    public final void zze(zzp zzp2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzp2);
        this.zzb(18, parcel);
    }

    public final void zzf(zzp zzp2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzp2);
        this.zzb(20, parcel);
    }

    public final void zzg(zzp zzp2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzp2);
        this.zzb(26, parcel);
    }

    public final void zzh(zzp zzp2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzp2);
        this.zzb(6, parcel);
    }

    public final void zzi(zzp zzp2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzp2);
        this.zzb(25, parcel);
    }
}

