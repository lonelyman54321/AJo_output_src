/*
 * Decompiled with CFR 0.152.
 */
package com.google.cloud.audit;

import com.google.cloud.audit.AuthenticationInfo;
import com.google.cloud.audit.AuthenticationInfo$1;
import com.google.cloud.audit.AuthenticationInfoOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class AuthenticationInfo$Builder
extends GeneratedMessageLite$Builder
implements AuthenticationInfoOrBuilder {
    private AuthenticationInfo$Builder() {
        AuthenticationInfo authenticationInfo = AuthenticationInfo.access$000();
        super(authenticationInfo);
    }

    public /* synthetic */ AuthenticationInfo$Builder(AuthenticationInfo$1 authenticationInfo$1) {
        this();
    }

    public AuthenticationInfo$Builder clearPrincipalEmail() {
        this.copyOnWrite();
        AuthenticationInfo.access$200((AuthenticationInfo)this.instance);
        return this;
    }

    public String getPrincipalEmail() {
        return ((AuthenticationInfo)this.instance).getPrincipalEmail();
    }

    public ByteString getPrincipalEmailBytes() {
        return ((AuthenticationInfo)this.instance).getPrincipalEmailBytes();
    }

    public AuthenticationInfo$Builder setPrincipalEmail(String string2) {
        this.copyOnWrite();
        AuthenticationInfo.access$100((AuthenticationInfo)this.instance, string2);
        return this;
    }

    public AuthenticationInfo$Builder setPrincipalEmailBytes(ByteString byteString) {
        this.copyOnWrite();
        AuthenticationInfo.access$300((AuthenticationInfo)this.instance, byteString);
        return this;
    }
}

