/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$FileDescriptorProto;
import com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos$FileDescriptorSet$Builder;
import com.google.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class DescriptorProtos$FileDescriptorSet
extends GeneratedMessageLite
implements DescriptorProtos$FileDescriptorSetOrBuilder {
    private static final DescriptorProtos$FileDescriptorSet DEFAULT_INSTANCE;
    public static final int FILE_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private Internal$ProtobufList file_;
    private byte memoizedIsInitialized = (byte)2;

    static {
        DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet;
        DEFAULT_INSTANCE = descriptorProtos$FileDescriptorSet = new DescriptorProtos$FileDescriptorSet();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FileDescriptorSet.class, descriptorProtos$FileDescriptorSet);
    }

    private DescriptorProtos$FileDescriptorSet() {
        Internal$ProtobufList internal$ProtobufList;
        this.file_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ DescriptorProtos$FileDescriptorSet access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet, int n3, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorSet.setFile(n3, descriptorProtos$FileDescriptorProto);
    }

    public static /* synthetic */ void access$200(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorSet.addFile(descriptorProtos$FileDescriptorProto);
    }

    public static /* synthetic */ void access$300(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet, int n3, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorSet.addFile(n3, descriptorProtos$FileDescriptorProto);
    }

    public static /* synthetic */ void access$400(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet, Iterable iterable) {
        descriptorProtos$FileDescriptorSet.addAllFile(iterable);
    }

    public static /* synthetic */ void access$500(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet) {
        descriptorProtos$FileDescriptorSet.clearFile();
    }

    public static /* synthetic */ void access$600(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet, int n3) {
        descriptorProtos$FileDescriptorSet.removeFile(n3);
    }

    private void addAllFile(Iterable iterable) {
        this.ensureFileIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.file_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addFile(int n3, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.getClass();
        this.ensureFileIsMutable();
        this.file_.add(n3, descriptorProtos$FileDescriptorProto);
    }

    private void addFile(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.getClass();
        this.ensureFileIsMutable();
        this.file_.add(descriptorProtos$FileDescriptorProto);
    }

    private void clearFile() {
        Internal$ProtobufList internal$ProtobufList;
        this.file_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureFileIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.file_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.file_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static DescriptorProtos$FileDescriptorSet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$FileDescriptorSet$Builder newBuilder() {
        return (DescriptorProtos$FileDescriptorSet$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FileDescriptorSet$Builder newBuilder(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet) {
        return (DescriptorProtos$FileDescriptorSet$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$FileDescriptorSet);
    }

    public static DescriptorProtos$FileDescriptorSet parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorSet)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorSet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FileDescriptorSet)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteString byteString) {
        return (DescriptorProtos$FileDescriptorSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FileDescriptorSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$FileDescriptorSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FileDescriptorSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FileDescriptorSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FileDescriptorSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FileDescriptorSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(byte[] byArray) {
        return (DescriptorProtos$FileDescriptorSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FileDescriptorSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeFile(int n3) {
        this.ensureFileIsMutable();
        this.file_.remove(n3);
    }

    private void setFile(int n3, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.getClass();
        this.ensureFileIsMutable();
        this.file_.set(n3, descriptorProtos$FileDescriptorProto);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        int n3 = 1;
        int[] nArray = DescriptorProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        int n4 = object.ordinal();
        n4 = nArray[n4];
        nArray = null;
        switch (n4) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 7: {
                if (clazz == null) {
                    n3 = 0;
                    object2 = null;
                }
                n4 = (byte)n3;
                this.memoizedIsInitialized = (byte)n4;
                return null;
            }
            case 6: {
                return this.memoizedIsInitialized;
            }
            case 5: {
                object = PARSER;
                if (object != null) return object;
                clazz = DescriptorProtos$FileDescriptorSet.class;
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
                object[0] = "file_";
                object[n3] = DescriptorProtos$FileDescriptorProto.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", object);
            }
            case 2: {
                return new DescriptorProtos$FileDescriptorSet$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$FileDescriptorSet();
    }

    public DescriptorProtos$FileDescriptorProto getFile(int n3) {
        return (DescriptorProtos$FileDescriptorProto)this.file_.get(n3);
    }

    public int getFileCount() {
        return this.file_.size();
    }

    public List getFileList() {
        return this.file_;
    }

    public DescriptorProtos$FileDescriptorProtoOrBuilder getFileOrBuilder(int n3) {
        return (DescriptorProtos$FileDescriptorProtoOrBuilder)this.file_.get(n3);
    }

    public List getFileOrBuilderList() {
        return this.file_;
    }
}

