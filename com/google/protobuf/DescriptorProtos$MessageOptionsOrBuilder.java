/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder;
import java.util.List;

public interface DescriptorProtos$MessageOptionsOrBuilder
extends GeneratedMessageLite$ExtendableMessageOrBuilder {
    public boolean getDeprecated();

    public boolean getMapEntry();

    public boolean getMessageSetWireFormat();

    public boolean getNoStandardDescriptorAccessor();

    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int var1);

    public int getUninterpretedOptionCount();

    public List getUninterpretedOptionList();

    public boolean hasDeprecated();

    public boolean hasMapEntry();

    public boolean hasMessageSetWireFormat();

    public boolean hasNoStandardDescriptorAccessor();
}

