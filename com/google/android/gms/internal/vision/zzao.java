/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.vision.zzab;
import com.google.android.gms.internal.vision.zzal;
import com.google.android.gms.internal.vision.zzar;

public final class zzao
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final zzab zza;
    public final String zzb;
    public final String zzc;
    private final zzal[] zzd;
    private final zzab zze;
    private final float zzf;
    private final boolean zzg;

    static {
        zzar zzar2 = new zzar();
        CREATOR = zzar2;
    }

    public zzao(zzal[] zzalArray, zzab zzab2, zzab zzab3, String string2, float f5, String string3, boolean bl2) {
        this.zzd = zzalArray;
        this.zza = zzab2;
        this.zze = zzab3;
        this.zzb = string2;
        this.zzf = f5;
        this.zzc = string3;
        this.zzg = bl2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.zzd;
        SafeParcelWriter.writeTypedArray(parcel, 2, object, n3, false);
        zzab zzab2 = this.zza;
        SafeParcelWriter.writeParcelable(parcel, 3, zzab2, n3, false);
        zzab2 = this.zze;
        SafeParcelWriter.writeParcelable(parcel, 4, zzab2, n3, false);
        object = this.zzb;
        SafeParcelWriter.writeString(parcel, 5, (String)object, false);
        float f5 = this.zzf;
        SafeParcelWriter.writeFloat(parcel, 6, f5);
        object = this.zzc;
        SafeParcelWriter.writeString(parcel, 7, (String)object, false);
        boolean bl2 = this.zzg;
        SafeParcelWriter.writeBoolean(parcel, 8, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

