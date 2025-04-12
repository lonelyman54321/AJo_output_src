/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$FileDescriptorProto;
import com.google.protobuf.DescriptorProtos$FileDescriptorProto$Builder;
import com.google.protobuf.DescriptorProtos$FileDescriptorSet;
import com.google.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$FileDescriptorSet$Builder
extends GeneratedMessageLite$Builder
implements DescriptorProtos$FileDescriptorSetOrBuilder {
    private DescriptorProtos$FileDescriptorSet$Builder() {
        DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet = DescriptorProtos$FileDescriptorSet.access$000();
        super(descriptorProtos$FileDescriptorSet);
    }

    public /* synthetic */ DescriptorProtos$FileDescriptorSet$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$FileDescriptorSet$Builder addAllFile(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorSet.access$400((DescriptorProtos$FileDescriptorSet)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$FileDescriptorSet$Builder addFile(int n3, DescriptorProtos$FileDescriptorProto$Builder descriptorProtos$FileDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet = (DescriptorProtos$FileDescriptorSet)this.instance;
        descriptorProtos$FileDescriptorProtoOrBuilder = (DescriptorProtos$FileDescriptorProto)descriptorProtos$FileDescriptorProtoOrBuilder.build();
        DescriptorProtos$FileDescriptorSet.access$300(descriptorProtos$FileDescriptorSet, n3, (DescriptorProtos$FileDescriptorProto)descriptorProtos$FileDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$FileDescriptorSet$Builder addFile(int n3, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorSet.access$300((DescriptorProtos$FileDescriptorSet)this.instance, n3, descriptorProtos$FileDescriptorProto);
        return this;
    }

    public DescriptorProtos$FileDescriptorSet$Builder addFile(DescriptorProtos$FileDescriptorProto$Builder descriptorProtos$FileDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet = (DescriptorProtos$FileDescriptorSet)this.instance;
        descriptorProtos$FileDescriptorProtoOrBuilder = (DescriptorProtos$FileDescriptorProto)descriptorProtos$FileDescriptorProtoOrBuilder.build();
        DescriptorProtos$FileDescriptorSet.access$200(descriptorProtos$FileDescriptorSet, (DescriptorProtos$FileDescriptorProto)descriptorProtos$FileDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$FileDescriptorSet$Builder addFile(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorSet.access$200((DescriptorProtos$FileDescriptorSet)this.instance, descriptorProtos$FileDescriptorProto);
        return this;
    }

    public DescriptorProtos$FileDescriptorSet$Builder clearFile() {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorSet.access$500((DescriptorProtos$FileDescriptorSet)this.instance);
        return this;
    }

    public DescriptorProtos$FileDescriptorProto getFile(int n3) {
        return ((DescriptorProtos$FileDescriptorSet)this.instance).getFile(n3);
    }

    public int getFileCount() {
        return ((DescriptorProtos$FileDescriptorSet)this.instance).getFileCount();
    }

    public List getFileList() {
        return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorSet)this.instance).getFileList());
    }

    public DescriptorProtos$FileDescriptorSet$Builder removeFile(int n3) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorSet.access$600((DescriptorProtos$FileDescriptorSet)this.instance, n3);
        return this;
    }

    public DescriptorProtos$FileDescriptorSet$Builder setFile(int n3, DescriptorProtos$FileDescriptorProto$Builder descriptorProtos$FileDescriptorProtoOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet = (DescriptorProtos$FileDescriptorSet)this.instance;
        descriptorProtos$FileDescriptorProtoOrBuilder = (DescriptorProtos$FileDescriptorProto)descriptorProtos$FileDescriptorProtoOrBuilder.build();
        DescriptorProtos$FileDescriptorSet.access$100(descriptorProtos$FileDescriptorSet, n3, (DescriptorProtos$FileDescriptorProto)descriptorProtos$FileDescriptorProtoOrBuilder);
        return this;
    }

    public DescriptorProtos$FileDescriptorSet$Builder setFile(int n3, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        this.copyOnWrite();
        DescriptorProtos$FileDescriptorSet.access$100((DescriptorProtos$FileDescriptorSet)this.instance, n3, descriptorProtos$FileDescriptorProto);
        return this;
    }
}

