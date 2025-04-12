/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

public final class CredentialRequest$Builder {
    private boolean zba;
    private String[] zbb;
    private CredentialPickerConfig zbc;
    private CredentialPickerConfig zbd;
    private boolean zbe = false;
    private String zbf = null;
    private String zbg;

    public CredentialRequest build() {
        int n3;
        Object object = this.zbb;
        if (object == null) {
            n3 = 0;
            this.zbb = object = new String[0];
        }
        if ((n3 = this.zba) == 0 && (n3 = ((String[])(object = this.zbb)).length) == 0) {
            object = new IllegalStateException("At least one authentication method must be specified");
            throw object;
        }
        boolean bl2 = this.zba;
        String[] stringArray = this.zbb;
        CredentialPickerConfig credentialPickerConfig = this.zbc;
        CredentialPickerConfig credentialPickerConfig2 = this.zbd;
        boolean bl3 = this.zbe;
        String string2 = this.zbf;
        String string3 = this.zbg;
        object = new CredentialRequest(4, bl2, stringArray, credentialPickerConfig, credentialPickerConfig2, bl3, string2, string3, false);
        return object;
    }

    public CredentialRequest$Builder setAccountTypes(String ... stringArray) {
        if (stringArray == null) {
            stringArray = new String[]{};
        }
        this.zbb = stringArray;
        return this;
    }

    public CredentialRequest$Builder setCredentialHintPickerConfig(CredentialPickerConfig credentialPickerConfig) {
        this.zbd = credentialPickerConfig;
        return this;
    }

    public CredentialRequest$Builder setCredentialPickerConfig(CredentialPickerConfig credentialPickerConfig) {
        this.zbc = credentialPickerConfig;
        return this;
    }

    public CredentialRequest$Builder setIdTokenNonce(String string2) {
        this.zbg = string2;
        return this;
    }

    public CredentialRequest$Builder setIdTokenRequested(boolean bl2) {
        this.zbe = bl2;
        return this;
    }

    public CredentialRequest$Builder setPasswordLoginSupported(boolean bl2) {
        this.zba = bl2;
        return this;
    }

    public CredentialRequest$Builder setServerClientId(String string2) {
        this.zbf = string2;
        return this;
    }

    public CredentialRequest$Builder setSupportsPasswordLogin(boolean bl2) {
        this.setPasswordLoginSupported(bl2);
        return this;
    }
}

