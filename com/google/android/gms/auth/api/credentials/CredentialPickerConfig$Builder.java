/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;

public class CredentialPickerConfig$Builder {
    private boolean zba = false;
    private boolean zbb;
    private int zbc;

    public CredentialPickerConfig$Builder() {
        boolean bl2;
        this.zbb = bl2 = true;
        this.zbc = (int)(bl2 ? 1 : 0);
    }

    public CredentialPickerConfig build() {
        boolean bl2 = this.zba;
        boolean bl3 = this.zbb;
        int n3 = this.zbc;
        CredentialPickerConfig credentialPickerConfig = new CredentialPickerConfig(2, bl2, bl3, false, n3);
        return credentialPickerConfig;
    }

    public CredentialPickerConfig$Builder setForNewAccount(boolean n3) {
        int n4 = 1;
        if (n4 == n3) {
            n4 = 3;
        }
        this.zbc = n4;
        return this;
    }

    public CredentialPickerConfig$Builder setPrompt(int n3) {
        this.zbc = n3;
        return this;
    }

    public CredentialPickerConfig$Builder setShowAddAccountButton(boolean bl2) {
        this.zba = bl2;
        return this;
    }

    public CredentialPickerConfig$Builder setShowCancelButton(boolean bl2) {
        this.zbb = bl2;
        return this;
    }
}

