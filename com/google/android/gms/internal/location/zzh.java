/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.location.zzi;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.DeviceOrientationRequest$Builder;
import java.util.Collections;
import java.util.List;

public final class zzh
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    static final List zza;
    static final DeviceOrientationRequest zzb;
    final DeviceOrientationRequest zzc;
    final List zzd;
    final String zze;

    static {
        zza = Collections.emptyList();
        Object object = new DeviceOrientationRequest$Builder(20000L);
        zzb = ((DeviceOrientationRequest$Builder)object).build();
        object = new zzi();
        CREATOR = object;
    }

    public zzh(DeviceOrientationRequest deviceOrientationRequest, List list, String string2) {
        this.zzc = deviceOrientationRequest;
        this.zzd = list;
        this.zze = string2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof zzh;
        if (!bl3) {
            return false;
        }
        object = (zzh)object;
        Object object2 = this.zzc;
        Object object3 = ((zzh)object).zzc;
        bl3 = Objects.equal(object2, object3);
        return bl3 && (bl3 = Objects.equal(object2 = this.zzd, object3 = ((zzh)object).zzd)) && (bl2 = Objects.equal(object2 = this.zze, object = ((zzh)object).zze));
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String string2 = String.valueOf(this.zzc);
        String string3 = String.valueOf(this.zzd);
        int n3 = string2.length();
        int n4 = string3.length();
        String string4 = this.zze;
        int n7 = String.valueOf(string4).length();
        n3 = n3 + 68 + n4 + 7 + n7;
        StringBuilder stringBuilder = new StringBuilder(n3 += 2);
        X50.a(stringBuilder, "DeviceOrientationRequestInternal[deviceOrientationRequest=", string2, ", clients=", string3);
        return BW0.b(stringBuilder, ", tag='", string4, "']");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.zzc;
        SafeParcelWriter.writeParcelable(parcel, 1, (Parcelable)object, n3, false);
        object = this.zzd;
        SafeParcelWriter.writeTypedList(parcel, 2, (List)object, false);
        object = this.zze;
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

