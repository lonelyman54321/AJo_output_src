/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRange;
import com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class DescriptorProtos$DescriptorProto$ReservedRange$Builder
extends GeneratedMessageLite$Builder
implements DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder {
    private DescriptorProtos$DescriptorProto$ReservedRange$Builder() {
        DescriptorProtos$DescriptorProto$ReservedRange descriptorProtos$DescriptorProto$ReservedRange = DescriptorProtos$DescriptorProto$ReservedRange.access$7100();
        super(descriptorProtos$DescriptorProto$ReservedRange);
    }

    public /* synthetic */ DescriptorProtos$DescriptorProto$ReservedRange$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$DescriptorProto$ReservedRange$Builder clearEnd() {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto$ReservedRange.access$7500((DescriptorProtos$DescriptorProto$ReservedRange)this.instance);
        return this;
    }

    public DescriptorProtos$DescriptorProto$ReservedRange$Builder clearStart() {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto$ReservedRange.access$7300((DescriptorProtos$DescriptorProto$ReservedRange)this.instance);
        return this;
    }

    public int getEnd() {
        return ((DescriptorProtos$DescriptorProto$ReservedRange)this.instance).getEnd();
    }

    public int getStart() {
        return ((DescriptorProtos$DescriptorProto$ReservedRange)this.instance).getStart();
    }

    public boolean hasEnd() {
        return ((DescriptorProtos$DescriptorProto$ReservedRange)this.instance).hasEnd();
    }

    public boolean hasStart() {
        return ((DescriptorProtos$DescriptorProto$ReservedRange)this.instance).hasStart();
    }

    public DescriptorProtos$DescriptorProto$ReservedRange$Builder setEnd(int n3) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto$ReservedRange.access$7400((DescriptorProtos$DescriptorProto$ReservedRange)this.instance, n3);
        return this;
    }

    public DescriptorProtos$DescriptorProto$ReservedRange$Builder setStart(int n3) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto$ReservedRange.access$7200((DescriptorProtos$DescriptorProto$ReservedRange)this.instance, n3);
        return this;
    }
}

