/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.SourceInfo$1;
import com.google.api.SourceInfo$Builder;
import com.google.api.SourceInfoOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class SourceInfo
extends GeneratedMessageLite
implements SourceInfoOrBuilder {
    private static final SourceInfo DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int SOURCE_FILES_FIELD_NUMBER = 1;
    private Internal$ProtobufList sourceFiles_;

    static {
        SourceInfo sourceInfo;
        DEFAULT_INSTANCE = sourceInfo = new SourceInfo();
        GeneratedMessageLite.registerDefaultInstance(SourceInfo.class, sourceInfo);
    }

    private SourceInfo() {
        Internal$ProtobufList internal$ProtobufList;
        this.sourceFiles_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ SourceInfo access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(SourceInfo sourceInfo, int n3, Any any) {
        sourceInfo.setSourceFiles(n3, any);
    }

    public static /* synthetic */ void access$200(SourceInfo sourceInfo, Any any) {
        sourceInfo.addSourceFiles(any);
    }

    public static /* synthetic */ void access$300(SourceInfo sourceInfo, int n3, Any any) {
        sourceInfo.addSourceFiles(n3, any);
    }

    public static /* synthetic */ void access$400(SourceInfo sourceInfo, Iterable iterable) {
        sourceInfo.addAllSourceFiles(iterable);
    }

    public static /* synthetic */ void access$500(SourceInfo sourceInfo) {
        sourceInfo.clearSourceFiles();
    }

    public static /* synthetic */ void access$600(SourceInfo sourceInfo, int n3) {
        sourceInfo.removeSourceFiles(n3);
    }

    private void addAllSourceFiles(Iterable iterable) {
        this.ensureSourceFilesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.sourceFiles_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addSourceFiles(int n3, Any any) {
        any.getClass();
        this.ensureSourceFilesIsMutable();
        this.sourceFiles_.add(n3, any);
    }

    private void addSourceFiles(Any any) {
        any.getClass();
        this.ensureSourceFilesIsMutable();
        this.sourceFiles_.add(any);
    }

    private void clearSourceFiles() {
        Internal$ProtobufList internal$ProtobufList;
        this.sourceFiles_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSourceFilesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.sourceFiles_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.sourceFiles_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static SourceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static SourceInfo$Builder newBuilder() {
        return (SourceInfo$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static SourceInfo$Builder newBuilder(SourceInfo sourceInfo) {
        return (SourceInfo$Builder)DEFAULT_INSTANCE.createBuilder(sourceInfo);
    }

    public static SourceInfo parseDelimitedFrom(InputStream inputStream) {
        return (SourceInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SourceInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SourceInfo parseFrom(ByteString byteString) {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static SourceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SourceInfo parseFrom(CodedInputStream codedInputStream) {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static SourceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static SourceInfo parseFrom(InputStream inputStream) {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static SourceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SourceInfo parseFrom(ByteBuffer byteBuffer) {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static SourceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SourceInfo parseFrom(byte[] byArray) {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static SourceInfo parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeSourceFiles(int n3) {
        this.ensureSourceFilesIsMutable();
        this.sourceFiles_.remove(n3);
    }

    private void setSourceFiles(int n3, Any any) {
        any.getClass();
        this.ensureSourceFilesIsMutable();
        this.sourceFiles_.set(n3, any);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = SourceInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = SourceInfo.class;
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
                object[0] = "sourceFiles_";
                object[by2] = Any.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", object);
            }
            case 2: {
                return new SourceInfo$Builder(null);
            }
            case 1: 
        }
        return new SourceInfo();
    }

    public Any getSourceFiles(int n3) {
        return (Any)this.sourceFiles_.get(n3);
    }

    public int getSourceFilesCount() {
        return this.sourceFiles_.size();
    }

    public List getSourceFilesList() {
        return this.sourceFiles_;
    }

    public AnyOrBuilder getSourceFilesOrBuilder(int n3) {
        return (AnyOrBuilder)this.sourceFiles_.get(n3);
    }

    public List getSourceFilesOrBuilderList() {
        return this.sourceFiles_;
    }
}

