/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$ServiceOptions;
import com.google.protobuf.DescriptorProtos$ServiceOptionsOrBuilder;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$Builder;
import com.google.protobuf.GeneratedMessageLite$ExtendableBuilder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$ServiceOptions$Builder
extends GeneratedMessageLite$ExtendableBuilder
implements DescriptorProtos$ServiceOptionsOrBuilder {
    private DescriptorProtos$ServiceOptions$Builder() {
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = DescriptorProtos$ServiceOptions.access$37500();
        super(descriptorProtos$ServiceOptions);
    }

    public /* synthetic */ DescriptorProtos$ServiceOptions$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$ServiceOptions$Builder addAllUninterpretedOption(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$ServiceOptions.access$38100((DescriptorProtos$ServiceOptions)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$ServiceOptions$Builder addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = (DescriptorProtos$ServiceOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$ServiceOptions.access$38000(descriptorProtos$ServiceOptions, n3, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$ServiceOptions$Builder addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$ServiceOptions.access$38000((DescriptorProtos$ServiceOptions)this.instance, n3, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$ServiceOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = (DescriptorProtos$ServiceOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$ServiceOptions.access$37900(descriptorProtos$ServiceOptions, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$ServiceOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$ServiceOptions.access$37900((DescriptorProtos$ServiceOptions)this.instance, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$ServiceOptions$Builder clearDeprecated() {
        this.copyOnWrite();
        DescriptorProtos$ServiceOptions.access$37700((DescriptorProtos$ServiceOptions)this.instance);
        return this;
    }

    public DescriptorProtos$ServiceOptions$Builder clearUninterpretedOption() {
        this.copyOnWrite();
        DescriptorProtos$ServiceOptions.access$38200((DescriptorProtos$ServiceOptions)this.instance);
        return this;
    }

    public boolean getDeprecated() {
        return ((DescriptorProtos$ServiceOptions)this.instance).getDeprecated();
    }

    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int n3) {
        return ((DescriptorProtos$ServiceOptions)this.instance).getUninterpretedOption(n3);
    }

    public int getUninterpretedOptionCount() {
        return ((DescriptorProtos$ServiceOptions)this.instance).getUninterpretedOptionCount();
    }

    public List getUninterpretedOptionList() {
        return Collections.unmodifiableList(((DescriptorProtos$ServiceOptions)this.instance).getUninterpretedOptionList());
    }

    public boolean hasDeprecated() {
        return ((DescriptorProtos$ServiceOptions)this.instance).hasDeprecated();
    }

    public DescriptorProtos$ServiceOptions$Builder removeUninterpretedOption(int n3) {
        this.copyOnWrite();
        DescriptorProtos$ServiceOptions.access$38300((DescriptorProtos$ServiceOptions)this.instance, n3);
        return this;
    }

    public DescriptorProtos$ServiceOptions$Builder setDeprecated(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$ServiceOptions.access$37600((DescriptorProtos$ServiceOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$ServiceOptions$Builder setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = (DescriptorProtos$ServiceOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$ServiceOptions.access$37800(descriptorProtos$ServiceOptions, n3, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$ServiceOptions$Builder setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$ServiceOptions.access$37800((DescriptorProtos$ServiceOptions)this.instance, n3, descriptorProtos$UninterpretedOption);
        return this;
    }
}

