/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$Annotation;
import com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder;
import com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$Builder;
import com.google.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class DescriptorProtos$GeneratedCodeInfo
extends GeneratedMessageLite
implements DescriptorProtos$GeneratedCodeInfoOrBuilder {
    public static final int ANNOTATION_FIELD_NUMBER = 1;
    private static final DescriptorProtos$GeneratedCodeInfo DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    private Internal$ProtobufList annotation_;

    static {
        DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo;
        DEFAULT_INSTANCE = descriptorProtos$GeneratedCodeInfo = new DescriptorProtos$GeneratedCodeInfo();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$GeneratedCodeInfo.class, descriptorProtos$GeneratedCodeInfo);
    }

    private DescriptorProtos$GeneratedCodeInfo() {
        Internal$ProtobufList internal$ProtobufList;
        this.annotation_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ DescriptorProtos$GeneratedCodeInfo access$46800() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$46900(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo, int n3, DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation) {
        descriptorProtos$GeneratedCodeInfo.setAnnotation(n3, descriptorProtos$GeneratedCodeInfo$Annotation);
    }

    public static /* synthetic */ void access$47000(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo, DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation) {
        descriptorProtos$GeneratedCodeInfo.addAnnotation(descriptorProtos$GeneratedCodeInfo$Annotation);
    }

    public static /* synthetic */ void access$47100(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo, int n3, DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation) {
        descriptorProtos$GeneratedCodeInfo.addAnnotation(n3, descriptorProtos$GeneratedCodeInfo$Annotation);
    }

    public static /* synthetic */ void access$47200(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo, Iterable iterable) {
        descriptorProtos$GeneratedCodeInfo.addAllAnnotation(iterable);
    }

    public static /* synthetic */ void access$47300(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
        descriptorProtos$GeneratedCodeInfo.clearAnnotation();
    }

    public static /* synthetic */ void access$47400(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo, int n3) {
        descriptorProtos$GeneratedCodeInfo.removeAnnotation(n3);
    }

    private void addAllAnnotation(Iterable iterable) {
        this.ensureAnnotationIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.annotation_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAnnotation(int n3, DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation) {
        descriptorProtos$GeneratedCodeInfo$Annotation.getClass();
        this.ensureAnnotationIsMutable();
        this.annotation_.add(n3, descriptorProtos$GeneratedCodeInfo$Annotation);
    }

    private void addAnnotation(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation) {
        descriptorProtos$GeneratedCodeInfo$Annotation.getClass();
        this.ensureAnnotationIsMutable();
        this.annotation_.add(descriptorProtos$GeneratedCodeInfo$Annotation);
    }

    private void clearAnnotation() {
        Internal$ProtobufList internal$ProtobufList;
        this.annotation_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureAnnotationIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.annotation_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.annotation_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static DescriptorProtos$GeneratedCodeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$GeneratedCodeInfo$Builder newBuilder() {
        return (DescriptorProtos$GeneratedCodeInfo$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$GeneratedCodeInfo$Builder newBuilder(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
        return (DescriptorProtos$GeneratedCodeInfo$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$GeneratedCodeInfo);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$GeneratedCodeInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$GeneratedCodeInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteString byteString) {
        return (DescriptorProtos$GeneratedCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$GeneratedCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$GeneratedCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$GeneratedCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(InputStream inputStream) {
        return (DescriptorProtos$GeneratedCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$GeneratedCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$GeneratedCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$GeneratedCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(byte[] byArray) {
        return (DescriptorProtos$GeneratedCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$GeneratedCodeInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAnnotation(int n3) {
        this.ensureAnnotationIsMutable();
        this.annotation_.remove(n3);
    }

    private void setAnnotation(int n3, DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation) {
        descriptorProtos$GeneratedCodeInfo$Annotation.getClass();
        this.ensureAnnotationIsMutable();
        this.annotation_.set(n3, descriptorProtos$GeneratedCodeInfo$Annotation);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = DescriptorProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object3 = object.ordinal();
        object3 = object2[object3];
        object2 = null;
        switch (object3) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                object = PARSER;
                if (object != null) return object;
                clazz = DescriptorProtos$GeneratedCodeInfo.class;
                synchronized (clazz) {
                    try {
                        object = PARSER;
                        if (object != null) return object;
                        object2 = DEFAULT_INSTANCE;
                        PARSER = object = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object2);
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                object = new Object[2];
                object[0] = "annotation_";
                object[by2] = DescriptorProtos$GeneratedCodeInfo$Annotation.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", object);
            }
            case 2: {
                return new DescriptorProtos$GeneratedCodeInfo$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$GeneratedCodeInfo();
    }

    public DescriptorProtos$GeneratedCodeInfo$Annotation getAnnotation(int n3) {
        return (DescriptorProtos$GeneratedCodeInfo$Annotation)this.annotation_.get(n3);
    }

    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    public List getAnnotationList() {
        return this.annotation_;
    }

    public DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder getAnnotationOrBuilder(int n3) {
        return (DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder)this.annotation_.get(n3);
    }

    public List getAnnotationOrBuilderList() {
        return this.annotation_;
    }
}

