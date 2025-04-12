/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.location.zzaj;

public final class LocationSettingsStates
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;

    static {
        zzaj zzaj2 = new zzaj();
        CREATOR = zzaj2;
    }

    public LocationSettingsStates(boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        this.zza = bl2;
        this.zzb = bl3;
        this.zzc = bl4;
        this.zzd = bl5;
        this.zze = bl6;
        this.zzf = bl7;
    }

    public static LocationSettingsStates fromIntent(Intent intent) {
        Parcelable.Creator creator = CREATOR;
        return (LocationSettingsStates)SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", creator);
    }

    public boolean isBlePresent() {
        return this.zzf;
    }

    public boolean isBleUsable() {
        return this.zzc;
    }

    public boolean isGpsPresent() {
        return this.zzd;
    }

    public boolean isGpsUsable() {
        return this.zza;
    }

    public boolean isLocationPresent() {
        boolean bl2 = this.zzd;
        return bl2 || (bl2 = this.zze);
        {
        }
    }

    public boolean isLocationUsable() {
        boolean bl2 = this.zza;
        return bl2 || (bl2 = this.zzb);
        {
        }
    }

    public boolean isNetworkLocationPresent() {
        return this.zze;
    }

    public boolean isNetworkLocationUsable() {
        return this.zzb;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        boolean bl2 = this.isGpsUsable();
        SafeParcelWriter.writeBoolean(parcel, 1, bl2);
        bl2 = this.isNetworkLocationUsable();
        SafeParcelWriter.writeBoolean(parcel, 2, bl2);
        bl2 = this.isBleUsable();
        SafeParcelWriter.writeBoolean(parcel, 3, bl2);
        bl2 = this.isGpsPresent();
        SafeParcelWriter.writeBoolean(parcel, 4, bl2);
        bl2 = this.isNetworkLocationPresent();
        SafeParcelWriter.writeBoolean(parcel, 5, bl2);
        bl2 = this.isBlePresent();
        SafeParcelWriter.writeBoolean(parcel, 6, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

