/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.rpc.BadRequest$FieldViolation;
import java.util.List;

public interface BadRequestOrBuilder
extends MessageLiteOrBuilder {
    public BadRequest.FieldViolation getFieldViolations(int var1);

    public int getFieldViolationsCount();

    public List getFieldViolationsList();
}

