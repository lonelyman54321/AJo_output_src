/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo$1;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType;

final class AutoValue_NetworkConnectionInfo
extends NetworkConnectionInfo {
    private final NetworkConnectionInfo$MobileSubtype mobileSubtype;
    private final NetworkConnectionInfo$NetworkType networkType;

    private AutoValue_NetworkConnectionInfo(NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType, NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype) {
        this.networkType = networkConnectionInfo$NetworkType;
        this.mobileSubtype = networkConnectionInfo$MobileSubtype;
    }

    public /* synthetic */ AutoValue_NetworkConnectionInfo(NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType, NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype, AutoValue_NetworkConnectionInfo$1 autoValue_NetworkConnectionInfo$1) {
        this(networkConnectionInfo$NetworkType, networkConnectionInfo$MobileSubtype);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof NetworkConnectionInfo;
        if (bl3) {
            boolean bl4;
            NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType;
            object = (NetworkConnectionInfo)object;
            Enum enum_ = this.networkType;
            if (!(enum_ == null ? (enum_ = ((NetworkConnectionInfo)object).getNetworkType()) == null : (bl3 = enum_.equals((Object)(networkConnectionInfo$NetworkType = ((NetworkConnectionInfo)object).getNetworkType())))) || !((enum_ = this.mobileSubtype) == null ? (object = ((NetworkConnectionInfo)object).getMobileSubtype()) == null : (bl4 = enum_.equals(object = ((NetworkConnectionInfo)object).getMobileSubtype())))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public NetworkConnectionInfo$MobileSubtype getMobileSubtype() {
        return this.mobileSubtype;
    }

    public NetworkConnectionInfo$NetworkType getNetworkType() {
        return this.networkType;
    }

    public int hashCode() {
        int n3;
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType = this.networkType;
        int n4 = 0;
        if (networkConnectionInfo$NetworkType == null) {
            n3 = 0;
            networkConnectionInfo$NetworkType = null;
        } else {
            n3 = ((Object)((Object)networkConnectionInfo$NetworkType)).hashCode();
        }
        int n7 = 1000003;
        n3 = (n3 ^ n7) * n7;
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype = this.mobileSubtype;
        if (networkConnectionInfo$MobileSubtype != null) {
            n4 = ((Object)((Object)networkConnectionInfo$MobileSubtype)).hashCode();
        }
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("NetworkConnectionInfo{networkType=");
        Enum enum_ = this.networkType;
        stringBuilder.append(enum_);
        stringBuilder.append(", mobileSubtype=");
        enum_ = this.mobileSubtype;
        stringBuilder.append(enum_);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

