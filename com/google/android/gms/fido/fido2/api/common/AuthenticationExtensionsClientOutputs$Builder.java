/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2.api.common;

import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;

public final class AuthenticationExtensionsClientOutputs$Builder {
    private UvmEntries zza;
    private AuthenticationExtensionsCredPropsOutputs zzb;

    public AuthenticationExtensionsClientOutputs build() {
        UvmEntries uvmEntries = this.zza;
        AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.zzb;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = new AuthenticationExtensionsClientOutputs(uvmEntries, null, authenticationExtensionsCredPropsOutputs, null);
        return authenticationExtensionsClientOutputs;
    }

    public AuthenticationExtensionsClientOutputs$Builder setCredProps(AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs) {
        this.zzb = authenticationExtensionsCredPropsOutputs;
        return this;
    }

    public AuthenticationExtensionsClientOutputs$Builder setUserVerificationMethodEntries(UvmEntries uvmEntries) {
        this.zza = uvmEntries;
        return this;
    }
}

