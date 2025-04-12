/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$MethodDescriptorProto;
import com.google.protobuf.DescriptorProtos$MethodDescriptorProto$Builder;
import com.google.protobuf.DescriptorProtos$ServiceDescriptorProto;
import com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$ServiceOptions;
import com.google.protobuf.DescriptorProtos$ServiceOptions$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$ServiceDescriptorProto$Builder
extends GeneratedMessageLite$Builder
implements DescriptorProtos$ServiceDescriptorProtoOrBuilder {
    private DescriptorProtos$ServiceDescriptorProto$Builder() {
        DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto = DescriptorProtos$ServiceDescriptorProto.access$21900();
        super(descriptorProtos$ServiceDescriptorProto);
    }

    public /* synthetic */ DescriptorProtos$ServiceDescriptorProto$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$ServiceDescriptorProto$Builder addAllMethod(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$ServiceDescriptorProto.access$22600((DescriptorProtos$ServiceDescriptorProto)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$ServiceDescriptorProto$Builder addMethod(int n3, DescriptorProtos$MethodDescriptorProto$Builder descriptorProtos$MethodDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto = (DescriptorProtos$ServiceDescriptorProto)this.instance;
        descriptorProtos$MethodDescriptorProtoOrBuilder = (DescriptorProtos$MethodDescriptorProto)descriptorProtos$MethodDescriptorProtoOrBuilder.build();
        DescriptorProtos$ServiceDescriptorProto.access$22500(descriptorProtos$ServiceDescriptorProto, n3, (DescriptorProtos$MethodDescriptorProto)descriptorProtos$MethodDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$ServiceDescriptorProto$Builder addMethod(int n3, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$ServiceDescriptorProto.access$22500((DescriptorProtos$ServiceDescriptorProto)this.instance, n3, descriptorProtos$MethodDescriptorProto);
        return this;
    }

    public DescriptorProtos$ServiceDescriptorProto$Builder addMethod(DescriptorProtos$MethodDescriptorProto$Builder descriptorProtos$MethodDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto = (DescriptorProtos$ServiceDescriptorProto)this.instance;
        descriptorProtos$MethodDescriptorProtoOrBuilder = (DescriptorProtos$MethodDescriptorProto)descriptorProtos$MethodDescriptorProtoOrBuilder.build();
        DescriptorProtos$ServiceDescriptorProto.access$22400(descriptorProtos$ServiceDescriptorProto, (DescriptorProtos$MethodDescriptorProto)descriptorProtos$MethodDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$ServiceDescriptorProto$Builder addMethod(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$ServiceDescriptorProto.access$22400((DescriptorProtos$ServiceDescriptorProto)this.instance, descriptorProtos$MethodDescriptorProto);
        return this;
    }

    public DescriptorProtos$ServiceDescriptorProto$Builder clearMethod() {
        this.copyOnWrite();
        DescriptorProtos$ServiceDescriptorProto.access$22700((DescriptorProtos$ServiceDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$ServiceDescriptorProto$Builder clearName() {
        this.copyOnWrite();
        DescriptorProtos$ServiceDescriptorProto.access$22100((DescriptorProtos$ServiceDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$ServiceDescriptorProto$Builder clearOptions() {
        this.copyOnWrite();
        DescriptorProtos$ServiceDescriptorProto.access$23100((DescriptorProtos$ServiceDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$MethodDescriptorProto getMethod(int n3) {
        return ((DescriptorProtos$ServiceDescriptorProto)this.instance).getMethod(n3);
    }

    public int getMethodCount() {
        return ((DescriptorProtos$ServiceDescriptorProto)this.instance).getMethodCount();
    }

    public List getMethodList() {
        return Collections.unmodifiableList(((DescriptorProtos$ServiceDescriptorProto)this.instance).getMethodList());
    }

    public String getName() {
        return ((DescriptorProtos$ServiceDescriptorProto)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((DescriptorProtos$ServiceDescriptorProto)this.instance).getNameBytes();
    }

    public DescriptorProtos$ServiceOptions getOptions() {
        return ((DescriptorProtos$ServiceDescriptorProto)this.instance).getOptions();
    }

    public boolean hasName() {
        return ((DescriptorProtos$ServiceDescriptorProto)this.instance).hasName();
    }

    public boolean hasOptions() {
        return ((DescriptorProtos$ServiceDescriptorProto)this.instance).hasOptions();
    }

    public DescriptorProtos$ServiceDescriptorProto$Builder mergeOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
        this.copyOnWrite();
        DescriptorProtos$ServiceDescriptorProto.access$23000((DescriptorProtos$ServiceDescriptorProto)this.instance, descriptorProtos$ServiceOptions);
        return this;
    }

    public DescriptorProtos$ServiceDescriptorProto$Builder removeMethod(int n3) {
        this.copyOnWrite();
        DescriptorProtos$ServiceDescriptorProto.access$22800((DescriptorProtos$ServiceDescriptorProto)this.instance, n3);
        return this;
    }

    public DescriptorProtos$ServiceDescriptorProto$Builder setMethod(int n3, DescriptorProtos$MethodDescriptorProto$Builder descriptorProtos$MethodDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto = (DescriptorProtos$ServiceDescriptorProto)this.instance;
        descriptorProtos$MethodDescriptorProtoOrBuilder = (DescriptorProtos$MethodDescriptorProto)descriptorProtos$MethodDescriptorProtoOrBuilder.build();
        DescriptorProtos$ServiceDescriptorProto.access$22300(descriptorProtos$ServiceDescriptorProto, n3, (DescriptorProtos$MethodDescriptorProto)descriptorProtos$MethodDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$ServiceDescriptorProto$Builder setMethod(int n3, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$ServiceDescriptorProto.access$22300((DescriptorProtos$ServiceDescriptorProto)this.instance, n3, descriptorProtos$MethodDescriptorProto);
        return this;
    }

    public DescriptorProtos$ServiceDescriptorProto$Builder setName(String string2) {
        this.copyOnWrite();
        DescriptorProtos$ServiceDescriptorProto.access$22000((DescriptorProtos$ServiceDescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$ServiceDescriptorProto$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$ServiceDescriptorProto.access$22200((DescriptorProtos$ServiceDescriptorProto)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$ServiceDescriptorProto$Builder setOptions(DescriptorProtos$ServiceOptions$Builder descriptorProtos$ServiceOptionsOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto = (DescriptorProtos$ServiceDescriptorProto)this.instance;
        descriptorProtos$ServiceOptionsOrBuilder = (DescriptorProtos$ServiceOptions)descriptorProtos$ServiceOptionsOrBuilder.build();
        DescriptorProtos$ServiceDescriptorProto.access$22900(descriptorProtos$ServiceDescriptorProto, (DescriptorProtos$ServiceOptions)descriptorProtos$ServiceOptionsOrBuilder);
        return this;
    }

    public DescriptorProtos$ServiceDescriptorProto$Builder setOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
        this.copyOnWrite();
        DescriptorProtos$ServiceDescriptorProto.access$22900((DescriptorProtos$ServiceDescriptorProto)this.instance, descriptorProtos$ServiceOptions);
        return this;
    }
}

