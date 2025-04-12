/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.gtm.zzar;
import com.google.android.gms.internal.gtm.zzat;
import com.google.android.gms.internal.gtm.zzhd;
import com.google.android.gms.internal.gtm.zzhg;

public final class zzhe
extends zzar
implements zzhg {
    public zzhe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.internal.ITagManagerService");
    }

    public final void zze() {
        Parcel parcel = this.zza();
        this.zzl(102, parcel);
    }

    public final void zzf(String string2, Bundle bundle, String string3, long l2, boolean bl2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        zzat.zzd(parcel, (Parcelable)bundle);
        parcel.writeString(string3);
        parcel.writeLong(l2);
        parcel.writeInt((int)(bl2 ? 1 : 0));
        this.zzl(101, parcel);
    }

    public final void zzg(String string2, String string3, String string4) {
        throw null;
    }

    public final void zzh(String string2, String string3, String string4, zzhd zzhd2) {
        string4 = this.zza();
        string4.writeString(string2);
        string4.writeString(string3);
        string4.writeString(null);
        zzat.zze((Parcel)string4, zzhd2);
        this.zzl(2, (Parcel)string4);
    }

    public final void zzi() {
        Parcel parcel = this.zza();
        this.zzl(3, parcel);
    }
}

