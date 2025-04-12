/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.longrunning.Operation$ResultCase;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.rpc.Status;

public interface OperationOrBuilder
extends MessageLiteOrBuilder {
    public boolean getDone();

    public Status getError();

    public Any getMetadata();

    public String getName();

    public ByteString getNameBytes();

    public Any getResponse();

    public Operation$ResultCase getResultCase();

    public boolean hasError();

    public boolean hasMetadata();

    public boolean hasResponse();
}

