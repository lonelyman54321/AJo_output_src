/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.zbf;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class IdToken
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zba;
    private final String zbb;

    static {
        zbf zbf2 = new zbf();
        CREATOR = zbf2;
    }

    public IdToken(String string2, String string3) {
        Preconditions.checkArgument(TextUtils.isEmpty((CharSequence)string2) ^ true, "account type string cannot be null or empty");
        Preconditions.checkArgument(TextUtils.isEmpty((CharSequence)string3) ^ true, "id token string cannot be null or empty");
        this.zba = string2;
        this.zbb = string3;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof IdToken;
        if (!bl4) {
            return false;
        }
        object = (IdToken)object;
        String string2 = this.zba;
        String string3 = ((IdToken)object).zba;
        bl4 = Objects.equal(string2, string3);
        if (bl4 && (bl2 = Objects.equal(string2 = this.zbb, object = ((IdToken)object).zbb))) {
            return bl3;
        }
        return false;
    }

    public String getAccountType() {
        return this.zba;
    }

    public String getIdToken() {
        return this.zbb;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.getAccountType();
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        String string3 = this.getIdToken();
        SafeParcelWriter.writeString(parcel, 2, string3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

