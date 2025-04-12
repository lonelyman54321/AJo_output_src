/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import java.util.List;

public final class SignRequestParams$Builder {
    Integer zza;
    Double zzb;
    Uri zzc;
    byte[] zzd;
    List zze;
    ChannelIdValue zzf;
    String zzg;

    public SignRequestParams build() {
        Integer n3 = this.zza;
        Double d2 = this.zzb;
        Uri uri = this.zzc;
        byte[] byArray = this.zzd;
        List list = this.zze;
        ChannelIdValue channelIdValue = this.zzf;
        String string2 = this.zzg;
        SignRequestParams signRequestParams = new SignRequestParams(n3, d2, uri, byArray, list, channelIdValue, string2);
        return signRequestParams;
    }

    public SignRequestParams$Builder setAppId(Uri uri) {
        this.zzc = uri;
        return this;
    }

    public SignRequestParams$Builder setChannelIdValue(ChannelIdValue channelIdValue) {
        this.zzf = channelIdValue;
        return this;
    }

    public SignRequestParams$Builder setDefaultSignChallenge(byte[] byArray) {
        this.zzd = byArray;
        return this;
    }

    public SignRequestParams$Builder setDisplayHint(String string2) {
        this.zzg = string2;
        return this;
    }

    public SignRequestParams$Builder setRegisteredKeys(List list) {
        this.zze = list;
        return this;
    }

    public SignRequestParams$Builder setRequestId(Integer n3) {
        this.zza = n3;
        return this;
    }

    public SignRequestParams$Builder setTimeoutSeconds(Double d2) {
        this.zzb = d2;
        return this;
    }
}

