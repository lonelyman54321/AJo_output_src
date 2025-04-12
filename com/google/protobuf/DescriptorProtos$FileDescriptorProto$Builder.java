/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$DescriptorProto;
import com.google.protobuf.DescriptorProtos$DescriptorProto$Builder;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto$Builder;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Builder;
import com.google.protobuf.DescriptorProtos$FileDescriptorProto;
import com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$FileOptions$Builder;
import com.google.protobuf.DescriptorProtos$ServiceDescriptorProto;
import com.google.protobuf.DescriptorProtos$ServiceDescriptorProto$Builder;
import com.google.protobuf.DescriptorProtos$SourceCodeInfo;
import com.google.protobuf.DescriptorProtos$SourceCodeInfo$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$FileDescriptorProto$Builder
extends GeneratedMessageLite$Builder
implements DescriptorProtos$FileDescriptorProtoOrBuilder {
    private DescriptorProtos$FileDescriptorProto$Builder() {
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = DescriptorProtos$FileDescriptorProto.access$800();
        super(descriptorProtos$FileDescriptorProto);
    }

    public /* synthetic */ DescriptorProtos$FileDescriptorProto$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$FileDescriptorProto$Builder addAllDependency(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$1700((DescriptorProtos$FileDescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addAllEnumType(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$3700((DescriptorProtos$FileDescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addAllExtension(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$4900((DescriptorProtos$FileDescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addAllMessageType(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$3100((DescriptorProtos$FileDescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addAllPublicDependency(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$2200((DescriptorProtos$FileDescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addAllService(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$4300((DescriptorProtos$FileDescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addAllWeakDependency(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$2600((DescriptorProtos$FileDescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addDependency(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$1600((DescriptorProtos$FileDescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addDependencyBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$1900((DescriptorProtos$FileDescriptorProto)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addEnumType(int n3, DescriptorProtos$EnumDescriptorProto$Builder descriptorProtos$EnumDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto)this.instance;
        descriptorProtos$EnumDescriptorProtoOrBuilder = (DescriptorProtos$EnumDescriptorProto)descriptorProtos$EnumDescriptorProtoOrBuilder.build();
        DescriptorProtos$FileDescriptorProto.access$3600(descriptorProtos$FileDescriptorProto, n3, (DescriptorProtos$EnumDescriptorProto)descriptorProtos$EnumDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addEnumType(int n3, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$3600((DescriptorProtos$FileDescriptorProto)this.instance, n3, descriptorProtos$EnumDescriptorProto);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addEnumType(DescriptorProtos$EnumDescriptorProto$Builder descriptorProtos$EnumDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto)this.instance;
        descriptorProtos$EnumDescriptorProtoOrBuilder = (DescriptorProtos$EnumDescriptorProto)descriptorProtos$EnumDescriptorProtoOrBuilder.build();
        DescriptorProtos$FileDescriptorProto.access$3500(descriptorProtos$FileDescriptorProto, (DescriptorProtos$EnumDescriptorProto)descriptorProtos$EnumDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$3500((DescriptorProtos$FileDescriptorProto)this.instance, descriptorProtos$EnumDescriptorProto);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addExtension(int n3, DescriptorProtos$FieldDescriptorProto$Builder descriptorProtos$FieldDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto)this.instance;
        descriptorProtos$FieldDescriptorProtoOrBuilder = (DescriptorProtos$FieldDescriptorProto)descriptorProtos$FieldDescriptorProtoOrBuilder.build();
        DescriptorProtos$FileDescriptorProto.access$4800(descriptorProtos$FileDescriptorProto, n3, (DescriptorProtos$FieldDescriptorProto)descriptorProtos$FieldDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addExtension(int n3, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$4800((DescriptorProtos$FileDescriptorProto)this.instance, n3, descriptorProtos$FieldDescriptorProto);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addExtension(DescriptorProtos$FieldDescriptorProto$Builder descriptorProtos$FieldDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto)this.instance;
        descriptorProtos$FieldDescriptorProtoOrBuilder = (DescriptorProtos$FieldDescriptorProto)descriptorProtos$FieldDescriptorProtoOrBuilder.build();
        DescriptorProtos$FileDescriptorProto.access$4700(descriptorProtos$FileDescriptorProto, (DescriptorProtos$FieldDescriptorProto)descriptorProtos$FieldDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$4700((DescriptorProtos$FileDescriptorProto)this.instance, descriptorProtos$FieldDescriptorProto);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addMessageType(int n3, DescriptorProtos$DescriptorProto$Builder descriptorProtos$DescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto)this.instance;
        descriptorProtos$DescriptorProtoOrBuilder = (DescriptorProtos$DescriptorProto)descriptorProtos$DescriptorProtoOrBuilder.build();
        DescriptorProtos$FileDescriptorProto.access$3000(descriptorProtos$FileDescriptorProto, n3, (DescriptorProtos$DescriptorProto)descriptorProtos$DescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addMessageType(int n3, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$3000((DescriptorProtos$FileDescriptorProto)this.instance, n3, descriptorProtos$DescriptorProto);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addMessageType(DescriptorProtos$DescriptorProto$Builder descriptorProtos$DescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto)this.instance;
        descriptorProtos$DescriptorProtoOrBuilder = (DescriptorProtos$DescriptorProto)descriptorProtos$DescriptorProtoOrBuilder.build();
        DescriptorProtos$FileDescriptorProto.access$2900(descriptorProtos$FileDescriptorProto, (DescriptorProtos$DescriptorProto)descriptorProtos$DescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addMessageType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$2900((DescriptorProtos$FileDescriptorProto)this.instance, descriptorProtos$DescriptorProto);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addPublicDependency(int n3) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$2100((DescriptorProtos$FileDescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addService(int n3, DescriptorProtos$ServiceDescriptorProto$Builder descriptorProtos$ServiceDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto)this.instance;
        descriptorProtos$ServiceDescriptorProtoOrBuilder = (DescriptorProtos$ServiceDescriptorProto)descriptorProtos$ServiceDescriptorProtoOrBuilder.build();
        DescriptorProtos$FileDescriptorProto.access$4200(descriptorProtos$FileDescriptorProto, n3, (DescriptorProtos$ServiceDescriptorProto)descriptorProtos$ServiceDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addService(int n3, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$4200((DescriptorProtos$FileDescriptorProto)this.instance, n3, descriptorProtos$ServiceDescriptorProto);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addService(DescriptorProtos$ServiceDescriptorProto$Builder descriptorProtos$ServiceDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto)this.instance;
        descriptorProtos$ServiceDescriptorProtoOrBuilder = (DescriptorProtos$ServiceDescriptorProto)descriptorProtos$ServiceDescriptorProtoOrBuilder.build();
        DescriptorProtos$FileDescriptorProto.access$4100(descriptorProtos$FileDescriptorProto, (DescriptorProtos$ServiceDescriptorProto)descriptorProtos$ServiceDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addService(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$4100((DescriptorProtos$FileDescriptorProto)this.instance, descriptorProtos$ServiceDescriptorProto);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder addWeakDependency(int n3) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$2500((DescriptorProtos$FileDescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder clearDependency() {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$1800((DescriptorProtos$FileDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder clearEnumType() {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$3800((DescriptorProtos$FileDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder clearExtension() {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$5000((DescriptorProtos$FileDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder clearMessageType() {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$3200((DescriptorProtos$FileDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder clearName() {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$1000((DescriptorProtos$FileDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder clearOptions() {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$5400((DescriptorProtos$FileDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder clearPackage() {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$1300((DescriptorProtos$FileDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder clearPublicDependency() {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$2300((DescriptorProtos$FileDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder clearService() {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$4400((DescriptorProtos$FileDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder clearSourceCodeInfo() {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$5700((DescriptorProtos$FileDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder clearSyntax() {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$5900((DescriptorProtos$FileDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder clearWeakDependency() {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$2700((DescriptorProtos$FileDescriptorProto)this.instance);
        return this;
    }

    public String getDependency(int n3) {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getDependency(n3);
    }

    public ByteString getDependencyBytes(int n3) {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getDependencyBytes(n3);
    }

    public int getDependencyCount() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getDependencyCount();
    }

    public List getDependencyList() {
        return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto)this.instance).getDependencyList());
    }

    public DescriptorProtos$EnumDescriptorProto getEnumType(int n3) {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getEnumType(n3);
    }

    public int getEnumTypeCount() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getEnumTypeCount();
    }

    public List getEnumTypeList() {
        return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto)this.instance).getEnumTypeList());
    }

    public DescriptorProtos$FieldDescriptorProto getExtension(int n3) {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getExtension(n3);
    }

    public int getExtensionCount() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getExtensionCount();
    }

    public List getExtensionList() {
        return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto)this.instance).getExtensionList());
    }

    public DescriptorProtos$DescriptorProto getMessageType(int n3) {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getMessageType(n3);
    }

    public int getMessageTypeCount() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getMessageTypeCount();
    }

    public List getMessageTypeList() {
        return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto)this.instance).getMessageTypeList());
    }

    public String getName() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getNameBytes();
    }

    public DescriptorProtos$FileOptions getOptions() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getOptions();
    }

    public String getPackage() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getPackage();
    }

    public ByteString getPackageBytes() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getPackageBytes();
    }

    public int getPublicDependency(int n3) {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getPublicDependency(n3);
    }

    public int getPublicDependencyCount() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getPublicDependencyCount();
    }

    public List getPublicDependencyList() {
        return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto)this.instance).getPublicDependencyList());
    }

    public DescriptorProtos$ServiceDescriptorProto getService(int n3) {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getService(n3);
    }

    public int getServiceCount() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getServiceCount();
    }

    public List getServiceList() {
        return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto)this.instance).getServiceList());
    }

    public DescriptorProtos$SourceCodeInfo getSourceCodeInfo() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getSourceCodeInfo();
    }

    public String getSyntax() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getSyntax();
    }

    public ByteString getSyntaxBytes() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getSyntaxBytes();
    }

    public int getWeakDependency(int n3) {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getWeakDependency(n3);
    }

    public int getWeakDependencyCount() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).getWeakDependencyCount();
    }

    public List getWeakDependencyList() {
        return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto)this.instance).getWeakDependencyList());
    }

    public boolean hasName() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).hasName();
    }

    public boolean hasOptions() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).hasOptions();
    }

    public boolean hasPackage() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).hasPackage();
    }

    public boolean hasSourceCodeInfo() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).hasSourceCodeInfo();
    }

    public boolean hasSyntax() {
        return ((DescriptorProtos$FileDescriptorProto)this.instance).hasSyntax();
    }

    public DescriptorProtos$FileDescriptorProto$Builder mergeOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$5300((DescriptorProtos$FileDescriptorProto)this.instance, descriptorProtos$FileOptions);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder mergeSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$5600((DescriptorProtos$FileDescriptorProto)this.instance, descriptorProtos$SourceCodeInfo);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder removeEnumType(int n3) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$3900((DescriptorProtos$FileDescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder removeExtension(int n3) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$5100((DescriptorProtos$FileDescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder removeMessageType(int n3) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$3300((DescriptorProtos$FileDescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder removeService(int n3) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$4500((DescriptorProtos$FileDescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setDependency(int n3, String string2) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$1500((DescriptorProtos$FileDescriptorProto)this.instance, n3, string2);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setEnumType(int n3, DescriptorProtos$EnumDescriptorProto$Builder descriptorProtos$EnumDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto)this.instance;
        descriptorProtos$EnumDescriptorProtoOrBuilder = (DescriptorProtos$EnumDescriptorProto)descriptorProtos$EnumDescriptorProtoOrBuilder.build();
        DescriptorProtos$FileDescriptorProto.access$3400(descriptorProtos$FileDescriptorProto, n3, (DescriptorProtos$EnumDescriptorProto)descriptorProtos$EnumDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setEnumType(int n3, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$3400((DescriptorProtos$FileDescriptorProto)this.instance, n3, descriptorProtos$EnumDescriptorProto);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setExtension(int n3, DescriptorProtos$FieldDescriptorProto$Builder descriptorProtos$FieldDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto)this.instance;
        descriptorProtos$FieldDescriptorProtoOrBuilder = (DescriptorProtos$FieldDescriptorProto)descriptorProtos$FieldDescriptorProtoOrBuilder.build();
        DescriptorProtos$FileDescriptorProto.access$4600(descriptorProtos$FileDescriptorProto, n3, (DescriptorProtos$FieldDescriptorProto)descriptorProtos$FieldDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setExtension(int n3, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$4600((DescriptorProtos$FileDescriptorProto)this.instance, n3, descriptorProtos$FieldDescriptorProto);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setMessageType(int n3, DescriptorProtos$DescriptorProto$Builder descriptorProtos$DescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto)this.instance;
        descriptorProtos$DescriptorProtoOrBuilder = (DescriptorProtos$DescriptorProto)descriptorProtos$DescriptorProtoOrBuilder.build();
        DescriptorProtos$FileDescriptorProto.access$2800(descriptorProtos$FileDescriptorProto, n3, (DescriptorProtos$DescriptorProto)descriptorProtos$DescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setMessageType(int n3, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$2800((DescriptorProtos$FileDescriptorProto)this.instance, n3, descriptorProtos$DescriptorProto);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setName(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$900((DescriptorProtos$FileDescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$1100((DescriptorProtos$FileDescriptorProto)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setOptions(DescriptorProtos$FileOptions$Builder descriptorProtos$FileOptionsOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto)this.instance;
        descriptorProtos$FileOptionsOrBuilder = (DescriptorProtos$FileOptions)descriptorProtos$FileOptionsOrBuilder.build();
        DescriptorProtos$FileDescriptorProto.access$5200(descriptorProtos$FileDescriptorProto, (DescriptorProtos$FileOptions)descriptorProtos$FileOptionsOrBuilder);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$5200((DescriptorProtos$FileDescriptorProto)this.instance, descriptorProtos$FileOptions);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setPackage(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$1200((DescriptorProtos$FileDescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setPackageBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$1400((DescriptorProtos$FileDescriptorProto)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setPublicDependency(int n3, int n4) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$2000((DescriptorProtos$FileDescriptorProto)this.instance, n3, n4);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setService(int n3, DescriptorProtos$ServiceDescriptorProto$Builder descriptorProtos$ServiceDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto)this.instance;
        descriptorProtos$ServiceDescriptorProtoOrBuilder = (DescriptorProtos$ServiceDescriptorProto)descriptorProtos$ServiceDescriptorProtoOrBuilder.build();
        DescriptorProtos$FileDescriptorProto.access$4000(descriptorProtos$FileDescriptorProto, n3, (DescriptorProtos$ServiceDescriptorProto)descriptorProtos$ServiceDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setService(int n3, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$4000((DescriptorProtos$FileDescriptorProto)this.instance, n3, descriptorProtos$ServiceDescriptorProto);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setSourceCodeInfo(DescriptorProtos$SourceCodeInfo$Builder descriptorProtos$SourceCodeInfoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = (DescriptorProtos$FileDescriptorProto)this.instance;
        descriptorProtos$SourceCodeInfoOrBuilder = (DescriptorProtos$SourceCodeInfo)descriptorProtos$SourceCodeInfoOrBuilder.build();
        DescriptorProtos$FileDescriptorProto.access$5500(descriptorProtos$FileDescriptorProto, (DescriptorProtos$SourceCodeInfo)descriptorProtos$SourceCodeInfoOrBuilder);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$5500((DescriptorProtos$FileDescriptorProto)this.instance, descriptorProtos$SourceCodeInfo);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setSyntax(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$5800((DescriptorProtos$FileDescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setSyntaxBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$6000((DescriptorProtos$FileDescriptorProto)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto$Builder setWeakDependency(int n3, int n4) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorProto.access$2400((DescriptorProtos$FileDescriptorProto)this.instance, n3, n4);
        return this;
    }
}

