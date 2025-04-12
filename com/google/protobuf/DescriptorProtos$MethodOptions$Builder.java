/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions$IdempotencyLevel;
import com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$Builder;
import com.google.protobuf.GeneratedMessageLite$ExtendableBuilder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$MethodOptions$Builder
extends GeneratedMessageLite$ExtendableBuilder
implements DescriptorProtos$MethodOptionsOrBuilder {
    private DescriptorProtos$MethodOptions$Builder() {
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = DescriptorProtos$MethodOptions.access$38500();
        super(descriptorProtos$MethodOptions);
    }

    public /* synthetic */ DescriptorProtos$MethodOptions$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$MethodOptions$Builder addAllUninterpretedOption(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$MethodOptions.access$39300((DescriptorProtos$MethodOptions)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$MethodOptions$Builder addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = (DescriptorProtos$MethodOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$MethodOptions.access$39200(descriptorProtos$MethodOptions, n3, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$MethodOptions$Builder addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$MethodOptions.access$39200((DescriptorProtos$MethodOptions)this.instance, n3, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$MethodOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = (DescriptorProtos$MethodOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$MethodOptions.access$39100(descriptorProtos$MethodOptions, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$MethodOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$MethodOptions.access$39100((DescriptorProtos$MethodOptions)this.instance, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$MethodOptions$Builder clearDeprecated() {
        this.copyOnWrite();
        DescriptorProtos$MethodOptions.access$38700((DescriptorProtos$MethodOptions)this.instance);
        return this;
    }

    public DescriptorProtos$MethodOptions$Builder clearIdempotencyLevel() {
        this.copyOnWrite();
        DescriptorProtos$MethodOptions.access$38900((DescriptorProtos$MethodOptions)this.instance);
        return this;
    }

    public DescriptorProtos$MethodOptions$Builder clearUninterpretedOption() {
        this.copyOnWrite();
        DescriptorProtos$MethodOptions.access$39400((DescriptorProtos$MethodOptions)this.instance);
        return this;
    }

    public boolean getDeprecated() {
        return ((DescriptorProtos$MethodOptions)this.instance).getDeprecated();
    }

    public DescriptorProtos$MethodOptions$IdempotencyLevel getIdempotencyLevel() {
        return ((DescriptorProtos$MethodOptions)this.instance).getIdempotencyLevel();
    }

    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int n3) {
        return ((DescriptorProtos$MethodOptions)this.instance).getUninterpretedOption(n3);
    }

    public int getUninterpretedOptionCount() {
        return ((DescriptorProtos$MethodOptions)this.instance).getUninterpretedOptionCount();
    }

    public List getUninterpretedOptionList() {
        return Collections.unmodifiableList(((DescriptorProtos$MethodOptions)this.instance).getUninterpretedOptionList());
    }

    public boolean hasDeprecated() {
        return ((DescriptorProtos$MethodOptions)this.instance).hasDeprecated();
    }

    public boolean hasIdempotencyLevel() {
        return ((DescriptorProtos$MethodOptions)this.instance).hasIdempotencyLevel();
    }

    public DescriptorProtos$MethodOptions$Builder removeUninterpretedOption(int n3) {
        this.copyOnWrite();
        DescriptorProtos$MethodOptions.access$39500((DescriptorProtos$MethodOptions)this.instance, n3);
        return this;
    }

    public DescriptorProtos$MethodOptions$Builder setDeprecated(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$MethodOptions.access$38600((DescriptorProtos$MethodOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$MethodOptions$Builder setIdempotencyLevel(DescriptorProtos$MethodOptions$IdempotencyLevel descriptorProtos$MethodOptions$IdempotencyLevel) {
        this.copyOnWrite();
        DescriptorProtos$MethodOptions.access$38800((DescriptorProtos$MethodOptions)this.instance, descriptorProtos$MethodOptions$IdempotencyLevel);
        return this;
    }

    public DescriptorProtos$MethodOptions$Builder setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = (DescriptorProtos$MethodOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$MethodOptions.access$39000(descriptorProtos$MethodOptions, n3, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$MethodOptions$Builder setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$MethodOptions.access$39000((DescriptorProtos$MethodOptions)this.instance, n3, descriptorProtos$UninterpretedOption);
        return this;
    }
}

