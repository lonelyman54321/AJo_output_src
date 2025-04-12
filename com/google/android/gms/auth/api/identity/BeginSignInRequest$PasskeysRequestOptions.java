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
import com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions$Builder;
import com.google.android.gms.auth.api.identity.zbn;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class BeginSignInRequest$PasskeysRequestOptions
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final boolean zba;
    private final byte[] zbb;
    private final String zbc;

    static {
        zbn zbn2 = new zbn();
        CREATOR = zbn2;
    }

    public BeginSignInRequest$PasskeysRequestOptions(boolean bl2, byte[] byArray, String string2) {
        if (bl2) {
            Preconditions.checkNotNull(byArray);
            Preconditions.checkNotNull(string2);
        }
        this.zba = bl2;
        this.zbb = byArray;
        this.zbc = string2;
    }

    public static BeginSignInRequest$PasskeysRequestOptions$Builder builder() {
        BeginSignInRequest$PasskeysRequestOptions$Builder beginSignInRequest$PasskeysRequestOptions$Builder = new BeginSignInRequest$PasskeysRequestOptions$Builder();
        return beginSignInRequest$PasskeysRequestOptions$Builder;
    }

    public boolean equals(Object object) {
        boolean bl2;
        byte[] byArray;
        Object object2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof BeginSignInRequest$PasskeysRequestOptions;
        if (!bl4) {
            return false;
        }
        object = (BeginSignInRequest$PasskeysRequestOptions)object;
        bl4 = this.zba;
        boolean bl5 = ((BeginSignInRequest$PasskeysRequestOptions)object).zba;
        if (bl4 == bl5 && (bl4 = Arrays.equals((byte[])(object2 = this.zbb), byArray = ((BeginSignInRequest$PasskeysRequestOptions)object).zbb)) && ((object2 = (Object)this.zbc) == (object = ((BeginSignInRequest$PasskeysRequestOptions)object).zbc) || object2 != null && (bl2 = object2.equals(object)))) {
            return bl3;
        }
        return false;
    }

    public byte[] getChallenge() {
        return this.zbb;
    }

    public String getRpId() {
        return this.zbc;
    }

    public int hashCode() {
        Boolean bl2 = this.zba;
        String string2 = this.zbc;
        Object[] objectArray = new Object[]{bl2, string2};
        int n3 = Arrays.hashCode(objectArray) * 31;
        return Arrays.hashCode(this.zbb) + n3;
    }

    public boolean isSupported() {
        return this.zba;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        boolean bl2 = this.isSupported();
        SafeParcelWriter.writeBoolean(parcel, 1, bl2);
        byte[] byArray = this.getChallenge();
        SafeParcelWriter.writeByteArray(parcel, 2, byArray, false);
        String string2 = this.getRpId();
        SafeParcelWriter.writeString(parcel, 3, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

