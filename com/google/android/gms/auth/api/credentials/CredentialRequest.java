/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Builder;
import com.google.android.gms.auth.api.credentials.zbc;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class CredentialRequest
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zba;
    private final boolean zbb;
    private final String[] zbc;
    private final CredentialPickerConfig zbd;
    private final CredentialPickerConfig zbe;
    private final boolean zbf;
    private final String zbg;
    private final String zbh;
    private final boolean zbi;

    static {
        zbc zbc2 = new zbc();
        CREATOR = zbc2;
    }

    public CredentialRequest(int n3, boolean n4, String[] stringArray, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean bl2, String string2, String string3, boolean bl3) {
        this.zba = n3;
        this.zbb = n4;
        Object object = (String[])Preconditions.checkNotNull(stringArray);
        this.zbc = object;
        if (credentialPickerConfig == null) {
            credentialPickerConfig = ((CredentialPickerConfig$Builder)object).build();
        }
        this.zbd = credentialPickerConfig;
        if (credentialPickerConfig2 == null) {
            object = new CredentialPickerConfig$Builder();
            credentialPickerConfig2 = ((CredentialPickerConfig$Builder)object).build();
        }
        this.zbe = credentialPickerConfig2;
        n4 = 3;
        if (n3 < n4) {
            this.zbf = true;
            n3 = 0;
            this.zbg = null;
            this.zbh = null;
        } else {
            this.zbf = bl2;
            this.zbg = string2;
            this.zbh = string3;
        }
        this.zbi = bl3;
    }

    public String[] getAccountTypes() {
        return this.zbc;
    }

    public Set getAccountTypesSet() {
        List<String> list = Arrays.asList(this.zbc);
        HashSet<String> hashSet = new HashSet<String>(list);
        return hashSet;
    }

    public CredentialPickerConfig getCredentialHintPickerConfig() {
        return this.zbe;
    }

    public CredentialPickerConfig getCredentialPickerConfig() {
        return this.zbd;
    }

    public String getIdTokenNonce() {
        return this.zbh;
    }

    public String getServerClientId() {
        return this.zbg;
    }

    public boolean getSupportsPasswordLogin() {
        return this.isPasswordLoginSupported();
    }

    public boolean isIdTokenRequested() {
        return this.zbf;
    }

    public boolean isPasswordLoginSupported() {
        return this.zbb;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        boolean bl2 = this.isPasswordLoginSupported();
        SafeParcelWriter.writeBoolean(parcel, 1, bl2);
        Object object = this.getAccountTypes();
        SafeParcelWriter.writeStringArray(parcel, 2, object, false);
        CredentialPickerConfig credentialPickerConfig = this.getCredentialPickerConfig();
        SafeParcelWriter.writeParcelable(parcel, 3, credentialPickerConfig, n3, false);
        credentialPickerConfig = this.getCredentialHintPickerConfig();
        SafeParcelWriter.writeParcelable(parcel, 4, credentialPickerConfig, n3, false);
        int n7 = this.isIdTokenRequested();
        SafeParcelWriter.writeBoolean(parcel, 5, n7 != 0);
        object = this.getServerClientId();
        SafeParcelWriter.writeString(parcel, 6, (String)object, false);
        object = this.getIdTokenNonce();
        SafeParcelWriter.writeString(parcel, 7, (String)object, false);
        n7 = this.zbi;
        SafeParcelWriter.writeBoolean(parcel, 8, n7 != 0);
        n7 = this.zba;
        SafeParcelWriter.writeInt(parcel, 1000, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

