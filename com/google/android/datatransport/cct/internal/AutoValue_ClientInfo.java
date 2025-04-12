/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.AutoValue_ClientInfo$1;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ClientInfo$ClientType;

final class AutoValue_ClientInfo
extends ClientInfo {
    private final AndroidClientInfo androidClientInfo;
    private final ClientInfo$ClientType clientType;

    private AutoValue_ClientInfo(ClientInfo$ClientType clientInfo$ClientType, AndroidClientInfo androidClientInfo) {
        this.clientType = clientInfo$ClientType;
        this.androidClientInfo = androidClientInfo;
    }

    public /* synthetic */ AutoValue_ClientInfo(ClientInfo$ClientType clientInfo$ClientType, AndroidClientInfo androidClientInfo, AutoValue_ClientInfo$1 autoValue_ClientInfo$1) {
        this(clientInfo$ClientType, androidClientInfo);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof ClientInfo;
        if (bl3) {
            boolean bl4;
            ClientInfo$ClientType clientInfo$ClientType;
            object = (ClientInfo)object;
            Object object2 = this.clientType;
            if (!(object2 == null ? (object2 = ((ClientInfo)object).getClientType()) == null : (bl3 = ((Object)object2).equals((Object)(clientInfo$ClientType = ((ClientInfo)object).getClientType())))) || !((object2 = this.androidClientInfo) == null ? (object = ((ClientInfo)object).getAndroidClientInfo()) == null : (bl4 = ((Object)object2).equals(object = ((ClientInfo)object).getAndroidClientInfo())))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public AndroidClientInfo getAndroidClientInfo() {
        return this.androidClientInfo;
    }

    public ClientInfo$ClientType getClientType() {
        return this.clientType;
    }

    public int hashCode() {
        int n3;
        ClientInfo$ClientType clientInfo$ClientType = this.clientType;
        int n4 = 0;
        if (clientInfo$ClientType == null) {
            n3 = 0;
            clientInfo$ClientType = null;
        } else {
            n3 = ((Object)((Object)clientInfo$ClientType)).hashCode();
        }
        int n7 = 1000003;
        n3 = (n3 ^ n7) * n7;
        AndroidClientInfo androidClientInfo = this.androidClientInfo;
        if (androidClientInfo != null) {
            n4 = androidClientInfo.hashCode();
        }
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ClientInfo{clientType=");
        Object object = this.clientType;
        stringBuilder.append(object);
        stringBuilder.append(", androidClientInfo=");
        object = this.androidClientInfo;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

