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
import com.google.android.gms.fido.fido2.api.common.zzaf;

public class GoogleThirdPartyPaymentExtension
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final boolean zza;

    static {
        zzaf zzaf2 = new zzaf();
        CREATOR = zzaf2;
    }

    public GoogleThirdPartyPaymentExtension(boolean bl2) {
        this.zza = bl2;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof GoogleThirdPartyPaymentExtension;
        if (!bl2) {
            return false;
        }
        bl2 = this.zza;
        boolean bl3 = ((GoogleThirdPartyPaymentExtension)(object = (GoogleThirdPartyPaymentExtension)object)).getThirdPartyPayment();
        return bl2 == bl3;
    }

    public boolean getThirdPartyPayment() {
        return this.zza;
    }

    public int hashCode() {
        Boolean bl2 = this.zza;
        Object[] objectArray = new Object[]{bl2};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        boolean bl2 = this.getThirdPartyPayment();
        SafeParcelWriter.writeBoolean(parcel, 1, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

