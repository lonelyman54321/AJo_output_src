/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import kotlin.jvm.internal.Intrinsics;

public final class RefreshTokenRequest {
    private final String clientName;
    private final String clientSecret;
    private final String deviceInfo;
    private final String grantType;
    private final String ucpRefreshToken;

    public RefreshTokenRequest(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "grantType");
        Intrinsics.checkNotNullParameter(string3, "ucpRefreshToken");
        Intrinsics.checkNotNullParameter(string4, "clientSecret");
        Intrinsics.checkNotNullParameter(string5, "clientName");
        Intrinsics.checkNotNullParameter(string6, "deviceInfo");
        this.grantType = string2;
        this.ucpRefreshToken = string3;
        this.clientSecret = string4;
        this.clientName = string5;
        this.deviceInfo = string6;
    }

    public static /* synthetic */ RefreshTokenRequest copy$default(RefreshTokenRequest refreshTokenRequest, String string2, String object, String string3, String object2, String string4, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = refreshTokenRequest.grantType;
        }
        if ((n4 = n3 & 2) != 0) {
            object = refreshTokenRequest.ucpRefreshToken;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = refreshTokenRequest.clientSecret;
        }
        String string5 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = refreshTokenRequest.clientName;
        }
        String string6 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = refreshTokenRequest.deviceInfo;
        }
        String string7 = string4;
        object = refreshTokenRequest;
        string3 = string2;
        object2 = object3;
        string4 = string5;
        object3 = string7;
        return refreshTokenRequest.copy(string2, (String)object2, string5, string6, string7);
    }

    public final String component1() {
        return this.grantType;
    }

    public final String component2() {
        return this.ucpRefreshToken;
    }

    public final String component3() {
        return this.clientSecret;
    }

    public final String component4() {
        return this.clientName;
    }

    public final String component5() {
        return this.deviceInfo;
    }

    public final RefreshTokenRequest copy(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "grantType");
        Intrinsics.checkNotNullParameter(string3, "ucpRefreshToken");
        Intrinsics.checkNotNullParameter(string4, "clientSecret");
        Intrinsics.checkNotNullParameter(string5, "clientName");
        Intrinsics.checkNotNullParameter(string6, "deviceInfo");
        RefreshTokenRequest refreshTokenRequest = new RefreshTokenRequest(string2, string3, string4, string5, string6);
        return refreshTokenRequest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RefreshTokenRequest;
        if (!bl3) {
            return false;
        }
        object = (RefreshTokenRequest)object;
        String string2 = this.grantType;
        String string3 = ((RefreshTokenRequest)object).grantType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.ucpRefreshToken;
        string3 = ((RefreshTokenRequest)object).ucpRefreshToken;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.clientSecret;
        string3 = ((RefreshTokenRequest)object).clientSecret;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.clientName;
        string3 = ((RefreshTokenRequest)object).clientName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.deviceInfo;
        object = ((RefreshTokenRequest)object).deviceInfo;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getClientName() {
        return this.clientName;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    public final String getGrantType() {
        return this.grantType;
    }

    public final String getUcpRefreshToken() {
        return this.ucpRefreshToken;
    }

    public int hashCode() {
        int n3 = this.grantType.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.ucpRefreshToken;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.clientSecret;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.clientName;
        n3 = zy_2.b(n3, n4, string2);
        return this.deviceInfo.hashCode() + n3;
    }

    public String toString() {
        CharSequence charSequence = this.grantType;
        String string2 = this.ucpRefreshToken;
        String string3 = this.clientSecret;
        String string4 = this.clientName;
        String string5 = this.deviceInfo;
        charSequence = og_1.a("RefreshTokenRequest(grantType=", charSequence, ", ucpRefreshToken=", string2, ", clientSecret=");
        X50.a((StringBuilder)charSequence, string3, ", clientName=", string4, ", deviceInfo=");
        return h30_0.a((StringBuilder)charSequence, string5, ")");
    }
}

