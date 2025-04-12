/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePart;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface DescriptorProtos$UninterpretedOptionOrBuilder
extends MessageLiteOrBuilder {
    public String getAggregateValue();

    public ByteString getAggregateValueBytes();

    public double getDoubleValue();

    public String getIdentifierValue();

    public ByteString getIdentifierValueBytes();

    public DescriptorProtos.UninterpretedOption.NamePart getName(int var1);

    public int getNameCount();

    public List getNameList();

    public long getNegativeIntValue();

    public long getPositiveIntValue();

    public ByteString getStringValue();

    public boolean hasAggregateValue();

    public boolean hasDoubleValue();

    public boolean hasIdentifierValue();

    public boolean hasNegativeIntValue();

    public boolean hasPositiveIntValue();

    public boolean hasStringValue();
}

