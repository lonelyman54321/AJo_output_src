/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.measurement.internal.zzbi;
import com.google.android.gms.measurement.internal.zzbj;
import java.util.Iterator;

public final class zzbg
extends AbstractSafeParcelable
implements Iterable {
    public static final Parcelable.Creator CREATOR;
    private final Bundle zza;

    static {
        zzbi zzbi2 = new zzbi();
        CREATOR = zzbi2;
    }

    public zzbg(Bundle bundle) {
        this.zza = bundle;
    }

    public static /* bridge */ /* synthetic */ Bundle zza(zzbg zzbg2) {
        return zzbg2.zza;
    }

    public final Iterator iterator() {
        zzbj zzbj2 = new zzbj(this);
        return zzbj2;
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        Bundle bundle = this.zzb();
        SafeParcelWriter.writeBundle(parcel, 2, bundle, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Double zza(String string2) {
        return this.zza.getDouble(string2);
    }

    public final Bundle zzb() {
        Bundle bundle = this.zza;
        Bundle bundle2 = new Bundle(bundle);
        return bundle2;
    }

    public final Long zzb(String string2) {
        return this.zza.getLong(string2);
    }

    public final Object zzc(String string2) {
        return this.zza.get(string2);
    }

    public final String zzd(String string2) {
        return this.zza.getString(string2);
    }
}

