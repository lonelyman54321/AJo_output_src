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
import com.google.android.gms.fido.fido2.api.common.zzac;

public final class zzab
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final long zza;

    static {
        zzac zzac2 = new zzac();
        CREATOR = zzac2;
    }

    public zzab(long l2) {
        this.zza = l2 = ((Long)Preconditions.checkNotNull(l2)).longValue();
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzab;
        if (!bl2) {
            return false;
        }
        object = (zzab)object;
        long l2 = this.zza;
        long l3 = ((zzab)object).zza;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object2 == false;
    }

    public final int hashCode() {
        Long l2 = this.zza;
        Object[] objectArray = new Object[]{l2};
        return Objects.hashCode(objectArray);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        long l2 = this.zza;
        SafeParcelWriter.writeLong(parcel, 1, l2);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

