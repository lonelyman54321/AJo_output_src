/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2.api.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.zzay;
import java.util.List;

public final class PublicKeyCredentialRequestOptions$Builder {
    private byte[] zza;
    private Double zzb;
    private String zzc;
    private List zzd;
    private Integer zze;
    private TokenBinding zzf;
    private zzay zzg;
    private AuthenticationExtensions zzh;

    public PublicKeyCredentialRequestOptions$Builder() {
    }

    public PublicKeyCredentialRequestOptions$Builder(PublicKeyCredentialRequestOptions abstractSafeParcelable) {
        if (abstractSafeParcelable != null) {
            Object object = abstractSafeParcelable.getChallenge();
            this.zza = object;
            object = abstractSafeParcelable.getTimeoutSeconds();
            this.zzb = object;
            object = abstractSafeParcelable.getRpId();
            this.zzc = object;
            object = abstractSafeParcelable.getAllowList();
            this.zzd = object;
            object = abstractSafeParcelable.getRequestId();
            this.zze = object;
            object = abstractSafeParcelable.getTokenBinding();
            this.zzf = object;
            object = (Object)abstractSafeParcelable.zza();
            this.zzg = (zzay)((Object)object);
            abstractSafeParcelable = abstractSafeParcelable.getAuthenticationExtensions();
            this.zzh = abstractSafeParcelable;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public PublicKeyCredentialRequestOptions build() {
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions;
        void var8_10;
        byte[] byArray = this.zza;
        Double d2 = this.zzb;
        String string2 = this.zzc;
        List list = this.zzd;
        Integer n3 = this.zze;
        TokenBinding tokenBinding = this.zzf;
        zzay zzay2 = this.zzg;
        if (zzay2 == null) {
            Object var8_9 = null;
        } else {
            String string3 = zzay2.toString();
        }
        void var9_13 = var8_10;
        AuthenticationExtensions authenticationExtensions = this.zzh;
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions2 = publicKeyCredentialRequestOptions;
        return new PublicKeyCredentialRequestOptions(byArray, d2, string2, list, n3, tokenBinding, (String)var9_13, authenticationExtensions, null);
    }

    public PublicKeyCredentialRequestOptions$Builder setAllowList(List list) {
        this.zzd = list;
        return this;
    }

    public PublicKeyCredentialRequestOptions$Builder setAuthenticationExtensions(AuthenticationExtensions authenticationExtensions) {
        this.zzh = authenticationExtensions;
        return this;
    }

    public PublicKeyCredentialRequestOptions$Builder setChallenge(byte[] byArray) {
        byArray = (byte[])Preconditions.checkNotNull(byArray);
        this.zza = byArray;
        return this;
    }

    public PublicKeyCredentialRequestOptions$Builder setRequestId(Integer n3) {
        this.zze = n3;
        return this;
    }

    public PublicKeyCredentialRequestOptions$Builder setRpId(String string2) {
        this.zzc = string2 = (String)Preconditions.checkNotNull(string2);
        return this;
    }

    public PublicKeyCredentialRequestOptions$Builder setTimeoutSeconds(Double d2) {
        this.zzb = d2;
        return this;
    }

    public PublicKeyCredentialRequestOptions$Builder setTokenBinding(TokenBinding tokenBinding) {
        this.zzf = tokenBinding;
        return this;
    }
}

