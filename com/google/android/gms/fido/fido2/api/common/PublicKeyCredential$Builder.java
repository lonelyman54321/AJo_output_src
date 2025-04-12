/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2.api.common;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;

public class PublicKeyCredential$Builder {
    private String zza;
    private byte[] zzb;
    private AuthenticatorResponse zzc;
    private AuthenticationExtensionsClientOutputs zzd;
    private String zze;

    public PublicKeyCredential build() {
        AuthenticatorResponse authenticatorResponse;
        AuthenticatorResponse authenticatorResponse2;
        AuthenticatorResponse authenticatorResponse3;
        AbstractSafeParcelable abstractSafeParcelable = this.zzc;
        boolean bl2 = abstractSafeParcelable instanceof AuthenticatorAttestationResponse;
        AuthenticatorResponse authenticatorResponse4 = null;
        if (bl2) {
            authenticatorResponse3 = abstractSafeParcelable;
            authenticatorResponse2 = authenticatorResponse3 = (AuthenticatorAttestationResponse)abstractSafeParcelable;
        } else {
            authenticatorResponse2 = null;
        }
        bl2 = abstractSafeParcelable instanceof AuthenticatorAssertionResponse;
        if (bl2) {
            authenticatorResponse3 = abstractSafeParcelable;
            authenticatorResponse = authenticatorResponse3 = (AuthenticatorAssertionResponse)abstractSafeParcelable;
        } else {
            authenticatorResponse = null;
        }
        bl2 = abstractSafeParcelable instanceof AuthenticatorErrorResponse;
        if (bl2) {
            authenticatorResponse4 = abstractSafeParcelable;
            authenticatorResponse4 = (AuthenticatorErrorResponse)abstractSafeParcelable;
        }
        String string2 = this.zza;
        String string3 = PublicKeyCredentialType.PUBLIC_KEY.toString();
        byte[] byArray = this.zzb;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.zzd;
        String string4 = this.zze;
        abstractSafeParcelable = new PublicKeyCredential(string2, string3, byArray, (AuthenticatorAttestationResponse)authenticatorResponse2, (AuthenticatorAssertionResponse)authenticatorResponse, (AuthenticatorErrorResponse)authenticatorResponse4, authenticationExtensionsClientOutputs, string4);
        return abstractSafeParcelable;
    }

    public PublicKeyCredential$Builder setAuthenticationExtensionsClientOutputs(AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs) {
        this.zzd = authenticationExtensionsClientOutputs;
        return this;
    }

    public PublicKeyCredential$Builder setAuthenticatorAttachment(String string2) {
        this.zze = string2;
        return this;
    }

    public PublicKeyCredential$Builder setId(String string2) {
        this.zza = string2;
        return this;
    }

    public PublicKeyCredential$Builder setRawId(byte[] byArray) {
        this.zzb = byArray;
        return this;
    }

    public PublicKeyCredential$Builder setResponse(AuthenticatorResponse authenticatorResponse) {
        this.zzc = authenticatorResponse;
        return this;
    }
}

