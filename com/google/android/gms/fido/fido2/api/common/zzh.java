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
import com.google.android.gms.fido.fido2.api.common.zzi;
import java.util.Arrays;

public final class zzh
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final boolean zza;
    private final byte[] zzb;

    static {
        zzi zzi2 = new zzi();
        CREATOR = zzi2;
    }

    public zzh(boolean bl2, byte[] byArray) {
        this.zza = bl2;
        this.zzb = byArray;
    }

    public final boolean equals(Object object) {
        byte[] byArray;
        boolean bl2;
        boolean bl3 = object instanceof zzh;
        if (!bl3) {
            return false;
        }
        object = (zzh)object;
        bl3 = this.zza;
        boolean bl4 = ((zzh)object).zza;
        return bl3 == bl4 && (bl2 = Arrays.equals(byArray = this.zzb, (byte[])(object = (Object)((zzh)object).zzb)));
    }

    public final int hashCode() {
        Boolean bl2 = this.zza;
        byte[] byArray = this.zzb;
        Object[] objectArray = new Object[]{bl2, byArray};
        return Objects.hashCode(objectArray);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        boolean bl2 = this.zza;
        SafeParcelWriter.writeBoolean(parcel, 1, bl2);
        byte[] byArray = this.zzb;
        SafeParcelWriter.writeByteArray(parcel, 2, byArray, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

