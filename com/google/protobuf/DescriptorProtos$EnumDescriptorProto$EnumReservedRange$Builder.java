/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRange;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder
extends GeneratedMessageLite$Builder
implements DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder {
    private DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder() {
        DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange = DescriptorProtos$EnumDescriptorProto$EnumReservedRange.access$17800();
        super(descriptorProtos$EnumDescriptorProto$EnumReservedRange);
    }

    public /* synthetic */ DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clearEnd() {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto$EnumReservedRange.access$18200((DescriptorProtos$EnumDescriptorProto$EnumReservedRange)this.instance);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clearStart() {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto$EnumReservedRange.access$18000((DescriptorProtos$EnumDescriptorProto$EnumReservedRange)this.instance);
        return this;
    }

    public int getEnd() {
        return ((DescriptorProtos$EnumDescriptorProto$EnumReservedRange)this.instance).getEnd();
    }

    public int getStart() {
        return ((DescriptorProtos$EnumDescriptorProto$EnumReservedRange)this.instance).getStart();
    }

    public boolean hasEnd() {
        return ((DescriptorProtos$EnumDescriptorProto$EnumReservedRange)this.instance).hasEnd();
    }

    public boolean hasStart() {
        return ((DescriptorProtos$EnumDescriptorProto$EnumReservedRange)this.instance).hasStart();
    }

    public DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder setEnd(int n3) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto$EnumReservedRange.access$18100((DescriptorProtos$EnumDescriptorProto$EnumReservedRange)this.instance, n3);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder setStart(int n3) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto$EnumReservedRange.access$17900((DescriptorProtos$EnumDescriptorProto$EnumReservedRange)this.instance, n3);
        return this;
    }
}

