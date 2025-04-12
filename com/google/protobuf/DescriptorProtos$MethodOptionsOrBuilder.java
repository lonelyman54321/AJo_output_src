/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$MethodOptions$IdempotencyLevel;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder;
import java.util.List;

public interface DescriptorProtos$MethodOptionsOrBuilder
extends GeneratedMessageLite$ExtendableMessageOrBuilder {
    public boolean getDeprecated();

    public DescriptorProtos$MethodOptions$IdempotencyLevel getIdempotencyLevel();

    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int var1);

    public int getUninterpretedOptionCount();

    public List getUninterpretedOptionList();

    public boolean hasDeprecated();

    public boolean hasIdempotencyLevel();
}

