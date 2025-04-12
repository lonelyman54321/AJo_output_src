/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto;
import com.google.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$EnumValueOptions;
import com.google.protobuf.DescriptorProtos$EnumValueOptions$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class DescriptorProtos$EnumValueDescriptorProto$Builder
extends GeneratedMessageLite$Builder
implements DescriptorProtos$EnumValueDescriptorProtoOrBuilder {
    private DescriptorProtos$EnumValueDescriptorProto$Builder() {
        DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto = DescriptorProtos$EnumValueDescriptorProto.access$20900();
        super(descriptorProtos$EnumValueDescriptorProto);
    }

    public /* synthetic */ DescriptorProtos$EnumValueDescriptorProto$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$EnumValueDescriptorProto$Builder clearName() {
        this.copyOnWrite();
        DescriptorProtos$EnumValueDescriptorProto.access$21100((DescriptorProtos$EnumValueDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$EnumValueDescriptorProto$Builder clearNumber() {
        this.copyOnWrite();
        DescriptorProtos$EnumValueDescriptorProto.access$21400((DescriptorProtos$EnumValueDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$EnumValueDescriptorProto$Builder clearOptions() {
        this.copyOnWrite();
        DescriptorProtos$EnumValueDescriptorProto.access$21700((DescriptorProtos$EnumValueDescriptorProto)this.instance);
        return this;
    }

    public String getName() {
        return ((DescriptorProtos$EnumValueDescriptorProto)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((DescriptorProtos$EnumValueDescriptorProto)this.instance).getNameBytes();
    }

    public int getNumber() {
        return ((DescriptorProtos$EnumValueDescriptorProto)this.instance).getNumber();
    }

    public DescriptorProtos$EnumValueOptions getOptions() {
        return ((DescriptorProtos$EnumValueDescriptorProto)this.instance).getOptions();
    }

    public boolean hasName() {
        return ((DescriptorProtos$EnumValueDescriptorProto)this.instance).hasName();
    }

    public boolean hasNumber() {
        return ((DescriptorProtos$EnumValueDescriptorProto)this.instance).hasNumber();
    }

    public boolean hasOptions() {
        return ((DescriptorProtos$EnumValueDescriptorProto)this.instance).hasOptions();
    }

    public DescriptorProtos$EnumValueDescriptorProto$Builder mergeOptions(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
        this.copyOnWrite();
        DescriptorProtos$EnumValueDescriptorProto.access$21600((DescriptorProtos$EnumValueDescriptorProto)this.instance, descriptorProtos$EnumValueOptions);
        return this;
    }

    public DescriptorProtos$EnumValueDescriptorProto$Builder setName(String string2) {
        this.copyOnWrite();
        DescriptorProtos$EnumValueDescriptorProto.access$21000((DescriptorProtos$EnumValueDescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$EnumValueDescriptorProto$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$EnumValueDescriptorProto.access$21200((DescriptorProtos$EnumValueDescriptorProto)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$EnumValueDescriptorProto$Builder setNumber(int n3) {
        this.copyOnWrite();
        DescriptorProtos$EnumValueDescriptorProto.access$21300((DescriptorProtos$EnumValueDescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$EnumValueDescriptorProto$Builder setOptions(DescriptorProtos$EnumValueOptions$Builder descriptorProtos$EnumValueOptionsOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto = (DescriptorProtos$EnumValueDescriptorProto)this.instance;
        descriptorProtos$EnumValueOptionsOrBuilder = (DescriptorProtos$EnumValueOptions)descriptorProtos$EnumValueOptionsOrBuilder.build();
        DescriptorProtos$EnumValueDescriptorProto.access$21500(descriptorProtos$EnumValueDescriptorProto, (DescriptorProtos$EnumValueOptions)descriptorProtos$EnumValueOptionsOrBuilder);
        return this;
    }

    public DescriptorProtos$EnumValueDescriptorProto$Builder setOptions(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
        this.copyOnWrite();
        DescriptorProtos$EnumValueDescriptorProto.access$21500((DescriptorProtos$EnumValueDescriptorProto)this.instance, descriptorProtos$EnumValueOptions);
        return this;
    }
}

