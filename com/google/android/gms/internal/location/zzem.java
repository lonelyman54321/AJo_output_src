/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.location.zzen;
import com.google.android.gms.internal.location.zzex;
import java.util.List;

public final class zzem
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final List zza;
    private final PendingIntent zzb;
    private final String zzc;

    static {
        zzen zzen2 = new zzen();
        CREATOR = zzen2;
    }

    public zzem(List list, PendingIntent pendingIntent, String string2) {
        list = list == null ? zzex.zzi() : zzex.zzj(list);
        this.zza = list;
        this.zzb = pendingIntent;
        this.zzc = string2;
    }

    public static zzem zza(List list) {
        Preconditions.checkNotNull(list, "geofence can't be null.");
        Preconditions.checkArgument(list.isEmpty() ^ true, "Geofences must contains at least one id.");
        zzem zzem2 = new zzem(list, null, "");
        return zzem2;
    }

    public static zzem zzb(PendingIntent pendingIntent) {
        Preconditions.checkNotNull(pendingIntent, "PendingIntent can not be null.");
        zzem zzem2 = new zzem(null, pendingIntent, "");
        return zzem2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, (List)object, false);
        PendingIntent pendingIntent = this.zzb;
        SafeParcelWriter.writeParcelable(parcel, 2, (Parcelable)pendingIntent, n3, false);
        object = this.zzc;
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

