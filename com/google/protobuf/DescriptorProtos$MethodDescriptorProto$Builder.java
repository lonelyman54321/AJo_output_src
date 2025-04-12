/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$MethodDescriptorProto;
import com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class DescriptorProtos$MethodDescriptorProto$Builder
extends GeneratedMessageLite$Builder
implements DescriptorProtos$MethodDescriptorProtoOrBuilder {
    private DescriptorProtos$MethodDescriptorProto$Builder() {
        DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto = DescriptorProtos$MethodDescriptorProto.access$23300();
        super(descriptorProtos$MethodDescriptorProto);
    }

    public /* synthetic */ DescriptorProtos$MethodDescriptorProto$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$MethodDescriptorProto$Builder clearClientStreaming() {
        this.copyOnWrite();
        DescriptorProtos$MethodDescriptorProto.access$24700((DescriptorProtos$MethodDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$MethodDescriptorProto$Builder clearInputType() {
        this.copyOnWrite();
        DescriptorProtos$MethodDescriptorProto.access$23800((DescriptorProtos$MethodDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$MethodDescriptorProto$Builder clearName() {
        this.copyOnWrite();
        DescriptorProtos$MethodDescriptorProto.access$23500((DescriptorProtos$MethodDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$MethodDescriptorProto$Builder clearOptions() {
        this.copyOnWrite();
        DescriptorProtos$MethodDescriptorProto.access$24500((DescriptorProtos$MethodDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$MethodDescriptorProto$Builder clearOutputType() {
        this.copyOnWrite();
        DescriptorProtos$MethodDescriptorProto.access$24100((DescriptorProtos$MethodDescriptorProto)this.instance);
        return this;
    }

    public DescriptorProtos$MethodDescriptorProto$Builder clearServerStreaming() {
        this.copyOnWrite();
        DescriptorProtos$MethodDescriptorProto.access$24900((DescriptorProtos$MethodDescriptorProto)this.instance);
        return this;
    }

    public boolean getClientStreaming() {
        return ((DescriptorProtos$MethodDescriptorProto)this.instance).getClientStreaming();
    }

    public String getInputType() {
        return ((DescriptorProtos$MethodDescriptorProto)this.instance).getInputType();
    }

    public ByteString getInputTypeBytes() {
        return ((DescriptorProtos$MethodDescriptorProto)this.instance).getInputTypeBytes();
    }

    public String getName() {
        return ((DescriptorProtos$MethodDescriptorProto)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((DescriptorProtos$MethodDescriptorProto)this.instance).getNameBytes();
    }

    public DescriptorProtos$MethodOptions getOptions() {
        return ((DescriptorProtos$MethodDescriptorProto)this.instance).getOptions();
    }

    public String getOutputType() {
        return ((DescriptorProtos$MethodDescriptorProto)this.instance).getOutputType();
    }

    public ByteString getOutputTypeBytes() {
        return ((DescriptorProtos$MethodDescriptorProto)this.instance).getOutputTypeBytes();
    }

    public boolean getServerStreaming() {
        return ((DescriptorProtos$MethodDescriptorProto)this.instance).getServerStreaming();
    }

    public boolean hasClientStreaming() {
        return ((DescriptorProtos$MethodDescriptorProto)this.instance).hasClientStreaming();
    }

    public boolean hasInputType() {
        return ((DescriptorProtos$MethodDescriptorProto)this.instance).hasInputType();
    }

    public boolean hasName() {
        return ((DescriptorProtos$MethodDescriptorProto)this.instance).hasName();
    }

    public boolean hasOptions() {
        return ((DescriptorProtos$MethodDescriptorProto)this.instance).hasOptions();
    }

    public boolean hasOutputType() {
        return ((DescriptorProtos$MethodDescriptorProto)this.instance).hasOutputType();
    }

    public boolean hasServerStreaming() {
        return ((DescriptorProtos$MethodDescriptorProto)this.instance).hasServerStreaming();
    }

    public DescriptorProtos$MethodDescriptorProto$Builder mergeOptions(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        this.copyOnWrite();
        DescriptorProtos$MethodDescriptorProto.access$24400((DescriptorProtos$MethodDescriptorProto)this.instance, descriptorProtos$MethodOptions);
        return this;
    }

    public DescriptorProtos$MethodDescriptorProto$Builder setClientStreaming(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$MethodDescriptorProto.access$24600((DescriptorProtos$MethodDescriptorProto)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$MethodDescriptorProto$Builder setInputType(String string2) {
        this.copyOnWrite();
        DescriptorProtos$MethodDescriptorProto.access$23700((DescriptorProtos$MethodDescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$MethodDescriptorProto$Builder setInputTypeBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$MethodDescriptorProto.access$23900((DescriptorProtos$MethodDescriptorProto)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$MethodDescriptorProto$Builder setName(String string2) {
        this.copyOnWrite();
        DescriptorProtos$MethodDescriptorProto.access$23400((DescriptorProtos$MethodDescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$MethodDescriptorProto$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$MethodDescriptorProto.access$23600((DescriptorProtos$MethodDescriptorProto)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$MethodDescriptorProto$Builder setOptions(DescriptorProtos$MethodOptions$Builder descriptorProtos$MethodOptionsOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto = (DescriptorProtos$MethodDescriptorProto)this.instance;
        descriptorProtos$MethodOptionsOrBuilder = (DescriptorProtos$MethodOptions)descriptorProtos$MethodOptionsOrBuilder.build();
        DescriptorProtos$MethodDescriptorProto.access$24300(descriptorProtos$MethodDescriptorProto, (DescriptorProtos$MethodOptions)descriptorProtos$MethodOptionsOrBuilder);
        return this;
    }

    public DescriptorProtos$MethodDescriptorProto$Builder setOptions(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        this.copyOnWrite();
        DescriptorProtos$MethodDescriptorProto.access$24300((DescriptorProtos$MethodDescriptorProto)this.instance, descriptorProtos$MethodOptions);
        return this;
    }

    public DescriptorProtos$MethodDescriptorProto$Builder setOutputType(String string2) {
        this.copyOnWrite();
        DescriptorProtos$MethodDescriptorProto.access$24000((DescriptorProtos$MethodDescriptorProto)this.instance, string2);
        return this;
    }

    public DescriptorProtos$MethodDescriptorProto$Builder setOutputTypeBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$MethodDescriptorProto.access$24200((DescriptorProtos$MethodDescriptorProto)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$MethodDescriptorProto$Builder setServerStreaming(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$MethodDescriptorProto.access$24800((DescriptorProtos$MethodDescriptorProto)this.instance, bl2);
        return this;
    }
}

