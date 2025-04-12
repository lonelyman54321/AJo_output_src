/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.fido2.api.common.zzr;
import java.util.Arrays;

public final class zzq
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final long zza;
    private final byte[] zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    static {
        zzr zzr2 = new zzr();
        CREATOR = zzr2;
    }

    public zzq(long l2, byte[] byArray, byte[] byArray2, byte[] byArray3) {
        this.zza = l2;
        byte[] byArray4 = (byte[])Preconditions.checkNotNull(byArray);
        this.zzb = byArray4;
        byArray4 = (byte[])Preconditions.checkNotNull(byArray2);
        this.zzc = byArray4;
        byArray4 = (byte[])Preconditions.checkNotNull(byArray3);
        this.zzd = byArray4;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        byte[] byArray;
        byte[] byArray2;
        Object object2 = object instanceof zzq;
        if (!object2) {
            return false;
        }
        object = (zzq)object;
        long l2 = this.zza;
        long l3 = ((zzq)object).zza;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return !object2 && (object2 = Arrays.equals(byArray2 = this.zzb, byArray = ((zzq)object).zzb)) && (object2 = Arrays.equals(byArray2 = this.zzc, byArray = ((zzq)object).zzc)) && (bl2 = Arrays.equals(byArray2 = this.zzd, (byte[])(object = (Object)((zzq)object).zzd)));
    }

    public final int hashCode() {
        Long l2 = this.zza;
        byte[] byArray = this.zzb;
        byte[] byArray2 = this.zzc;
        byte[] byArray3 = this.zzd;
        Object[] objectArray = new Object[]{l2, byArray, byArray2, byArray3};
        return Objects.hashCode(objectArray);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        long l2 = this.zza;
        SafeParcelWriter.writeLong(parcel, 1, l2);
        byte[] byArray = this.zzb;
        SafeParcelWriter.writeByteArray(parcel, 2, byArray, false);
        byte[] byArray2 = this.zzc;
        SafeParcelWriter.writeByteArray(parcel, 3, byArray2, false);
        byArray2 = this.zzd;
        SafeParcelWriter.writeByteArray(parcel, 4, byArray2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

