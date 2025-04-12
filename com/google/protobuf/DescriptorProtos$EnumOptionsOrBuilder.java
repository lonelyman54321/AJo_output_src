/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder;
import java.util.List;

public interface DescriptorProtos$EnumOptionsOrBuilder
extends GeneratedMessageLite$ExtendableMessageOrBuilder {
    public boolean getAllowAlias();

    public boolean getDeprecated();

    public DescriptorProtos.UninterpretedOption getUninterpretedOption(int var1);

    public int getUninterpretedOptionCount();

    public List getUninterpretedOptionList();

    public boolean hasAllowAlias();

    public boolean hasDeprecated();
}

