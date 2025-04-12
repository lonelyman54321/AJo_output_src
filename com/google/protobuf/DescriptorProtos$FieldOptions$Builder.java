/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$FieldOptions;
import com.google.protobuf.DescriptorProtos$FieldOptions$CType;
import com.google.protobuf.DescriptorProtos$FieldOptions$JSType;
import com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$Builder;
import com.google.protobuf.GeneratedMessageLite$ExtendableBuilder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$FieldOptions$Builder
extends GeneratedMessageLite$ExtendableBuilder
implements DescriptorProtos$FieldOptionsOrBuilder {
    private DescriptorProtos$FieldOptions$Builder() {
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = DescriptorProtos$FieldOptions.access$32500();
        super(descriptorProtos$FieldOptions);
    }

    public /* synthetic */ DescriptorProtos$FieldOptions$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$FieldOptions$Builder addAllUninterpretedOption(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions.access$34100((DescriptorProtos$FieldOptions)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = (DescriptorProtos$FieldOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$FieldOptions.access$34000(descriptorProtos$FieldOptions, n3, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions.access$34000((DescriptorProtos$FieldOptions)this.instance, n3, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = (DescriptorProtos$FieldOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$FieldOptions.access$33900(descriptorProtos$FieldOptions, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions.access$33900((DescriptorProtos$FieldOptions)this.instance, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder clearCtype() {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions.access$32700((DescriptorProtos$FieldOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder clearDeprecated() {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions.access$33500((DescriptorProtos$FieldOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder clearJstype() {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions.access$33100((DescriptorProtos$FieldOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder clearLazy() {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions.access$33300((DescriptorProtos$FieldOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder clearPacked() {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions.access$32900((DescriptorProtos$FieldOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder clearUninterpretedOption() {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions.access$34200((DescriptorProtos$FieldOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder clearWeak() {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions.access$33700((DescriptorProtos$FieldOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FieldOptions$CType getCtype() {
        return ((DescriptorProtos$FieldOptions)this.instance).getCtype();
    }

    public boolean getDeprecated() {
        return ((DescriptorProtos$FieldOptions)this.instance).getDeprecated();
    }

    public DescriptorProtos$FieldOptions$JSType getJstype() {
        return ((DescriptorProtos$FieldOptions)this.instance).getJstype();
    }

    public boolean getLazy() {
        return ((DescriptorProtos$FieldOptions)this.instance).getLazy();
    }

    public boolean getPacked() {
        return ((DescriptorProtos$FieldOptions)this.instance).getPacked();
    }

    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int n3) {
        return ((DescriptorProtos$FieldOptions)this.instance).getUninterpretedOption(n3);
    }

    public int getUninterpretedOptionCount() {
        return ((DescriptorProtos$FieldOptions)this.instance).getUninterpretedOptionCount();
    }

    public List getUninterpretedOptionList() {
        return Collections.unmodifiableList(((DescriptorProtos$FieldOptions)this.instance).getUninterpretedOptionList());
    }

    public boolean getWeak() {
        return ((DescriptorProtos$FieldOptions)this.instance).getWeak();
    }

    public boolean hasCtype() {
        return ((DescriptorProtos$FieldOptions)this.instance).hasCtype();
    }

    public boolean hasDeprecated() {
        return ((DescriptorProtos$FieldOptions)this.instance).hasDeprecated();
    }

    public boolean hasJstype() {
        return ((DescriptorProtos$FieldOptions)this.instance).hasJstype();
    }

    public boolean hasLazy() {
        return ((DescriptorProtos$FieldOptions)this.instance).hasLazy();
    }

    public boolean hasPacked() {
        return ((DescriptorProtos$FieldOptions)this.instance).hasPacked();
    }

    public boolean hasWeak() {
        return ((DescriptorProtos$FieldOptions)this.instance).hasWeak();
    }

    public DescriptorProtos$FieldOptions$Builder removeUninterpretedOption(int n3) {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions.access$34300((DescriptorProtos$FieldOptions)this.instance, n3);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder setCtype(DescriptorProtos$FieldOptions$CType descriptorProtos$FieldOptions$CType) {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions.access$32600((DescriptorProtos$FieldOptions)this.instance, descriptorProtos$FieldOptions$CType);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder setDeprecated(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions.access$33400((DescriptorProtos$FieldOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder setJstype(DescriptorProtos$FieldOptions$JSType descriptorProtos$FieldOptions$JSType) {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions.access$33000((DescriptorProtos$FieldOptions)this.instance, descriptorProtos$FieldOptions$JSType);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder setLazy(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions.access$33200((DescriptorProtos$FieldOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder setPacked(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions.access$32800((DescriptorProtos$FieldOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = (DescriptorProtos$FieldOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$FieldOptions.access$33800(descriptorProtos$FieldOptions, n3, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions.access$33800((DescriptorProtos$FieldOptions)this.instance, n3, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$FieldOptions$Builder setWeak(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$FieldOptions.access$33600((DescriptorProtos$FieldOptions)this.instance, bl2);
        return this;
    }
}

