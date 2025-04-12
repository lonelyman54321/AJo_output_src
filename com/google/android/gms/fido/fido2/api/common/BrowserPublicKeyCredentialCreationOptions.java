/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.zzn;

public class BrowserPublicKeyCredentialCreationOptions
extends BrowserRequestOptions {
    public static final Parcelable.Creator CREATOR;
    private final PublicKeyCredentialCreationOptions zza;
    private final Uri zzb;
    private final byte[] zzc;

    static {
        zzn zzn2 = new zzn();
        CREATOR = zzn2;
    }

    public BrowserPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, Uri uri, byte[] byArray) {
        this.zza = publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions)Preconditions.checkNotNull(publicKeyCredentialCreationOptions);
        BrowserPublicKeyCredentialCreationOptions.zzc(uri);
        this.zzb = uri;
        BrowserPublicKeyCredentialCreationOptions.zzd(byArray);
        this.zzc = byArray;
    }

    public static BrowserPublicKeyCredentialCreationOptions deserializeFromBytes(byte[] byArray) {
        Parcelable.Creator creator = CREATOR;
        return (BrowserPublicKeyCredentialCreationOptions)SafeParcelableSerializer.deserializeFromBytes(byArray, creator);
    }

    public static /* bridge */ /* synthetic */ Uri zza(Uri uri) {
        BrowserPublicKeyCredentialCreationOptions.zzc(uri);
        return uri;
    }

    public static /* bridge */ /* synthetic */ byte[] zzb(byte[] byArray) {
        BrowserPublicKeyCredentialCreationOptions.zzd(byArray);
        return byArray;
    }

    private static Uri zzc(Uri uri) {
        boolean bl2;
        Preconditions.checkNotNull(uri);
        String string2 = uri.getScheme();
        boolean bl3 = false;
        if (string2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        String string3 = "origin scheme must be non-empty";
        Preconditions.checkArgument(bl2, string3);
        string2 = uri.getAuthority();
        if (string2 != null) {
            bl3 = true;
        }
        Preconditions.checkArgument(bl3, "origin authority must be non-empty");
        return uri;
    }

    private static byte[] zzd(byte[] byArray) {
        int n3;
        int n4;
        boolean bl2 = true;
        if (byArray != null && (n4 = byArray.length) != (n3 = 32)) {
            bl2 = false;
        }
        Preconditions.checkArgument(bl2, "clientDataHash must be 32 bytes long");
        return byArray;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof BrowserPublicKeyCredentialCreationOptions;
        if (!bl3) {
            return false;
        }
        object = (BrowserPublicKeyCredentialCreationOptions)object;
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = this.zza;
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions2 = ((BrowserPublicKeyCredentialCreationOptions)object).zza;
        bl3 = Objects.equal(publicKeyCredentialCreationOptions, publicKeyCredentialCreationOptions2);
        return bl3 && (bl2 = Objects.equal(publicKeyCredentialCreationOptions = this.zzb, object = ((BrowserPublicKeyCredentialCreationOptions)object).zzb));
    }

    public AuthenticationExtensions getAuthenticationExtensions() {
        return this.zza.getAuthenticationExtensions();
    }

    public byte[] getChallenge() {
        return this.zza.getChallenge();
    }

    public byte[] getClientDataHash() {
        return this.zzc;
    }

    public Uri getOrigin() {
        return this.zzb;
    }

    public PublicKeyCredentialCreationOptions getPublicKeyCredentialCreationOptions() {
        return this.zza;
    }

    public Integer getRequestId() {
        return this.zza.getRequestId();
    }

    public Double getTimeoutSeconds() {
        return this.zza.getTimeoutSeconds();
    }

    public TokenBinding getTokenBinding() {
        return this.zza.getTokenBinding();
    }

    public int hashCode() {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = this.zza;
        Uri uri = this.zzb;
        Object[] objectArray = new Object[]{publicKeyCredentialCreationOptions, uri};
        return Objects.hashCode(objectArray);
    }

    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.getPublicKeyCredentialCreationOptions();
        SafeParcelWriter.writeParcelable(parcel, 2, (Parcelable)object, n3, false);
        Uri uri = this.getOrigin();
        SafeParcelWriter.writeParcelable(parcel, 3, (Parcelable)uri, n3, false);
        object = this.getClientDataHash();
        SafeParcelWriter.writeByteArray(parcel, 4, (byte[])object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

