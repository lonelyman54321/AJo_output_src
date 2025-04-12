/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2.api.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.List;

public final class PublicKeyCredentialCreationOptions$Builder {
    private PublicKeyCredentialRpEntity zza;
    private PublicKeyCredentialUserEntity zzb;
    private byte[] zzc;
    private List zzd;
    private Double zze;
    private List zzf;
    private AuthenticatorSelectionCriteria zzg;
    private Integer zzh;
    private TokenBinding zzi;
    private AttestationConveyancePreference zzj;
    private AuthenticationExtensions zzk;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public PublicKeyCredentialCreationOptions build() {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions;
        void var11_13;
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.zza;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.zzb;
        byte[] byArray = this.zzc;
        List list = this.zzd;
        Double d2 = this.zze;
        List list2 = this.zzf;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.zzg;
        Integer n3 = this.zzh;
        TokenBinding tokenBinding = this.zzi;
        AttestationConveyancePreference attestationConveyancePreference = this.zzj;
        if (attestationConveyancePreference == null) {
            Object var11_12 = null;
        } else {
            String string2 = attestationConveyancePreference.toString();
        }
        void var12_16 = var11_13;
        AuthenticationExtensions authenticationExtensions = this.zzk;
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions2 = publicKeyCredentialCreationOptions;
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, byArray, list, d2, list2, authenticatorSelectionCriteria, n3, tokenBinding, (String)var12_16, authenticationExtensions);
    }

    public PublicKeyCredentialCreationOptions$Builder setAttestationConveyancePreference(AttestationConveyancePreference attestationConveyancePreference) {
        this.zzj = attestationConveyancePreference;
        return this;
    }

    public PublicKeyCredentialCreationOptions$Builder setAuthenticationExtensions(AuthenticationExtensions authenticationExtensions) {
        this.zzk = authenticationExtensions;
        return this;
    }

    public PublicKeyCredentialCreationOptions$Builder setAuthenticatorSelection(AuthenticatorSelectionCriteria authenticatorSelectionCriteria) {
        this.zzg = authenticatorSelectionCriteria;
        return this;
    }

    public PublicKeyCredentialCreationOptions$Builder setChallenge(byte[] byArray) {
        byArray = (byte[])Preconditions.checkNotNull(byArray);
        this.zzc = byArray;
        return this;
    }

    public PublicKeyCredentialCreationOptions$Builder setExcludeList(List list) {
        this.zzf = list;
        return this;
    }

    public PublicKeyCredentialCreationOptions$Builder setParameters(List list) {
        this.zzd = list = (List)Preconditions.checkNotNull(list);
        return this;
    }

    public PublicKeyCredentialCreationOptions$Builder setRequestId(Integer n3) {
        this.zzh = n3;
        return this;
    }

    public PublicKeyCredentialCreationOptions$Builder setRp(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity) {
        this.zza = publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity)Preconditions.checkNotNull(publicKeyCredentialRpEntity);
        return this;
    }

    public PublicKeyCredentialCreationOptions$Builder setTimeoutSeconds(Double d2) {
        this.zze = d2;
        return this;
    }

    public PublicKeyCredentialCreationOptions$Builder setTokenBinding(TokenBinding tokenBinding) {
        this.zzi = tokenBinding;
        return this;
    }

    public PublicKeyCredentialCreationOptions$Builder setUser(PublicKeyCredentialUserEntity publicKeyCredentialUserEntity) {
        this.zzb = publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity)Preconditions.checkNotNull(publicKeyCredentialUserEntity);
        return this;
    }
}

