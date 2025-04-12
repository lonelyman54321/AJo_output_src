/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$DescriptorProto;
import com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRange;
import com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRange$Builder;
import com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRange;
import com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRange$Builder;
import com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto$Builder;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Builder;
import com.google.protobuf.DescriptorProtos$MessageOptions;
import com.google.protobuf.DescriptorProtos$MessageOptions$Builder;
import com.google.protobuf.DescriptorProtos$OneofDescriptorProto;
import com.google.protobuf.DescriptorProtos$OneofDescriptorProto$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$DescriptorProto$Builder
extends GeneratedMessageLite$Builder
implements DescriptorProtos$DescriptorProtoOrBuilder {
    private DescriptorProtos$DescriptorProto$Builder() {
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = DescriptorProtos$DescriptorProto.access$7700();
        super(descriptorProtos$DescriptorProto);
    }

    public /* synthetic */ DescriptorProtos$DescriptorProto$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$DescriptorProto$Builder addAllEnumType(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$10200((DescriptorProtos$DescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addAllExtension(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$9000((DescriptorProtos$DescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addAllExtensionRange(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$10800((DescriptorProtos$DescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addAllField(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$8400((DescriptorProtos$DescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addAllNestedType(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$9600((DescriptorProtos$DescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addAllOneofDecl(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$11400((DescriptorProtos$DescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addAllReservedName(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$12800((DescriptorProtos$DescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addAllReservedRange(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$12300((DescriptorProtos$DescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addEnumType(int n3, DescriptorProtos$EnumDescriptorProto$Builder descriptorProtos$EnumDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$EnumDescriptorProtoOrBuilder = (DescriptorProtos$EnumDescriptorProto)descriptorProtos$EnumDescriptorProtoOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$10100(descriptorProtos$DescriptorProto, n3, (DescriptorProtos$EnumDescriptorProto)descriptorProtos$EnumDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addEnumType(int n3, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$10100((DescriptorProtos$DescriptorProto)this.instance, n3, descriptorProtos$EnumDescriptorProto);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addEnumType(DescriptorProtos$EnumDescriptorProto$Builder descriptorProtos$EnumDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$EnumDescriptorProtoOrBuilder = (DescriptorProtos$EnumDescriptorProto)descriptorProtos$EnumDescriptorProtoOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$10000(descriptorProtos$DescriptorProto, (DescriptorProtos$EnumDescriptorProto)descriptorProtos$EnumDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$10000((DescriptorProtos$DescriptorProto)this.instance, descriptorProtos$EnumDescriptorProto);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addExtension(int n3, DescriptorProtos$FieldDescriptorProto$Builder descriptorProtos$FieldDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$FieldDescriptorProtoOrBuilder = (DescriptorProtos$FieldDescriptorProto)descriptorProtos$FieldDescriptorProtoOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$8900(descriptorProtos$DescriptorProto, n3, (DescriptorProtos$FieldDescriptorProto)descriptorProtos$FieldDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addExtension(int n3, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$8900((DescriptorProtos$DescriptorProto)this.instance, n3, descriptorProtos$FieldDescriptorProto);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addExtension(DescriptorProtos$FieldDescriptorProto$Builder descriptorProtos$FieldDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$FieldDescriptorProtoOrBuilder = (DescriptorProtos$FieldDescriptorProto)descriptorProtos$FieldDescriptorProtoOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$8800(descriptorProtos$DescriptorProto, (DescriptorProtos$FieldDescriptorProto)descriptorProtos$FieldDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$8800((DescriptorProtos$DescriptorProto)this.instance, descriptorProtos$FieldDescriptorProto);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addExtensionRange(int n3, DescriptorProtos$DescriptorProto$ExtensionRange$Builder descriptorProtos$DescriptorProto$ExtensionRangeOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$DescriptorProto$ExtensionRangeOrBuilder = (DescriptorProtos$DescriptorProto$ExtensionRange)descriptorProtos$DescriptorProto$ExtensionRangeOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$10700(descriptorProtos$DescriptorProto, n3, (DescriptorProtos$DescriptorProto$ExtensionRange)descriptorProtos$DescriptorProto$ExtensionRangeOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addExtensionRange(int n3, DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$10700((DescriptorProtos$DescriptorProto)this.instance, n3, descriptorProtos$DescriptorProto$ExtensionRange);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addExtensionRange(DescriptorProtos$DescriptorProto$ExtensionRange$Builder descriptorProtos$DescriptorProto$ExtensionRangeOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$DescriptorProto$ExtensionRangeOrBuilder = (DescriptorProtos$DescriptorProto$ExtensionRange)descriptorProtos$DescriptorProto$ExtensionRangeOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$10600(descriptorProtos$DescriptorProto, (DescriptorProtos$DescriptorProto$ExtensionRange)descriptorProtos$DescriptorProto$ExtensionRangeOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addExtensionRange(DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$10600((DescriptorProtos$DescriptorProto)this.instance, descriptorProtos$DescriptorProto$ExtensionRange);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addField(int n3, DescriptorProtos$FieldDescriptorProto$Builder descriptorProtos$FieldDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$FieldDescriptorProtoOrBuilder = (DescriptorProtos$FieldDescriptorProto)descriptorProtos$FieldDescriptorProtoOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$8300(descriptorProtos$DescriptorProto, n3, (DescriptorProtos$FieldDescriptorProto)descriptorProtos$FieldDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addField(int n3, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$8300((DescriptorProtos$DescriptorProto)this.instance, n3, descriptorProtos$FieldDescriptorProto);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addField(DescriptorProtos$FieldDescriptorProto$Builder descriptorProtos$FieldDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$FieldDescriptorProtoOrBuilder = (DescriptorProtos$FieldDescriptorProto)descriptorProtos$FieldDescriptorProtoOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$8200(descriptorProtos$DescriptorProto, (DescriptorProtos$FieldDescriptorProto)descriptorProtos$FieldDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addField(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$8200((DescriptorProtos$DescriptorProto)this.instance, descriptorProtos$FieldDescriptorProto);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addNestedType(int n3, DescriptorProtos$DescriptorProto$Builder descriptorProtos$DescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$DescriptorProtoOrBuilder = (DescriptorProtos$DescriptorProto)descriptorProtos$DescriptorProtoOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$9500(descriptorProtos$DescriptorProto, n3, (DescriptorProtos$DescriptorProto)descriptorProtos$DescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addNestedType(int n3, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$9500((DescriptorProtos$DescriptorProto)this.instance, n3, descriptorProtos$DescriptorProto);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addNestedType(DescriptorProtos$DescriptorProto$Builder descriptorProtos$DescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$DescriptorProtoOrBuilder = (DescriptorProtos$DescriptorProto)descriptorProtos$DescriptorProtoOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$9400(descriptorProtos$DescriptorProto, (DescriptorProtos$DescriptorProto)descriptorProtos$DescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addNestedType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$9400((DescriptorProtos$DescriptorProto)this.instance, descriptorProtos$DescriptorProto);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addOneofDecl(int n3, DescriptorProtos$OneofDescriptorProto$Builder descriptorProtos$OneofDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$OneofDescriptorProtoOrBuilder = (DescriptorProtos$OneofDescriptorProto)descriptorProtos$OneofDescriptorProtoOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$11300(descriptorProtos$DescriptorProto, n3, (DescriptorProtos$OneofDescriptorProto)descriptorProtos$OneofDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addOneofDecl(int n3, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$11300((DescriptorProtos$DescriptorProto)this.instance, n3, descriptorProtos$OneofDescriptorProto);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addOneofDecl(DescriptorProtos$OneofDescriptorProto$Builder descriptorProtos$OneofDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$OneofDescriptorProtoOrBuilder = (DescriptorProtos$OneofDescriptorProto)descriptorProtos$OneofDescriptorProtoOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$11200(descriptorProtos$DescriptorProto, (DescriptorProtos$OneofDescriptorProto)descriptorProtos$OneofDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addOneofDecl(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$11200((DescriptorProtos$DescriptorProto)this.instance, descriptorProtos$OneofDescriptorProto);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addReservedName(String string2) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$12700((DescriptorProtos$DescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addReservedNameBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$13000((DescriptorProtos$DescriptorProto)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addReservedRange(int n3, DescriptorProtos$DescriptorProto$ReservedRange$Builder descriptorProtos$DescriptorProto$ReservedRangeOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$DescriptorProto$ReservedRangeOrBuilder = (DescriptorProtos$DescriptorProto$ReservedRange)descriptorProtos$DescriptorProto$ReservedRangeOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$12200(descriptorProtos$DescriptorProto, n3, (DescriptorProtos$DescriptorProto$ReservedRange)descriptorProtos$DescriptorProto$ReservedRangeOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addReservedRange(int n3, DescriptorProtos$DescriptorProto$ReservedRange descriptorProtos$DescriptorProto$ReservedRange) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$12200((DescriptorProtos$DescriptorProto)this.instance, n3, descriptorProtos$DescriptorProto$ReservedRange);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addReservedRange(DescriptorProtos$DescriptorProto$ReservedRange$Builder descriptorProtos$DescriptorProto$ReservedRangeOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$DescriptorProto$ReservedRangeOrBuilder = (DescriptorProtos$DescriptorProto$ReservedRange)descriptorProtos$DescriptorProto$ReservedRangeOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$12100(descriptorProtos$DescriptorProto, (DescriptorProtos$DescriptorProto$ReservedRange)descriptorProtos$DescriptorProto$ReservedRangeOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder addReservedRange(DescriptorProtos$DescriptorProto$ReservedRange descriptorProtos$DescriptorProto$ReservedRange) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$12100((DescriptorProtos$DescriptorProto)this.instance, descriptorProtos$DescriptorProto$ReservedRange);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder clearEnumType() {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$10300((DescriptorProtos$DescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder clearExtension() {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$9100((DescriptorProtos$DescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder clearExtensionRange() {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$10900((DescriptorProtos$DescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder clearField() {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$8500((DescriptorProtos$DescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder clearName() {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$7900((DescriptorProtos$DescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder clearNestedType() {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$9700((DescriptorProtos$DescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder clearOneofDecl() {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$11500((DescriptorProtos$DescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder clearOptions() {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$11900((DescriptorProtos$DescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder clearReservedName() {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$12900((DescriptorProtos$DescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder clearReservedRange() {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$12400((DescriptorProtos$DescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$EnumDescriptorProto getEnumType(int n3) {
        return ((DescriptorProtos$DescriptorProto)this.instance).getEnumType(n3);
    }

    public int getEnumTypeCount() {
        return ((DescriptorProtos$DescriptorProto)this.instance).getEnumTypeCount();
    }

    public List getEnumTypeList() {
        return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto)this.instance).getEnumTypeList());
    }

    public DescriptorProtos$FieldDescriptorProto getExtension(int n3) {
        return ((DescriptorProtos$DescriptorProto)this.instance).getExtension(n3);
    }

    public int getExtensionCount() {
        return ((DescriptorProtos$DescriptorProto)this.instance).getExtensionCount();
    }

    public List getExtensionList() {
        return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto)this.instance).getExtensionList());
    }

    public DescriptorProtos$DescriptorProto$ExtensionRange getExtensionRange(int n3) {
        return ((DescriptorProtos$DescriptorProto)this.instance).getExtensionRange(n3);
    }

    public int getExtensionRangeCount() {
        return ((DescriptorProtos$DescriptorProto)this.instance).getExtensionRangeCount();
    }

    public List getExtensionRangeList() {
        return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto)this.instance).getExtensionRangeList());
    }

    public DescriptorProtos$FieldDescriptorProto getField(int n3) {
        return ((DescriptorProtos$DescriptorProto)this.instance).getField(n3);
    }

    public int getFieldCount() {
        return ((DescriptorProtos$DescriptorProto)this.instance).getFieldCount();
    }

    public List getFieldList() {
        return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto)this.instance).getFieldList());
    }

    public String getName() {
        return ((DescriptorProtos$DescriptorProto)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((DescriptorProtos$DescriptorProto)this.instance).getNameBytes();
    }

    public DescriptorProtos$DescriptorProto getNestedType(int n3) {
        return ((DescriptorProtos$DescriptorProto)this.instance).getNestedType(n3);
    }

    public int getNestedTypeCount() {
        return ((DescriptorProtos$DescriptorProto)this.instance).getNestedTypeCount();
    }

    public List getNestedTypeList() {
        return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto)this.instance).getNestedTypeList());
    }

    public DescriptorProtos$OneofDescriptorProto getOneofDecl(int n3) {
        return ((DescriptorProtos$DescriptorProto)this.instance).getOneofDecl(n3);
    }

    public int getOneofDeclCount() {
        return ((DescriptorProtos$DescriptorProto)this.instance).getOneofDeclCount();
    }

    public List getOneofDeclList() {
        return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto)this.instance).getOneofDeclList());
    }

    public DescriptorProtos$MessageOptions getOptions() {
        return ((DescriptorProtos$DescriptorProto)this.instance).getOptions();
    }

    public String getReservedName(int n3) {
        return ((DescriptorProtos$DescriptorProto)this.instance).getReservedName(n3);
    }

    public ByteString getReservedNameBytes(int n3) {
        return ((DescriptorProtos$DescriptorProto)this.instance).getReservedNameBytes(n3);
    }

    public int getReservedNameCount() {
        return ((DescriptorProtos$DescriptorProto)this.instance).getReservedNameCount();
    }

    public List getReservedNameList() {
        return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto)this.instance).getReservedNameList());
    }

    public DescriptorProtos$DescriptorProto$ReservedRange getReservedRange(int n3) {
        return ((DescriptorProtos$DescriptorProto)this.instance).getReservedRange(n3);
    }

    public int getReservedRangeCount() {
        return ((DescriptorProtos$DescriptorProto)this.instance).getReservedRangeCount();
    }

    public List getReservedRangeList() {
        return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto)this.instance).getReservedRangeList());
    }

    public boolean hasName() {
        return ((DescriptorProtos$DescriptorProto)this.instance).hasName();
    }

    public boolean hasOptions() {
        return ((DescriptorProtos$DescriptorProto)this.instance).hasOptions();
    }

    public DescriptorProtos$DescriptorProto$Builder mergeOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$11800((DescriptorProtos$DescriptorProto)this.instance, descriptorProtos$MessageOptions);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder removeEnumType(int n3) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$10400((DescriptorProtos$DescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder removeExtension(int n3) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$9200((DescriptorProtos$DescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder removeExtensionRange(int n3) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$11000((DescriptorProtos$DescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder removeField(int n3) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$8600((DescriptorProtos$DescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder removeNestedType(int n3) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$9800((DescriptorProtos$DescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder removeOneofDecl(int n3) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$11600((DescriptorProtos$DescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder removeReservedRange(int n3) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$12500((DescriptorProtos$DescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setEnumType(int n3, DescriptorProtos$EnumDescriptorProto$Builder descriptorProtos$EnumDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$EnumDescriptorProtoOrBuilder = (DescriptorProtos$EnumDescriptorProto)descriptorProtos$EnumDescriptorProtoOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$9900(descriptorProtos$DescriptorProto, n3, (DescriptorProtos$EnumDescriptorProto)descriptorProtos$EnumDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setEnumType(int n3, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$9900((DescriptorProtos$DescriptorProto)this.instance, n3, descriptorProtos$EnumDescriptorProto);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setExtension(int n3, DescriptorProtos$FieldDescriptorProto$Builder descriptorProtos$FieldDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$FieldDescriptorProtoOrBuilder = (DescriptorProtos$FieldDescriptorProto)descriptorProtos$FieldDescriptorProtoOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$8700(descriptorProtos$DescriptorProto, n3, (DescriptorProtos$FieldDescriptorProto)descriptorProtos$FieldDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setExtension(int n3, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$8700((DescriptorProtos$DescriptorProto)this.instance, n3, descriptorProtos$FieldDescriptorProto);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setExtensionRange(int n3, DescriptorProtos$DescriptorProto$ExtensionRange$Builder descriptorProtos$DescriptorProto$ExtensionRangeOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$DescriptorProto$ExtensionRangeOrBuilder = (DescriptorProtos$DescriptorProto$ExtensionRange)descriptorProtos$DescriptorProto$ExtensionRangeOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$10500(descriptorProtos$DescriptorProto, n3, (DescriptorProtos$DescriptorProto$ExtensionRange)descriptorProtos$DescriptorProto$ExtensionRangeOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setExtensionRange(int n3, DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$10500((DescriptorProtos$DescriptorProto)this.instance, n3, descriptorProtos$DescriptorProto$ExtensionRange);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setField(int n3, DescriptorProtos$FieldDescriptorProto$Builder descriptorProtos$FieldDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$FieldDescriptorProtoOrBuilder = (DescriptorProtos$FieldDescriptorProto)descriptorProtos$FieldDescriptorProtoOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$8100(descriptorProtos$DescriptorProto, n3, (DescriptorProtos$FieldDescriptorProto)descriptorProtos$FieldDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setField(int n3, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$8100((DescriptorProtos$DescriptorProto)this.instance, n3, descriptorProtos$FieldDescriptorProto);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setName(String string2) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$7800((DescriptorProtos$DescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$8000((DescriptorProtos$DescriptorProto)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setNestedType(int n3, DescriptorProtos$DescriptorProto$Builder descriptorProtos$DescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$DescriptorProtoOrBuilder = (DescriptorProtos$DescriptorProto)descriptorProtos$DescriptorProtoOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$9300(descriptorProtos$DescriptorProto, n3, (DescriptorProtos$DescriptorProto)descriptorProtos$DescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setNestedType(int n3, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$9300((DescriptorProtos$DescriptorProto)this.instance, n3, descriptorProtos$DescriptorProto);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setOneofDecl(int n3, DescriptorProtos$OneofDescriptorProto$Builder descriptorProtos$OneofDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$OneofDescriptorProtoOrBuilder = (DescriptorProtos$OneofDescriptorProto)descriptorProtos$OneofDescriptorProtoOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$11100(descriptorProtos$DescriptorProto, n3, (DescriptorProtos$OneofDescriptorProto)descriptorProtos$OneofDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setOneofDecl(int n3, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$11100((DescriptorProtos$DescriptorProto)this.instance, n3, descriptorProtos$OneofDescriptorProto);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setOptions(DescriptorProtos$MessageOptions$Builder descriptorProtos$MessageOptionsOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$MessageOptionsOrBuilder = (DescriptorProtos$MessageOptions)descriptorProtos$MessageOptionsOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$11700(descriptorProtos$DescriptorProto, (DescriptorProtos$MessageOptions)descriptorProtos$MessageOptionsOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$11700((DescriptorProtos$DescriptorProto)this.instance, descriptorProtos$MessageOptions);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setReservedName(int n3, String string2) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$12600((DescriptorProtos$DescriptorProto)this.instance, n3, string2);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setReservedRange(int n3, DescriptorProtos$DescriptorProto$ReservedRange$Builder descriptorProtos$DescriptorProto$ReservedRangeOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = (DescriptorProtos$DescriptorProto)this.instance;
        descriptorProtos$DescriptorProto$ReservedRangeOrBuilder = (DescriptorProtos$DescriptorProto$ReservedRange)descriptorProtos$DescriptorProto$ReservedRangeOrBuilder.build();
        DescriptorProtos$DescriptorProto.access$12000(descriptorProtos$DescriptorProto, n3, (DescriptorProtos$DescriptorProto$ReservedRange)descriptorProtos$DescriptorProto$ReservedRangeOrBuilder);
        return this;
    }

    public DescriptorProtos$DescriptorProto$Builder setReservedRange(int n3, DescriptorProtos$DescriptorProto$ReservedRange descriptorProtos$DescriptorProto$ReservedRange) {
        this.copyOnWrite();
        DescriptorProtos$DescriptorProto.access$12000((DescriptorProtos$DescriptorProto)this.instance, n3, descriptorProtos$DescriptorProto$ReservedRange);
        return this;
    }
}

