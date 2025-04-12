/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$EnumValueOptions;
import com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$Builder;
import com.google.protobuf.GeneratedMessageLite$ExtendableBuilder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$EnumValueOptions$Builder
extends GeneratedMessageLite$ExtendableBuilder
implements DescriptorProtos$EnumValueOptionsOrBuilder {
    private DescriptorProtos$EnumValueOptions$Builder() {
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = DescriptorProtos$EnumValueOptions.access$36500();
        super(descriptorProtos$EnumValueOptions);
    }

    public /* synthetic */ DescriptorProtos$EnumValueOptions$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$EnumValueOptions$Builder addAllUninterpretedOption(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$EnumValueOptions.access$37100((DescriptorProtos$EnumValueOptions)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$EnumValueOptions$Builder addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = (DescriptorProtos$EnumValueOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$EnumValueOptions.access$37000(descriptorProtos$EnumValueOptions, n3, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$EnumValueOptions$Builder addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$EnumValueOptions.access$37000((DescriptorProtos$EnumValueOptions)this.instance, n3, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$EnumValueOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = (DescriptorProtos$EnumValueOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$EnumValueOptions.access$36900(descriptorProtos$EnumValueOptions, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$EnumValueOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$EnumValueOptions.access$36900((DescriptorProtos$EnumValueOptions)this.instance, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$EnumValueOptions$Builder clearDeprecated() {
        this.copyOnWrite();
        DescriptorProtos$EnumValueOptions.access$36700((DescriptorProtos$EnumValueOptions)this.instance);
        return this;
    }

    public DescriptorProtos$EnumValueOptions$Builder clearUninterpretedOption() {
        this.copyOnWrite();
        DescriptorProtos$EnumValueOptions.access$37200((DescriptorProtos$EnumValueOptions)this.instance);
        return this;
    }

    public boolean getDeprecated() {
        return ((DescriptorProtos$EnumValueOptions)this.instance).getDeprecated();
    }

    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int n3) {
        return ((DescriptorProtos$EnumValueOptions)this.instance).getUninterpretedOption(n3);
    }

    public int getUninterpretedOptionCount() {
        return ((DescriptorProtos$EnumValueOptions)this.instance).getUninterpretedOptionCount();
    }

    public List getUninterpretedOptionList() {
        return Collections.unmodifiableList(((DescriptorProtos$EnumValueOptions)this.instance).getUninterpretedOptionList());
    }

    public boolean hasDeprecated() {
        return ((DescriptorProtos$EnumValueOptions)this.instance).hasDeprecated();
    }

    public DescriptorProtos$EnumValueOptions$Builder removeUninterpretedOption(int n3) {
        this.copyOnWrite();
        DescriptorProtos$EnumValueOptions.access$37300((DescriptorProtos$EnumValueOptions)this.instance, n3);
        return this;
    }

    public DescriptorProtos$EnumValueOptions$Builder setDeprecated(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$EnumValueOptions.access$36600((DescriptorProtos$EnumValueOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$EnumValueOptions$Builder setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = (DescriptorProtos$EnumValueOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$EnumValueOptions.access$36800(descriptorProtos$EnumValueOptions, n3, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$EnumValueOptions$Builder setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$EnumValueOptions.access$36800((DescriptorProtos$EnumValueOptions)this.instance, n3, descriptorProtos$UninterpretedOption);
        return this;
    }
}

