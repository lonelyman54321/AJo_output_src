/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.location.Location
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.ICancelToken$Stub;
import com.google.android.gms.internal.location.zza;
import com.google.android.gms.internal.location.zzab;
import com.google.android.gms.internal.location.zzc;
import com.google.android.gms.internal.location.zzee;
import com.google.android.gms.internal.location.zzei;
import com.google.android.gms.internal.location.zzem;
import com.google.android.gms.internal.location.zzj;
import com.google.android.gms.internal.location.zzo;
import com.google.android.gms.internal.location.zzr;
import com.google.android.gms.internal.location.zzt;
import com.google.android.gms.internal.location.zzv;
import com.google.android.gms.internal.location.zzz;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzad;
import com.google.android.gms.location.zzb;

public final class zzu
extends zza
implements zzv {
    public zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void zzA(Location location) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, (Parcelable)location);
        this.zzc(13, parcel);
    }

    public final void zzB(Location location, IStatusCallback iStatusCallback) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, (Parcelable)location);
        zzc.zzc(parcel, iStatusCallback);
        this.zzc(85, parcel);
    }

    public final void zzC(zzr zzr2) {
        Parcel parcel = this.zza();
        zzc.zzc(parcel, zzr2);
        this.zzc(67, parcel);
    }

    public final void zzD(LocationSettingsRequest locationSettingsRequest, zzab zzab2, String string2) {
        string2 = this.zza();
        zzc.zzb((Parcel)string2, locationSettingsRequest);
        zzc.zzc((Parcel)string2, zzab2);
        string2.writeString(null);
        this.zzc(63, (Parcel)string2);
    }

    public final void zzE(zzo zzo2) {
        Parcel parcel = this.zza();
        zzc.zzc(parcel, zzo2);
        this.zzc(95, parcel);
    }

    public final void zzF(zzj zzj2) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, zzj2);
        this.zzc(75, parcel);
    }

    public final void zzd(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzt zzt2) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, geofencingRequest);
        zzc.zzb(parcel, (Parcelable)pendingIntent);
        zzc.zzc(parcel, zzt2);
        this.zzc(57, parcel);
    }

    public final void zze(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, geofencingRequest);
        zzc.zzb(parcel, (Parcelable)pendingIntent);
        zzc.zzc(parcel, iStatusCallback);
        this.zzc(97, parcel);
    }

    public final void zzf(zzem zzem2, zzt zzt2) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, zzem2);
        zzc.zzc(parcel, zzt2);
        this.zzc(74, parcel);
    }

    public final void zzg(zzem zzem2, IStatusCallback iStatusCallback) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, zzem2);
        zzc.zzc(parcel, iStatusCallback);
        this.zzc(98, parcel);
    }

    public final void zzh(long l2, boolean bl2, PendingIntent pendingIntent) {
        Parcel parcel = this.zza();
        parcel.writeLong(l2);
        parcel.writeInt(1);
        zzc.zzb(parcel, (Parcelable)pendingIntent);
        this.zzc(5, parcel);
    }

    public final void zzi(zzb zzb2, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, zzb2);
        zzc.zzb(parcel, (Parcelable)pendingIntent);
        zzc.zzc(parcel, iStatusCallback);
        this.zzc(70, parcel);
    }

    public final void zzj(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, activityTransitionRequest);
        zzc.zzb(parcel, (Parcelable)pendingIntent);
        zzc.zzc(parcel, iStatusCallback);
        this.zzc(72, parcel);
    }

    public final void zzk(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, (Parcelable)pendingIntent);
        zzc.zzc(parcel, iStatusCallback);
        this.zzc(73, parcel);
    }

    public final void zzl(PendingIntent pendingIntent) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, (Parcelable)pendingIntent);
        this.zzc(6, parcel);
    }

    public final void zzm(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, (Parcelable)pendingIntent);
        zzc.zzb(parcel, sleepSegmentRequest);
        zzc.zzc(parcel, iStatusCallback);
        this.zzc(79, parcel);
    }

    public final void zzn(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, (Parcelable)pendingIntent);
        zzc.zzc(parcel, iStatusCallback);
        this.zzc(69, parcel);
    }

    public final void zzo(zzad zzad2, zzee zzee2) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, zzad2);
        zzc.zzb(parcel, zzee2);
        this.zzc(91, parcel);
    }

    public final LocationAvailability zzp(String string2) {
        Object object = this.zza();
        object.writeString(string2);
        string2 = this.zzb(34, (Parcel)object);
        object = LocationAvailability.CREATOR;
        object = (LocationAvailability)zzc.zza((Parcel)string2, (Parcelable.Creator)object);
        string2.recycle();
        return object;
    }

    public final void zzq(LastLocationRequest lastLocationRequest, zzee zzee2) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, lastLocationRequest);
        zzc.zzb(parcel, zzee2);
        this.zzc(90, parcel);
    }

    public final void zzr(LastLocationRequest lastLocationRequest, zzz zzz2) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, lastLocationRequest);
        zzc.zzc(parcel, zzz2);
        this.zzc(82, parcel);
    }

    public final Location zzs() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzb(7, parcel);
        parcel = Location.CREATOR;
        parcel = (Location)zzc.zza(parcel2, (Parcelable.Creator)parcel);
        parcel2.recycle();
        return parcel;
    }

    public final ICancelToken zzt(CurrentLocationRequest currentLocationRequest, zzee object) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, currentLocationRequest);
        zzc.zzb(parcel, (Parcelable)object);
        currentLocationRequest = this.zzb(92, parcel);
        object = ICancelToken$Stub.asInterface(currentLocationRequest.readStrongBinder());
        currentLocationRequest.recycle();
        return object;
    }

    public final ICancelToken zzu(CurrentLocationRequest currentLocationRequest, zzz object) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, currentLocationRequest);
        zzc.zzc(parcel, object);
        currentLocationRequest = this.zzb(87, parcel);
        object = ICancelToken$Stub.asInterface(currentLocationRequest.readStrongBinder());
        currentLocationRequest.recycle();
        return object;
    }

    public final void zzv(zzei zzei2) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, zzei2);
        this.zzc(59, parcel);
    }

    public final void zzw(zzee zzee2, LocationRequest locationRequest, IStatusCallback iStatusCallback) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, zzee2);
        zzc.zzb(parcel, locationRequest);
        zzc.zzc(parcel, iStatusCallback);
        this.zzc(88, parcel);
    }

    public final void zzx(zzee zzee2, IStatusCallback iStatusCallback) {
        Parcel parcel = this.zza();
        zzc.zzb(parcel, zzee2);
        zzc.zzc(parcel, iStatusCallback);
        this.zzc(89, parcel);
    }

    public final void zzy(boolean bl2) {
        Parcel parcel = this.zza();
        parcel.writeInt((int)(bl2 ? 1 : 0));
        this.zzc(12, parcel);
    }

    public final void zzz(boolean bl2, IStatusCallback iStatusCallback) {
        Parcel parcel = this.zza();
        parcel.writeInt((int)(bl2 ? 1 : 0));
        zzc.zzc(parcel, iStatusCallback);
        this.zzc(84, parcel);
    }
}

