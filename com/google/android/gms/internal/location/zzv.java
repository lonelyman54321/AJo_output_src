/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.location.Location
 *  android.os.IInterface
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.internal.location.zzab;
import com.google.android.gms.internal.location.zzee;
import com.google.android.gms.internal.location.zzei;
import com.google.android.gms.internal.location.zzem;
import com.google.android.gms.internal.location.zzj;
import com.google.android.gms.internal.location.zzo;
import com.google.android.gms.internal.location.zzr;
import com.google.android.gms.internal.location.zzt;
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

public interface zzv
extends IInterface {
    public void zzA(Location var1);

    public void zzB(Location var1, IStatusCallback var2);

    public void zzC(zzr var1);

    public void zzD(LocationSettingsRequest var1, zzab var2, String var3);

    public void zzE(zzo var1);

    public void zzF(zzj var1);

    public void zzd(GeofencingRequest var1, PendingIntent var2, zzt var3);

    public void zze(GeofencingRequest var1, PendingIntent var2, IStatusCallback var3);

    public void zzf(zzem var1, zzt var2);

    public void zzg(zzem var1, IStatusCallback var2);

    public void zzh(long var1, boolean var3, PendingIntent var4);

    public void zzi(zzb var1, PendingIntent var2, IStatusCallback var3);

    public void zzj(ActivityTransitionRequest var1, PendingIntent var2, IStatusCallback var3);

    public void zzk(PendingIntent var1, IStatusCallback var2);

    public void zzl(PendingIntent var1);

    public void zzm(PendingIntent var1, SleepSegmentRequest var2, IStatusCallback var3);

    public void zzn(PendingIntent var1, IStatusCallback var2);

    public void zzo(zzad var1, zzee var2);

    public LocationAvailability zzp(String var1);

    public void zzq(LastLocationRequest var1, zzee var2);

    public void zzr(LastLocationRequest var1, zzz var2);

    public Location zzs();

    public ICancelToken zzt(CurrentLocationRequest var1, zzee var2);

    public ICancelToken zzu(CurrentLocationRequest var1, zzz var2);

    public void zzv(zzei var1);

    public void zzw(zzee var1, LocationRequest var2, IStatusCallback var3);

    public void zzx(zzee var1, IStatusCallback var2);

    public void zzy(boolean var1);

    public void zzz(boolean var1, IStatusCallback var2);
}

