/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.identity;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions$Builder;
import com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions$Builder;
import com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions$Builder;
import com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions$Builder;
import com.google.android.gms.common.internal.Preconditions;

public final class BeginSignInRequest$Builder {
    private BeginSignInRequest$PasswordRequestOptions zba;
    private BeginSignInRequest$GoogleIdTokenRequestOptions zbb;
    private BeginSignInRequest$PasskeysRequestOptions zbc;
    private BeginSignInRequest$PasskeyJsonRequestOptions zbd;
    private String zbe;
    private boolean zbf;
    private int zbg;

    public BeginSignInRequest$Builder() {
        Object object = BeginSignInRequest$PasswordRequestOptions.builder();
        ((BeginSignInRequest$PasswordRequestOptions$Builder)object).setSupported(false);
        this.zba = object = ((BeginSignInRequest$PasswordRequestOptions$Builder)object).build();
        object = BeginSignInRequest$GoogleIdTokenRequestOptions.builder();
        ((BeginSignInRequest$GoogleIdTokenRequestOptions$Builder)object).setSupported(false);
        this.zbb = object = ((BeginSignInRequest$GoogleIdTokenRequestOptions$Builder)object).build();
        object = BeginSignInRequest$PasskeysRequestOptions.builder();
        ((BeginSignInRequest$PasskeysRequestOptions$Builder)object).setSupported(false);
        this.zbc = object = ((BeginSignInRequest$PasskeysRequestOptions$Builder)object).build();
        object = BeginSignInRequest$PasskeyJsonRequestOptions.builder();
        ((BeginSignInRequest$PasskeyJsonRequestOptions$Builder)object).setSupported(false);
        this.zbd = object = ((BeginSignInRequest$PasskeyJsonRequestOptions$Builder)object).build();
    }

    public BeginSignInRequest build() {
        BeginSignInRequest$PasswordRequestOptions beginSignInRequest$PasswordRequestOptions = this.zba;
        BeginSignInRequest$GoogleIdTokenRequestOptions beginSignInRequest$GoogleIdTokenRequestOptions = this.zbb;
        String string2 = this.zbe;
        boolean bl2 = this.zbf;
        int n3 = this.zbg;
        BeginSignInRequest$PasskeysRequestOptions beginSignInRequest$PasskeysRequestOptions = this.zbc;
        BeginSignInRequest$PasskeyJsonRequestOptions beginSignInRequest$PasskeyJsonRequestOptions = this.zbd;
        BeginSignInRequest beginSignInRequest = new BeginSignInRequest(beginSignInRequest$PasswordRequestOptions, beginSignInRequest$GoogleIdTokenRequestOptions, string2, bl2, n3, beginSignInRequest$PasskeysRequestOptions, beginSignInRequest$PasskeyJsonRequestOptions);
        return beginSignInRequest;
    }

    public BeginSignInRequest$Builder setAutoSelectEnabled(boolean bl2) {
        this.zbf = bl2;
        return this;
    }

    public BeginSignInRequest$Builder setGoogleIdTokenRequestOptions(BeginSignInRequest$GoogleIdTokenRequestOptions beginSignInRequest$GoogleIdTokenRequestOptions) {
        this.zbb = beginSignInRequest$GoogleIdTokenRequestOptions = (BeginSignInRequest$GoogleIdTokenRequestOptions)Preconditions.checkNotNull(beginSignInRequest$GoogleIdTokenRequestOptions);
        return this;
    }

    public BeginSignInRequest$Builder setPasskeyJsonSignInRequestOptions(BeginSignInRequest$PasskeyJsonRequestOptions beginSignInRequest$PasskeyJsonRequestOptions) {
        this.zbd = beginSignInRequest$PasskeyJsonRequestOptions = (BeginSignInRequest$PasskeyJsonRequestOptions)Preconditions.checkNotNull(beginSignInRequest$PasskeyJsonRequestOptions);
        return this;
    }

    public BeginSignInRequest$Builder setPasskeysSignInRequestOptions(BeginSignInRequest$PasskeysRequestOptions beginSignInRequest$PasskeysRequestOptions) {
        this.zbc = beginSignInRequest$PasskeysRequestOptions = (BeginSignInRequest$PasskeysRequestOptions)Preconditions.checkNotNull(beginSignInRequest$PasskeysRequestOptions);
        return this;
    }

    public BeginSignInRequest$Builder setPasswordRequestOptions(BeginSignInRequest$PasswordRequestOptions beginSignInRequest$PasswordRequestOptions) {
        this.zba = beginSignInRequest$PasswordRequestOptions = (BeginSignInRequest$PasswordRequestOptions)Preconditions.checkNotNull(beginSignInRequest$PasswordRequestOptions);
        return this;
    }

    public final BeginSignInRequest$Builder zba(String string2) {
        this.zbe = string2;
        return this;
    }

    public final BeginSignInRequest$Builder zbb(int n3) {
        this.zbg = n3;
        return this;
    }
}

