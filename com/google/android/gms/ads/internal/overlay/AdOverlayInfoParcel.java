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
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzczy;
import com.google.android.gms.internal.ads.zzdhi;

public final class AdOverlayInfoParcel
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final zzc zza;
    public final zza zzb;
    public final zzp zzc;
    public final zzchd zzd;
    public final zzbkh zze;
    public final String zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzaa zzi;
    public final int zzj;
    public final int zzk;
    public final String zzl;
    public final VersionInfoParcel zzm;
    public final String zzn;
    public final zzk zzo;
    public final zzbkf zzp;
    public final String zzq;
    public final String zzr;
    public final String zzs;
    public final zzczy zzt;
    public final zzdhi zzu;
    public final zzbuz zzv;
    public final boolean zzw;

    static {
        zzo zzo2 = new zzo();
        CREATOR = zzo2;
    }

    public AdOverlayInfoParcel(zza zza2, zzp zzp2, zzaa object, zzchd object2, int n3, VersionInfoParcel versionInfoParcel, String string2, zzk zzk2, String string3, String string4, String string5, zzczy zzczy2, zzbuz zzbuz2) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzp2;
        this.zzd = object2;
        this.zzp = null;
        this.zze = null;
        zzp2 = null;
        this.zzg = false;
        object = zzbep.zzaJ;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = string3;
            this.zzh = string4;
        }
        this.zzi = null;
        this.zzj = n3;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = string2;
        this.zzo = zzk2;
        this.zzq = null;
        this.zzr = null;
        this.zzs = string5;
        this.zzt = zzczy2;
        this.zzu = null;
        this.zzv = zzbuz2;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(zza zza2, zzp zzp2, zzaa zzaa2, zzchd zzchd2, boolean bl2, int n3, VersionInfoParcel versionInfoParcel, zzdhi zzdhi2, zzbuz zzbuz2) {
        this.zza = null;
        this.zzb = zza2;
        this.zzc = zzp2;
        this.zzd = zzchd2;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = bl2;
        this.zzh = null;
        this.zzi = zzaa2;
        this.zzj = n3;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdhi2;
        this.zzv = zzbuz2;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(zza zza2, zzp zzp2, zzbkf zzbkf2, zzbkh zzbkh2, zzaa zzaa2, zzchd zzchd2, boolean bl2, int n3, String string2, VersionInfoParcel versionInfoParcel, zzdhi zzdhi2, zzbuz zzbuz2, boolean bl3) {
        this.zza = null;
        this.zzb = zza2;
        this.zzc = zzp2;
        this.zzd = zzchd2;
        this.zzp = zzbkf2;
        this.zze = zzbkh2;
        this.zzf = null;
        this.zzg = bl2;
        this.zzh = null;
        this.zzi = zzaa2;
        this.zzj = n3;
        this.zzk = 3;
        this.zzl = string2;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdhi2;
        this.zzv = zzbuz2;
        this.zzw = bl3;
    }

    public AdOverlayInfoParcel(zza zza2, zzp zzp2, zzbkf zzbkf2, zzbkh zzbkh2, zzaa zzaa2, zzchd zzchd2, boolean bl2, int n3, String string2, String string3, VersionInfoParcel versionInfoParcel, zzdhi zzdhi2, zzbuz zzbuz2) {
        this.zza = null;
        this.zzb = zza2;
        this.zzc = zzp2;
        this.zzd = zzchd2;
        this.zzp = zzbkf2;
        this.zze = zzbkh2;
        this.zzf = string3;
        this.zzg = bl2;
        this.zzh = string2;
        this.zzi = zzaa2;
        this.zzj = n3;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdhi2;
        this.zzv = zzbuz2;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(zzc zzc2, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String string2, boolean bl2, String string3, IBinder iBinder5, int n3, int n4, String string4, VersionInfoParcel versionInfoParcel, String string5, zzk zzk2, IBinder iBinder6, String string6, String string7, String string8, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean bl3) {
        Object object = zzc2;
        this.zza = zzc2;
        this.zzb = object = (zza)ObjectWrapper.unwrap(IObjectWrapper$Stub.asInterface(iBinder));
        this.zzc = object = (zzp)ObjectWrapper.unwrap(IObjectWrapper$Stub.asInterface(iBinder2));
        this.zzd = object = (zzchd)ObjectWrapper.unwrap(IObjectWrapper$Stub.asInterface(iBinder3));
        this.zzp = object = (zzbkf)ObjectWrapper.unwrap(IObjectWrapper$Stub.asInterface(iBinder6));
        this.zze = object = (zzbkh)ObjectWrapper.unwrap(IObjectWrapper$Stub.asInterface(iBinder4));
        object = string2;
        this.zzf = string2;
        this.zzg = bl2;
        object = string3;
        this.zzh = string3;
        this.zzi = object = (zzaa)ObjectWrapper.unwrap(IObjectWrapper$Stub.asInterface(iBinder5));
        this.zzj = n3;
        this.zzk = n4;
        object = string4;
        this.zzl = string4;
        object = versionInfoParcel;
        this.zzm = versionInfoParcel;
        object = string5;
        this.zzn = string5;
        object = zzk2;
        this.zzo = zzk2;
        object = string6;
        this.zzq = string6;
        object = string7;
        this.zzr = string7;
        object = string8;
        this.zzs = string8;
        this.zzt = object = (zzczy)ObjectWrapper.unwrap(IObjectWrapper$Stub.asInterface(iBinder7));
        this.zzu = object = (zzdhi)ObjectWrapper.unwrap(IObjectWrapper$Stub.asInterface(iBinder8));
        this.zzv = object = (zzbuz)ObjectWrapper.unwrap(IObjectWrapper$Stub.asInterface(iBinder9));
        this.zzw = bl3;
    }

    public AdOverlayInfoParcel(zzc zzc2, zza zza2, zzp zzp2, zzaa zzaa2, VersionInfoParcel versionInfoParcel, zzchd zzchd2, zzdhi zzdhi2) {
        this.zza = zzc2;
        this.zzb = zza2;
        this.zzc = zzp2;
        this.zzd = zzchd2;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzaa2;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdhi2;
        this.zzv = null;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(zzp zzp2, zzchd zzchd2, int n3, VersionInfoParcel versionInfoParcel) {
        int n4;
        this.zzc = zzp2;
        this.zzd = zzchd2;
        this.zzj = n4 = 1;
        this.zzm = versionInfoParcel;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = n4;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(zzchd zzchd2, VersionInfoParcel versionInfoParcel, String string2, String string3, int n3, zzbuz zzbuz2) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzchd2;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = string2;
        this.zzr = string3;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = zzbuz2;
        this.zzw = false;
    }

    public static AdOverlayInfoParcel zza(Intent intent) {
        Object object;
        String string2 = "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo";
        try {
            intent = intent.getBundleExtra(string2);
            object = AdOverlayInfoParcel.class;
        }
        catch (Exception exception) {
            return null;
        }
        object = ((Class)object).getClassLoader();
        intent.setClassLoader((ClassLoader)object);
        intent = intent.getParcelable(string2);
        return (AdOverlayInfoParcel)intent;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, (Parcelable)object, n3, false);
        object = ObjectWrapper.wrap(this.zzb).asBinder();
        SafeParcelWriter.writeIBinder(parcel, 3, (IBinder)object, false);
        object = ObjectWrapper.wrap(this.zzc).asBinder();
        SafeParcelWriter.writeIBinder(parcel, 4, (IBinder)object, false);
        object = ObjectWrapper.wrap(this.zzd).asBinder();
        SafeParcelWriter.writeIBinder(parcel, 5, (IBinder)object, false);
        object = ObjectWrapper.wrap(this.zze).asBinder();
        SafeParcelWriter.writeIBinder(parcel, 6, (IBinder)object, false);
        Object object2 = this.zzf;
        SafeParcelWriter.writeString(parcel, 7, (String)object2, false);
        int n7 = this.zzg;
        SafeParcelWriter.writeBoolean(parcel, 8, n7 != 0);
        object2 = this.zzh;
        SafeParcelWriter.writeString(parcel, 9, (String)object2, false);
        object = ObjectWrapper.wrap(this.zzi).asBinder();
        SafeParcelWriter.writeIBinder(parcel, 10, (IBinder)object, false);
        n7 = this.zzj;
        SafeParcelWriter.writeInt(parcel, 11, n7);
        n7 = this.zzk;
        SafeParcelWriter.writeInt(parcel, 12, n7);
        object2 = this.zzl;
        SafeParcelWriter.writeString(parcel, 13, (String)object2, false);
        object2 = this.zzm;
        SafeParcelWriter.writeParcelable(parcel, 14, (Parcelable)object2, n3, false);
        object2 = this.zzn;
        SafeParcelWriter.writeString(parcel, 16, (String)object2, false);
        object2 = this.zzo;
        SafeParcelWriter.writeParcelable(parcel, 17, (Parcelable)object2, n3, false);
        IBinder iBinder = ObjectWrapper.wrap(this.zzp).asBinder();
        SafeParcelWriter.writeIBinder(parcel, 18, iBinder, false);
        object = this.zzq;
        SafeParcelWriter.writeString(parcel, 19, (String)object, false);
        object = this.zzr;
        SafeParcelWriter.writeString(parcel, 24, (String)object, false);
        object = this.zzs;
        SafeParcelWriter.writeString(parcel, 25, (String)object, false);
        iBinder = ObjectWrapper.wrap(this.zzt).asBinder();
        SafeParcelWriter.writeIBinder(parcel, 26, iBinder, false);
        iBinder = ObjectWrapper.wrap(this.zzu).asBinder();
        SafeParcelWriter.writeIBinder(parcel, 27, iBinder, false);
        iBinder = ObjectWrapper.wrap(this.zzv).asBinder();
        SafeParcelWriter.writeIBinder(parcel, 28, iBinder, false);
        boolean bl2 = this.zzw;
        SafeParcelWriter.writeBoolean(parcel, 29, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

