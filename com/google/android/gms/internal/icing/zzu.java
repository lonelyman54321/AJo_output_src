/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.icing.zzv;

public final class zzu
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean zza;

    static {
        zzv zzv2 = new zzv();
        CREATOR = zzv2;
    }

    public zzu(boolean bl2) {
        this.zza = bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof zzu;
        if (!bl3) {
            return false;
        }
        object = (zzu)object;
        bl3 = this.zza;
        boolean bl4 = ((zzu)object).zza;
        if (bl3 == bl4) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        boolean bl2 = this.zza;
        if (bl2) {
            return 1;
        }
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        boolean bl2 = this.zza;
        SafeParcelWriter.writeBoolean(parcel, 1, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

