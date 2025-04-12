/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface StatusOrBuilder
extends MessageLiteOrBuilder {
    public int getCode();

    public Any getDetails(int var1);

    public int getDetailsCount();

    public List getDetailsList();

    public String getMessage();

    public ByteString getMessageBytes();
}

