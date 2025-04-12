/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$DescriptorProto;
import com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$FileDescriptorProto$Builder;
import com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$FileOptions$Builder;
import com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder;
import com.google.protobuf.DescriptorProtos$ServiceDescriptorProto;
import com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$SourceCodeInfo;
import com.google.protobuf.DescriptorProtos$SourceCodeInfo$Builder;
import com.google.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$IntList;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class DescriptorProtos$FileDescriptorProto
extends GeneratedMessageLite
implements DescriptorProtos$FileDescriptorProtoOrBuilder {
    private static final DescriptorProtos$FileDescriptorProto DEFAULT_INSTANCE;
    public static final int DEPENDENCY_FIELD_NUMBER = 3;
    public static final int ENUM_TYPE_FIELD_NUMBER = 5;
    public static final int EXTENSION_FIELD_NUMBER = 7;
    public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 8;
    public static final int PACKAGE_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
    public static final int SERVICE_FIELD_NUMBER = 6;
    public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
    public static final int SYNTAX_FIELD_NUMBER = 12;
    public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
    private int bitField0_;
    private Internal$ProtobufList dependency_;
    private Internal$ProtobufList enumType_;
    private Internal$ProtobufList extension_;
    private byte memoizedIsInitialized = (byte)2;
    private Internal$ProtobufList messageType_;
    private String name_;
    private DescriptorProtos$FileOptions options_;
    private String package_;
    private Internal$IntList publicDependency_;
    private Internal$ProtobufList service_;
    private DescriptorProtos$SourceCodeInfo sourceCodeInfo_;
    private String syntax_;
    private Internal$IntList weakDependency_;

    static {
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto;
        DEFAULT_INSTANCE = descriptorProtos$FileDescriptorProto = new DescriptorProtos$FileDescriptorProto();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FileDescriptorProto.class, descriptorProtos$FileDescriptorProto);
    }

    private DescriptorProtos$FileDescriptorProto() {
        Internal$ProtobufList internal$ProtobufList;
        String string2;
        this.name_ = string2 = "";
        this.package_ = string2;
        this.dependency_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        internal$ProtobufList = GeneratedMessageLite.emptyIntList();
        this.publicDependency_ = internal$ProtobufList;
        internal$ProtobufList = GeneratedMessageLite.emptyIntList();
        this.weakDependency_ = internal$ProtobufList;
        this.messageType_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.enumType_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.service_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.extension_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.syntax_ = string2;
    }

    public static /* synthetic */ void access$1000(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.clearName();
    }

    public static /* synthetic */ void access$1100(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, ByteString byteString) {
        descriptorProtos$FileDescriptorProto.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$1200(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, String string2) {
        descriptorProtos$FileDescriptorProto.setPackage(string2);
    }

    public static /* synthetic */ void access$1300(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.clearPackage();
    }

    public static /* synthetic */ void access$1400(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, ByteString byteString) {
        descriptorProtos$FileDescriptorProto.setPackageBytes(byteString);
    }

    public static /* synthetic */ void access$1500(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, int n3, String string2) {
        descriptorProtos$FileDescriptorProto.setDependency(n3, string2);
    }

    public static /* synthetic */ void access$1600(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, String string2) {
        descriptorProtos$FileDescriptorProto.addDependency(string2);
    }

    public static /* synthetic */ void access$1700(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, Iterable iterable) {
        descriptorProtos$FileDescriptorProto.addAllDependency(iterable);
    }

    public static /* synthetic */ void access$1800(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.clearDependency();
    }

    public static /* synthetic */ void access$1900(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, ByteString byteString) {
        descriptorProtos$FileDescriptorProto.addDependencyBytes(byteString);
    }

    public static /* synthetic */ void access$2000(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, int n3, int n4) {
        descriptorProtos$FileDescriptorProto.setPublicDependency(n3, n4);
    }

    public static /* synthetic */ void access$2100(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, int n3) {
        descriptorProtos$FileDescriptorProto.addPublicDependency(n3);
    }

    public static /* synthetic */ void access$2200(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, Iterable iterable) {
        descriptorProtos$FileDescriptorProto.addAllPublicDependency(iterable);
    }

    public static /* synthetic */ void access$2300(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.clearPublicDependency();
    }

    public static /* synthetic */ void access$2400(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, int n3, int n4) {
        descriptorProtos$FileDescriptorProto.setWeakDependency(n3, n4);
    }

    public static /* synthetic */ void access$2500(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, int n3) {
        descriptorProtos$FileDescriptorProto.addWeakDependency(n3);
    }

    public static /* synthetic */ void access$2600(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, Iterable iterable) {
        descriptorProtos$FileDescriptorProto.addAllWeakDependency(iterable);
    }

    public static /* synthetic */ void access$2700(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.clearWeakDependency();
    }

    public static /* synthetic */ void access$2800(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, int n3, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$FileDescriptorProto.setMessageType(n3, descriptorProtos$DescriptorProto);
    }

    public static /* synthetic */ void access$2900(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$FileDescriptorProto.addMessageType(descriptorProtos$DescriptorProto);
    }

    public static /* synthetic */ void access$3000(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, int n3, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$FileDescriptorProto.addMessageType(n3, descriptorProtos$DescriptorProto);
    }

    public static /* synthetic */ void access$3100(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, Iterable iterable) {
        descriptorProtos$FileDescriptorProto.addAllMessageType(iterable);
    }

    public static /* synthetic */ void access$3200(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.clearMessageType();
    }

    public static /* synthetic */ void access$3300(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, int n3) {
        descriptorProtos$FileDescriptorProto.removeMessageType(n3);
    }

    public static /* synthetic */ void access$3400(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, int n3, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$FileDescriptorProto.setEnumType(n3, descriptorProtos$EnumDescriptorProto);
    }

    public static /* synthetic */ void access$3500(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$FileDescriptorProto.addEnumType(descriptorProtos$EnumDescriptorProto);
    }

    public static /* synthetic */ void access$3600(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, int n3, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$FileDescriptorProto.addEnumType(n3, descriptorProtos$EnumDescriptorProto);
    }

    public static /* synthetic */ void access$3700(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, Iterable iterable) {
        descriptorProtos$FileDescriptorProto.addAllEnumType(iterable);
    }

    public static /* synthetic */ void access$3800(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.clearEnumType();
    }

    public static /* synthetic */ void access$3900(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, int n3) {
        descriptorProtos$FileDescriptorProto.removeEnumType(n3);
    }

    public static /* synthetic */ void access$4000(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, int n3, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$FileDescriptorProto.setService(n3, descriptorProtos$ServiceDescriptorProto);
    }

    public static /* synthetic */ void access$4100(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$FileDescriptorProto.addService(descriptorProtos$ServiceDescriptorProto);
    }

    public static /* synthetic */ void access$4200(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, int n3, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$FileDescriptorProto.addService(n3, descriptorProtos$ServiceDescriptorProto);
    }

    public static /* synthetic */ void access$4300(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, Iterable iterable) {
        descriptorProtos$FileDescriptorProto.addAllService(iterable);
    }

    public static /* synthetic */ void access$4400(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.clearService();
    }

    public static /* synthetic */ void access$4500(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, int n3) {
        descriptorProtos$FileDescriptorProto.removeService(n3);
    }

    public static /* synthetic */ void access$4600(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, int n3, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FileDescriptorProto.setExtension(n3, descriptorProtos$FieldDescriptorProto);
    }

    public static /* synthetic */ void access$4700(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FileDescriptorProto.addExtension(descriptorProtos$FieldDescriptorProto);
    }

    public static /* synthetic */ void access$4800(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, int n3, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FileDescriptorProto.addExtension(n3, descriptorProtos$FieldDescriptorProto);
    }

    public static /* synthetic */ void access$4900(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, Iterable iterable) {
        descriptorProtos$FileDescriptorProto.addAllExtension(iterable);
    }

    public static /* synthetic */ void access$5000(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.clearExtension();
    }

    public static /* synthetic */ void access$5100(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, int n3) {
        descriptorProtos$FileDescriptorProto.removeExtension(n3);
    }

    public static /* synthetic */ void access$5200(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileDescriptorProto.setOptions(descriptorProtos$FileOptions);
    }

    public static /* synthetic */ void access$5300(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileDescriptorProto.mergeOptions(descriptorProtos$FileOptions);
    }

    public static /* synthetic */ void access$5400(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.clearOptions();
    }

    public static /* synthetic */ void access$5500(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        descriptorProtos$FileDescriptorProto.setSourceCodeInfo(descriptorProtos$SourceCodeInfo);
    }

    public static /* synthetic */ void access$5600(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        descriptorProtos$FileDescriptorProto.mergeSourceCodeInfo(descriptorProtos$SourceCodeInfo);
    }

    public static /* synthetic */ void access$5700(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.clearSourceCodeInfo();
    }

    public static /* synthetic */ void access$5800(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, String string2) {
        descriptorProtos$FileDescriptorProto.setSyntax(string2);
    }

    public static /* synthetic */ void access$5900(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.clearSyntax();
    }

    public static /* synthetic */ void access$6000(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, ByteString byteString) {
        descriptorProtos$FileDescriptorProto.setSyntaxBytes(byteString);
    }

    public static /* synthetic */ DescriptorProtos$FileDescriptorProto access$800() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$900(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, String string2) {
        descriptorProtos$FileDescriptorProto.setName(string2);
    }

    private void addAllDependency(Iterable iterable) {
        this.ensureDependencyIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.dependency_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
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

    private void addAllMessageType(Iterable iterable) {
        this.ensureMessageTypeIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.messageType_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllPublicDependency(Iterable iterable) {
        this.ensurePublicDependencyIsMutable();
        Internal$IntList internal$IntList = this.publicDependency_;
        AbstractMessageLite.addAll(iterable, internal$IntList);
    }

    private void addAllService(Iterable iterable) {
        this.ensureServiceIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.service_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllWeakDependency(Iterable iterable) {
        this.ensureWeakDependencyIsMutable();
        Internal$IntList internal$IntList = this.weakDependency_;
        AbstractMessageLite.addAll(iterable, internal$IntList);
    }

    private void addDependency(String string2) {
        string2.getClass();
        this.ensureDependencyIsMutable();
        this.dependency_.add(string2);
    }

    private void addDependencyBytes(ByteString object) {
        this.ensureDependencyIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.dependency_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
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

    private void addMessageType(int n3, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        this.ensureMessageTypeIsMutable();
        this.messageType_.add(n3, descriptorProtos$DescriptorProto);
    }

    private void addMessageType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        this.ensureMessageTypeIsMutable();
        this.messageType_.add(descriptorProtos$DescriptorProto);
    }

    private void addPublicDependency(int n3) {
        this.ensurePublicDependencyIsMutable();
        this.publicDependency_.addInt(n3);
    }

    private void addService(int n3, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.getClass();
        this.ensureServiceIsMutable();
        this.service_.add(n3, descriptorProtos$ServiceDescriptorProto);
    }

    private void addService(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.getClass();
        this.ensureServiceIsMutable();
        this.service_.add(descriptorProtos$ServiceDescriptorProto);
    }

    private void addWeakDependency(int n3) {
        this.ensureWeakDependencyIsMutable();
        this.weakDependency_.addInt(n3);
    }

    private void clearDependency() {
        Internal$ProtobufList internal$ProtobufList;
        this.dependency_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearEnumType() {
        Internal$ProtobufList internal$ProtobufList;
        this.enumType_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearExtension() {
        Internal$ProtobufList internal$ProtobufList;
        this.extension_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearMessageType() {
        Internal$ProtobufList internal$ProtobufList;
        this.messageType_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearName() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.name_ = string2 = DescriptorProtos$FileDescriptorProto.getDefaultInstance().getName();
    }

    private void clearOptions() {
        int n3;
        this.options_ = null;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFB;
    }

    private void clearPackage() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.package_ = string2 = DescriptorProtos$FileDescriptorProto.getDefaultInstance().getPackage();
    }

    private void clearPublicDependency() {
        Internal$IntList internal$IntList;
        this.publicDependency_ = internal$IntList = GeneratedMessageLite.emptyIntList();
    }

    private void clearService() {
        Internal$ProtobufList internal$ProtobufList;
        this.service_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearSourceCodeInfo() {
        int n3;
        this.sourceCodeInfo_ = null;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFF7;
    }

    private void clearSyntax() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFEF;
        this.syntax_ = string2 = DescriptorProtos$FileDescriptorProto.getDefaultInstance().getSyntax();
    }

    private void clearWeakDependency() {
        Internal$IntList internal$IntList;
        this.weakDependency_ = internal$IntList = GeneratedMessageLite.emptyIntList();
    }

    private void ensureDependencyIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.dependency_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.dependency_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
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

    private void ensureMessageTypeIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.messageType_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.messageType_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensurePublicDependencyIsMutable() {
        Internal$IntList internal$IntList = this.publicDependency_;
        boolean bl2 = internal$IntList.isModifiable();
        if (!bl2) {
            this.publicDependency_ = internal$IntList = GeneratedMessageLite.mutableCopy(internal$IntList);
        }
    }

    private void ensureServiceIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.service_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.service_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureWeakDependencyIsMutable() {
        Internal$IntList internal$IntList = this.weakDependency_;
        boolean bl2 = internal$IntList.isModifiable();
        if (!bl2) {
            this.weakDependency_ = internal$IntList = GeneratedMessageLite.mutableCopy(internal$IntList);
        }
    }

    public static DescriptorProtos$FileDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        int n3;
        DescriptorProtos$FileOptions descriptorProtos$FileOptions2;
        descriptorProtos$FileOptions.getClass();
        DescriptorProtos$FileOptionsOrBuilder descriptorProtos$FileOptionsOrBuilder = this.options_;
        if (descriptorProtos$FileOptionsOrBuilder != null && descriptorProtos$FileOptionsOrBuilder != (descriptorProtos$FileOptions2 = DescriptorProtos$FileOptions.getDefaultInstance())) {
            descriptorProtos$FileOptionsOrBuilder = DescriptorProtos$FileOptions.newBuilder(this.options_);
            this.options_ = descriptorProtos$FileOptions = (DescriptorProtos$FileOptions)((DescriptorProtos$FileOptions$Builder)((GeneratedMessageLite$Builder)((Object)descriptorProtos$FileOptionsOrBuilder)).mergeFrom(descriptorProtos$FileOptions)).buildPartial();
        } else {
            this.options_ = descriptorProtos$FileOptions;
        }
        this.bitField0_ = n3 = this.bitField0_ | 4;
    }

    private void mergeSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        int n3;
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo2;
        descriptorProtos$SourceCodeInfo.getClass();
        DescriptorProtos$SourceCodeInfoOrBuilder descriptorProtos$SourceCodeInfoOrBuilder = this.sourceCodeInfo_;
        if (descriptorProtos$SourceCodeInfoOrBuilder != null && descriptorProtos$SourceCodeInfoOrBuilder != (descriptorProtos$SourceCodeInfo2 = DescriptorProtos$SourceCodeInfo.getDefaultInstance())) {
            descriptorProtos$SourceCodeInfoOrBuilder = DescriptorProtos$SourceCodeInfo.newBuilder(this.sourceCodeInfo_);
            this.sourceCodeInfo_ = descriptorProtos$SourceCodeInfo = (DescriptorProtos$SourceCodeInfo)((DescriptorProtos$SourceCodeInfo$Builder)((GeneratedMessageLite$Builder)((Object)descriptorProtos$SourceCodeInfoOrBuilder)).mergeFrom(descriptorProtos$SourceCodeInfo)).buildPartial();
        } else {
            this.sourceCodeInfo_ = descriptorProtos$SourceCodeInfo;
        }
        this.bitField0_ = n3 = this.bitField0_ | 8;
    }

    public static DescriptorProtos$FileDescriptorProto$Builder newBuilder() {
        return (DescriptorProtos$FileDescriptorProto$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FileDescriptorProto$Builder newBuilder(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        return (DescriptorProtos$FileDescriptorProto$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$FileDescriptorProto);
    }

    public static DescriptorProtos$FileDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FileDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteString byteString) {
        return (DescriptorProtos$FileDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FileDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$FileDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FileDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FileDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FileDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FileDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(byte[] byArray) {
        return (DescriptorProtos$FileDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FileDescriptorProto)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
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

    private void removeMessageType(int n3) {
        this.ensureMessageTypeIsMutable();
        this.messageType_.remove(n3);
    }

    private void removeService(int n3) {
        this.ensureServiceIsMutable();
        this.service_.remove(n3);
    }

    private void setDependency(int n3, String string2) {
        string2.getClass();
        this.ensureDependencyIsMutable();
        this.dependency_.set(n3, string2);
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

    private void setMessageType(int n3, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        this.ensureMessageTypeIsMutable();
        this.messageType_.set(n3, descriptorProtos$DescriptorProto);
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

    private void setOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        int n3;
        descriptorProtos$FileOptions.getClass();
        this.options_ = descriptorProtos$FileOptions;
        this.bitField0_ = n3 = this.bitField0_ | 4;
    }

    private void setPackage(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 2;
        this.package_ = string2;
    }

    private void setPackageBytes(ByteString object) {
        int n3;
        this.package_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 2;
    }

    private void setPublicDependency(int n3, int n4) {
        this.ensurePublicDependencyIsMutable();
        this.publicDependency_.setInt(n3, n4);
    }

    private void setService(int n3, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.getClass();
        this.ensureServiceIsMutable();
        this.service_.set(n3, descriptorProtos$ServiceDescriptorProto);
    }

    private void setSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        int n3;
        descriptorProtos$SourceCodeInfo.getClass();
        this.sourceCodeInfo_ = descriptorProtos$SourceCodeInfo;
        this.bitField0_ = n3 = this.bitField0_ | 8;
    }

    private void setSyntax(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 0x10;
        this.syntax_ = string2;
    }

    private void setSyntaxBytes(ByteString object) {
        int n3;
        this.syntax_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 0x10;
    }

    private void setWeakDependency(int n3, int n4) {
        this.ensureWeakDependencyIsMutable();
        this.weakDependency_.setInt(n3, n4);
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
                clazz = DescriptorProtos$FileDescriptorProto.class;
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
                objectArray = new Object[17];
                objectArray[0] = "bitField0_";
                objectArray[n3] = "name_";
                objectArray[2] = "package_";
                objectArray[3] = "dependency_";
                objectArray[4] = "messageType_";
                objectArray[5] = DescriptorProtos$DescriptorProto.class;
                objectArray[6] = "enumType_";
                objectArray[7] = DescriptorProtos$EnumDescriptorProto.class;
                objectArray[8] = "service_";
                objectArray[9] = DescriptorProtos$ServiceDescriptorProto.class;
                objectArray[10] = "extension_";
                objectArray[11] = DescriptorProtos$FieldDescriptorProto.class;
                objectArray[12] = "options_";
                objectArray[13] = "sourceCodeInfo_";
                objectArray[14] = "publicDependency_";
                objectArray[15] = "weakDependency_";
                objectArray[16] = "syntax_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0007\u0005\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u001a\u0004\u041b\u0005\u041b\u0006\u041b\u0007\u041b\b\u1409\u0002\t\u1009\u0003\n\u0016\u000b\u0016\f\u1008\u0004", objectArray);
            }
            case 2: {
                return new DescriptorProtos$FileDescriptorProto$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$FileDescriptorProto();
    }

    public String getDependency(int n3) {
        return (String)this.dependency_.get(n3);
    }

    public ByteString getDependencyBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.dependency_.get(n3));
    }

    public int getDependencyCount() {
        return this.dependency_.size();
    }

    public List getDependencyList() {
        return this.dependency_;
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

    public DescriptorProtos$DescriptorProto getMessageType(int n3) {
        return (DescriptorProtos$DescriptorProto)this.messageType_.get(n3);
    }

    public int getMessageTypeCount() {
        return this.messageType_.size();
    }

    public List getMessageTypeList() {
        return this.messageType_;
    }

    public DescriptorProtos$DescriptorProtoOrBuilder getMessageTypeOrBuilder(int n3) {
        return (DescriptorProtos$DescriptorProtoOrBuilder)this.messageType_.get(n3);
    }

    public List getMessageTypeOrBuilderList() {
        return this.messageType_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public DescriptorProtos$FileOptions getOptions() {
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = this.options_;
        if (descriptorProtos$FileOptions == null) {
            descriptorProtos$FileOptions = DescriptorProtos$FileOptions.getDefaultInstance();
        }
        return descriptorProtos$FileOptions;
    }

    public String getPackage() {
        return this.package_;
    }

    public ByteString getPackageBytes() {
        return ByteString.copyFromUtf8(this.package_);
    }

    public int getPublicDependency(int n3) {
        return this.publicDependency_.getInt(n3);
    }

    public int getPublicDependencyCount() {
        return this.publicDependency_.size();
    }

    public List getPublicDependencyList() {
        return this.publicDependency_;
    }

    public DescriptorProtos$ServiceDescriptorProto getService(int n3) {
        return (DescriptorProtos$ServiceDescriptorProto)this.service_.get(n3);
    }

    public int getServiceCount() {
        return this.service_.size();
    }

    public List getServiceList() {
        return this.service_;
    }

    public DescriptorProtos$ServiceDescriptorProtoOrBuilder getServiceOrBuilder(int n3) {
        return (DescriptorProtos$ServiceDescriptorProtoOrBuilder)this.service_.get(n3);
    }

    public List getServiceOrBuilderList() {
        return this.service_;
    }

    public DescriptorProtos$SourceCodeInfo getSourceCodeInfo() {
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = this.sourceCodeInfo_;
        if (descriptorProtos$SourceCodeInfo == null) {
            descriptorProtos$SourceCodeInfo = DescriptorProtos$SourceCodeInfo.getDefaultInstance();
        }
        return descriptorProtos$SourceCodeInfo;
    }

    public String getSyntax() {
        return this.syntax_;
    }

    public ByteString getSyntaxBytes() {
        return ByteString.copyFromUtf8(this.syntax_);
    }

    public int getWeakDependency(int n3) {
        return this.weakDependency_.getInt(n3);
    }

    public int getWeakDependencyCount() {
        return this.weakDependency_.size();
    }

    public List getWeakDependencyList() {
        return this.weakDependency_;
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
        int n3 = this.bitField0_ & 4;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasPackage() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasSourceCodeInfo() {
        int n3 = this.bitField0_ & 8;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasSyntax() {
        int n3 = this.bitField0_ & 0x10;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }
}

