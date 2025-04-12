/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$Annotation$Builder;
import com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$IntList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class DescriptorProtos$GeneratedCodeInfo$Annotation
extends GeneratedMessageLite
implements DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder {
    public static final int BEGIN_FIELD_NUMBER = 3;
    private static final DescriptorProtos$GeneratedCodeInfo$Annotation DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 4;
    private static volatile Parser PARSER;
    public static final int PATH_FIELD_NUMBER = 1;
    public static final int SOURCE_FILE_FIELD_NUMBER = 2;
    private int begin_;
    private int bitField0_;
    private int end_;
    private int pathMemoizedSerializedSize = -1;
    private Internal$IntList path_;
    private String sourceFile_;

    static {
        DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation;
        DEFAULT_INSTANCE = descriptorProtos$GeneratedCodeInfo$Annotation = new DescriptorProtos$GeneratedCodeInfo$Annotation();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$GeneratedCodeInfo$Annotation.class, descriptorProtos$GeneratedCodeInfo$Annotation);
    }

    private DescriptorProtos$GeneratedCodeInfo$Annotation() {
        Internal$IntList internal$IntList;
        this.path_ = internal$IntList = GeneratedMessageLite.emptyIntList();
        this.sourceFile_ = "";
    }

    public static /* synthetic */ DescriptorProtos$GeneratedCodeInfo$Annotation access$45500() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$45600(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation, int n3, int n4) {
        descriptorProtos$GeneratedCodeInfo$Annotation.setPath(n3, n4);
    }

    public static /* synthetic */ void access$45700(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation, int n3) {
        descriptorProtos$GeneratedCodeInfo$Annotation.addPath(n3);
    }

    public static /* synthetic */ void access$45800(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation, Iterable iterable) {
        descriptorProtos$GeneratedCodeInfo$Annotation.addAllPath(iterable);
    }

    public static /* synthetic */ void access$45900(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation) {
        descriptorProtos$GeneratedCodeInfo$Annotation.clearPath();
    }

    public static /* synthetic */ void access$46000(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation, String string2) {
        descriptorProtos$GeneratedCodeInfo$Annotation.setSourceFile(string2);
    }

    public static /* synthetic */ void access$46100(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation) {
        descriptorProtos$GeneratedCodeInfo$Annotation.clearSourceFile();
    }

    public static /* synthetic */ void access$46200(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation, ByteString byteString) {
        descriptorProtos$GeneratedCodeInfo$Annotation.setSourceFileBytes(byteString);
    }

    public static /* synthetic */ void access$46300(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation, int n3) {
        descriptorProtos$GeneratedCodeInfo$Annotation.setBegin(n3);
    }

    public static /* synthetic */ void access$46400(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation) {
        descriptorProtos$GeneratedCodeInfo$Annotation.clearBegin();
    }

    public static /* synthetic */ void access$46500(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation, int n3) {
        descriptorProtos$GeneratedCodeInfo$Annotation.setEnd(n3);
    }

    public static /* synthetic */ void access$46600(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation) {
        descriptorProtos$GeneratedCodeInfo$Annotation.clearEnd();
    }

    private void addAllPath(Iterable iterable) {
        this.ensurePathIsMutable();
        Internal$IntList internal$IntList = this.path_;
        AbstractMessageLite.addAll(iterable, internal$IntList);
    }

    private void addPath(int n3) {
        this.ensurePathIsMutable();
        this.path_.addInt(n3);
    }

    private void clearBegin() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.begin_ = 0;
    }

    private void clearEnd() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFB;
        this.end_ = 0;
    }

    private void clearPath() {
        Internal$IntList internal$IntList;
        this.path_ = internal$IntList = GeneratedMessageLite.emptyIntList();
    }

    private void clearSourceFile() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.sourceFile_ = string2 = DescriptorProtos$GeneratedCodeInfo$Annotation.getDefaultInstance().getSourceFile();
    }

    private void ensurePathIsMutable() {
        Internal$IntList internal$IntList = this.path_;
        boolean bl2 = internal$IntList.isModifiable();
        if (!bl2) {
            this.path_ = internal$IntList = GeneratedMessageLite.mutableCopy(internal$IntList);
        }
    }

    public static DescriptorProtos$GeneratedCodeInfo$Annotation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$GeneratedCodeInfo$Annotation$Builder newBuilder() {
        return (DescriptorProtos$GeneratedCodeInfo$Annotation$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$GeneratedCodeInfo$Annotation$Builder newBuilder(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorProtos$GeneratedCodeInfo$Annotation) {
        return (DescriptorProtos$GeneratedCodeInfo$Annotation$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$GeneratedCodeInfo$Annotation);
    }

    public static DescriptorProtos$GeneratedCodeInfo$Annotation parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$GeneratedCodeInfo$Annotation)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo$Annotation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$GeneratedCodeInfo$Annotation)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(ByteString byteString) {
        return (DescriptorProtos$GeneratedCodeInfo$Annotation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$GeneratedCodeInfo$Annotation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$GeneratedCodeInfo$Annotation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$GeneratedCodeInfo$Annotation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(InputStream inputStream) {
        return (DescriptorProtos$GeneratedCodeInfo$Annotation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$GeneratedCodeInfo$Annotation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$GeneratedCodeInfo$Annotation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$GeneratedCodeInfo$Annotation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(byte[] byArray) {
        return (DescriptorProtos$GeneratedCodeInfo$Annotation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$GeneratedCodeInfo$Annotation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBegin(int n3) {
        int n4;
        this.bitField0_ = n4 = this.bitField0_ | 2;
        this.begin_ = n3;
    }

    private void setEnd(int n3) {
        int n4;
        this.bitField0_ = n4 = this.bitField0_ | 4;
        this.end_ = n3;
    }

    private void setPath(int n3, int n4) {
        this.ensurePathIsMutable();
        this.path_.setInt(n3, n4);
    }

    private void setSourceFile(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 1;
        this.sourceFile_ = string2;
    }

    private void setSourceFileBytes(ByteString object) {
        int n3;
        this.sourceFile_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = DescriptorProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object2 = objectArray.ordinal();
        object2 = object[object2];
        object = null;
        switch (object2) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                objectArray = PARSER;
                if (objectArray != null) return objectArray;
                clazz = DescriptorProtos$GeneratedCodeInfo$Annotation.class;
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
                objectArray = new Object[5];
                objectArray[0] = "bitField0_";
                objectArray[by2] = "path_";
                objectArray[2] = "sourceFile_";
                objectArray[3] = "begin_";
                objectArray[4] = "end_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001'\u0002\u1008\u0000\u0003\u1004\u0001\u0004\u1004\u0002", objectArray);
            }
            case 2: {
                return new DescriptorProtos$GeneratedCodeInfo$Annotation$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$GeneratedCodeInfo$Annotation();
    }

    public int getBegin() {
        return this.begin_;
    }

    public int getEnd() {
        return this.end_;
    }

    public int getPath(int n3) {
        return this.path_.getInt(n3);
    }

    public int getPathCount() {
        return this.path_.size();
    }

    public List getPathList() {
        return this.path_;
    }

    public String getSourceFile() {
        return this.sourceFile_;
    }

    public ByteString getSourceFileBytes() {
        return ByteString.copyFromUtf8(this.sourceFile_);
    }

    public boolean hasBegin() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasEnd() {
        int n3 = this.bitField0_ & 4;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasSourceFile() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }
}

