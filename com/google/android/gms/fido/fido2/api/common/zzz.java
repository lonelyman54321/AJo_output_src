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
import com.google.android.gms.fido.fido2.api.common.zzaa;

public final class zzz
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final boolean zza;

    static {
        zzaa zzaa2 = new zzaa();
        CREATOR = zzaa2;
    }

    public zzz(boolean bl2) {
        this.zza = bl2 = ((Boolean)Preconditions.checkNotNull(bl2)).booleanValue();
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzz;
        if (!bl2) {
            return false;
        }
        object = (zzz)object;
        bl2 = this.zza;
        boolean bl3 = ((zzz)object).zza;
        return bl2 == bl3;
    }

    public final int hashCode() {
        Boolean bl2 = this.zza;
        Object[] objectArray = new Object[]{bl2};
        return Objects.hashCode(objectArray);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        boolean bl2 = this.zza;
        SafeParcelWriter.writeBoolean(parcel, 1, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

