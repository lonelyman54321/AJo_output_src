/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.zzaa;
import com.google.firebase.appindexing.internal.zzc;

public final class zzz
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final Thing[] zzb;
    public final String[] zzc;
    public final String[] zzd;
    public final zzc zze;
    public final String zzf;
    public final String zzg;

    static {
        zzaa zzaa2 = new zzaa();
        CREATOR = zzaa2;
    }

    public zzz(int n3, Thing[] thingArray, String[] stringArray, String[] stringArray2, zzc zzc2, String string2, String string3) {
        int n4;
        if (n3 != 0 && n3 != (n4 = 1) && n3 != (n4 = 2) && n3 != (n4 = 3) && n3 != (n4 = 4) && n3 != (n4 = 6) && n3 != (n4 = 7)) {
            n3 = 0;
        }
        this.zza = n3;
        this.zzb = thingArray;
        this.zzc = stringArray;
        this.zzd = stringArray2;
        this.zze = zzc2;
        this.zzf = string2;
        this.zzg = string3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int n7 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, n7);
        Object object = this.zzb;
        SafeParcelWriter.writeTypedArray(parcel, 2, object, n3, false);
        Object object2 = this.zzc;
        SafeParcelWriter.writeStringArray(parcel, 3, object2, false);
        object2 = this.zzd;
        SafeParcelWriter.writeStringArray(parcel, 5, object2, false);
        object2 = this.zze;
        SafeParcelWriter.writeParcelable(parcel, 6, (Parcelable)object2, n3, false);
        object = this.zzf;
        SafeParcelWriter.writeString(parcel, 7, (String)object, false);
        object = this.zzg;
        SafeParcelWriter.writeString(parcel, 8, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

