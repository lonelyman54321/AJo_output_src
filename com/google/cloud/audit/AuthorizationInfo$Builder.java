/*
 * Decompiled with CFR 0.152.
 */
package com.google.cloud.audit;

import com.google.cloud.audit.AuthorizationInfo;
import com.google.cloud.audit.AuthorizationInfo$1;
import com.google.cloud.audit.AuthorizationInfoOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class AuthorizationInfo$Builder
extends GeneratedMessageLite$Builder
implements AuthorizationInfoOrBuilder {
    private AuthorizationInfo$Builder() {
        AuthorizationInfo authorizationInfo = AuthorizationInfo.access$000();
        super(authorizationInfo);
    }

    public /* synthetic */ AuthorizationInfo$Builder(AuthorizationInfo$1 authorizationInfo$1) {
        this();
    }

    public AuthorizationInfo$Builder clearGranted() {
        this.copyOnWrite();
        AuthorizationInfo.access$800((AuthorizationInfo)this.instance);
        return this;
    }

    public AuthorizationInfo$Builder clearPermission() {
        this.copyOnWrite();
        AuthorizationInfo.access$500((AuthorizationInfo)this.instance);
        return this;
    }

    public AuthorizationInfo$Builder clearResource() {
        this.copyOnWrite();
        AuthorizationInfo.access$200((AuthorizationInfo)this.instance);
        return this;
    }

    public boolean getGranted() {
        return ((AuthorizationInfo)this.instance).getGranted();
    }

    public String getPermission() {
        return ((AuthorizationInfo)this.instance).getPermission();
    }

    public ByteString getPermissionBytes() {
        return ((AuthorizationInfo)this.instance).getPermissionBytes();
    }

    public String getResource() {
        return ((AuthorizationInfo)this.instance).getResource();
    }

    public ByteString getResourceBytes() {
        return ((AuthorizationInfo)this.instance).getResourceBytes();
    }

    public AuthorizationInfo$Builder setGranted(boolean bl2) {
        this.copyOnWrite();
        AuthorizationInfo.access$700((AuthorizationInfo)this.instance, bl2);
        return this;
    }

    public AuthorizationInfo$Builder setPermission(String string2) {
        this.copyOnWrite();
        AuthorizationInfo.access$400((AuthorizationInfo)this.instance, string2);
        return this;
    }

    public AuthorizationInfo$Builder setPermissionBytes(ByteString byteString) {
        this.copyOnWrite();
        AuthorizationInfo.access$600((AuthorizationInfo)this.instance, byteString);
        return this;
    }

    public AuthorizationInfo$Builder setResource(String string2) {
        this.copyOnWrite();
        AuthorizationInfo.access$100((AuthorizationInfo)this.instance, string2);
        return this;
    }

    public AuthorizationInfo$Builder setResourceBytes(ByteString byteString) {
        this.copyOnWrite();
        AuthorizationInfo.access$300((AuthorizationInfo)this.instance, byteString);
        return this;
    }
}

