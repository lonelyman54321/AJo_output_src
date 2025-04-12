/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;

public final class BrowserPublicKeyCredentialCreationOptions$Builder {
    private PublicKeyCredentialCreationOptions zza;
    private Uri zzb;
    private byte[] zzc;

    public BrowserPublicKeyCredentialCreationOptions build() {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = this.zza;
        Uri uri = this.zzb;
        byte[] byArray = this.zzc;
        BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = new BrowserPublicKeyCredentialCreationOptions(publicKeyCredentialCreationOptions, uri, byArray);
        return browserPublicKeyCredentialCreationOptions;
    }

    public BrowserPublicKeyCredentialCreationOptions$Builder setClientDataHash(byte[] byArray) {
        BrowserPublicKeyCredentialCreationOptions.zzb(byArray);
        this.zzc = byArray;
        return this;
    }

    public BrowserPublicKeyCredentialCreationOptions$Builder setOrigin(Uri uri) {
        BrowserPublicKeyCredentialCreationOptions.zza(uri);
        this.zzb = uri;
        return this;
    }

    public BrowserPublicKeyCredentialCreationOptions$Builder setPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        this.zza = publicKeyCredentialCreationOptions;
        return this;
    }
}

