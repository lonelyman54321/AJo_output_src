/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Login;

import kotlin.jvm.internal.Intrinsics;

public final class UcpTokenRequest {
    private final String authCode;
    private final String clientName;
    private final String clientSecret;

    public UcpTokenRequest(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "authCode");
        Intrinsics.checkNotNullParameter(string3, "clientName");
        Intrinsics.checkNotNullParameter(string4, "clientSecret");
        this.authCode = string2;
        this.clientName = string3;
        this.clientSecret = string4;
    }

    public static /* synthetic */ UcpTokenRequest copy$default(UcpTokenRequest ucpTokenRequest, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = ucpTokenRequest.authCode;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = ucpTokenRequest.clientName;
        }
        if ((n3 &= 4) != 0) {
            string4 = ucpTokenRequest.clientSecret;
        }
        return ucpTokenRequest.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.authCode;
    }

    public final String component2() {
        return this.clientName;
    }

    public final String component3() {
        return this.clientSecret;
    }

    public final UcpTokenRequest copy(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "authCode");
        Intrinsics.checkNotNullParameter(string3, "clientName");
        Intrinsics.checkNotNullParameter(string4, "clientSecret");
        UcpTokenRequest ucpTokenRequest = new UcpTokenRequest(string2, string3, string4);
        return ucpTokenRequest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof UcpTokenRequest;
        if (!bl3) {
            return false;
        }
        object = (UcpTokenRequest)object;
        String string2 = this.authCode;
        String string3 = ((UcpTokenRequest)object).authCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.clientName;
        string3 = ((UcpTokenRequest)object).clientName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.clientSecret;
        object = ((UcpTokenRequest)object).clientSecret;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAuthCode() {
        return this.authCode;
    }

    public final String getClientName() {
        return this.clientName;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public int hashCode() {
        int n3 = this.authCode.hashCode() * 31;
        String string2 = this.clientName;
        n3 = zy_2.b(n3, 31, string2);
        return this.clientSecret.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.authCode;
        String string3 = this.clientName;
        String string4 = this.clientSecret;
        return h30_0.a(og_1.a("UcpTokenRequest(authCode=", string2, ", clientName=", string3, ", clientSecret="), string4, ")");
    }
}

