/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.zzh;
import com.google.android.gms.ads.internal.client.zzca;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbjm;

public final class PublisherAdViewOptions
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final boolean zza;
    private final zzcb zzb;
    private final IBinder zzc;

    static {
        zzh zzh2 = new zzh();
        CREATOR = zzh2;
    }

    public PublisherAdViewOptions(boolean bl2, IBinder iBinder, IBinder iBinder2) {
        zzcb zzcb2;
        this.zza = bl2;
        if (iBinder != null) {
            zzcb2 = zzca.zzd(iBinder);
        } else {
            bl2 = false;
            zzcb2 = null;
        }
        this.zzb = zzcb2;
        this.zzc = iBinder2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = 1;
        boolean bl2 = this.zza;
        SafeParcelWriter.writeBoolean(parcel, n4, bl2);
        zzcb zzcb2 = this.zzb;
        if (zzcb2 == null) {
            n4 = 0;
            zzcb2 = null;
        } else {
            zzcb2 = zzcb2.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, (IBinder)zzcb2, false);
        IBinder iBinder = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, iBinder, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    public final zzcb zza() {
        return this.zzb;
    }

    public final zzbjm zzb() {
        IBinder iBinder = this.zzc;
        if (iBinder == null) {
            return null;
        }
        return zzbjl.zzb(iBinder);
    }

    public final boolean zzc() {
        return this.zza;
    }
}

