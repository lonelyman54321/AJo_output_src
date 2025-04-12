/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePart;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePart$Builder;
import com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$UninterpretedOption$Builder
extends GeneratedMessageLite$Builder
implements DescriptorProtos$UninterpretedOptionOrBuilder {
    private DescriptorProtos$UninterpretedOption$Builder() {
        DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = DescriptorProtos$UninterpretedOption.access$40400();
        super(descriptorProtos$UninterpretedOption);
    }

    public /* synthetic */ DescriptorProtos$UninterpretedOption$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$UninterpretedOption$Builder addAllName(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$40800((DescriptorProtos$UninterpretedOption)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder addName(int n3, DescriptorProtos$UninterpretedOption$NamePart$Builder descriptorProtos$UninterpretedOption$NamePartOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = (DescriptorProtos$UninterpretedOption)this.instance;
        descriptorProtos$UninterpretedOption$NamePartOrBuilder = (DescriptorProtos$UninterpretedOption$NamePart)descriptorProtos$UninterpretedOption$NamePartOrBuilder.build();
        DescriptorProtos$UninterpretedOption.access$40700(descriptorProtos$UninterpretedOption, n3, (DescriptorProtos$UninterpretedOption$NamePart)descriptorProtos$UninterpretedOption$NamePartOrBuilder);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder addName(int n3, DescriptorProtos$UninterpretedOption$NamePart descriptorProtos$UninterpretedOption$NamePart) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$40700((DescriptorProtos$UninterpretedOption)this.instance, n3, descriptorProtos$UninterpretedOption$NamePart);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder addName(DescriptorProtos$UninterpretedOption$NamePart$Builder descriptorProtos$UninterpretedOption$NamePartOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = (DescriptorProtos$UninterpretedOption)this.instance;
        descriptorProtos$UninterpretedOption$NamePartOrBuilder = (DescriptorProtos$UninterpretedOption$NamePart)descriptorProtos$UninterpretedOption$NamePartOrBuilder.build();
        DescriptorProtos$UninterpretedOption.access$40600(descriptorProtos$UninterpretedOption, (DescriptorProtos$UninterpretedOption$NamePart)descriptorProtos$UninterpretedOption$NamePartOrBuilder);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder addName(DescriptorProtos$UninterpretedOption$NamePart descriptorProtos$UninterpretedOption$NamePart) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$40600((DescriptorProtos$UninterpretedOption)this.instance, descriptorProtos$UninterpretedOption$NamePart);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder clearAggregateValue() {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$42300((DescriptorProtos$UninterpretedOption)this.instance);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder clearDoubleValue() {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$41900((DescriptorProtos$UninterpretedOption)this.instance);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder clearIdentifierValue() {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$41200((DescriptorProtos$UninterpretedOption)this.instance);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder clearName() {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$40900((DescriptorProtos$UninterpretedOption)this.instance);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder clearNegativeIntValue() {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$41700((DescriptorProtos$UninterpretedOption)this.instance);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder clearPositiveIntValue() {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$41500((DescriptorProtos$UninterpretedOption)this.instance);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder clearStringValue() {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$42100((DescriptorProtos$UninterpretedOption)this.instance);
        return this;
    }

    public String getAggregateValue() {
        return ((DescriptorProtos$UninterpretedOption)this.instance).getAggregateValue();
    }

    public ByteString getAggregateValueBytes() {
        return ((DescriptorProtos$UninterpretedOption)this.instance).getAggregateValueBytes();
    }

    public double getDoubleValue() {
        return ((DescriptorProtos$UninterpretedOption)this.instance).getDoubleValue();
    }

    public String getIdentifierValue() {
        return ((DescriptorProtos$UninterpretedOption)this.instance).getIdentifierValue();
    }

    public ByteString getIdentifierValueBytes() {
        return ((DescriptorProtos$UninterpretedOption)this.instance).getIdentifierValueBytes();
    }

    public DescriptorProtos$UninterpretedOption$NamePart getName(int n3) {
        return ((DescriptorProtos$UninterpretedOption)this.instance).getName(n3);
    }

    public int getNameCount() {
        return ((DescriptorProtos$UninterpretedOption)this.instance).getNameCount();
    }

    public List getNameList() {
        return Collections.unmodifiableList(((DescriptorProtos$UninterpretedOption)this.instance).getNameList());
    }

    public long getNegativeIntValue() {
        return ((DescriptorProtos$UninterpretedOption)this.instance).getNegativeIntValue();
    }

    public long getPositiveIntValue() {
        return ((DescriptorProtos$UninterpretedOption)this.instance).getPositiveIntValue();
    }

    public ByteString getStringValue() {
        return ((DescriptorProtos$UninterpretedOption)this.instance).getStringValue();
    }

    public boolean hasAggregateValue() {
        return ((DescriptorProtos$UninterpretedOption)this.instance).hasAggregateValue();
    }

    public boolean hasDoubleValue() {
        return ((DescriptorProtos$UninterpretedOption)this.instance).hasDoubleValue();
    }

    public boolean hasIdentifierValue() {
        return ((DescriptorProtos$UninterpretedOption)this.instance).hasIdentifierValue();
    }

    public boolean hasNegativeIntValue() {
        return ((DescriptorProtos$UninterpretedOption)this.instance).hasNegativeIntValue();
    }

    public boolean hasPositiveIntValue() {
        return ((DescriptorProtos$UninterpretedOption)this.instance).hasPositiveIntValue();
    }

    public boolean hasStringValue() {
        return ((DescriptorProtos$UninterpretedOption)this.instance).hasStringValue();
    }

    public DescriptorProtos$UninterpretedOption$Builder removeName(int n3) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$41000((DescriptorProtos$UninterpretedOption)this.instance, n3);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder setAggregateValue(String string2) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$42200((DescriptorProtos$UninterpretedOption)this.instance, string2);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder setAggregateValueBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$42400((DescriptorProtos$UninterpretedOption)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder setDoubleValue(double d2) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$41800((DescriptorProtos$UninterpretedOption)this.instance, d2);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder setIdentifierValue(String string2) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$41100((DescriptorProtos$UninterpretedOption)this.instance, string2);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder setIdentifierValueBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$41300((DescriptorProtos$UninterpretedOption)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder setName(int n3, DescriptorProtos$UninterpretedOption$NamePart$Builder descriptorProtos$UninterpretedOption$NamePartOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = (DescriptorProtos$UninterpretedOption)this.instance;
        descriptorProtos$UninterpretedOption$NamePartOrBuilder = (DescriptorProtos$UninterpretedOption$NamePart)descriptorProtos$UninterpretedOption$NamePartOrBuilder.build();
        DescriptorProtos$UninterpretedOption.access$40500(descriptorProtos$UninterpretedOption, n3, (DescriptorProtos$UninterpretedOption$NamePart)descriptorProtos$UninterpretedOption$NamePartOrBuilder);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder setName(int n3, DescriptorProtos$UninterpretedOption$NamePart descriptorProtos$UninterpretedOption$NamePart) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$40500((DescriptorProtos$UninterpretedOption)this.instance, n3, descriptorProtos$UninterpretedOption$NamePart);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder setNegativeIntValue(long l2) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$41600((DescriptorProtos$UninterpretedOption)this.instance, l2);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder setPositiveIntValue(long l2) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$41400((DescriptorProtos$UninterpretedOption)this.instance, l2);
        return this;
    }

    public DescriptorProtos$UninterpretedOption$Builder setStringValue(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$UninterpretedOption.access$42000((DescriptorProtos$UninterpretedOption)this.instance, byteString);
        return this;
    }
}

