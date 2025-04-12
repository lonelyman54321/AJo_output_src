/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$ExtensionRangeOptions;
import com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$Builder;
import com.google.protobuf.GeneratedMessageLite$ExtendableBuilder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$ExtensionRangeOptions$Builder
extends GeneratedMessageLite$ExtendableBuilder
implements DescriptorProtos$ExtensionRangeOptionsOrBuilder {
    private DescriptorProtos$ExtensionRangeOptions$Builder() {
        DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = DescriptorProtos$ExtensionRangeOptions.access$13200();
        super(descriptorProtos$ExtensionRangeOptions);
    }

    public /* synthetic */ DescriptorProtos$ExtensionRangeOptions$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$ExtensionRangeOptions$Builder addAllUninterpretedOption(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$ExtensionRangeOptions.access$13600((DescriptorProtos$ExtensionRangeOptions)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$ExtensionRangeOptions$Builder addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = (DescriptorProtos$ExtensionRangeOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$ExtensionRangeOptions.access$13500(descriptorProtos$ExtensionRangeOptions, n3, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$ExtensionRangeOptions$Builder addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$ExtensionRangeOptions.access$13500((DescriptorProtos$ExtensionRangeOptions)this.instance, n3, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$ExtensionRangeOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = (DescriptorProtos$ExtensionRangeOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$ExtensionRangeOptions.access$13400(descriptorProtos$ExtensionRangeOptions, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$ExtensionRangeOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$ExtensionRangeOptions.access$13400((DescriptorProtos$ExtensionRangeOptions)this.instance, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$ExtensionRangeOptions$Builder clearUninterpretedOption() {
        this.copyOnWrite();
        DescriptorProtos$ExtensionRangeOptions.access$13700((DescriptorProtos$ExtensionRangeOptions)this.instance);
        return this;
    }

    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int n3) {
        return ((DescriptorProtos$ExtensionRangeOptions)this.instance).getUninterpretedOption(n3);
    }

    public int getUninterpretedOptionCount() {
        return ((DescriptorProtos$ExtensionRangeOptions)this.instance).getUninterpretedOptionCount();
    }

    public List getUninterpretedOptionList() {
        return Collections.unmodifiableList(((DescriptorProtos$ExtensionRangeOptions)this.instance).getUninterpretedOptionList());
    }

    public DescriptorProtos$ExtensionRangeOptions$Builder removeUninterpretedOption(int n3) {
        this.copyOnWrite();
        DescriptorProtos$ExtensionRangeOptions.access$13800((DescriptorProtos$ExtensionRangeOptions)this.instance, n3);
        return this;
    }

    public DescriptorProtos$ExtensionRangeOptions$Builder setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = (DescriptorProtos$ExtensionRangeOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$ExtensionRangeOptions.access$13300(descriptorProtos$ExtensionRangeOptions, n3, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$ExtensionRangeOptions$Builder setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$ExtensionRangeOptions.access$13300((DescriptorProtos$ExtensionRangeOptions)this.instance, n3, descriptorProtos$UninterpretedOption);
        return this;
    }
}

