/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.longrunning.Operation;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface ListOperationsResponseOrBuilder
extends MessageLiteOrBuilder {
    public String getNextPageToken();

    public ByteString getNextPageTokenBytes();

    public Operation getOperations(int var1);

    public int getOperationsCount();

    public List getOperationsList();
}

