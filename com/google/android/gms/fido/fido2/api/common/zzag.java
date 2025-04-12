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
import com.google.android.gms.fido.fido2.api.common.zzah;

public final class zzag
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zza;

    static {
        zzah zzah2 = new zzah();
        CREATOR = zzah2;
    }

    public zzag(String string2) {
        this.zza = string2 = (String)Preconditions.checkNotNull(string2);
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzag;
        if (!bl2) {
            return false;
        }
        object = (zzag)object;
        String string2 = this.zza;
        object = ((zzag)object).zza;
        return string2.equals(object);
    }

    public final int hashCode() {
        String string2 = this.zza;
        Object[] objectArray = new Object[]{string2};
        return Objects.hashCode(objectArray);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.zza;
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

