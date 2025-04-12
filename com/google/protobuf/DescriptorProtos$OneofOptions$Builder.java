/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$OneofOptions;
import com.google.protobuf.DescriptorProtos$OneofOptionsOrBuilder;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$Builder;
import com.google.protobuf.GeneratedMessageLite$ExtendableBuilder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$OneofOptions$Builder
extends GeneratedMessageLite$ExtendableBuilder
implements DescriptorProtos$OneofOptionsOrBuilder {
    private DescriptorProtos$OneofOptions$Builder() {
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = DescriptorProtos$OneofOptions.access$34500();
        super(descriptorProtos$OneofOptions);
    }

    public /* synthetic */ DescriptorProtos$OneofOptions$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$OneofOptions$Builder addAllUninterpretedOption(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$OneofOptions.access$34900((DescriptorProtos$OneofOptions)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$OneofOptions$Builder addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = (DescriptorProtos$OneofOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$OneofOptions.access$34800(descriptorProtos$OneofOptions, n3, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$OneofOptions$Builder addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$OneofOptions.access$34800((DescriptorProtos$OneofOptions)this.instance, n3, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$OneofOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = (DescriptorProtos$OneofOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$OneofOptions.access$34700(descriptorProtos$OneofOptions, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$OneofOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$OneofOptions.access$34700((DescriptorProtos$OneofOptions)this.instance, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$OneofOptions$Builder clearUninterpretedOption() {
        this.copyOnWrite();
        DescriptorProtos$OneofOptions.access$35000((DescriptorProtos$OneofOptions)this.instance);
        return this;
    }

    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int n3) {
        return ((DescriptorProtos$OneofOptions)this.instance).getUninterpretedOption(n3);
    }

    public int getUninterpretedOptionCount() {
        return ((DescriptorProtos$OneofOptions)this.instance).getUninterpretedOptionCount();
    }

    public List getUninterpretedOptionList() {
        return Collections.unmodifiableList(((DescriptorProtos$OneofOptions)this.instance).getUninterpretedOptionList());
    }

    public DescriptorProtos$OneofOptions$Builder removeUninterpretedOption(int n3) {
        this.copyOnWrite();
        DescriptorProtos$OneofOptions.access$35100((DescriptorProtos$OneofOptions)this.instance, n3);
        return this;
    }

    public DescriptorProtos$OneofOptions$Builder setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = (DescriptorProtos$OneofOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$OneofOptions.access$34600(descriptorProtos$OneofOptions, n3, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$OneofOptions$Builder setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$OneofOptions.access$34600((DescriptorProtos$OneofOptions)this.instance, n3, descriptorProtos$UninterpretedOption);
        return this;
    }
}

