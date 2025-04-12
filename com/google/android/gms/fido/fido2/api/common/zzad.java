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
import com.google.android.gms.fido.fido2.api.common.zzae;

public final class zzad
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final boolean zza;

    static {
        zzae zzae2 = new zzae();
        CREATOR = zzae2;
    }

    public zzad(boolean bl2) {
        this.zza = bl2 = ((Boolean)Preconditions.checkNotNull(bl2)).booleanValue();
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzad;
        if (!bl2) {
            return false;
        }
        object = (zzad)object;
        bl2 = this.zza;
        boolean bl3 = ((zzad)object).zza;
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

