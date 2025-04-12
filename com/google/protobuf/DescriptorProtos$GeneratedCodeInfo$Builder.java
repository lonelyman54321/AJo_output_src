/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$GeneratedCodeInfo;
import com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$Annotation;
import com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$Annotation$Builder;
import com.google.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$GeneratedCodeInfo$Builder
extends GeneratedMessageLite$Builder
implements DescriptorProtos$GeneratedCodeInfoOrBuilder {
    private DescriptorProtos$GeneratedCodeInfo$Builder() {
        DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = DescriptorProtos$GeneratedCodeInfo.access$46800();
        super(descriptorProtos$GeneratedCodeInfo);
    }

    public /* synthetic */ DescriptorProtos$GeneratedCodeInfo$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$GeneratedCodeInfo$Builder addAllAnnotation(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo.access$47200((DescriptorProtos$GeneratedCodeInfo)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$GeneratedCodeInfo$Builder addAnnotation(int n3, DescriptorProtos$GeneratedCodeInfo$Annotation$Builder descriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = (DescriptorProtos$GeneratedCodeInfo)this.instance;
        descriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder = (DescriptorProtos$GeneratedCodeInfo$Annotation)descriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder.build();
        DescriptorProtos$GeneratedCodeInfo.access$47100(descriptorProtos$GeneratedCodeInfo, n3, (DescriptorProtos$GeneratedCodeInfo$Annotation)descriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder);
        return this;
    }

    public DescriptorProtos$GeneratedCodeInfo$Builder addAnnotation(int n3, DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation) {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo.access$47100((DescriptorProtos$GeneratedCodeInfo)this.instance, n3, descriptorProtos$GeneratedCodeInfo$Annotation);
        return this;
    }

    public DescriptorProtos$GeneratedCodeInfo$Builder addAnnotation(DescriptorProtos$GeneratedCodeInfo$Annotation$Builder descriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = (DescriptorProtos$GeneratedCodeInfo)this.instance;
        descriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder = (DescriptorProtos$GeneratedCodeInfo$Annotation)descriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder.build();
        DescriptorProtos$GeneratedCodeInfo.access$47000(descriptorProtos$GeneratedCodeInfo, (DescriptorProtos$GeneratedCodeInfo$Annotation)descriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder);
        return this;
    }

    public DescriptorProtos$GeneratedCodeInfo$Builder addAnnotation(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation) {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo.access$47000((DescriptorProtos$GeneratedCodeInfo)this.instance, descriptorProtos$GeneratedCodeInfo$Annotation);
        return this;
    }

    public DescriptorProtos$GeneratedCodeInfo$Builder clearAnnotation() {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo.access$47300((DescriptorProtos$GeneratedCodeInfo)this.instance);
        return this;
    }

    public DescriptorProtos$GeneratedCodeInfo$Annotation getAnnotation(int n3) {
        return ((DescriptorProtos$GeneratedCodeInfo)this.instance).getAnnotation(n3);
    }

    public int getAnnotationCount() {
        return ((DescriptorProtos$GeneratedCodeInfo)this.instance).getAnnotationCount();
    }

    public List getAnnotationList() {
        return Collections.unmodifiableList(((DescriptorProtos$GeneratedCodeInfo)this.instance).getAnnotationList());
    }

    public DescriptorProtos$GeneratedCodeInfo$Builder removeAnnotation(int n3) {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo.access$47400((DescriptorProtos$GeneratedCodeInfo)this.instance, n3);
        return this;
    }

    public DescriptorProtos$GeneratedCodeInfo$Builder setAnnotation(int n3, DescriptorProtos$GeneratedCodeInfo$Annotation$Builder descriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = (DescriptorProtos$GeneratedCodeInfo)this.instance;
        descriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder = (DescriptorProtos$GeneratedCodeInfo$Annotation)descriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder.build();
        DescriptorProtos$GeneratedCodeInfo.access$46900(descriptorProtos$GeneratedCodeInfo, n3, (DescriptorProtos$GeneratedCodeInfo$Annotation)descriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder);
        return this;
    }

    public DescriptorProtos$GeneratedCodeInfo$Builder setAnnotation(int n3, DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation) {
        this.copyOnWrite();
        DescriptorProtos$GeneratedCodeInfo.access$46900((DescriptorProtos$GeneratedCodeInfo)this.instance, n3, descriptorProtos$GeneratedCodeInfo$Annotation);
        return this;
    }
}

