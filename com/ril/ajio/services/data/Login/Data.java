/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Login;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Data {
    private final String accessToken;
    private final int expires;
    private final String refreshToken;
    private final String tokenProvider;
    private final String tokenType;

    public Data(String string2, int n3, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "accessToken");
        Intrinsics.checkNotNullParameter(string3, "refreshToken");
        this.accessToken = string2;
        this.expires = n3;
        this.refreshToken = string3;
        this.tokenProvider = string4;
        this.tokenType = string5;
    }

    public /* synthetic */ Data(String string2, int n3, String string3, String string4, String string5, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 8;
        String string6 = n7 != 0 ? null : string4;
        int n8 = n4 & 0x10;
        String string7 = n8 != 0 ? null : string5;
        this(string2, n3, string3, string6, string7);
    }

    public static /* synthetic */ Data copy$default(Data data, String string2, int n3, String string3, String string4, String string5, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = data.accessToken;
        }
        if ((n7 = n4 & 2) != 0) {
            n3 = data.expires;
        }
        n7 = n3;
        n3 = n4 & 4;
        if (n3 != 0) {
            string3 = data.refreshToken;
        }
        String string6 = string3;
        n3 = n4 & 8;
        if (n3 != 0) {
            string4 = data.tokenProvider;
        }
        String string7 = string4;
        n3 = n4 & 0x10;
        if (n3 != 0) {
            string5 = data.tokenType;
        }
        String string8 = string5;
        string3 = string2;
        string5 = string6;
        return data.copy(string2, n7, string6, string7, string8);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final int component2() {
        return this.expires;
    }

    public final String component3() {
        return this.refreshToken;
    }

    public final String component4() {
        return this.tokenProvider;
    }

    public final String component5() {
        return this.tokenType;
    }

    public final Data copy(String string2, int n3, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "accessToken");
        Intrinsics.checkNotNullParameter(string3, "refreshToken");
        Data data = new Data(string2, n3, string3, string4, string5);
        return data;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Data;
        if (n3 == 0) {
            return false;
        }
        object = (Data)object;
        String string2 = this.accessToken;
        String string3 = ((Data)object).accessToken;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.expires;
        int n4 = ((Data)object).expires;
        if (n3 != n4) {
            return false;
        }
        string2 = this.refreshToken;
        string3 = ((Data)object).refreshToken;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.tokenProvider;
        string3 = ((Data)object).tokenProvider;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.tokenType;
        object = ((Data)object).tokenType;
        boolean bl3 = Intrinsics.areEqual(string2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final int getExpires() {
        return this.expires;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getTokenProvider() {
        return this.tokenProvider;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        String string2 = this.accessToken;
        int n3 = string2.hashCode();
        int n4 = 31;
        n3 *= 31;
        int n7 = this.expires;
        n3 = (n3 + n7) * 31;
        String string3 = this.refreshToken;
        n3 = zy_2.b(n3, n4, string3);
        string3 = this.tokenProvider;
        int n8 = 0;
        if (string3 == null) {
            n7 = 0;
            string3 = null;
        } else {
            n7 = string3.hashCode();
        }
        n3 = (n3 + n7) * 31;
        String string4 = this.tokenType;
        if (string4 != null) {
            n8 = string4.hashCode();
        }
        return n3 + n8;
    }

    public String toString() {
        CharSequence charSequence = this.accessToken;
        int n3 = this.expires;
        String string2 = this.refreshToken;
        String string3 = this.tokenProvider;
        String string4 = this.tokenType;
        charSequence = oe3_0.a(n3, "Data(accessToken=", charSequence, ", expires=", ", refreshToken=");
        X50.a((StringBuilder)charSequence, string2, ", tokenProvider=", string3, ", tokenType=");
        return h30_0.a((StringBuilder)charSequence, string4, ")");
    }
}

