/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest$Builder;
import com.google.android.gms.auth.api.identity.zbj;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class GetPhoneNumberHintIntentRequest
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zba;

    static {
        zbj zbj2 = new zbj();
        CREATOR = zbj2;
    }

    public GetPhoneNumberHintIntentRequest(int n3) {
        this.zba = n3;
    }

    public static GetPhoneNumberHintIntentRequest$Builder builder() {
        GetPhoneNumberHintIntentRequest$Builder getPhoneNumberHintIntentRequest$Builder = new GetPhoneNumberHintIntentRequest$Builder(null);
        return getPhoneNumberHintIntentRequest$Builder;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof GetPhoneNumberHintIntentRequest;
        if (!bl2) {
            return false;
        }
        object = (GetPhoneNumberHintIntentRequest)object;
        Integer n3 = this.zba;
        object = ((GetPhoneNumberHintIntentRequest)object).zba;
        return Objects.equal(n3, object);
    }

    public int hashCode() {
        Integer n3 = this.zba;
        Object[] objectArray = new Object[]{n3};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zba;
        SafeParcelWriter.writeInt(parcel, 1, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

