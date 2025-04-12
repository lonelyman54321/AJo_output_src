/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzdl;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzf;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zze
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final String zzb;
    public final String zzc;
    public zze zzd;
    public IBinder zze;

    static {
        zzf zzf2 = new zzf();
        CREATOR = zzf2;
    }

    public zze(int n3, String string2, String string3, zze zze2, IBinder iBinder) {
        this.zza = n3;
        this.zzb = string2;
        this.zzc = string3;
        this.zzd = zze2;
        this.zze = iBinder;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = this.zza;
        int n7 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n4);
        String string2 = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        Object object = this.zzc;
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        object = this.zzd;
        SafeParcelWriter.writeParcelable(parcel, 4, (Parcelable)object, n3, false);
        string2 = this.zze;
        SafeParcelWriter.writeIBinder(parcel, 5, (IBinder)string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n7);
    }

    public final AdError zza() {
        Object object;
        String string2;
        Object object2 = this.zzd;
        if (object2 == null) {
            boolean bl2 = false;
            object2 = null;
        } else {
            String string3 = ((zze)object2).zzc;
            string2 = ((zze)object2).zzb;
            int n3 = ((zze)object2).zza;
            object2 = object = new AdError(n3, string2, string3);
        }
        int n4 = this.zza;
        string2 = this.zzb;
        object = this.zzc;
        AdError adError = new AdError(n4, string2, (String)object, (AdError)object2);
        return adError;
    }

    public final LoadAdError zzb() {
        String string2;
        AdError adError;
        Object object = this.zzd;
        IInterface iInterface = null;
        if (object == null) {
            adError = null;
        } else {
            AdError adError2;
            string2 = ((zze)object).zzc;
            String string3 = ((zze)object).zzb;
            int n3 = ((zze)object).zza;
            adError = adError2 = new AdError(n3, string3, string2);
        }
        int n4 = this.zza;
        String string4 = this.zzb;
        String string5 = this.zzc;
        string2 = this.zze;
        if (string2 != null) {
            iInterface = string2.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            boolean bl2 = iInterface instanceof zzdn;
            iInterface = bl2 ? (zzdn)iInterface : new zzdl((IBinder)string2);
        }
        ResponseInfo responseInfo = ResponseInfo.zza(iInterface);
        object = new LoadAdError(n4, string4, string5, adError, responseInfo);
        return object;
    }
}

