/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import java.util.List;

public final class RegisterRequestParams$Builder {
    Integer zza;
    Double zzb;
    Uri zzc;
    List zzd;
    List zze;
    ChannelIdValue zzf;
    String zzg;

    public RegisterRequestParams build() {
        Integer n3 = this.zza;
        Double d2 = this.zzb;
        Uri uri = this.zzc;
        List list = this.zzd;
        List list2 = this.zze;
        ChannelIdValue channelIdValue = this.zzf;
        String string2 = this.zzg;
        RegisterRequestParams registerRequestParams = new RegisterRequestParams(n3, d2, uri, list, list2, channelIdValue, string2);
        return registerRequestParams;
    }

    public RegisterRequestParams$Builder setAppId(Uri uri) {
        this.zzc = uri;
        return this;
    }

    public RegisterRequestParams$Builder setChannelIdValue(ChannelIdValue channelIdValue) {
        this.zzf = channelIdValue;
        return this;
    }

    public RegisterRequestParams$Builder setDisplayHint(String string2) {
        this.zzg = string2;
        return this;
    }

    public RegisterRequestParams$Builder setRegisterRequests(List list) {
        this.zzd = list;
        return this;
    }

    public RegisterRequestParams$Builder setRegisteredKeys(List list) {
        this.zze = list;
        return this;
    }

    public RegisterRequestParams$Builder setRequestId(Integer n3) {
        this.zza = n3;
        return this;
    }

    public RegisterRequestParams$Builder setTimeoutSeconds(Double d2) {
        this.zzb = d2;
        return this;
    }
}

