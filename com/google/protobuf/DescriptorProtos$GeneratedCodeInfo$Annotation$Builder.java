/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$Annotation;
import com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$GeneratedCodeInfo$Annotation$Builder
extends GeneratedMessageLite$Builder
implements DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder {
    private DescriptorProtos$GeneratedCodeInfo$Annotation$Builder() {
        DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation = DescriptorProtos$GeneratedCodeInfo$Annotation.access$45500();
        super(descriptorProtos$GeneratedCodeInfo$Annotation);
    }

    public /* synthetic */ DescriptorProtos$GeneratedCodeInfo$Annotation$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder addAllPath(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo$Annotation.access$45800((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder addPath(int n3) {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo$Annotation.access$45700((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance, n3);
        return this;
    }

    public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clearBegin() {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo$Annotation.access$46400((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance);
        return this;
    }

    public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clearEnd() {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo$Annotation.access$46600((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance);
        return this;
    }

    public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clearPath() {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo$Annotation.access$45900((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance);
        return this;
    }

    public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clearSourceFile() {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo$Annotation.access$46100((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance);
        return this;
    }

    public int getBegin() {
        return ((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance).getBegin();
    }

    public int getEnd() {
        return ((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance).getEnd();
    }

    public int getPath(int n3) {
        return ((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance).getPath(n3);
    }

    public int getPathCount() {
        return ((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance).getPathCount();
    }

    public List getPathList() {
        return Collections.unmodifiableList(((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance).getPathList());
    }

    public String getSourceFile() {
        return ((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance).getSourceFile();
    }

    public ByteString getSourceFileBytes() {
        return ((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance).getSourceFileBytes();
    }

    public boolean hasBegin() {
        return ((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance).hasBegin();
    }

    public boolean hasEnd() {
        return ((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance).hasEnd();
    }

    public boolean hasSourceFile() {
        return ((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance).hasSourceFile();
    }

    public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setBegin(int n3) {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo$Annotation.access$46300((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance, n3);
        return this;
    }

    public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setEnd(int n3) {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo$Annotation.access$46500((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance, n3);
        return this;
    }

    public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setPath(int n3, int n4) {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo$Annotation.access$45600((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance, n3, n4);
        return this;
    }

    public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setSourceFile(String string2) {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo$Annotation.access$46000((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance, string2);
        return this;
    }

    public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setSourceFileBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo$Annotation.access$46200((DescriptorProtos$GeneratedCodeInfo$Annotation)this.instance, byteString);
        return this;
    }
}

