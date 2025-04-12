/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.rpc.PreconditionFailure$Violation;
import java.util.List;

public interface PreconditionFailureOrBuilder
extends MessageLiteOrBuilder {
    public PreconditionFailure.Violation getViolations(int var1);

    public int getViolationsCount();

    public List getViolationsList();
}

