/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.rpc.QuotaFailure$Violation;
import java.util.List;

public interface QuotaFailureOrBuilder
extends MessageLiteOrBuilder {
    public QuotaFailure.Violation getViolations(int var1);

    public int getViolationsCount();

    public List getViolationsList();
}

