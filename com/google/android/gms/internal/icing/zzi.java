/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.icing.zzj;

public final class zzi
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final String zza;
    final String zzb;
    final String zzc;

    static {
        zzj zzj2 = new zzj();
        CREATOR = zzj2;
    }

    public zzi(String string2, String string3, String string4) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = string4;
    }

    public final String toString() {
        String string2 = this.zza;
        String string3 = this.zzb;
        String string4 = this.zzc;
        return h30_0.a(og_1.a("DocumentId[packageName=", string2, ", corpusName=", string3, ", uri="), string4, "]");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.zza;
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        String string3 = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, string3, false);
        string3 = this.zzc;
        SafeParcelWriter.writeString(parcel, 3, string3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

