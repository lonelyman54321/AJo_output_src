/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.AutoValue_TokenResult;
import com.google.firebase.installations.remote.AutoValue_TokenResult$1;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.installations.remote.TokenResult$Builder;
import com.google.firebase.installations.remote.TokenResult$ResponseCode;

final class AutoValue_TokenResult$Builder
extends TokenResult$Builder {
    private TokenResult$ResponseCode responseCode;
    private String token;
    private Long tokenExpirationTimestamp;

    public AutoValue_TokenResult$Builder() {
    }

    private AutoValue_TokenResult$Builder(TokenResult object) {
        Object object2 = object.getToken();
        this.token = object2;
        this.tokenExpirationTimestamp = object2 = Long.valueOf(object.getTokenExpirationTimestamp());
        object = object.getResponseCode();
        this.responseCode = object;
    }

    public /* synthetic */ AutoValue_TokenResult$Builder(TokenResult tokenResult, AutoValue_TokenResult$1 autoValue_TokenResult$1) {
        this(tokenResult);
    }

    public TokenResult build() {
        Object object = this.tokenExpirationTimestamp;
        object = object == null ? " tokenExpirationTimestamp" : "";
        boolean bl2 = ((String)object).isEmpty();
        if (bl2) {
            String string2 = this.token;
            long l2 = this.tokenExpirationTimestamp;
            TokenResult$ResponseCode tokenResult$ResponseCode = this.responseCode;
            object = new AutoValue_TokenResult(string2, l2, tokenResult$ResponseCode, null);
            return object;
        }
        object = "Missing required properties:".concat((String)object);
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public TokenResult$Builder setResponseCode(TokenResult$ResponseCode tokenResult$ResponseCode) {
        this.responseCode = tokenResult$ResponseCode;
        return this;
    }

    public TokenResult$Builder setToken(String string2) {
        this.token = string2;
        return this;
    }

    public TokenResult$Builder setTokenExpirationTimestamp(long l2) {
        Long l3;
        this.tokenExpirationTimestamp = l3 = Long.valueOf(l2);
        return this;
    }
}

