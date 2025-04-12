/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.zzd;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzc
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final boolean zzad;
    private final long zzae;
    private final long zzaf;

    static {
        zzd zzd2 = new zzd();
        CREATOR = zzd2;
    }

    public zzc(boolean bl2, long l2, long l3) {
        this.zzad = bl2;
        this.zzae = l2;
        this.zzaf = l3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof zzc;
        if (bl3) {
            long l2;
            long l3;
            long l4;
            long l7;
            long l8;
            object = (zzc)object;
            bl3 = this.zzad;
            boolean bl4 = ((zzc)object).zzad;
            if (bl3 == bl4 && !(bl3 = (l8 = (l7 = this.zzae) - (l4 = ((zzc)object).zzae)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) && (l3 = (l2 = (l7 = this.zzaf) - (l4 = ((zzc)object).zzaf)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        Boolean bl2 = this.zzad;
        Long l2 = this.zzae;
        Long l3 = this.zzaf;
        Object[] objectArray = new Object[]{bl2, l2, l3};
        return Objects.hashCode(objectArray);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        boolean bl2 = this.zzad;
        stringBuilder.append(bl2);
        stringBuilder.append(",collectForDebugStartTimeMillis: ");
        long l2 = this.zzae;
        stringBuilder.append(l2);
        stringBuilder.append(",collectForDebugExpiryTimeMillis: ");
        l2 = this.zzaf;
        return jl0_0.b(stringBuilder, l2, "]");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        boolean bl2 = this.zzad;
        SafeParcelWriter.writeBoolean(parcel, 1, bl2);
        long l2 = this.zzaf;
        SafeParcelWriter.writeLong(parcel, 2, l2);
        l2 = this.zzae;
        SafeParcelWriter.writeLong(parcel, 3, l2);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

