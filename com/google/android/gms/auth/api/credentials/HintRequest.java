/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.zbe;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class HintRequest
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zba;
    private final CredentialPickerConfig zbb;
    private final boolean zbc;
    private final boolean zbd;
    private final String[] zbe;
    private final boolean zbf;
    private final String zbg;
    private final String zbh;

    static {
        zbe zbe2 = new zbe();
        CREATOR = zbe2;
    }

    public HintRequest(int n3, CredentialPickerConfig stringArray, boolean bl2, boolean bl3, String[] stringArray2, boolean bl4, String string2, String string3) {
        this.zba = n3;
        stringArray = (CredentialPickerConfig)Preconditions.checkNotNull(stringArray);
        this.zbb = stringArray;
        this.zbc = bl2;
        this.zbd = bl3;
        stringArray = (String[])Preconditions.checkNotNull(stringArray2);
        this.zbe = stringArray;
        int n4 = 2;
        if (n3 < n4) {
            this.zbf = true;
            this.zbg = null;
            this.zbh = null;
            return;
        }
        this.zbf = bl4;
        this.zbg = string2;
        this.zbh = string3;
    }

    public String[] getAccountTypes() {
        return this.zbe;
    }

    public CredentialPickerConfig getHintPickerConfig() {
        return this.zbb;
    }

    public String getIdTokenNonce() {
        return this.zbh;
    }

    public String getServerClientId() {
        return this.zbg;
    }

    public boolean isEmailAddressIdentifierSupported() {
        return this.zbc;
    }

    public boolean isIdTokenRequested() {
        return this.zbf;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.getHintPickerConfig();
        SafeParcelWriter.writeParcelable(parcel, 1, (Parcelable)object, n3, false);
        int n7 = this.isEmailAddressIdentifierSupported();
        SafeParcelWriter.writeBoolean(parcel, 2, n7 != 0);
        n7 = this.zbd;
        SafeParcelWriter.writeBoolean(parcel, 3, n7 != 0);
        object = this.getAccountTypes();
        SafeParcelWriter.writeStringArray(parcel, 4, object, false);
        n7 = this.isIdTokenRequested();
        SafeParcelWriter.writeBoolean(parcel, 5, n7 != 0);
        object = this.getServerClientId();
        SafeParcelWriter.writeString(parcel, 6, (String)object, false);
        object = this.getIdTokenNonce();
        SafeParcelWriter.writeString(parcel, 7, (String)object, false);
        n7 = this.zba;
        SafeParcelWriter.writeInt(parcel, 1000, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

