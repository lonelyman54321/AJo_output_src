/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePart;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class DescriptorProtos$UninterpretedOption$NamePart$Builder
extends GeneratedMessageLite$Builder
implements DescriptorProtos$UninterpretedOption$NamePartOrBuilder {
    private DescriptorProtos$UninterpretedOption$NamePart$Builder() {
        DescriptorProtos$UninterpretedOption$NamePart descriptorProtos$UninterpretedOption$NamePart = DescriptorProtos$UninterpretedOption$NamePart.access$39700();
        super(descriptorProtos$UninterpretedOption$NamePart);
    }

    public /* synthetic */ DescriptorProtos$UninterpretedOption$NamePart$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$UninterpretedOption$NamePart$Builder clearIsExtension() {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption$NamePart.access$40200((DescriptorProtos$UninterpretedOption$NamePart)this.instance);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$NamePart$Builder clearNamePart() {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption$NamePart.access$39900((DescriptorProtos$UninterpretedOption$NamePart)this.instance);
        return this;
    }

    public boolean getIsExtension() {
        return ((DescriptorProtos$UninterpretedOption$NamePart)this.instance).getIsExtension();
    }

    public String getNamePart() {
        return ((DescriptorProtos$UninterpretedOption$NamePart)this.instance).getNamePart();
    }

    public ByteString getNamePartBytes() {
        return ((DescriptorProtos$UninterpretedOption$NamePart)this.instance).getNamePartBytes();
    }

    public boolean hasIsExtension() {
        return ((DescriptorProtos$UninterpretedOption$NamePart)this.instance).hasIsExtension();
    }

    public boolean hasNamePart() {
        return ((DescriptorProtos$UninterpretedOption$NamePart)this.instance).hasNamePart();
    }

    public DescriptorProtos$UninterpretedOption$NamePart$Builder setIsExtension(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption$NamePart.access$40100((DescriptorProtos$UninterpretedOption$NamePart)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$NamePart$Builder setNamePart(String string2) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption$NamePart.access$39800((DescriptorProtos$UninterpretedOption$NamePart)this.instance, string2);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$NamePart$Builder setNamePartBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption$NamePart.access$40000((DescriptorProtos$UninterpretedOption$NamePart)this.instance, byteString);
        return this;
    }
}

