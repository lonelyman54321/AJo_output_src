/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$MessageOptions;
import com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$Builder;
import com.google.protobuf.GeneratedMessageLite$ExtendableBuilder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$MessageOptions$Builder
extends GeneratedMessageLite$ExtendableBuilder
implements DescriptorProtos$MessageOptionsOrBuilder {
    private DescriptorProtos$MessageOptions$Builder() {
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = DescriptorProtos$MessageOptions.access$30900();
        super(descriptorProtos$MessageOptions);
    }

    public /* synthetic */ DescriptorProtos$MessageOptions$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$MessageOptions$Builder addAllUninterpretedOption(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$MessageOptions.access$32100((DescriptorProtos$MessageOptions)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$MessageOptions$Builder addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = (DescriptorProtos$MessageOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$MessageOptions.access$32000(descriptorProtos$MessageOptions, n3, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$MessageOptions$Builder addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$MessageOptions.access$32000((DescriptorProtos$MessageOptions)this.instance, n3, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$MessageOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = (DescriptorProtos$MessageOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$MessageOptions.access$31900(descriptorProtos$MessageOptions, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$MessageOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$MessageOptions.access$31900((DescriptorProtos$MessageOptions)this.instance, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$MessageOptions$Builder clearDeprecated() {
        this.copyOnWrite();
        DescriptorProtos$MessageOptions.access$31500((DescriptorProtos$MessageOptions)this.instance);
        return this;
    }

    public DescriptorProtos$MessageOptions$Builder clearMapEntry() {
        this.copyOnWrite();
        DescriptorProtos$MessageOptions.access$31700((DescriptorProtos$MessageOptions)this.instance);
        return this;
    }

    public DescriptorProtos$MessageOptions$Builder clearMessageSetWireFormat() {
        this.copyOnWrite();
        DescriptorProtos$MessageOptions.access$31100((DescriptorProtos$MessageOptions)this.instance);
        return this;
    }

    public DescriptorProtos$MessageOptions$Builder clearNoStandardDescriptorAccessor() {
        this.copyOnWrite();
        DescriptorProtos$MessageOptions.access$31300((DescriptorProtos$MessageOptions)this.instance);
        return this;
    }

    public DescriptorProtos$MessageOptions$Builder clearUninterpretedOption() {
        this.copyOnWrite();
        DescriptorProtos$MessageOptions.access$32200((DescriptorProtos$MessageOptions)this.instance);
        return this;
    }

    public boolean getDeprecated() {
        return ((DescriptorProtos$MessageOptions)this.instance).getDeprecated();
    }

    public boolean getMapEntry() {
        return ((DescriptorProtos$MessageOptions)this.instance).getMapEntry();
    }

    public boolean getMessageSetWireFormat() {
        return ((DescriptorProtos$MessageOptions)this.instance).getMessageSetWireFormat();
    }

    public boolean getNoStandardDescriptorAccessor() {
        return ((DescriptorProtos$MessageOptions)this.instance).getNoStandardDescriptorAccessor();
    }

    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int n3) {
        return ((DescriptorProtos$MessageOptions)this.instance).getUninterpretedOption(n3);
    }

    public int getUninterpretedOptionCount() {
        return ((DescriptorProtos$MessageOptions)this.instance).getUninterpretedOptionCount();
    }

    public List getUninterpretedOptionList() {
        return Collections.unmodifiableList(((DescriptorProtos$MessageOptions)this.instance).getUninterpretedOptionList());
    }

    public boolean hasDeprecated() {
        return ((DescriptorProtos$MessageOptions)this.instance).hasDeprecated();
    }

    public boolean hasMapEntry() {
        return ((DescriptorProtos$MessageOptions)this.instance).hasMapEntry();
    }

    public boolean hasMessageSetWireFormat() {
        return ((DescriptorProtos$MessageOptions)this.instance).hasMessageSetWireFormat();
    }

    public boolean hasNoStandardDescriptorAccessor() {
        return ((DescriptorProtos$MessageOptions)this.instance).hasNoStandardDescriptorAccessor();
    }

    public DescriptorProtos$MessageOptions$Builder removeUninterpretedOption(int n3) {
        this.copyOnWrite();
        DescriptorProtos$MessageOptions.access$32300((DescriptorProtos$MessageOptions)this.instance, n3);
        return this;
    }

    public DescriptorProtos$MessageOptions$Builder setDeprecated(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$MessageOptions.access$31400((DescriptorProtos$MessageOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$MessageOptions$Builder setMapEntry(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$MessageOptions.access$31600((DescriptorProtos$MessageOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$MessageOptions$Builder setMessageSetWireFormat(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$MessageOptions.access$31000((DescriptorProtos$MessageOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$MessageOptions$Builder setNoStandardDescriptorAccessor(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$MessageOptions.access$31200((DescriptorProtos$MessageOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$MessageOptions$Builder setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = (DescriptorProtos$MessageOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$MessageOptions.access$31800(descriptorProtos$MessageOptions, n3, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$MessageOptions$Builder setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$MessageOptions.access$31800((DescriptorProtos$MessageOptions)this.instance, n3, descriptorProtos$UninterpretedOption);
        return this;
    }
}

