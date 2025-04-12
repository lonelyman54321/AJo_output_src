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
import com.google.android.gms.internal.vision.zzv;
import com.google.android.gms.vision.Frame;

public final class zzs
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    public int zze;

    static {
        zzv zzv2 = new zzv();
        CREATOR = zzv2;
    }

    public zzs() {
    }

    public zzs(int n3, int n4, int n7, long l2, int n8) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
        this.zzd = l2;
        this.zze = n8;
    }

    public static zzs zza(Frame frame) {
        long l2;
        int n3;
        zzs zzs2 = new zzs();
        zzs2.zza = n3 = frame.getMetadata().getWidth();
        zzs2.zzb = n3 = frame.getMetadata().getHeight();
        zzs2.zze = n3 = frame.getMetadata().getRotation();
        zzs2.zzc = n3 = frame.getMetadata().getId();
        zzs2.zzd = l2 = frame.getMetadata().getTimestampMillis();
        return zzs2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zza;
        SafeParcelWriter.writeInt(parcel, 2, n4);
        n4 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 3, n4);
        n4 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 4, n4);
        long l2 = this.zzd;
        SafeParcelWriter.writeLong(parcel, 5, l2);
        n4 = this.zze;
        SafeParcelWriter.writeInt(parcel, 6, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

