/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.u2f.api.common;

import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.ClientData;

public class ClientData$Builder
implements Cloneable {
    private String zza;
    private String zzb;
    private String zzc;
    private ChannelIdValue zzd;

    public ClientData$Builder() {
        ChannelIdValue channelIdValue;
        this.zzd = channelIdValue = ChannelIdValue.ABSENT;
    }

    public ClientData$Builder(String string2, String string3, String string4, ChannelIdValue channelIdValue) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = string4;
        this.zzd = channelIdValue;
    }

    public static ClientData$Builder newInstance() {
        ClientData$Builder clientData$Builder = new ClientData$Builder();
        return clientData$Builder;
    }

    public ClientData build() {
        String string2 = this.zza;
        String string3 = this.zzb;
        String string4 = this.zzc;
        ChannelIdValue channelIdValue = this.zzd;
        ClientData clientData = new ClientData(string2, string3, string4, channelIdValue);
        return clientData;
    }

    public ClientData$Builder clone() {
        String string2 = this.zza;
        String string3 = this.zzb;
        String string4 = this.zzc;
        ChannelIdValue channelIdValue = this.zzd;
        ClientData$Builder clientData$Builder = new ClientData$Builder(string2, string3, string4, channelIdValue);
        return clientData$Builder;
    }

    public ClientData$Builder setChallenge(String string2) {
        this.zzb = string2;
        return this;
    }

    public ClientData$Builder setChannelId(ChannelIdValue channelIdValue) {
        this.zzd = channelIdValue;
        return this;
    }

    public ClientData$Builder setOrigin(String string2) {
        this.zzc = string2;
        return this;
    }

    public ClientData$Builder setType(String string2) {
        this.zza = string2;
        return this;
    }
}

