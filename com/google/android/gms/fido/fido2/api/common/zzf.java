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
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.fido2.api.common.zzg;
import java.util.Arrays;

public final class zzf
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final byte[] zza;
    private final byte[] zzb;

    static {
        zzg zzg2 = new zzg();
        CREATOR = zzg2;
    }

    public zzf(byte[] byArray, byte[] byArray2) {
        this.zza = byArray;
        this.zzb = byArray2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof zzf;
        if (!bl3) {
            return false;
        }
        object = (zzf)object;
        byte[] byArray = this.zza;
        byte[] byArray2 = ((zzf)object).zza;
        bl3 = Arrays.equals(byArray, byArray2);
        return bl3 && (bl2 = Arrays.equals(byArray = this.zzb, (byte[])(object = (Object)((zzf)object).zzb)));
    }

    public final int hashCode() {
        byte[] byArray = this.zza;
        byte[] byArray2 = this.zzb;
        Object[] objectArray = new Object[]{byArray, byArray2};
        return Objects.hashCode(objectArray);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        byte[] byArray = this.zza;
        SafeParcelWriter.writeByteArray(parcel, 1, byArray, false);
        byte[] byArray2 = this.zzb;
        SafeParcelWriter.writeByteArray(parcel, 2, byArray2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

