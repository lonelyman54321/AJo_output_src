/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$OneofDescriptorProto;
import com.google.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$OneofOptions;
import com.google.protobuf.DescriptorProtos$OneofOptions$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class DescriptorProtos$OneofDescriptorProto$Builder
extends GeneratedMessageLite$Builder
implements DescriptorProtos$OneofDescriptorProtoOrBuilder {
    private DescriptorProtos$OneofDescriptorProto$Builder() {
        DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto = DescriptorProtos$OneofDescriptorProto.access$17000();
        super(descriptorProtos$OneofDescriptorProto);
    }

    public /* synthetic */ DescriptorProtos$OneofDescriptorProto$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$OneofDescriptorProto$Builder clearName() {
        this.copyOnWrite();
        DescriptorProtos$OneofDescriptorProto.access$17200((DescriptorProtos$OneofDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$OneofDescriptorProto$Builder clearOptions() {
        this.copyOnWrite();
        DescriptorProtos$OneofDescriptorProto.access$17600((DescriptorProtos$OneofDescriptorProto)this.instance);
        return this;
    }

    public String getName() {
        return ((DescriptorProtos$OneofDescriptorProto)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((DescriptorProtos$OneofDescriptorProto)this.instance).getNameBytes();
    }

    public DescriptorProtos$OneofOptions getOptions() {
        return ((DescriptorProtos$OneofDescriptorProto)this.instance).getOptions();
    }

    public boolean hasName() {
        return ((DescriptorProtos$OneofDescriptorProto)this.instance).hasName();
    }

    public boolean hasOptions() {
        return ((DescriptorProtos$OneofDescriptorProto)this.instance).hasOptions();
    }

    public DescriptorProtos$OneofDescriptorProto$Builder mergeOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
        this.copyOnWrite();
        DescriptorProtos$OneofDescriptorProto.access$17500((DescriptorProtos$OneofDescriptorProto)this.instance, descriptorProtos$OneofOptions);
        return this;
    }

    public DescriptorProtos$OneofDescriptorProto$Builder setName(String string2) {
        this.copyOnWrite();
        DescriptorProtos$OneofDescriptorProto.access$17100((DescriptorProtos$OneofDescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$OneofDescriptorProto$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$OneofDescriptorProto.access$17300((DescriptorProtos$OneofDescriptorProto)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$OneofDescriptorProto$Builder setOptions(DescriptorProtos$OneofOptions$Builder descriptorProtos$OneofOptionsOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto = (DescriptorProtos$OneofDescriptorProto)this.instance;
        descriptorProtos$OneofOptionsOrBuilder = (DescriptorProtos$OneofOptions)descriptorProtos$OneofOptionsOrBuilder.build();
        DescriptorProtos$OneofDescriptorProto.access$17400(descriptorProtos$OneofDescriptorProto, (DescriptorProtos$OneofOptions)descriptorProtos$OneofOptionsOrBuilder);
        return this;
    }

    public DescriptorProtos$OneofDescriptorProto$Builder setOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
        this.copyOnWrite();
        DescriptorProtos$OneofDescriptorProto.access$17400((DescriptorProtos$OneofDescriptorProto)this.instance, descriptorProtos$OneofOptions);
        return this;
    }
}

