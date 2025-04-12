/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$DescriptorProto$Builder;
import com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRange;
import com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder;
import com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRange;
import com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder;
import com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$MessageOptions;
import com.google.protobuf.DescriptorProtos$MessageOptions$Builder;
import com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder;
import com.google.protobuf.DescriptorProtos$OneofDescriptorProto;
import com.google.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class DescriptorProtos$DescriptorProto
extends GeneratedMessageLite
implements DescriptorProtos$DescriptorProtoOrBuilder {
    private static final DescriptorProtos$DescriptorProto DEFAULT_INSTANCE;
    public static final int ENUM_TYPE_FIELD_NUMBER = 4;
    public static final int EXTENSION_FIELD_NUMBER = 6;
    public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
    public static final int FIELD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NESTED_TYPE_FIELD_NUMBER = 3;
    public static final int ONEOF_DECL_FIELD_NUMBER = 8;
    public static final int OPTIONS_FIELD_NUMBER = 7;
    private static volatile Parser PARSER;
    public static final int RESERVED_NAME_FIELD_NUMBER = 10;
    public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
    private int bitField0_;
    private Internal$ProtobufList enumType_;
    private Internal$ProtobufList extensionRange_;
    private Internal$ProtobufList extension_;
    private Internal$ProtobufList field_;
    private byte memoizedIsInitialized = (byte)2;
    private String name_ = "";
    private Internal$ProtobufList nestedType_;
    private Internal$ProtobufList oneofDecl_;
    private DescriptorProtos$MessageOptions options_;
    private Internal$ProtobufList reservedName_;
    private Internal$ProtobufList reservedRange_;

    static {
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto;
        DEFAULT_INSTANCE = descriptorProtos$DescriptorProto = new DescriptorProtos$DescriptorProto();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$DescriptorProto.class, descriptorProtos$DescriptorProto);
    }

    private DescriptorProtos$DescriptorProto() {
        Internal$ProtobufList internal$ProtobufList;
        this.field_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.extension_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.nestedType_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.enumType_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.extensionRange_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.oneofDecl_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.reservedRange_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.reservedName_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ void access$10000(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$DescriptorProto.addEnumType(descriptorProtos$EnumDescriptorProto);
    }

    public static /* synthetic */ void access$10100(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$DescriptorProto.addEnumType(n3, descriptorProtos$EnumDescriptorProto);
    }

    public static /* synthetic */ void access$10200(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, Iterable iterable) {
        descriptorProtos$DescriptorProto.addAllEnumType(iterable);
    }

    public static /* synthetic */ void access$10300(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.clearEnumType();
    }

    public static /* synthetic */ void access$10400(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3) {
        descriptorProtos$DescriptorProto.removeEnumType(n3);
    }

    public static /* synthetic */ void access$10500(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3, DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange) {
        descriptorProtos$DescriptorProto.setExtensionRange(n3, descriptorProtos$DescriptorProto$ExtensionRange);
    }

    public static /* synthetic */ void access$10600(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange) {
        descriptorProtos$DescriptorProto.addExtensionRange(descriptorProtos$DescriptorProto$ExtensionRange);
    }

    public static /* synthetic */ void access$10700(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3, DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange) {
        descriptorProtos$DescriptorProto.addExtensionRange(n3, descriptorProtos$DescriptorProto$ExtensionRange);
    }

    public static /* synthetic */ void access$10800(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, Iterable iterable) {
        descriptorProtos$DescriptorProto.addAllExtensionRange(iterable);
    }

    public static /* synthetic */ void access$10900(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.clearExtensionRange();
    }

    public static /* synthetic */ void access$11000(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3) {
        descriptorProtos$DescriptorProto.removeExtensionRange(n3);
    }

    public static /* synthetic */ void access$11100(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$DescriptorProto.setOneofDecl(n3, descriptorProtos$OneofDescriptorProto);
    }

    public static /* synthetic */ void access$11200(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$DescriptorProto.addOneofDecl(descriptorProtos$OneofDescriptorProto);
    }

    public static /* synthetic */ void access$11300(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$DescriptorProto.addOneofDecl(n3, descriptorProtos$OneofDescriptorProto);
    }

    public static /* synthetic */ void access$11400(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, Iterable iterable) {
        descriptorProtos$DescriptorProto.addAllOneofDecl(iterable);
    }

    public static /* synthetic */ void access$11500(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.clearOneofDecl();
    }

    public static /* synthetic */ void access$11600(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3) {
        descriptorProtos$DescriptorProto.removeOneofDecl(n3);
    }

    public static /* synthetic */ void access$11700(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        descriptorProtos$DescriptorProto.setOptions(descriptorProtos$MessageOptions);
    }

    public static /* synthetic */ void access$11800(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        descriptorProtos$DescriptorProto.mergeOptions(descriptorProtos$MessageOptions);
    }

    public static /* synthetic */ void access$11900(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.clearOptions();
    }

    public static /* synthetic */ void access$12000(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3, DescriptorProtos$DescriptorProto$ReservedRange descriptorProtos$DescriptorProto$ReservedRange) {
        descriptorProtos$DescriptorProto.setReservedRange(n3, descriptorProtos$DescriptorProto$ReservedRange);
    }

    public static /* synthetic */ void access$12100(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, DescriptorProtos$DescriptorProto$ReservedRange descriptorProtos$DescriptorProto$ReservedRange) {
        descriptorProtos$DescriptorProto.addReservedRange(descriptorProtos$DescriptorProto$ReservedRange);
    }

    public static /* synthetic */ void access$12200(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3, DescriptorProtos$DescriptorProto$ReservedRange descriptorProtos$DescriptorProto$ReservedRange) {
        descriptorProtos$DescriptorProto.addReservedRange(n3, descriptorProtos$DescriptorProto$ReservedRange);
    }

    public static /* synthetic */ void access$12300(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, Iterable iterable) {
        descriptorProtos$DescriptorProto.addAllReservedRange(iterable);
    }

    public static /* synthetic */ void access$12400(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.clearReservedRange();
    }

    public static /* synthetic */ void access$12500(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3) {
        descriptorProtos$DescriptorProto.removeReservedRange(n3);
    }

    public static /* synthetic */ void access$12600(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3, String string2) {
        descriptorProtos$DescriptorProto.setReservedName(n3, string2);
    }

    public static /* synthetic */ void access$12700(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, String string2) {
        descriptorProtos$DescriptorProto.addReservedName(string2);
    }

    public static /* synthetic */ void access$12800(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, Iterable iterable) {
        descriptorProtos$DescriptorProto.addAllReservedName(iterable);
    }

    public static /* synthetic */ void access$12900(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.clearReservedName();
    }

    public static /* synthetic */ void access$13000(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, ByteString byteString) {
        descriptorProtos$DescriptorProto.addReservedNameBytes(byteString);
    }

    public static /* synthetic */ DescriptorProtos$DescriptorProto access$7700() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$7800(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, String string2) {
        descriptorProtos$DescriptorProto.setName(string2);
    }

    public static /* synthetic */ void access$7900(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.clearName();
    }

    public static /* synthetic */ void access$8000(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, ByteString byteString) {
        descriptorProtos$DescriptorProto.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$8100(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$DescriptorProto.setField(n3, descriptorProtos$FieldDescriptorProto);
    }

    public static /* synthetic */ void access$8200(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$DescriptorProto.addField(descriptorProtos$FieldDescriptorProto);
    }

    public static /* synthetic */ void access$8300(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$DescriptorProto.addField(n3, descriptorProtos$FieldDescriptorProto);
    }

    public static /* synthetic */ void access$8400(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, Iterable iterable) {
        descriptorProtos$DescriptorProto.addAllField(iterable);
    }

    public static /* synthetic */ void access$8500(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.clearField();
    }

    public static /* synthetic */ void access$8600(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3) {
        descriptorProtos$DescriptorProto.removeField(n3);
    }

    public static /* synthetic */ void access$8700(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$DescriptorProto.setExtension(n3, descriptorProtos$FieldDescriptorProto);
    }

    public static /* synthetic */ void access$8800(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$DescriptorProto.addExtension(descriptorProtos$FieldDescriptorProto);
    }

    public static /* synthetic */ void access$8900(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$DescriptorProto.addExtension(n3, descriptorProtos$FieldDescriptorProto);
    }

    public static /* synthetic */ void access$9000(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, Iterable iterable) {
        descriptorProtos$DescriptorProto.addAllExtension(iterable);
    }

    public static /* synthetic */ void access$9100(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.clearExtension();
    }

    public static /* synthetic */ void access$9200(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3) {
        descriptorProtos$DescriptorProto.removeExtension(n3);
    }

    public static /* synthetic */ void access$9300(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto2) {
        descriptorProtos$DescriptorProto.setNestedType(n3, descriptorProtos$DescriptorProto2);
    }

    public static /* synthetic */ void access$9400(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto2) {
        descriptorProtos$DescriptorProto.addNestedType(descriptorProtos$DescriptorProto2);
    }

    public static /* synthetic */ void access$9500(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto2) {
        descriptorProtos$DescriptorProto.addNestedType(n3, descriptorProtos$DescriptorProto2);
    }

    public static /* synthetic */ void access$9600(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, Iterable iterable) {
        descriptorProtos$DescriptorProto.addAllNestedType(iterable);
    }

    public static /* synthetic */ void access$9700(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.clearNestedType();
    }

    public static /* synthetic */ void access$9800(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3) {
        descriptorProtos$DescriptorProto.removeNestedType(n3);
    }

    public static /* synthetic */ void access$9900(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto, int n3, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$DescriptorProto.setEnumType(n3, descriptorProtos$EnumDescriptorProto);
    }

    private void addAllEnumType(Iterable iterable) {
        this.ensureEnumTypeIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.enumType_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllExtension(Iterable iterable) {
        this.ensureExtensionIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.extension_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllExtensionRange(Iterable iterable) {
        this.ensureExtensionRangeIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.extensionRange_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllField(Iterable iterable) {
        this.ensureFieldIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.field_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllNestedType(Iterable iterable) {
        this.ensureNestedTypeIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.nestedType_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllOneofDecl(Iterable iterable) {
        this.ensureOneofDeclIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.oneofDecl_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllReservedName(Iterable iterable) {
        this.ensureReservedNameIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.reservedName_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllReservedRange(Iterable iterable) {
        this.ensureReservedRangeIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.reservedRange_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addEnumType(int n3, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        this.ensureEnumTypeIsMutable();
        this.enumType_.add(n3, descriptorProtos$EnumDescriptorProto);
    }

    private void addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        this.ensureEnumTypeIsMutable();
        this.enumType_.add(descriptorProtos$EnumDescriptorProto);
    }

    private void addExtension(int n3, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        this.ensureExtensionIsMutable();
        this.extension_.add(n3, descriptorProtos$FieldDescriptorProto);
    }

    private void addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        this.ensureExtensionIsMutable();
        this.extension_.add(descriptorProtos$FieldDescriptorProto);
    }

    private void addExtensionRange(int n3, DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange) {
        descriptorProtos$DescriptorProto$ExtensionRange.getClass();
        this.ensureExtensionRangeIsMutable();
        this.extensionRange_.add(n3, descriptorProtos$DescriptorProto$ExtensionRange);
    }

    private void addExtensionRange(DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange) {
        descriptorProtos$DescriptorProto$ExtensionRange.getClass();
        this.ensureExtensionRangeIsMutable();
        this.extensionRange_.add(descriptorProtos$DescriptorProto$ExtensionRange);
    }

    private void addField(int n3, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        this.ensureFieldIsMutable();
        this.field_.add(n3, descriptorProtos$FieldDescriptorProto);
    }

    private void addField(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        this.ensureFieldIsMutable();
        this.field_.add(descriptorProtos$FieldDescriptorProto);
    }

    private void addNestedType(int n3, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        this.ensureNestedTypeIsMutable();
        this.nestedType_.add(n3, descriptorProtos$DescriptorProto);
    }

    private void addNestedType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        this.ensureNestedTypeIsMutable();
        this.nestedType_.add(descriptorProtos$DescriptorProto);
    }

    private void addOneofDecl(int n3, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$OneofDescriptorProto.getClass();
        this.ensureOneofDeclIsMutable();
        this.oneofDecl_.add(n3, descriptorProtos$OneofDescriptorProto);
    }

    private void addOneofDecl(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$OneofDescriptorProto.getClass();
        this.ensureOneofDeclIsMutable();
        this.oneofDecl_.add(descriptorProtos$OneofDescriptorProto);
    }

    private void addReservedName(String string2) {
        string2.getClass();
        this.ensureReservedNameIsMutable();
        this.reservedName_.add(string2);
    }

    private void addReservedNameBytes(ByteString object) {
        this.ensureReservedNameIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.reservedName_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void addReservedRange(int n3, DescriptorProtos$DescriptorProto$ReservedRange descriptorProtos$DescriptorProto$ReservedRange) {
        descriptorProtos$DescriptorProto$ReservedRange.getClass();
        this.ensureReservedRangeIsMutable();
        this.reservedRange_.add(n3, descriptorProtos$DescriptorProto$ReservedRange);
    }

    private void addReservedRange(DescriptorProtos$DescriptorProto$ReservedRange descriptorProtos$DescriptorProto$ReservedRange) {
        descriptorProtos$DescriptorProto$ReservedRange.getClass();
        this.ensureReservedRangeIsMutable();
        this.reservedRange_.add(descriptorProtos$DescriptorProto$ReservedRange);
    }

    private void clearEnumType() {
        Internal$ProtobufList internal$ProtobufList;
        this.enumType_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearExtension() {
        Internal$ProtobufList internal$ProtobufList;
        this.extension_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearExtensionRange() {
        Internal$ProtobufList internal$ProtobufList;
        this.extensionRange_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearField() {
        Internal$ProtobufList internal$ProtobufList;
        this.field_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearName() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.name_ = string2 = DescriptorProtos$DescriptorProto.getDefaultInstance().getName();
    }

    private void clearNestedType() {
        Internal$ProtobufList internal$ProtobufList;
        this.nestedType_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearOneofDecl() {
        Internal$ProtobufList internal$ProtobufList;
        this.oneofDecl_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearOptions() {
        int n3;
        this.options_ = null;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
    }

    private void clearReservedName() {
        Internal$ProtobufList internal$ProtobufList;
        this.reservedName_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearReservedRange() {
        Internal$ProtobufList internal$ProtobufList;
        this.reservedRange_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureEnumTypeIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.enumType_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.enumType_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureExtensionIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.extension_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.extension_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureExtensionRangeIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.extensionRange_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.extensionRange_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureFieldIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.field_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.field_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureNestedTypeIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.nestedType_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.nestedType_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureOneofDeclIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.oneofDecl_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.oneofDecl_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureReservedNameIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.reservedName_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.reservedName_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureReservedRangeIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.reservedRange_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.reservedRange_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static DescriptorProtos$DescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        int n3;
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions2;
        descriptorProtos$MessageOptions.getClass();
        DescriptorProtos$MessageOptionsOrBuilder descriptorProtos$MessageOptionsOrBuilder = this.options_;
        if (descriptorProtos$MessageOptionsOrBuilder != null && descriptorProtos$MessageOptionsOrBuilder != (descriptorProtos$MessageOptions2 = DescriptorProtos$MessageOptions.getDefaultInstance())) {
            descriptorProtos$MessageOptionsOrBuilder = DescriptorProtos$MessageOptions.newBuilder(this.options_);
            this.options_ = descriptorProtos$MessageOptions = (DescriptorProtos$MessageOptions)((DescriptorProtos$MessageOptions$Builder)((GeneratedMessageLite$Builder)((Object)descriptorProtos$MessageOptionsOrBuilder)).mergeFrom(descriptorProtos$MessageOptions)).buildPartial();
        } else {
            this.options_ = descriptorProtos$MessageOptions;
        }
        this.bitField0_ = n3 = this.bitField0_ | 2;
    }

    public static DescriptorProtos$DescriptorProto$Builder newBuilder() {
        return (DescriptorProtos$DescriptorProto$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$DescriptorProto$Builder newBuilder(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        return (DescriptorProtos$DescriptorProto$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$DescriptorProto);
    }

    public static DescriptorProtos$DescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$DescriptorProto)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$DescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$DescriptorProto)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$DescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$DescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$DescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$DescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$DescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$DescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$DescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$DescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(byte[] byArray) {
        return (DescriptorProtos$DescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$DescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeEnumType(int n3) {
        this.ensureEnumTypeIsMutable();
        this.enumType_.remove(n3);
    }

    private void removeExtension(int n3) {
        this.ensureExtensionIsMutable();
        this.extension_.remove(n3);
    }

    private void removeExtensionRange(int n3) {
        this.ensureExtensionRangeIsMutable();
        this.extensionRange_.remove(n3);
    }

    private void removeField(int n3) {
        this.ensureFieldIsMutable();
        this.field_.remove(n3);
    }

    private void removeNestedType(int n3) {
        this.ensureNestedTypeIsMutable();
        this.nestedType_.remove(n3);
    }

    private void removeOneofDecl(int n3) {
        this.ensureOneofDeclIsMutable();
        this.oneofDecl_.remove(n3);
    }

    private void removeReservedRange(int n3) {
        this.ensureReservedRangeIsMutable();
        this.reservedRange_.remove(n3);
    }

    private void setEnumType(int n3, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        this.ensureEnumTypeIsMutable();
        this.enumType_.set(n3, descriptorProtos$EnumDescriptorProto);
    }

    private void setExtension(int n3, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        this.ensureExtensionIsMutable();
        this.extension_.set(n3, descriptorProtos$FieldDescriptorProto);
    }

    private void setExtensionRange(int n3, DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange) {
        descriptorProtos$DescriptorProto$ExtensionRange.getClass();
        this.ensureExtensionRangeIsMutable();
        this.extensionRange_.set(n3, descriptorProtos$DescriptorProto$ExtensionRange);
    }

    private void setField(int n3, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        this.ensureFieldIsMutable();
        this.field_.set(n3, descriptorProtos$FieldDescriptorProto);
    }

    private void setName(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 1;
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        int n3;
        this.name_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 1;
    }

    private void setNestedType(int n3, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        this.ensureNestedTypeIsMutable();
        this.nestedType_.set(n3, descriptorProtos$DescriptorProto);
    }

    private void setOneofDecl(int n3, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$OneofDescriptorProto.getClass();
        this.ensureOneofDeclIsMutable();
        this.oneofDecl_.set(n3, descriptorProtos$OneofDescriptorProto);
    }

    private void setOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        int n3;
        descriptorProtos$MessageOptions.getClass();
        this.options_ = descriptorProtos$MessageOptions;
        this.bitField0_ = n3 = this.bitField0_ | 2;
    }

    private void setReservedName(int n3, String string2) {
        string2.getClass();
        this.ensureReservedNameIsMutable();
        this.reservedName_.set(n3, string2);
    }

    private void setReservedRange(int n3, DescriptorProtos$DescriptorProto$ReservedRange descriptorProtos$DescriptorProto$ReservedRange) {
        descriptorProtos$DescriptorProto$ReservedRange.getClass();
        this.ensureReservedRangeIsMutable();
        this.reservedRange_.set(n3, descriptorProtos$DescriptorProto$ReservedRange);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        int n3 = 1;
        int[] nArray = DescriptorProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        int n4 = objectArray.ordinal();
        n4 = nArray[n4];
        nArray = null;
        switch (n4) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 7: {
                if (clazz == null) {
                    n3 = 0;
                    object = null;
                }
                n4 = (byte)n3;
                this.memoizedIsInitialized = (byte)n4;
                return null;
            }
            case 6: {
                return this.memoizedIsInitialized;
            }
            case 5: {
                objectArray = PARSER;
                if (objectArray != null) return objectArray;
                clazz = DescriptorProtos$DescriptorProto.class;
                synchronized (clazz) {
                    try {
                        objectArray = PARSER;
                        if (objectArray != null) return objectArray;
                        object = DEFAULT_INSTANCE;
                        PARSER = objectArray = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                objectArray = new Object[18];
                objectArray[0] = "bitField0_";
                objectArray[n3] = "name_";
                objectArray[2] = "field_";
                objectArray[3] = clazz = DescriptorProtos$FieldDescriptorProto.class;
                objectArray[4] = "nestedType_";
                objectArray[5] = DescriptorProtos$DescriptorProto.class;
                objectArray[6] = "enumType_";
                objectArray[7] = DescriptorProtos$EnumDescriptorProto.class;
                objectArray[8] = "extensionRange_";
                objectArray[9] = DescriptorProtos$DescriptorProto$ExtensionRange.class;
                objectArray[10] = "extension_";
                objectArray[11] = clazz;
                objectArray[12] = "options_";
                objectArray[13] = "oneofDecl_";
                objectArray[14] = DescriptorProtos$OneofDescriptorProto.class;
                objectArray[15] = "reservedRange_";
                objectArray[16] = DescriptorProtos$DescriptorProto$ReservedRange.class;
                objectArray[17] = "reservedName_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\b\u0007\u0001\u1008\u0000\u0002\u041b\u0003\u041b\u0004\u041b\u0005\u041b\u0006\u041b\u0007\u1409\u0001\b\u041b\t\u001b\n\u001a", objectArray);
            }
            case 2: {
                return new DescriptorProtos$DescriptorProto$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$DescriptorProto();
    }

    public DescriptorProtos$EnumDescriptorProto getEnumType(int n3) {
        return (DescriptorProtos$EnumDescriptorProto)this.enumType_.get(n3);
    }

    public int getEnumTypeCount() {
        return this.enumType_.size();
    }

    public List getEnumTypeList() {
        return this.enumType_;
    }

    public DescriptorProtos$EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int n3) {
        return (DescriptorProtos$EnumDescriptorProtoOrBuilder)this.enumType_.get(n3);
    }

    public List getEnumTypeOrBuilderList() {
        return this.enumType_;
    }

    public DescriptorProtos$FieldDescriptorProto getExtension(int n3) {
        return (DescriptorProtos$FieldDescriptorProto)this.extension_.get(n3);
    }

    public int getExtensionCount() {
        return this.extension_.size();
    }

    public List getExtensionList() {
        return this.extension_;
    }

    public DescriptorProtos$FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int n3) {
        return (DescriptorProtos$FieldDescriptorProtoOrBuilder)this.extension_.get(n3);
    }

    public List getExtensionOrBuilderList() {
        return this.extension_;
    }

    public DescriptorProtos$DescriptorProto$ExtensionRange getExtensionRange(int n3) {
        return (DescriptorProtos$DescriptorProto$ExtensionRange)this.extensionRange_.get(n3);
    }

    public int getExtensionRangeCount() {
        return this.extensionRange_.size();
    }

    public List getExtensionRangeList() {
        return this.extensionRange_;
    }

    public DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder getExtensionRangeOrBuilder(int n3) {
        return (DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder)this.extensionRange_.get(n3);
    }

    public List getExtensionRangeOrBuilderList() {
        return this.extensionRange_;
    }

    public DescriptorProtos$FieldDescriptorProto getField(int n3) {
        return (DescriptorProtos$FieldDescriptorProto)this.field_.get(n3);
    }

    public int getFieldCount() {
        return this.field_.size();
    }

    public List getFieldList() {
        return this.field_;
    }

    public DescriptorProtos$FieldDescriptorProtoOrBuilder getFieldOrBuilder(int n3) {
        return (DescriptorProtos$FieldDescriptorProtoOrBuilder)this.field_.get(n3);
    }

    public List getFieldOrBuilderList() {
        return this.field_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public DescriptorProtos$DescriptorProto getNestedType(int n3) {
        return (DescriptorProtos$DescriptorProto)this.nestedType_.get(n3);
    }

    public int getNestedTypeCount() {
        return this.nestedType_.size();
    }

    public List getNestedTypeList() {
        return this.nestedType_;
    }

    public DescriptorProtos$DescriptorProtoOrBuilder getNestedTypeOrBuilder(int n3) {
        return (DescriptorProtos$DescriptorProtoOrBuilder)this.nestedType_.get(n3);
    }

    public List getNestedTypeOrBuilderList() {
        return this.nestedType_;
    }

    public DescriptorProtos$OneofDescriptorProto getOneofDecl(int n3) {
        return (DescriptorProtos$OneofDescriptorProto)this.oneofDecl_.get(n3);
    }

    public int getOneofDeclCount() {
        return this.oneofDecl_.size();
    }

    public List getOneofDeclList() {
        return this.oneofDecl_;
    }

    public DescriptorProtos$OneofDescriptorProtoOrBuilder getOneofDeclOrBuilder(int n3) {
        return (DescriptorProtos$OneofDescriptorProtoOrBuilder)this.oneofDecl_.get(n3);
    }

    public List getOneofDeclOrBuilderList() {
        return this.oneofDecl_;
    }

    public DescriptorProtos$MessageOptions getOptions() {
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = this.options_;
        if (descriptorProtos$MessageOptions == null) {
            descriptorProtos$MessageOptions = DescriptorProtos$MessageOptions.getDefaultInstance();
        }
        return descriptorProtos$MessageOptions;
    }

    public String getReservedName(int n3) {
        return (String)this.reservedName_.get(n3);
    }

    public ByteString getReservedNameBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.reservedName_.get(n3));
    }

    public int getReservedNameCount() {
        return this.reservedName_.size();
    }

    public List getReservedNameList() {
        return this.reservedName_;
    }

    public DescriptorProtos$DescriptorProto$ReservedRange getReservedRange(int n3) {
        return (DescriptorProtos$DescriptorProto$ReservedRange)this.reservedRange_.get(n3);
    }

    public int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    public List getReservedRangeList() {
        return this.reservedRange_;
    }

    public DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder getReservedRangeOrBuilder(int n3) {
        return (DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder)this.reservedRange_.get(n3);
    }

    public List getReservedRangeOrBuilderList() {
        return this.reservedRange_;
    }

    public boolean hasName() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean hasOptions() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }
}

