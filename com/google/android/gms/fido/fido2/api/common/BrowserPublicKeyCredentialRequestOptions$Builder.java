/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

public final class BrowserPublicKeyCredentialRequestOptions$Builder {
    private PublicKeyCredentialRequestOptions zza;
    private Uri zzb;
    private byte[] zzc;

    public BrowserPublicKeyCredentialRequestOptions build() {
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = this.zza;
        Uri uri = this.zzb;
        byte[] byArray = this.zzc;
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = new BrowserPublicKeyCredentialRequestOptions(publicKeyCredentialRequestOptions, uri, byArray);
        return browserPublicKeyCredentialRequestOptions;
    }

    public BrowserPublicKeyCredentialRequestOptions$Builder setClientDataHash(byte[] byArray) {
        BrowserPublicKeyCredentialRequestOptions.zzb(byArray);
        this.zzc = byArray;
        return this;
    }

    public BrowserPublicKeyCredentialRequestOptions$Builder setOrigin(Uri uri) {
        BrowserPublicKeyCredentialRequestOptions.zza(uri);
        this.zzb = uri;
        return this;
    }

    public BrowserPublicKeyCredentialRequestOptions$Builder setPublicKeyCredentialRequestOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        this.zza = publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions)Preconditions.checkNotNull(publicKeyCredentialRequestOptions);
        return this;
    }
}

