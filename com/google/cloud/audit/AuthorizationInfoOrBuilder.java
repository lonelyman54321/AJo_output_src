/*
 * Decompiled with CFR 0.152.
 */
package com.google.cloud.audit;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface AuthorizationInfoOrBuilder
extends MessageLiteOrBuilder {
    public boolean getGranted();

    public String getPermission();

    public ByteString getPermissionBytes();

    public String getResource();

    public ByteString getResourceBytes();
}

