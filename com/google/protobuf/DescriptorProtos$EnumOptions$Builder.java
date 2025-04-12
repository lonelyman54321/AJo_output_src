/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$EnumOptions;
import com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$Builder;
import com.google.protobuf.GeneratedMessageLite$ExtendableBuilder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$EnumOptions$Builder
extends GeneratedMessageLite$ExtendableBuilder
implements DescriptorProtos$EnumOptionsOrBuilder {
    private DescriptorProtos$EnumOptions$Builder() {
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = DescriptorProtos$EnumOptions.access$35300();
        super(descriptorProtos$EnumOptions);
    }

    public /* synthetic */ DescriptorProtos$EnumOptions$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$EnumOptions$Builder addAllUninterpretedOption(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$EnumOptions.access$36100((DescriptorProtos$EnumOptions)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$EnumOptions$Builder addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = (DescriptorProtos$EnumOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$EnumOptions.access$36000(descriptorProtos$EnumOptions, n3, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$EnumOptions$Builder addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$EnumOptions.access$36000((DescriptorProtos$EnumOptions)this.instance, n3, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$EnumOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = (DescriptorProtos$EnumOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$EnumOptions.access$35900(descriptorProtos$EnumOptions, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$EnumOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$EnumOptions.access$35900((DescriptorProtos$EnumOptions)this.instance, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$EnumOptions$Builder clearAllowAlias() {
        this.copyOnWrite();
        DescriptorProtos$EnumOptions.access$35500((DescriptorProtos$EnumOptions)this.instance);
        return this;
    }

    public DescriptorProtos$EnumOptions$Builder clearDeprecated() {
        this.copyOnWrite();
        DescriptorProtos$EnumOptions.access$35700((DescriptorProtos$EnumOptions)this.instance);
        return this;
    }

    public DescriptorProtos$EnumOptions$Builder clearUninterpretedOption() {
        this.copyOnWrite();
        DescriptorProtos$EnumOptions.access$36200((DescriptorProtos$EnumOptions)this.instance);
        return this;
    }

    public boolean getAllowAlias() {
        return ((DescriptorProtos$EnumOptions)this.instance).getAllowAlias();
    }

    public boolean getDeprecated() {
        return ((DescriptorProtos$EnumOptions)this.instance).getDeprecated();
    }

    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int n3) {
        return ((DescriptorProtos$EnumOptions)this.instance).getUninterpretedOption(n3);
    }

    public int getUninterpretedOptionCount() {
        return ((DescriptorProtos$EnumOptions)this.instance).getUninterpretedOptionCount();
    }

    public List getUninterpretedOptionList() {
        return Collections.unmodifiableList(((DescriptorProtos$EnumOptions)this.instance).getUninterpretedOptionList());
    }

    public boolean hasAllowAlias() {
        return ((DescriptorProtos$EnumOptions)this.instance).hasAllowAlias();
    }

    public boolean hasDeprecated() {
        return ((DescriptorProtos$EnumOptions)this.instance).hasDeprecated();
    }

    public DescriptorProtos$EnumOptions$Builder removeUninterpretedOption(int n3) {
        this.copyOnWrite();
        DescriptorProtos$EnumOptions.access$36300((DescriptorProtos$EnumOptions)this.instance, n3);
        return this;
    }

    public DescriptorProtos$EnumOptions$Builder setAllowAlias(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$EnumOptions.access$35400((DescriptorProtos$EnumOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$EnumOptions$Builder setDeprecated(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$EnumOptions.access$35600((DescriptorProtos$EnumOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$EnumOptions$Builder setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = (DescriptorProtos$EnumOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$EnumOptions.access$35800(descriptorProtos$EnumOptions, n3, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$EnumOptions$Builder setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$EnumOptions.access$35800((DescriptorProtos$EnumOptions)this.instance, n3, descriptorProtos$UninterpretedOption);
        return this;
    }
}

