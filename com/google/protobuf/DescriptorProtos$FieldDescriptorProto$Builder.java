/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Label;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Type;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$FieldOptions;
import com.google.protobuf.DescriptorProtos$FieldOptions$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class DescriptorProtos$FieldDescriptorProto$Builder
extends GeneratedMessageLite$Builder
implements DescriptorProtos$FieldDescriptorProtoOrBuilder {
    private DescriptorProtos$FieldDescriptorProto$Builder() {
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = DescriptorProtos$FieldDescriptorProto.access$14000();
        super(descriptorProtos$FieldDescriptorProto);
    }

    public /* synthetic */ DescriptorProtos$FieldDescriptorProto$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$FieldDescriptorProto$Builder clearDefaultValue() {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$15700((DescriptorProtos$FieldDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder clearExtendee() {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$15400((DescriptorProtos$FieldDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder clearJsonName() {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$16200((DescriptorProtos$FieldDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder clearLabel() {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$14700((DescriptorProtos$FieldDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder clearName() {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$14200((DescriptorProtos$FieldDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder clearNumber() {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$14500((DescriptorProtos$FieldDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder clearOneofIndex() {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$16000((DescriptorProtos$FieldDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder clearOptions() {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$16600((DescriptorProtos$FieldDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder clearProto3Optional() {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$16800((DescriptorProtos$FieldDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder clearType() {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$14900((DescriptorProtos$FieldDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder clearTypeName() {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$15100((DescriptorProtos$FieldDescriptorProto)this.instance);
        return this;
    }

    public String getDefaultValue() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).getDefaultValue();
    }

    public ByteString getDefaultValueBytes() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).getDefaultValueBytes();
    }

    public String getExtendee() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).getExtendee();
    }

    public ByteString getExtendeeBytes() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).getExtendeeBytes();
    }

    public String getJsonName() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).getJsonName();
    }

    public ByteString getJsonNameBytes() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).getJsonNameBytes();
    }

    public DescriptorProtos$FieldDescriptorProto$Label getLabel() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).getLabel();
    }

    public String getName() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).getNameBytes();
    }

    public int getNumber() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).getNumber();
    }

    public int getOneofIndex() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).getOneofIndex();
    }

    public DescriptorProtos$FieldOptions getOptions() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).getOptions();
    }

    public boolean getProto3Optional() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).getProto3Optional();
    }

    public DescriptorProtos$FieldDescriptorProto$Type getType() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).getType();
    }

    public String getTypeName() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).getTypeName();
    }

    public ByteString getTypeNameBytes() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).getTypeNameBytes();
    }

    public boolean hasDefaultValue() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).hasDefaultValue();
    }

    public boolean hasExtendee() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).hasExtendee();
    }

    public boolean hasJsonName() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).hasJsonName();
    }

    public boolean hasLabel() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).hasLabel();
    }

    public boolean hasName() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).hasName();
    }

    public boolean hasNumber() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).hasNumber();
    }

    public boolean hasOneofIndex() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).hasOneofIndex();
    }

    public boolean hasOptions() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).hasOptions();
    }

    public boolean hasProto3Optional() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).hasProto3Optional();
    }

    public boolean hasType() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).hasType();
    }

    public boolean hasTypeName() {
        return ((DescriptorProtos$FieldDescriptorProto)this.instance).hasTypeName();
    }

    public DescriptorProtos$FieldDescriptorProto$Builder mergeOptions(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$16500((DescriptorProtos$FieldDescriptorProto)this.instance, descriptorProtos$FieldOptions);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder setDefaultValue(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$15600((DescriptorProtos$FieldDescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder setDefaultValueBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$15800((DescriptorProtos$FieldDescriptorProto)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder setExtendee(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$15300((DescriptorProtos$FieldDescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder setExtendeeBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$15500((DescriptorProtos$FieldDescriptorProto)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder setJsonName(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$16100((DescriptorProtos$FieldDescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder setJsonNameBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$16300((DescriptorProtos$FieldDescriptorProto)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder setLabel(DescriptorProtos$FieldDescriptorProto$Label descriptorProtos$FieldDescriptorProto$Label) {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$14600((DescriptorProtos$FieldDescriptorProto)this.instance, descriptorProtos$FieldDescriptorProto$Label);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder setName(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$14100((DescriptorProtos$FieldDescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$14300((DescriptorProtos$FieldDescriptorProto)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder setNumber(int n3) {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$14400((DescriptorProtos$FieldDescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder setOneofIndex(int n3) {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$15900((DescriptorProtos$FieldDescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder setOptions(DescriptorProtos$FieldOptions$Builder descriptorProtos$FieldOptionsOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = (DescriptorProtos$FieldDescriptorProto)this.instance;
        descriptorProtos$FieldOptionsOrBuilder = (DescriptorProtos$FieldOptions)descriptorProtos$FieldOptionsOrBuilder.build();
        DescriptorProtos$FieldDescriptorProto.access$16400(descriptorProtos$FieldDescriptorProto, (DescriptorProtos$FieldOptions)descriptorProtos$FieldOptionsOrBuilder);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder setOptions(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$16400((DescriptorProtos$FieldDescriptorProto)this.instance, descriptorProtos$FieldOptions);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder setProto3Optional(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$16700((DescriptorProtos$FieldDescriptorProto)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder setType(DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type) {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$14800((DescriptorProtos$FieldDescriptorProto)this.instance, descriptorProtos$FieldDescriptorProto$Type);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder setTypeName(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$15000((DescriptorProtos$FieldDescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FieldDescriptorProto$Builder setTypeNameBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FieldDescriptorProto.access$15200((DescriptorProtos$FieldDescriptorProto)this.instance, byteString);
        return this;
    }
}

