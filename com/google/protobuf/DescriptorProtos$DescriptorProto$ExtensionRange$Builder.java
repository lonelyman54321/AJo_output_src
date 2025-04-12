/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRange;
import com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder;
import com.google.protobuf.DescriptorProtos$ExtensionRangeOptions;
import com.google.protobuf.DescriptorProtos$ExtensionRangeOptions$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class DescriptorProtos$DescriptorProto$ExtensionRange$Builder
extends GeneratedMessageLite$Builder
implements DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder {
    private DescriptorProtos$DescriptorProto$ExtensionRange$Builder() {
        DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange = DescriptorProtos$DescriptorProto$ExtensionRange.access$6200();
        super(descriptorProtos$DescriptorProto$ExtensionRange);
    }

    public /* synthetic */ DescriptorProtos$DescriptorProto$ExtensionRange$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$DescriptorProto$ExtensionRange$Builder clearEnd() {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto$ExtensionRange.access$6600((DescriptorProtos$DescriptorProto$ExtensionRange)this.instance);
        return this;
    }

    public DescriptorProtos$DescriptorProto$ExtensionRange$Builder clearOptions() {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto$ExtensionRange.access$6900((DescriptorProtos$DescriptorProto$ExtensionRange)this.instance);
        return this;
    }

    public DescriptorProtos$DescriptorProto$ExtensionRange$Builder clearStart() {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto$ExtensionRange.access$6400((DescriptorProtos$DescriptorProto$ExtensionRange)this.instance);
        return this;
    }

    public int getEnd() {
        return ((DescriptorProtos$DescriptorProto$ExtensionRange)this.instance).getEnd();
    }

    public DescriptorProtos$ExtensionRangeOptions getOptions() {
        return ((DescriptorProtos$DescriptorProto$ExtensionRange)this.instance).getOptions();
    }

    public int getStart() {
        return ((DescriptorProtos$DescriptorProto$ExtensionRange)this.instance).getStart();
    }

    public boolean hasEnd() {
        return ((DescriptorProtos$DescriptorProto$ExtensionRange)this.instance).hasEnd();
    }

    public boolean hasOptions() {
        return ((DescriptorProtos$DescriptorProto$ExtensionRange)this.instance).hasOptions();
    }

    public boolean hasStart() {
        return ((DescriptorProtos$DescriptorProto$ExtensionRange)this.instance).hasStart();
    }

    public DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto$ExtensionRange.access$6800((DescriptorProtos$DescriptorProto$ExtensionRange)this.instance, descriptorProtos$ExtensionRangeOptions);
        return this;
    }

    public DescriptorProtos$DescriptorProto$ExtensionRange$Builder setEnd(int n3) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto$ExtensionRange.access$6500((DescriptorProtos$DescriptorProto$ExtensionRange)this.instance, n3);
        return this;
    }

    public DescriptorProtos$DescriptorProto$ExtensionRange$Builder setOptions(DescriptorProtos$ExtensionRangeOptions$Builder descriptorProtos$ExtensionRangeOptionsOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange = (DescriptorProtos$DescriptorProto$ExtensionRange)this.instance;
        descriptorProtos$ExtensionRangeOptionsOrBuilder = (DescriptorProtos$ExtensionRangeOptions)descriptorProtos$ExtensionRangeOptionsOrBuilder.build();
        DescriptorProtos$DescriptorProto$ExtensionRange.access$6700(descriptorProtos$DescriptorProto$ExtensionRange, (DescriptorProtos$ExtensionRangeOptions)descriptorProtos$ExtensionRangeOptionsOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$ExtensionRange$Builder setOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto$ExtensionRange.access$6700((DescriptorProtos$DescriptorProto$ExtensionRange)this.instance, descriptorProtos$ExtensionRangeOptions);
        return this;
    }

    public DescriptorProtos$DescriptorProto$ExtensionRange$Builder setStart(int n3) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto$ExtensionRange.access$6300((DescriptorProtos$DescriptorProto$ExtensionRange)this.instance, n3);
        return this;
    }
}

