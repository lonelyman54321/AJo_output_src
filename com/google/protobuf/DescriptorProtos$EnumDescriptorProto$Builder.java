/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRange;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$EnumOptions;
import com.google.protobuf.DescriptorProtos$EnumOptions$Builder;
import com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto;
import com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$EnumDescriptorProto$Builder
extends GeneratedMessageLite$Builder
implements DescriptorProtos$EnumDescriptorProtoOrBuilder {
    private DescriptorProtos$EnumDescriptorProto$Builder() {
        DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = DescriptorProtos$EnumDescriptorProto.access$18400();
        super(descriptorProtos$EnumDescriptorProto);
    }

    public /* synthetic */ DescriptorProtos$EnumDescriptorProto$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$EnumDescriptorProto$Builder addAllReservedName(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$20500((DescriptorProtos$EnumDescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder addAllReservedRange(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$20000((DescriptorProtos$EnumDescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder addAllValue(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$19100((DescriptorProtos$EnumDescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder addReservedName(String string2) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$20400((DescriptorProtos$EnumDescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder addReservedNameBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$20700((DescriptorProtos$EnumDescriptorProto)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder addReservedRange(int n3, DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder descriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = (DescriptorProtos$EnumDescriptorProto)this.instance;
        descriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder = (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)descriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder.build();
        DescriptorProtos$EnumDescriptorProto.access$19900(descriptorProtos$EnumDescriptorProto, n3, (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)descriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder addReservedRange(int n3, DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$19900((DescriptorProtos$EnumDescriptorProto)this.instance, n3, descriptorProtos$EnumDescriptorProto$EnumReservedRange);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder addReservedRange(DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder descriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = (DescriptorProtos$EnumDescriptorProto)this.instance;
        descriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder = (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)descriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder.build();
        DescriptorProtos$EnumDescriptorProto.access$19800(descriptorProtos$EnumDescriptorProto, (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)descriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder addReservedRange(DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$19800((DescriptorProtos$EnumDescriptorProto)this.instance, descriptorProtos$EnumDescriptorProto$EnumReservedRange);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder addValue(int n3, DescriptorProtos$EnumValueDescriptorProto$Builder descriptorProtos$EnumValueDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = (DescriptorProtos$EnumDescriptorProto)this.instance;
        descriptorProtos$EnumValueDescriptorProtoOrBuilder = (DescriptorProtos$EnumValueDescriptorProto)descriptorProtos$EnumValueDescriptorProtoOrBuilder.build();
        DescriptorProtos$EnumDescriptorProto.access$19000(descriptorProtos$EnumDescriptorProto, n3, (DescriptorProtos$EnumValueDescriptorProto)descriptorProtos$EnumValueDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder addValue(int n3, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$19000((DescriptorProtos$EnumDescriptorProto)this.instance, n3, descriptorProtos$EnumValueDescriptorProto);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder addValue(DescriptorProtos$EnumValueDescriptorProto$Builder descriptorProtos$EnumValueDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = (DescriptorProtos$EnumDescriptorProto)this.instance;
        descriptorProtos$EnumValueDescriptorProtoOrBuilder = (DescriptorProtos$EnumValueDescriptorProto)descriptorProtos$EnumValueDescriptorProtoOrBuilder.build();
        DescriptorProtos$EnumDescriptorProto.access$18900(descriptorProtos$EnumDescriptorProto, (DescriptorProtos$EnumValueDescriptorProto)descriptorProtos$EnumValueDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder addValue(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$18900((DescriptorProtos$EnumDescriptorProto)this.instance, descriptorProtos$EnumValueDescriptorProto);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder clearName() {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$18600((DescriptorProtos$EnumDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder clearOptions() {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$19600((DescriptorProtos$EnumDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder clearReservedName() {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$20600((DescriptorProtos$EnumDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder clearReservedRange() {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$20100((DescriptorProtos$EnumDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder clearValue() {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$19200((DescriptorProtos$EnumDescriptorProto)this.instance);
        return this;
    }

    public String getName() {
        return ((DescriptorProtos$EnumDescriptorProto)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((DescriptorProtos$EnumDescriptorProto)this.instance).getNameBytes();
    }

    public DescriptorProtos$EnumOptions getOptions() {
        return ((DescriptorProtos$EnumDescriptorProto)this.instance).getOptions();
    }

    public String getReservedName(int n3) {
        return ((DescriptorProtos$EnumDescriptorProto)this.instance).getReservedName(n3);
    }

    public ByteString getReservedNameBytes(int n3) {
        return ((DescriptorProtos$EnumDescriptorProto)this.instance).getReservedNameBytes(n3);
    }

    public int getReservedNameCount() {
        return ((DescriptorProtos$EnumDescriptorProto)this.instance).getReservedNameCount();
    }

    public List getReservedNameList() {
        return Collections.unmodifiableList(((DescriptorProtos$EnumDescriptorProto)this.instance).getReservedNameList());
    }

    public DescriptorProtos$EnumDescriptorProto$EnumReservedRange getReservedRange(int n3) {
        return ((DescriptorProtos$EnumDescriptorProto)this.instance).getReservedRange(n3);
    }

    public int getReservedRangeCount() {
        return ((DescriptorProtos$EnumDescriptorProto)this.instance).getReservedRangeCount();
    }

    public List getReservedRangeList() {
        return Collections.unmodifiableList(((DescriptorProtos$EnumDescriptorProto)this.instance).getReservedRangeList());
    }

    public DescriptorProtos$EnumValueDescriptorProto getValue(int n3) {
        return ((DescriptorProtos$EnumDescriptorProto)this.instance).getValue(n3);
    }

    public int getValueCount() {
        return ((DescriptorProtos$EnumDescriptorProto)this.instance).getValueCount();
    }

    public List getValueList() {
        return Collections.unmodifiableList(((DescriptorProtos$EnumDescriptorProto)this.instance).getValueList());
    }

    public boolean hasName() {
        return ((DescriptorProtos$EnumDescriptorProto)this.instance).hasName();
    }

    public boolean hasOptions() {
        return ((DescriptorProtos$EnumDescriptorProto)this.instance).hasOptions();
    }

    public DescriptorProtos$EnumDescriptorProto$Builder mergeOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$19500((DescriptorProtos$EnumDescriptorProto)this.instance, descriptorProtos$EnumOptions);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder removeReservedRange(int n3) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$20200((DescriptorProtos$EnumDescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder removeValue(int n3) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$19300((DescriptorProtos$EnumDescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder setName(String string2) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$18500((DescriptorProtos$EnumDescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$18700((DescriptorProtos$EnumDescriptorProto)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder setOptions(DescriptorProtos$EnumOptions$Builder descriptorProtos$EnumOptionsOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = (DescriptorProtos$EnumDescriptorProto)this.instance;
        descriptorProtos$EnumOptionsOrBuilder = (DescriptorProtos$EnumOptions)descriptorProtos$EnumOptionsOrBuilder.build();
        DescriptorProtos$EnumDescriptorProto.access$19400(descriptorProtos$EnumDescriptorProto, (DescriptorProtos$EnumOptions)descriptorProtos$EnumOptionsOrBuilder);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder setOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$19400((DescriptorProtos$EnumDescriptorProto)this.instance, descriptorProtos$EnumOptions);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder setReservedName(int n3, String string2) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$20300((DescriptorProtos$EnumDescriptorProto)this.instance, n3, string2);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder setReservedRange(int n3, DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder descriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = (DescriptorProtos$EnumDescriptorProto)this.instance;
        descriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder = (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)descriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder.build();
        DescriptorProtos$EnumDescriptorProto.access$19700(descriptorProtos$EnumDescriptorProto, n3, (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)descriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder setReservedRange(int n3, DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$19700((DescriptorProtos$EnumDescriptorProto)this.instance, n3, descriptorProtos$EnumDescriptorProto$EnumReservedRange);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder setValue(int n3, DescriptorProtos$EnumValueDescriptorProto$Builder descriptorProtos$EnumValueDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = (DescriptorProtos$EnumDescriptorProto)this.instance;
        descriptorProtos$EnumValueDescriptorProtoOrBuilder = (DescriptorProtos$EnumValueDescriptorProto)descriptorProtos$EnumValueDescriptorProtoOrBuilder.build();
        DescriptorProtos$EnumDescriptorProto.access$18800(descriptorProtos$EnumDescriptorProto, n3, (DescriptorProtos$EnumValueDescriptorProto)descriptorProtos$EnumValueDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto$Builder setValue(int n3, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$EnumDescriptorProto.access$18800((DescriptorProtos$EnumDescriptorProto)this.instance, n3, descriptorProtos$EnumValueDescriptorProto);
        return this;
    }
}

