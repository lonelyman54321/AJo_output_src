/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface ExprOrBuilder
extends MessageLiteOrBuilder {
    public String getDescription();

    public ByteString getDescriptionBytes();

    public String getExpression();

    public ByteString getExpressionBytes();

    public String getLocation();

    public ByteString getLocationBytes();

    public String getTitle();

    public ByteString getTitleBytes();
}

