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
import com.google.android.gms.fido.fido2.api.common.zzx;

public class FidoAppIdExtension
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zza;

    static {
        zzx zzx2 = new zzx();
        CREATOR = zzx2;
    }

    public FidoAppIdExtension(String string2) {
        this.zza = string2 = (String)Preconditions.checkNotNull(string2);
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof FidoAppIdExtension;
        if (!bl2) {
            return false;
        }
        object = (FidoAppIdExtension)object;
        String string2 = this.zza;
        object = ((FidoAppIdExtension)object).zza;
        return string2.equals(object);
    }

    public String getAppId() {
        return this.zza;
    }

    public int hashCode() {
        String string2 = this.zza;
        Object[] objectArray = new Object[]{string2};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.getAppId();
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

