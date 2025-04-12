/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.AutoValue_TokenResult$1;
import com.google.firebase.installations.remote.AutoValue_TokenResult$Builder;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.installations.remote.TokenResult$Builder;
import com.google.firebase.installations.remote.TokenResult$ResponseCode;

final class AutoValue_TokenResult
extends TokenResult {
    private final TokenResult$ResponseCode responseCode;
    private final String token;
    private final long tokenExpirationTimestamp;

    private AutoValue_TokenResult(String string2, long l2, TokenResult$ResponseCode tokenResult$ResponseCode) {
        this.token = string2;
        this.tokenExpirationTimestamp = l2;
        this.responseCode = tokenResult$ResponseCode;
    }

    public /* synthetic */ AutoValue_TokenResult(String string2, long l2, TokenResult$ResponseCode tokenResult$ResponseCode, AutoValue_TokenResult$1 autoValue_TokenResult$1) {
        this(string2, l2, tokenResult$ResponseCode);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof TokenResult;
        if (bl3) {
            boolean bl4;
            long l2;
            long l3;
            long l4;
            String string2;
            object = (TokenResult)object;
            Object object2 = this.token;
            if (!(object2 == null ? (object2 = ((TokenResult)object).getToken()) == null : (bl3 = ((String)object2).equals(string2 = ((TokenResult)object).getToken()))) || (bl3 = (l4 = (l3 = this.tokenExpirationTimestamp) - (l2 = ((TokenResult)object).getTokenExpirationTimestamp())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) || !((object2 = this.responseCode) == null ? (object = ((TokenResult)object).getResponseCode()) == null : (bl4 = object2.equals(object = ((TokenResult)object).getResponseCode())))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public TokenResult$ResponseCode getResponseCode() {
        return this.responseCode;
    }

    public String getToken() {
        return this.token;
    }

    public long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    public int hashCode() {
        int n3;
        String string2 = this.token;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        int n7 = 1000003;
        n3 = (n3 ^ n7) * n7;
        long l2 = this.tokenExpirationTimestamp;
        int n8 = 32;
        long l3 = l2 >>> n8;
        int n10 = (int)(l2 ^= l3);
        n3 = (n3 ^ n10) * n7;
        TokenResult$ResponseCode tokenResult$ResponseCode = this.responseCode;
        if (tokenResult$ResponseCode != null) {
            n4 = ((Object)((Object)tokenResult$ResponseCode)).hashCode();
        }
        return n3 ^ n4;
    }

    public TokenResult$Builder toBuilder() {
        AutoValue_TokenResult$Builder autoValue_TokenResult$Builder = new AutoValue_TokenResult$Builder(this, null);
        return autoValue_TokenResult$Builder;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("TokenResult{token=");
        Object object = this.token;
        stringBuilder.append((String)object);
        stringBuilder.append(", tokenExpirationTimestamp=");
        long l2 = this.tokenExpirationTimestamp;
        stringBuilder.append(l2);
        stringBuilder.append(", responseCode=");
        object = this.responseCode;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

