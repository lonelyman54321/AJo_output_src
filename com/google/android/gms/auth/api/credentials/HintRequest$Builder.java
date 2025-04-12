/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Builder;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.Preconditions;

public final class HintRequest$Builder {
    private boolean zba;
    private boolean zbb;
    private String[] zbc;
    private CredentialPickerConfig zbd;
    private boolean zbe;
    private String zbf;
    private String zbg;

    public HintRequest$Builder() {
        Object object = new CredentialPickerConfig$Builder();
        this.zbd = object = ((CredentialPickerConfig$Builder)object).build();
        this.zbe = false;
    }

    public HintRequest build() {
        int n3;
        Object object = this.zbc;
        if (object == null) {
            n3 = 0;
            this.zbc = object = new String[0];
        }
        if ((n3 = this.zba) == 0 && (n3 = this.zbb) == 0 && (n3 = ((String[])(object = this.zbc)).length) == 0) {
            object = new IllegalStateException("At least one authentication method must be specified");
            throw object;
        }
        CredentialPickerConfig credentialPickerConfig = this.zbd;
        boolean bl2 = this.zba;
        boolean bl3 = this.zbb;
        String[] stringArray = this.zbc;
        boolean bl4 = this.zbe;
        String string2 = this.zbf;
        String string3 = this.zbg;
        object = new HintRequest(2, credentialPickerConfig, bl2, bl3, stringArray, bl4, string2, string3);
        return object;
    }

    public HintRequest$Builder setAccountTypes(String ... stringArray) {
        if (stringArray == null) {
            stringArray = new String[]{};
        }
        this.zbc = stringArray;
        return this;
    }

    public HintRequest$Builder setEmailAddressIdentifierSupported(boolean bl2) {
        this.zba = bl2;
        return this;
    }

    public HintRequest$Builder setHintPickerConfig(CredentialPickerConfig credentialPickerConfig) {
        this.zbd = credentialPickerConfig = (CredentialPickerConfig)Preconditions.checkNotNull(credentialPickerConfig);
        return this;
    }

    public HintRequest$Builder setIdTokenNonce(String string2) {
        this.zbg = string2;
        return this;
    }

    public HintRequest$Builder setIdTokenRequested(boolean bl2) {
        this.zbe = bl2;
        return this;
    }

    public HintRequest$Builder setPhoneNumberIdentifierSupported(boolean bl2) {
        this.zbb = bl2;
        return this;
    }

    public HintRequest$Builder setServerClientId(String string2) {
        this.zbf = string2;
        return this;
    }
}

