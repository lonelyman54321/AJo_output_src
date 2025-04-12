/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzeo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzen
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zza;
    private final int zzb;
    private final String zzc;

    static {
        zzeo zzeo2 = new zzeo();
        CREATOR = zzeo2;
    }

    public zzen() {
        this(241806202, 241806000, "23.2.0");
    }

    public zzen(int n3, int n4, String string2) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = string2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, n4);
        n4 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 2, n4);
        String string2 = this.zzc;
        SafeParcelWriter.writeString(parcel, 3, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }
}

