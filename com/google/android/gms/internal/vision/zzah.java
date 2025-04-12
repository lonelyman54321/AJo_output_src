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
import com.google.android.gms.internal.vision.zzag;
import com.google.android.gms.internal.vision.zzao;

public final class zzah
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final zzao[] zza;
    public final zzab zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;
    public final int zzg;
    private final zzab zzh;
    private final zzab zzi;
    private final float zzj;
    private final int zzk;

    static {
        zzag zzag2 = new zzag();
        CREATOR = zzag2;
    }

    public zzah(zzao[] zzaoArray, zzab zzab2, zzab zzab3, zzab zzab4, String string2, float f5, String string3, int n3, boolean bl2, int n4, int n7) {
        this.zza = zzaoArray;
        this.zzb = zzab2;
        this.zzh = zzab3;
        this.zzi = zzab4;
        this.zzc = string2;
        this.zzj = f5;
        this.zzd = string3;
        this.zzk = n3;
        this.zze = bl2;
        this.zzf = n4;
        this.zzg = n7;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.zza;
        SafeParcelWriter.writeTypedArray(parcel, 2, object, n3, false);
        zzab zzab2 = this.zzb;
        SafeParcelWriter.writeParcelable(parcel, 3, zzab2, n3, false);
        zzab2 = this.zzh;
        SafeParcelWriter.writeParcelable(parcel, 4, zzab2, n3, false);
        zzab2 = this.zzi;
        SafeParcelWriter.writeParcelable(parcel, 5, zzab2, n3, false);
        object = this.zzc;
        SafeParcelWriter.writeString(parcel, 6, (String)object, false);
        float f5 = this.zzj;
        SafeParcelWriter.writeFloat(parcel, 7, f5);
        object = this.zzd;
        SafeParcelWriter.writeString(parcel, 8, (String)object, false);
        int n7 = this.zzk;
        SafeParcelWriter.writeInt(parcel, 9, n7);
        n7 = (int)(this.zze ? 1 : 0);
        SafeParcelWriter.writeBoolean(parcel, 10, n7 != 0);
        n7 = this.zzf;
        SafeParcelWriter.writeInt(parcel, 11, n7);
        n7 = this.zzg;
        SafeParcelWriter.writeInt(parcel, 12, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

